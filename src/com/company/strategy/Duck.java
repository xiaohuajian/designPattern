package com.company.strategy;

import com.company.strategy.flyBehavior.FlyBehavior;

/**
 * Created by 41082 on 2018/5/24.
 */
public abstract class Duck {


    protected String name;

    public FlyBehavior mFlyBevior;

    public Duck(){
        System.out.println("父类构造方法");
    }

    public Duck(FlyBehavior flyBehavior){
        this.mFlyBevior = flyBehavior;
    }

    protected void swim(){
        System.out.println("duck can swim");
    }


    protected abstract void display();



    protected void performFly(){
        mFlyBevior.fly();
    }

    // 通过此方法来动态实现鸭子的行为，而不是在让子类在构造器中去实现；而且随时可以改变
    public void setFlyBevior(FlyBehavior flyBevior){
        this.mFlyBevior = flyBevior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
