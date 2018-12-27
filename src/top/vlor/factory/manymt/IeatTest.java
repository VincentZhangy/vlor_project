package top.vlor.factory.manymt;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import top.vlor.factory.Inoodles;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 10:09 2018/3/31
 * @Modified by：
 */
public class IeatTest {
    Logger log = Logger.getLogger(Test.class);

    @Test
    public void noodleTest(){
        Inoodles lznoodles = ManyWayNoodlesFactory.createLZNoodles();
        lznoodles.desc();
        log.info("开始吃兰州拉面");

        Inoodles paoNoodles = ManyWayNoodlesFactory.createPaoNoodles();
        paoNoodles.desc();
        log.info("加班，开始吃泡面");

        Inoodles miNoodles = ManyWayNoodlesFactory.createMiNoodles();
        miNoodles.desc();
        log.info("开始吃家乡米面");
    }
}
