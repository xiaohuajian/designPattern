package com.company.adapter;

/**
 * Created by 41082 on 2018/7/10.
 */
public class WildTurkey implements Turky {

    @Override
    public void gobble() {
        System.out.println("WildTurky gobble");
    }

    @Override
    public void fly() {
        System.out.println("wildTurky fly");
    }
}
