package com.company.factory;

import com.company.factory.factory.NYPizzaStrore;
import com.company.factory.factory.PizzaStore;
import com.company.factory.product.NYStyleCHeesePizza;

/**
 * Created by 41082 on 2018/6/28.
 */
public class main {

    public static void main(String[] args) {
        /* joke 想要从纽约店里点一个pizza **/
        // 1. 先选择一个商店 （利用父类用子类实现的特点）
        PizzaStore pizzaStore = new NYPizzaStrore();

        // 2. 接着就可以创建订单了
        pizzaStore.orderPizza(new NYStyleCHeesePizza());
    }


}
