package com.dahua.test;

import com.company.state.better.SoldOutState;
import com.google.gson.Gson;

public class Test {


    public static void main(String[] args) {

//        Gson gson = new Gson();
//        gson.toJson(1);            // ==> 1
//        gson.toJson("abcd");       // ==> "abcd"
//        gson.toJson(new Long(10)); // ==> 10
//        int[] values = { 1 ,2};
//        gson.toJson(values);       // ==> [1]
//
//        System.out.println(gson.toJson(1) + gson.toJson("abcd") +gson.toJson(values));
//
//// Deserialization
//        int one = gson.fromJson("1", int.class);
//        Integer one1 = gson.fromJson("1", Integer.class);
//
//        System.out.println(one + one1);

        String str= "AC# ";
        String [] temp = str.split("#");
        System.out.println(temp.length);

    }
}
