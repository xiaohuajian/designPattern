package com.company.decorator.example_starbuzz.decorate;

import com.company.decorator.example_starbuzz.Beverage;

/**
 * Created by 41082 on 2018/5/31.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getCondimentDescrption() {
        return beverage.getCondimentDescrption() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
