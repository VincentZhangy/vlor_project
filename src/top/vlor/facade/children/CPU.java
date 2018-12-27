package top.vlor.facade.children;

import org.apache.log4j.Logger;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 11:15 2018/5/3
 * @Modified by：
 */
public class CPU {
    public static final Logger log = Logger.getLogger(CPU.class);

    public void start(){
        log.info("CPU is start...");
    }

    public void shutDown(){
        log.info("CPU is shutdown...");
    }
}
