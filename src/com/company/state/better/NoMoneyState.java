package com.company.state.better;

public class NoMoneyState implements State {

    transient BetterGumballMachine gumballMachine;

    public NoMoneyState(BetterGumballMachine machine){
        this.gumballMachine = machine;
    }


    @Override
    public void insertMoney() {
        System.out.println("投币成功");
        gumballMachine.curState = gumballMachine.getHasMoneyState();
    }

    @Override
    public void ejectMoney() {
        System.out.println("操作无效，你未投钱无法退钱");
    }

    @Override
    public void makeGumball() {
        System.out.println("操作无效，你未投钱无法给你糖果");
    }

    @Override
    public void dispense() {
        System.out.println("操作无效，你未投钱无法给你糖果");
    }
}
