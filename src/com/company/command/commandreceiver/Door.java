package com.company.command.commandreceiver;

/**
 * Created by 41082 on 2018/7/4.
 */
public class Door {

    /**
     * 命令的具体执行方式
     */
    public void DoorOn(){
        System.out.println("门打开了");
    }

    /**
     * 命令的具体执行方式
     */
    public void DoorOff(){
        System.out.println("门关了");
    }
}
