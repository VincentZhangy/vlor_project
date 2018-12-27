package top.vlor.garnisher;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 11:58 2018/4/14
 * @Modified by：
 */
public abstract class Coffee {

    /**
     * @Author: vlor
     * @Description: 咖啡的信息
     * @Date: 2018/4/14 11:58
     */
    String cofferInformation = "咖啡";

    public String getCofferInformation(){
        return this.cofferInformation;
    }

    public abstract Double cost();
}
