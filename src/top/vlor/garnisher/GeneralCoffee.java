package top.vlor.garnisher;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 12:42 2018/4/14
 * @Modified by：
 */
public class GeneralCoffee extends Coffee{

    public GeneralCoffee() {
        cofferInformation = "普通咖啡";
    }

    @Override
    public Double cost() {
        return 10.0;
    }
}
