package com.company.gc;

import java.util.HashMap;

public class FinalizeEscapeGC {

    public static FinalizeEscapeGC save_hook = null;


    public void  isAlive(){
        System.out.println("is alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed");
        FinalizeEscapeGC.save_hook = null;
    }

    public static void main(String[] args) {
        save_hook = new FinalizeEscapeGC();
        save_hook = null;
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (save_hook != null){
            save_hook.isAlive();
        }else {
            System.out.println("i am dead");
        }

        System.out.println("----------------");
        save_hook = null;
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (save_hook != null){
            save_hook.isAlive();
        }else {
            System.out.println("i am dead");
        }
    }
}
