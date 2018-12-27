package top.vlor.garnisher;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 12:51 2018/4/14
 * @Modified by：
 */
public class Suger extends Flavour {
    Coffee coffee;

    public Suger(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getCofferInformation() {
        return coffee.getCofferInformation()+",add suger ";
    }

    @Override
    public Double cost() {
        return coffee.cost()+1.0;
    }
}
