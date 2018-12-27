package top.vlor.strategy;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 22:25 2018/11/6
 * @Modified by：
 */
public class CashContext {
    CashSuper cs = null;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn(300,100);
                break;
            case "打8折":
                cs = new CashRebate(0.8);
                break;
        }
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
