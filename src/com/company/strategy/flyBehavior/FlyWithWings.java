package com.company.strategy.flyBehavior;

/**
 * Created by 41082 on 2018/5/24.
 * 采用这种抽出变化的部分，并作为一个接口，而且用类来实现这个接口，并且把所有的变化有类来表示 这种方式是最好的方式：即利用了接口抽象定义，又避免了接口的不能进行代码复用
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("有翅膀可以飞");
    }
}
