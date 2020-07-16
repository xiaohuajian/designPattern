package com.company.adapter;

/**
 * Created by 41082 on 2018/7/10.
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("MallardDuck quack");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck fly");
    }
}
