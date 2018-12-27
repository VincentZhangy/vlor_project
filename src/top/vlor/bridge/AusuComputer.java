package top.vlor.bridge;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 13:23 2018/5/4
 * @Modified by：
 */
public class AusuComputer extends AbstractComputer {

    public AusuComputer(CPUAbility cpuAbility) {
        super(cpuAbility);
    }

    @Override
    public void checkPcAbility() {
        System.out.println("华硕笔记本CPU性能："+super.cpuAbility.abilityCpu());
    }
}
