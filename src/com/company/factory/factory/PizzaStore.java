package com.company.factory.factory;

import com.company.factory.product.Pizza;

/**
 * Created by 41082 on 2018/6/28.
 * 相当于facotry 而生产具体的东西由子类去实现
 *
 * 工厂模式和泛型生成器结合，或者是项目中source 运用以及推送的时候运用
 *
 */
public abstract class PizzaStore {
    /**
     * 该订单并不知道此生产的pizza是什么类型的，而决定类型的是商店决定的
     * @param type
     * @return
     */
    public Pizza orderPizza(Pizza type){
        Pizza pizza;
        // 这是变化的部分 抽离出来由子类去实现
        pizza = createPizza(type);
        // 这是固定的部分
        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    //通过商店制造一个pizza ，只关心会有一个pizza 不关心是什么样的pizza
    protected abstract Pizza createPizza(Pizza type);
}
