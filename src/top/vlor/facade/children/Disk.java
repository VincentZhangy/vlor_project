package top.vlor.facade.children;

import org.apache.log4j.Logger;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 11:18 2018/5/3
 * @Modified by：
 */
public class Disk {
    final static Logger log = Logger.getLogger(Disk.class);

    public void start(){
        log.info("Disk is start...");
    }

    public void shutDown(){
        log.info("Disk is shutdown...");
    }
}
