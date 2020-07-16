package com.company.decorator.example_starbuzz.concrete_component;

import com.company.decorator.example_starbuzz.Beverage;

/**
 * Created by 41082 on 2018/5/31.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        descrption = HouseBlend.class.getName();
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
