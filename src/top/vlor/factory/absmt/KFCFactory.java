package top.vlor.factory.absmt;

import top.vlor.factory.ColeDrink;
import top.vlor.factory.IDrink;
import top.vlor.factory.Inoodles;
import top.vlor.factory.PaoNoodles;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 10:59 2018/3/31
 * @Modified by：
 */
public class KFCFactory extends AbstractFoodFactory {
    @Override
    public Inoodles createNoodles() {
        return new PaoNoodles();
    }

    @Override
    public IDrink createDrink() {
        return new ColeDrink();
    }
}
