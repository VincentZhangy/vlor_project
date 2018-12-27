package top.vlor.facade;

import org.apache.log4j.Logger;
import top.vlor.facade.children.CPU;
import top.vlor.facade.children.Disk;
import top.vlor.facade.children.Memory;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 11:21 2018/5/3
 * @Modified by：
 */
public class Computer {
    public static final Logger log = Logger.getLogger(Computer.class);

    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void start(){
        log.info("Computer is start begin ...");
        cpu.start();
        disk.start();
        memory.start();
        log.info("Computer is start end ...");
    }

    public void shutDown(){
        log.info("Computer is shotDown begin ...");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        log.info("Computer is shotDown end ...");
    }
}
