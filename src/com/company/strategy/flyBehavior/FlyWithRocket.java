package com.company.strategy.flyBehavior;

/**
 * Created by 41082 on 2018/5/25.
 * 由于把飞行行为抽离出来后，后续对其的扩展很方便
 */
public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("用火箭实现飞行");
    }
}
