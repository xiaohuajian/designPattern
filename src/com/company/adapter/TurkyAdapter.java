package com.company.adapter;

/**
 * Created by 41082 on 2018/7/10.
 */
public class TurkyAdapter implements Duck {
    Turky mTurky;

    public TurkyAdapter(Turky mTurky) {
        this.mTurky = mTurky;
    }

    @Override
    public void quack() {
        mTurky.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 2; i++) {
            mTurky.fly();
        }
    }
}
