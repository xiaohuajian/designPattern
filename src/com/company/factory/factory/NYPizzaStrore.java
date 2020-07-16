package com.company.factory.factory;

import com.company.factory.product.Pizza;

/**
 * Created by 41082 on 2018/6/28.
 * pizza的子类 纽约店
 */
public class NYPizzaStrore extends PizzaStore {

    @Override
    protected Pizza createPizza(Pizza type) {
        System.out.println("纽约店生产了一个" + type.getClass().getName() +"的pizza");
        return type;
    }
}
