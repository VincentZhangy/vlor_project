package top.vlor.test;

import top.vlor.util.ExcelUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Descreption: 实需销售业绩是否异常
 * @Author: vlor
 * @Date: Created in 14:19 2018/7/2
 * @Modified by：
 */
public class ReadExcelTest {
    public static void main(String[] args) {
        List<List<String>> list  = new ArrayList();
        try {
            list = ExcelUtil.readXlsx("D://test.xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }
        getCountnum(list,12,20,21,"调整架");
        getCountnum(list,13,22,23,"清洁剂");
        getCountnum(list,14,24,25,"水龙头");
        getCountnum(list,15,26,27,"洗衣球");
    }

    public static void getCountnum(List<List<String>> list,int allcount,int zzdcount,int fjxhdcount,String producname){
        double count = 0.0; //调整架相差值
        for(int i = 1;i<list.size();i++){
            if(Double.parseDouble(list.get(i).get(allcount))!=(Double.parseDouble(list.get(i).get(zzdcount))+Double.parseDouble(list.get(i).get(fjxhdcount)))) {
                System.out.println("服务店编号：" + list.get(i).get(0) + ";" + producname + "合计：" + list.get(i).get(allcount) + ";"+producname+"[增值单]:" + list.get(i).get(zzdcount) + ";"+producname+"[附件消耗单]:" + list.get(i).get(fjxhdcount) + ";"+producname+"合计："+(Double.parseDouble(list.get(i).get(zzdcount))+Double.parseDouble(list.get(i).get(fjxhdcount))));
                count += Double.parseDouble(list.get(i).get(allcount))-(Double.parseDouble(list.get(i).get(zzdcount))+Double.parseDouble(list.get(i).get(fjxhdcount)));
            }
        }
        System.out.println(producname+"相差数量："+count);
    }
}
