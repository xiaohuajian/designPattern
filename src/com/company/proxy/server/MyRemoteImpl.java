package com.company.proxy.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    @Override
    public String sayHello() throws RemoteException {
        return "I am server ,i say hello";
    }

    public MyRemoteImpl() throws RemoteException{}

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            LocateRegistry.createRegistry(8891);
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Naming.rebind("RemoteHello", service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
