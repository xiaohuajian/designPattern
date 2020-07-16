package com.company.state.better;

public class SoldOutState implements State {


    transient BetterGumballMachine gumballMachine;

    public SoldOutState(BetterGumballMachine machine){
        this.gumballMachine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("投币无效，糖果已卖完");
    }

    @Override
    public void ejectMoney() {
        System.out.println("操作无效，你未投钱无法退钱");
    }

    @Override
    public void makeGumball() {
        System.out.println("糖果已卖完");
    }

    @Override
    public void dispense() {
        System.out.println("糖果已卖完");
    }
}
