package top.vlor.factory.manymt;

import top.vlor.factory.Inoodles;
import top.vlor.factory.LZNoodles;
import top.vlor.factory.MiNoodles;
import top.vlor.factory.PaoNoodles;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 10:06 2018/3/31
 * @Modified by：
 */
public class ManyWayNoodlesFactory {
    
    /**
     * @Author: vlor
     * @Description: 生产兰州拉面
     * @Date: 2018/3/31 10:07 
     */
    public static Inoodles createLZNoodles(){
        return new LZNoodles();
    }

    /**
     * @Author: vlor
     * @Description: 生产泡面
     * @Date: 2018/3/31 10:08
     */
    public static Inoodles createPaoNoodles(){
        return new PaoNoodles();
    }

    /**
     * @Author: vlor
     * @Description: 生产米面
     * @Date: 2018/3/31 10:08
     */
    public static Inoodles createMiNoodles(){
        return new MiNoodles();
    }
}
