package com.company.responsibilityChain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Test {


    public static void main(String[] args) {

//        Support alice   = new NoSupport("Alice");
//        Support bob     = new LimitSupport("Bob", 100);
//        Support charlie = new SpecialSupport("Charlie", 429);
//        Support diana   = new LimitSupport("Diana", 200);
//        Support elmo    = new OddSupport("Elmo");
//        Support fred    = new LimitSupport("Fred", 300);
//
//        alice.setNext(charlie).setNext(diana).setNext(elmo).setNext(fred).setNext(bob);
//
//        for(int i=0;i<100;i+=33) {
//            alice.support(new Trouble(i));
//        }

//        Calendar calendar = Calendar.getInstance();
//
//        Date date1 = calendar.getTime();
//        calendar.add(Calendar.MONTH, 3);
//        Date date2 = calendar.getTime();
//
//        System.out.println(date1);
//        System.out.println(date2);
//        int a = (int) ((date2.getTime() - date1.getTime()) / (24 * 60 * 60 * 1000));
//        System.out.println(a);


        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String str = (df.format(new Date())).replace("-", "");// new Date()为获取当前系统时间
        System.out.println(Integer.valueOf(str));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("test");
            if (list.get(i)> 0){

                //break;
            }
        }


    }
}
