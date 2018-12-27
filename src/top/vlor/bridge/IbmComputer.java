package top.vlor.bridge;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 13:25 2018/5/4
 * @Modified by：
 */
public class IbmComputer extends AbstractComputer {

    public IbmComputer(CPUAbility cpuAbility) {
        super(cpuAbility);
    }

    @Override
    public void checkPcAbility() {
        System.out.println("IBM笔记本性能："+super.cpuAbility.abilityCpu());
    }
}
