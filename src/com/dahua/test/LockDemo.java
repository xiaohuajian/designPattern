package com.dahua.test;

import java.util.concurrent.locks.Lock;

public class LockDemo {

    synchronized void a(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("a");
    }

    synchronized void b(){
        System.out.println("b");
    }

    void c(){
        System.out.println("c");
    }

    public static void main(String[] args) {
        LockDemo lockDemo = new LockDemo();

        new Thread(new Runnable() {
            @Override
            public void run() {
                lockDemo.a();
                System.out.println(System.currentTimeMillis());
            }
        }).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                lockDemo.c();
                System.out.println(System.currentTimeMillis());
            }
        }).start();


    }
}
