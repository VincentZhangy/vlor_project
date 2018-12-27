package top.vlor.facade;

import org.apache.log4j.Logger;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 11:28 2018/5/3
 * @Modified by：
 */
public class Client {
    public static final Logger log = Logger.getLogger(Client.class);

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        log.info("============================");
        computer.shutDown();
    }
}
