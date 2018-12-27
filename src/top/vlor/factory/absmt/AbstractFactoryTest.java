package top.vlor.factory.absmt;

import org.junit.jupiter.api.Test;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 11:01 2018/3/31
 * @Modified by：
 */
public class AbstractFactoryTest {

    @Test
    public void absTest(){
        AbstractFoodFactory aff = new KFCFactory();
        aff.createNoodles().desc();
        aff.createDrink().getPrice();

        AbstractFoodFactory affa = new XBKFactory();
        affa.createNoodles().desc();
        affa.createDrink().getPrice();
    }
}
