package top.vlor.factory.commonmt;

import top.vlor.factory.Inoodles;
import top.vlor.factory.MiNoodles;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 10:34 2018/3/31
 * @Modified by：
 */
public class MiFactory extends NoodlesFactory {
    @Override
    public Inoodles creat() {
        return new MiNoodles();
    }
}
