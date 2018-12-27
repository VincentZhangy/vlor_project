package top.vlor.test;

import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.Map;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 16:43 2018/5/9
 * @Modified by：
 */
public class TestGeocoder {
    public static void main(String[] args) {
        int count = 0;
        Connection conn = getConn();
        Connection conn2;
        Statement st = null;
        try {
            st=conn.createStatement();
            ResultSet rs = st.executeQuery("select * from geocoder");
            while (rs.next()){
                String fwdaddress  = rs.getString("fwdaddress");
                String province = rs.getString("province");
                String city = rs.getString("city");
                String county = rs.getString("county");
                String town  = rs.getString("town");
                System.out.println(fwdaddress);
                Map<String,Double> map = BaiduMapUtils.getLngAndLat(fwdaddress.replaceAll(" ","").replaceAll("  ","").replace("#","号"));
                String fwdlng = map.get("lng")==null?rs.getString("countylng"):map.get("lng").toString();
                String fwdlat = map.get("lat")==null?rs.getString("countylat"):map.get("lat").toString();
                System.out.println(city+county+town);
                Map<String,Double> map2 = BaiduMapUtils.getLngAndLat(province.replaceAll(" ","")+city.replaceAll(" ","")+county.replaceAll(" ","")+town.replaceAll(" ",""));
                String townlng = map2.get("lng")==null?rs.getString("townlng"):map2.get("lng").toString();
                String townlat = map2.get("lat")==null?rs.getString("townlat"):map2.get("lat").toString();
                Double ftdistance = getDistance(Double.parseDouble(fwdlng),Double.parseDouble(fwdlat),Double.parseDouble(townlng),Double.parseDouble(townlat));
                if(ftdistance>0){
                    count++;
                }
                String fwdbh = rs.getString("fwdbh");
                String towncode = rs.getString("towncode");
                conn2 = getConn();
                Statement st2 = conn2.createStatement();
                String sql = "update geocoder set fwdlng='"+fwdlng+"',fwdlat='"+fwdlat+"',town2lng='"+townlng+"',town2lat='"+townlat+"',ftdistance='"+ftdistance+"' where fwdbh='"+fwdbh+"' and towncode='"+towncode+"'";
                System.out.println("sql:"+sql);
                boolean bool = st2.execute(sql);
                st2.close();
                conn2.close();
            }
            rs.close();
            st.close();
            conn.close();
            System.out.println("count:"+count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test(){

        Map<String,Double> map = BaiduMapUtils.getLngAndLat("北京市市辖区通州区永顺街道");

    }

    @Test
    public void test2(){
        int count = 0;
        Connection conn = getConn();
        Connection conn2;
        Statement st = null;
        try {
            st=conn.createStatement();
            ResultSet rs = st.executeQuery("select * from geocoder");
            while (rs.next()){
                String province = rs.getString("province");
                String city = rs.getString("city");
                String county = rs.getString("county");
                String townlng  = rs.getString("town2lng");
                String townlat  = rs.getString("town2lat");
                Map<String,Double> map = BaiduMapUtils.getLngAndLat(province.replaceAll(" ","")+city.replaceAll(" ","")+county.replaceAll(" ",""));
                String countylng = map.get("lng")==null?rs.getString("countylng"):map.get("lng").toString();
                String countylat = map.get("lat")==null?rs.getString("countylat"):map.get("lat").toString();
                System.out.println(province+city+county);
                Double ctdistance = getDistance(Double.parseDouble(countylng),Double.parseDouble(countylat),Double.parseDouble(townlng),Double.parseDouble(townlat));
                if(ctdistance>100000){
                    count++;
                }
                String fwdbh = rs.getString("fwdbh");
                String towncode = rs.getString("towncode");
                conn2 = getConn();
                Statement st2 = conn2.createStatement();
                String sql = "update geocoder set county2lng='"+countylng+"',county2lat='"+countylat+"',ctdistance='"+ctdistance+"' where fwdbh='"+fwdbh+"' and towncode='"+towncode+"'";
                System.out.println("sql:"+sql);
                boolean bool = st2.execute(sql);
                st2.close();
                conn2.close();
            }
            rs.close();
            st.close();
            conn.close();
            System.out.println("count:"+count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn(){
        String url = "jdbc:mysql://127.0.0.1:3306/vlor_top?useUnicode=true&amp;characterEncoding=utf-8";
        String user = "root";
        String password = "950107";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    //地球平均半径
    private static final double EARTH_RADIUS = 6378137;

    //把经纬度转为度（°）
    private static double rad(double d){
        return d * Math.PI / 180.0;
    }

    /**
     * 根据两点间经纬度坐标（double值），计算两点间距离，单位为米
     * @param lng1
     * @param lat1
     * @param lng2
     * @param lat2
     * @return
     */
    public static double getDistance(double lng1, double lat1, double lng2, double lat2){
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(
                Math.sqrt(
                        Math.pow(Math.sin(a/2),2)
                                + Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)
                )
        );
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000) / 10000;
        return s;
    }
}
