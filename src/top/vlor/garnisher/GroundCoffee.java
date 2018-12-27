package top.vlor.garnisher;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 12:45 2018/4/14
 * @Modified by：
 */
public class GroundCoffee extends Coffee {

    public GroundCoffee() {
        cofferInformation="现磨咖啡";
    }

    @Override
    public Double cost() {
        return 15.0;
    }
}
