package com.company.adapter;

/**
 * Created by 41082 on 2018/7/10.
 */
public class mainTest {

    public static void main(String[] args) {
        Turky turky = new WildTurkey();
        turky.fly();
        turky.gobble();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();

        TurkyAdapter turkyAdapter = new TurkyAdapter(turky);
        turkyAdapter.fly();
        turkyAdapter.quack();
    }
}
