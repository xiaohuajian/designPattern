package com.company.state.better;

public class HasMoneyState implements State {

    transient BetterGumballMachine gumballMachine;

    public HasMoneyState(BetterGumballMachine machine){
        this.gumballMachine = machine;
    }


    @Override
    public void insertMoney() {
        System.out.println("你已透过币");
    }

    @Override
    public void ejectMoney() {
        System.out.println("退钱成功");
        gumballMachine.curState = gumballMachine.getNoMoneyState();
    }

    @Override
    public void makeGumball() {
        System.out.println("正在售货,请等待...");
        gumballMachine.curState = gumballMachine.soldState;
    }

    @Override
    public void dispense() {
        System.out.println("正在计算中，状态变为售卖状态");
    }
}
