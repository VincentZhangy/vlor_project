package top.vlor.factory;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 10:54 2018/3/31
 * @Modified by：
 */
public class WaterDrink extends IDrink {
    @Override
    public void getPrice() {
        System.out.println("矿泉水两块钱一瓶，现在越来越贵了");
    }
}
