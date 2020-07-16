package com.company.strategy.flyBehavior;

/**
 * Created by 41082 on 2018/5/24.
 */
public class FlyNoWing implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("没有翅膀不能飞");
    }
}
