package com.company.strategy;

import com.company.strategy.MallardDuck;
import com.company.strategy.ModelDuck;
import com.company.strategy.flyBehavior.FlyWithRocket;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.swim();

        //动态改变fly行为，且不依赖构造器
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBevior(new FlyWithRocket());
        modelDuck.performFly();
    }
}
