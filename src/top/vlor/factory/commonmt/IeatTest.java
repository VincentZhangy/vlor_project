package top.vlor.factory.commonmt;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import top.vlor.factory.Inoodles;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 10:35 2018/3/31
 * @Modified by：
 */
public class IeatTest {
    Logger log = Logger.getLogger(this.getClass());

    @Test
    public void eatTest(){
        NoodlesFactory lzFactory = new LZFactory();
        Inoodles lzNoodels = lzFactory.creat();
        log.info("兰州拉面师傅已经准备好了");
        lzNoodels.desc();
        log.info("早上开始吃兰州拉面");

        NoodlesFactory paoFactory = new PaoFactory();
        Inoodles paoNoodles = paoFactory.creat();
        log.info("泡面师傅已经准备好了");
        paoNoodles.desc();
        log.info("中午吃泡面");

        NoodlesFactory miFactory = new MiFactory();
        Inoodles miNoodles = miFactory.creat();
        log.info("米面师傅已经准备好了");
        miNoodles.desc();
        log.info("晚上吃米面，怎么一天都在吃面");
    }
}
