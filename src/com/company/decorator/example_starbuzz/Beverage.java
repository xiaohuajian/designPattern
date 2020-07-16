package com.company.decorator.example_starbuzz;

/**
 * Created by 41082 on 2018/5/31.
 * 具体的组件 （顶层组件，抽象所有公共属性）
 */
public abstract class Beverage {

    protected String descrption;

    protected String size;

    public String getCondimentDescrption(){
        return descrption;
    }

    public void setDescrption(String descrption){
        this.descrption = descrption;
    }

    public abstract double cost();

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }
}
