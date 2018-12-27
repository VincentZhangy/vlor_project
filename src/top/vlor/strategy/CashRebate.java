package top.vlor.strategy;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 22:09 2018/11/6
 * @Modified by：
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
