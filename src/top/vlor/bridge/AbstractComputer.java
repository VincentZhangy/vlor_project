package top.vlor.bridge;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 13:19 2018/5/4
 * @Modified by：
 */
public abstract class AbstractComputer {
    CPUAbility cpuAbility;

    public AbstractComputer(CPUAbility cpuAbility){
        this.cpuAbility = cpuAbility;
    }

    public abstract void checkPcAbility();
}
