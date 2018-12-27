package top.vlor.statemode.impl;

import top.vlor.statemode.CandyMachine;
import top.vlor.statemode.State;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 15:01 2018/6/27
 * @Modified by：
 */
public class SoldOutState implements State {

    private CandyMachine mCandyMachine;
    public SoldOutState(CandyMachine mCandyMachine)
    {
        this.mCandyMachine=mCandyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("you can't insert coin,the machine sold out!");
    }

    @Override
    public void returnCoin() {
        System.out.println("you can't return,you haven't inserted a coin yet!");
    }

    @Override
    public void turnCrack() {
        System.out.println("you turned,but there are no candies!");
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {
        System.out.println("***SoldOutState***");
    }
}
