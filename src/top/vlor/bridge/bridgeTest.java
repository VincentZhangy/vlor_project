package top.vlor.bridge;

import top.vlor.bridge.impl.AmdCpu;
import top.vlor.bridge.impl.IntelCpu;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 13:27 2018/5/4
 * @Modified by：
 */
public class bridgeTest {
    public static void main(String[] args) {
        CPUAbility cpuAbility = new IntelCpu();
        AbstractComputer computer = new AusuComputer(cpuAbility);
        computer.checkPcAbility();
        cpuAbility = new AmdCpu();
        computer = new IbmComputer(cpuAbility);
        computer.checkPcAbility();
    }
}
