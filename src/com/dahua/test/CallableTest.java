package com.dahua.test;

import java.util.concurrent.*;

public class CallableTest implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "sjh";
    }


    public static void main(String[] args) throws Exception {
        CallableTest callableTest = new CallableTest();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(callableTest);
        System.out.println(future.get());
        System.out.println(callableTest.call());
        MyRunnable myRunnable = new MyRunnable();
//        try {
//            executorService.execute(myRunnable);
//        }catch (Exception e){
//            System.out.println(e);
//        }
        executorService.execute(myRunnable);
    }

    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    System.out.println("异常补货");
                }
            });
            System.out.println("run");
            throw new RuntimeException("运行时异常");
        }
    }
}
