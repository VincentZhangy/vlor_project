package top.vlor.factory.commonmt;

import top.vlor.factory.Inoodles;
import top.vlor.factory.PaoNoodles;

/**
 * @Author: vlor
 * @Descreption: 生产泡面的工厂
 * @Date: Created in 10:33 2018/3/31
 * @Modified by：
 */
public class PaoFactory extends NoodlesFactory {
    @Override
    public Inoodles creat() {
        return new PaoNoodles();
    }
}
