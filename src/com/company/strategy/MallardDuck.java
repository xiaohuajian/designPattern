package com.company.strategy;


import com.company.strategy.flyBehavior.FlyWithWings;

/**
 * Created by 41082 on 2018/5/24.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        //这种在构造方式中实现引用 同时也是一直委托的思想把会飞的实现 delegate了fly的实现，并不是Duck及其子类来完成的
        System.out.println("子类方法");
        mFlyBevior = new FlyWithWings();
    }

    @Override
    protected void performFly() {
        super.performFly();
        System.out.println("MallardDuck");
    }

    @Override
    protected void swim() {

    }

    @Override
    protected void display() {
        System.out.println("name" + MallardDuck.class.getName());
    }
}
