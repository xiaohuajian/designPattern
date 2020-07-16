package com.company.state.better;

import com.company.state.better.proxy.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 改良版的糖果机器
 */

public class BetterGumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    State hasMoneyState;
    State noMoneyState;
    State soldState;
    State soldOutState;
    State winState;

    State curState;
    int count = 0;
    String location;

    public BetterGumballMachine(int count) throws RemoteException{

        hasMoneyState = new HasMoneyState(this);
        noMoneyState = new NoMoneyState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winState = new WinState(this);
        this.count = count;
        if (count > 0){
            curState = noMoneyState;
        }

    }

    public BetterGumballMachine(int count, String location)throws RemoteException{
        hasMoneyState = new HasMoneyState(this);
        noMoneyState = new NoMoneyState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winState = new WinState(this);
        this.count = count;
        if (count > 0){
            curState = noMoneyState;
        }
        this.location = location;
    }



    public void releaseBoll(){
        System.out.println("一个糖果给你了");
        count = count -1;
    }


    @Override
    public String getLocation() throws RemoteException {
        return "我的位置" + location;
    }

    @Override
    public State getState() throws RemoteException {
        return curState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(State hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(State noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }



    public static void main(String[] args) throws RemoteException {
//        BetterGumballMachine machine = new BetterGumballMachine(6);
//
//        machine.curState.insertMoney();
//        machine.curState.makeGumball();
//        machine.curState.dispense();

          BetterGumballMachine machine = new BetterGumballMachine(6, "china");
        try {
            Naming.rebind("gumball", machine);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
