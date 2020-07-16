package com.company.state.better;

public class WinState implements State {

    transient BetterGumballMachine gumballMachine;

    public WinState(BetterGumballMachine machine){
        this.gumballMachine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("操作无效");
    }

    @Override
    public void ejectMoney() {
        System.out.println("操作无效");
    }

    @Override
    public void makeGumball() {
        System.out.println("操作无效");
    }

    @Override
    public void dispense() {
        System.out.println("给你2个糖果");

    }
}
