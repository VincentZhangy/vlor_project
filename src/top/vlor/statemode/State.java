package top.vlor.statemode;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 14:39 2018/6/27
 * @Modified by：
 */
public interface State {

    /**
     * 投币
     */
    public void insertCoin();

    /**
     * 退币
     */
    public void returnCoin();

    /**
     * 转动曲柄
     */
    public void turnCrack();

    /**
     * 售出糖果
     */
    public void dispense();

    /**
     * 打印状态
     */
    public void printstate();
}
