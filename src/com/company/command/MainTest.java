package com.company.command;

import com.company.command.commandreceiver.Light;
import com.company.command.commandrequest.RemoteControl;
import com.company.command.concretecommand.LightOnCommand;

/**
 * Created by 41082 on 2018/7/4.
 */
public class MainTest {

    public static void main(String[] args) {
        // 命令发出者
        RemoteControl remoteControl = new RemoteControl();
        // 命令传递者
        CommandConveier commandConveier = new CommandConveier();
        // 具体的命令
        LightOnCommand lightOnCommand = new LightOnCommand();
        // 命令接收者
        Light light = new Light();

        // 命令发出者绑定传递者
        remoteControl.setCommandConveier(commandConveier);
        // 传递者接收命令
        commandConveier.setCommand(lightOnCommand);
        // 命令选定执行者
        lightOnCommand.setLightReciver(light);
        // 命令传递者调用命令
        commandConveier.invokeCommand();
    }
}
