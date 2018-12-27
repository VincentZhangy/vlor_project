package top.vlor.strategy;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 22:18 2018/11/6
 * @Modified by：
 */
public class Client {
    private double total = 0.0d;

    public void btn_Onclick(Object sender, String selectItem, String price, String num){
        CashSuper cashSuper = CashFactory.createCashAccept(selectItem);
        double totalPrices = 0.0d;
        totalPrices = cashSuper.acceptCash(Double.parseDouble(price) * Double.parseDouble(num));
        total += totalPrices;
    }

    public void btn_OnclickTwo (String selectItem, String price, String num){
        CashContext cc = new CashContext(selectItem);
        double totalPrices = 0.0d;
        totalPrices = cc.getResult(Double.parseDouble(price) * Double.parseDouble(num));
        total += totalPrices;
    }
}
