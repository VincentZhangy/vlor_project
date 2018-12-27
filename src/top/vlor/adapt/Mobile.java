package top.vlor.adapt;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 09:34 2018/4/11
 * @Modified by：
 */
public class Mobile {
    public void charging(Voltage5v voltage5v){
        if(voltage5v.output5v() == 5){
            System.out.println("电压刚好5v，充电正常");
        }else if(voltage5v.output5v()>5){
            System.out.println("电压过高，电池可能会爆炸");
        }
    }
}
