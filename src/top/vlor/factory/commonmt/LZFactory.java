package top.vlor.factory.commonmt;

import top.vlor.factory.Inoodles;
import top.vlor.factory.LZNoodles;

/**
 * @Author: vlor
 * @Descreption: 生产兰州拉面的工厂
 * @Date: Created in 10:32 2018/3/31
 * @Modified by：
 */
public class LZFactory extends NoodlesFactory {
    @Override
    public Inoodles creat() {
        return new LZNoodles();
    }
}
