package top.vlor.test;

import top.vlor.util.ExcelUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 12:48 2018/11/1
 * @Modified by：
 */
public class RealVendorExcelTest {

    public static void main(String[] args) {

        List<List<String>> psmplist  = new ArrayList();
        List<List<String>> csmlist  = new ArrayList();
        try {
            psmplist = ExcelUtil.readXlsx("D://123.xlsx");
            csmlist = ExcelUtil.readXlsx("D://321.xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String fwdmc = "";
        double tzjhj = 0, qxjhj = 0, slthj = 0, xyqhj = 0, csjf122=0,csjf210=0 ,csjf213=0,csjf176=0, csjf212=0, csjf119=0, csjf211=0,csjf214=0,csjf217=0,csjf215=0,csjf216=0;
        for(int i = 1;i<psmplist.size();i++){
            List<String> psmpL = psmplist.get(i);
            fwdmc = psmpL.get(1);
            tzjhj = Double.parseDouble(psmpL.get(10));
            qxjhj = Double.parseDouble(psmpL.get(11));
            slthj = Double.parseDouble(psmpL.get(12));
            xyqhj = Double.parseDouble(psmpL.get(13));
            csjf122 = Double.parseDouble(psmpL.get(14));
            csjf210 = Double.parseDouble(psmpL.get(15));
            csjf213 = Double.parseDouble(psmpL.get(16));
            csjf176 = Double.parseDouble(psmpL.get(17));
            csjf212 = Double.parseDouble(psmpL.get(18));
            csjf119 = Double.parseDouble(psmpL.get(19));
            csjf211 = Double.parseDouble(psmpL.get(20));
            csjf214 = Double.parseDouble(psmpL.get(21));
            csjf217 = Double.parseDouble(psmpL.get(22));
            csjf215 = Double.parseDouble(psmpL.get(23));
//            csjf216 = Double.parseDouble(psmpL.get(24));
            /*System.out.println("服务店名称：" + fwdmc +";调整架合计："+tzjhj +";清洗剂合计：" + qxjhj +";水龙头合计：" + slthj +";洗衣球合计：" + qxjhj +";CSJF122（调整架）合计：" + csjf122
                    +";csjf210（调整架）合计：" + csjf210 +";csjf213（调整架）合计：" + csjf213 +";csjf176(清洗剂)合计：" + csjf176 +";csjf212（水龙头）合计：" + csjf212
                    +";csjf119（水龙头）合计：" + csjf119 +";csjf211（水龙头）合计：" + csjf211 +";csjf214（水龙头）合计：" + csjf214 +";csjf217（水龙头）合计：" + csjf217
                    +";csjf215（洗衣球）合计：" + csjf215+";csjf216（洗衣球）合计：" + csjf216);*/
            List<Map> list = new ArrayList();
            Map map = new HashMap();
            map.put("CSJF","CSJF122");
            map.put("num",csjf122);
            list.add(map);
            map = new HashMap();
            map.put("CSJF","CSJF210");
            map.put("num",csjf210);
            list.add(map);
            map = new HashMap();
            map.put("CSJF","CSJF213");
            map.put("num",csjf213);
            list.add(map);
            map = new HashMap();
            map.put("CSJF","CSJF176");
            map.put("num",csjf176);
            list.add(map);
            map = new HashMap();
            map.put("CSJF","CSJF212");
            map.put("num",csjf212);
            list.add(map);
            map = new HashMap();
            map.put("CSJF","CSJF119");
            map.put("num",csjf119);
            list.add(map);
            map = new HashMap();
            map.put("CSJF","CSJF211");
            map.put("num",csjf211);
            list.add(map);
            map = new HashMap();
            map.put("CSJF","CSJF214");
            map.put("num",csjf214);
            list.add(map);
            map = new HashMap();
            map.put("CSJF","CSJF217");
            map.put("num",csjf217);
            list.add(map);
            map = new HashMap();
            map.put("CSJF","CSJF215");
            map.put("num",csjf215);
            list.add(map);
//            map = new HashMap();
//            map.put("CSJF","CSJF216");
//            map.put("num",csjf216);
//            list.add(map);
            String csjf = "";
            for(int j = 0; j<list.size(); j++) {
                Map csjfMap = list.get(j);
                csjf = csjfMap.get("CSJF").toString();
                double aa = 0;
                for (int z = 1; z < csmlist.size(); z++) {
                    if(fwdmc.equals(csmlist.get(z).get(9)) && csjf.equals(csmlist.get(z).get(5))){
                        aa += Double.parseDouble(csmlist.get(z).get(6));
                    }
                }
                if(aa != Double.parseDouble(csjfMap.get("num").toString())){
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAA>>>>>  psmp >"+ fwdmc+">"+csjf+">"+ csjfMap.get("num") +"||||||||||<" + "csm<"+fwdmc+"<" + csjf + "<" + aa);
                }
            }
        }
    }
}
