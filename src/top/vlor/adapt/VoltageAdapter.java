package top.vlor.adapt;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 09:31 2018/4/11
 * @Modified by：
 */
public class VoltageAdapter extends Voltage220v implements Voltage5v {

    @Override
    public int output5v() {
        int src = output220v();
        System.out.println("适配器开始工作转换电压");
        int dst = src/44;
        System.out.println("适配器完成工作输出电压"+dst+"v");
        return dst;
    }
}
