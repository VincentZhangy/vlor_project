package top.vlor.test;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 11:47 2018/5/7
 * @Modified by：
 */
public class WMHcodeTest {
    public static void main(String[] args) {
        String sno = "140823416700248";
        String tmps;
        String tmpc,gsno;
        int i=1,rs1,rs2,rs3;
        float asum=0,esum=0,easc = 0;
        while (i<=sno.length()){
            tmps = sno.substring(i-1,i);
            asum += (Integer.valueOf(tmps)+i)*i;
            easc = Integer.valueOf(tmps);
            if(i>10){
                esum += (Integer.valueOf(tmps)+i)*(i-7);
            }
            i++;
        }
        System.out.println(((int)Math.floor(Math.sqrt(asum*esum*easc))));
        System.out.println(((int)Math.floor(Math.sqrt((asum+esum)*(asum-easc)*easc))));
        System.out.println(((int)Math.floor(Math.sqrt((asum-easc)*(esum+easc)*easc))));
        rs1 = ((int)Math.floor(Math.sqrt(asum*esum*easc))) % 10;
        rs2 = ((int)Math.floor(Math.sqrt((asum+esum)*(asum-easc)*easc))) % 10;
        rs3 = ((int)Math.floor(Math.sqrt((asum-easc)*(esum+easc)*easc))) % 10;
        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);
    }
}
