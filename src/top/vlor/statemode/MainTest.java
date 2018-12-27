package top.vlor.statemode;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 15:11 2018/6/27
 * @Modified by：
 */
public class MainTest {
    public static void main(String[] args) {
        CandyMachine mCandyMachine  = new CandyMachine(6);

        mCandyMachine.printstate();

        mCandyMachine.insertCoin();
        mCandyMachine.printstate();

        mCandyMachine.returnCoin();
        mCandyMachine.printstate();

        mCandyMachine.turnCrank();
        mCandyMachine.printstate();

        mCandyMachine.insertCoin();
        mCandyMachine.printstate();

        mCandyMachine.turnCrank();
        mCandyMachine.printstate();
    }
}
