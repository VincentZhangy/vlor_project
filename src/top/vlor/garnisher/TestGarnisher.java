package top.vlor.garnisher;

import org.junit.jupiter.api.Test;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 12:52 2018/4/14
 * @Modified by：
 */
public class TestGarnisher {

    @Test
    public void test(){
        Coffee generalCoffer = new GeneralCoffee();
        Coffee groundCoffer = new GroundCoffee();
        Coffee sugerCoffer = new Suger(generalCoffer);
        Coffee milkCoffer = new Milk(groundCoffer);
        System.out.println(sugerCoffer.getCofferInformation()+" "+sugerCoffer.cost());
        System.out.println(milkCoffer.getCofferInformation()+" "+milkCoffer.cost());
    }
}
