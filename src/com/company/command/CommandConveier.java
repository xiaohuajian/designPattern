package com.company.command;

/**
 * Created by 41082 on 2018/7/4.
 * 命令转达者
 * 这个中间环节可以省略的
 */
public class CommandConveier {


    Commad command;

    /**
     * 命令请求者进行命令输入
     * @param command
     */
    public void setCommand(Commad command) {
        this.command = command;

    }

    /**
     * 请求者发出命令
     */
    public void invokeCommand(){
        command.execute();
    }
}
