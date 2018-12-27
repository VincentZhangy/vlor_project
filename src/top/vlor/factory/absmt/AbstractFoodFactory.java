package top.vlor.factory.absmt;

import top.vlor.factory.IDrink;
import top.vlor.factory.Inoodles;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 10:52 2018/3/31
 * @Modified by：
 */
public abstract class AbstractFoodFactory {

    /**
     * @Author: vlor
     * @Description: 生产面条
     * @Date: 2018/3/31 10:58 
     */
    public abstract Inoodles createNoodles();
    
    /**
     * @Author: vlor
     * @Description: 生产饮料
     * @Date: 2018/3/31 10:58 
     */
    public abstract IDrink createDrink();
}
