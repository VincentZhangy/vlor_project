package top.vlor.adapt;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 09:46 2018/4/11
 * @Modified by：
 */
public class VoltageAdapter2 implements Voltage5v {

    private Voltage220v voltage220v;

    public VoltageAdapter2(Voltage220v voltage220v){
        this.voltage220v = voltage220v;
    }
    @Override
    public int output5v() {
        int dst = 0;
        if(voltage220v!=null){
            int src = voltage220v.output220v();
            System.out.println("适配器开始工作");
            dst = src/44;
            System.out.println("适配器工作完成输出电压："+dst+"v");
        }
        return dst;
    }
}
