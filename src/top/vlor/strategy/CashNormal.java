package top.vlor.strategy;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 22:08 2018/11/6
 * @Modified by：
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
