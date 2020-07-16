package com.company.state.better.proxy;

import com.company.state.better.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}
