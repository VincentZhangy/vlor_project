package top.vlor.factory.absmt;

import top.vlor.factory.IDrink;
import top.vlor.factory.Inoodles;
import top.vlor.factory.MiNoodles;
import top.vlor.factory.WaterDrink;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 11:00 2018/3/31
 * @Modified by：
 */
public class XBKFactory extends AbstractFoodFactory {
    @Override
    public Inoodles createNoodles() {
        return new MiNoodles();
    }

    @Override
    public IDrink createDrink() {
        return new WaterDrink();
    }
}
