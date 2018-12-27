package top.vlor.garnisher;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 12:48 2018/4/14
 * @Modified by：
 */
public class Milk extends Flavour {
    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getCofferInformation() {
        String addFlavor = coffee.cofferInformation+",add milk ";
        return addFlavor;
    }

    @Override
    public Double cost() {
        return coffee.cost()+3.0;
    }
}
