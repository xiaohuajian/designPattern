package com.company.command.commandreceiver;

/**
 * Created by 41082 on 2018/7/4.
 * 命令的receiver
 */
public class Light {
    /**
     * 命令的具体执行方式
     */
    public void lightOn(){
        System.out.println("灯打开了");
    }

    /**
     * 命令的具体执行方式
     */
    public void lightOff(){
        System.out.println("灯关了");
    }
}
