package com.company.decorator.example_starbuzz.concrete_component;

import com.company.decorator.example_starbuzz.Beverage;

/**
 * Created by 41082 on 2018/5/31.
 */
public class DarkRoast extends Beverage {

    @Override
    public double cost() {
        return 1.0;
    }


}
