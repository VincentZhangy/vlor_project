package top.vlor.facade.children;

import org.apache.log4j.Logger;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 11:19 2018/5/3
 * @Modified by：
 */
public class Memory {
    public static final Logger log = Logger.getLogger(Memory.class);

    public void start(){
        log.info("Memory is start...");
    }

    public void shutDown(){
        log.info("Memory is shutdown...");
    }
}
