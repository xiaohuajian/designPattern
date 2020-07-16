package com.company.factory.product;

/**
 * Created by 41082 on 2018/6/28.
 * 扮演着产品类，
 * 所有pizza的父类，还有其他种类的 如：芝士，香肠，脆皮等等
 */
public class Pizza {

    private String type;

    public Pizza() {
    }

    public Pizza(String type) {
        this.type = type;
    }

    public void prepare(){
        System.out.println("prepare");
    }

    public void cut(){
        System.out.println("cut");
    }

    public void box(){
        System.out.println("box");
    }
}
