package com.company.state.better;

public class SoldState implements State {

    transient BetterGumballMachine gumballMachine;

    public SoldState(BetterGumballMachine machine){
        this.gumballMachine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("我们正在生产糖果，请等待");
    }

    @Override
    public void ejectMoney() {
        System.out.println("正在售货，无法退钱");
    }

    @Override
    public void makeGumball() {
        System.out.println("正在给你出售糖果，不要重复操作");
        dispense();
    }

    @Override
    public void dispense() {
        if (gumballMachine.count == 0){
            System.out.println("注意一下，糖果已经卖完了");
            gumballMachine.curState = gumballMachine.getSoldOutState();
        }else {
            gumballMachine.curState = gumballMachine.getNoMoneyState();
            System.out.println("投给你了糖果，请查收");
            gumballMachine.count = gumballMachine.count -1;
        }
    }
}
