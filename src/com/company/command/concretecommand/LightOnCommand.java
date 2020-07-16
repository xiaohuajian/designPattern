package com.company.command.concretecommand;

import com.company.command.Commad;
import com.company.command.commandreceiver.Light;

/**
 * Created by 41082 on 2018/7/4.
 * 具体的命令
 * 组合命令执行者来执行命令，可以理解为light执行了此命令 LightOnCommand
 */
public class LightOnCommand implements Commad {

    Light light;

    /**
     * 设置命令的执行人
     * @param lightReciver
     */
    public void setLightReciver(Light lightReciver){
        light = lightReciver;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}
