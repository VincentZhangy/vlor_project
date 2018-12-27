package top.vlor.adapt;

import org.junit.jupiter.api.Test;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 09:38 2018/4/11
 * @Modified by：
 */
public class AdapterTest {
    @Test
    public void test(){

        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter());
    }

    @Test
    public void test2(){
        VoltageAdapter2 adapter2 = new VoltageAdapter2(new Voltage220v());
        Mobile mobile = new Mobile();
        mobile.charging(adapter2);
    }
}
