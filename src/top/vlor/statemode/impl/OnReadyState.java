package top.vlor.statemode.impl;

import top.vlor.statemode.CandyMachine;
import top.vlor.statemode.State;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 14:54 2018/6/27
 * @Modified by：
 */
public class OnReadyState implements State {

    private CandyMachine mCandyMachine;
    public OnReadyState(CandyMachine mCandyMachine)
    {
        this.mCandyMachine=mCandyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("you have inserted a coin,next,please turn crank!");
        mCandyMachine.setState(mCandyMachine.mHasCoin);
    }

    @Override
    public void returnCoin() {
        System.out.println("you haven't inserted a coin yet!");
    }

    @Override
    public void turnCrack() {
        System.out.println("you turned,but you haven't inserted a coin!");
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {
        System.out.println("***OnReadyState***");
    }
}
