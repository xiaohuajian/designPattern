package com.company.decorator.example_starbuzz.decorate;

import com.company.decorator.example_starbuzz.Beverage;

/**
 * Created by 41082 on 2018/5/31.
 * 这里的继承为了实现类型匹配 而不是继承父类的属性和行为
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 调料的说明（和基类的getDescription作用不一样）
     * @return
     */
    public abstract String getCondimentDescrption();


}
