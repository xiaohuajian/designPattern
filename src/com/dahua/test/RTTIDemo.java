package com.dahua.test;

public class RTTIDemo {


    public static String A = "静态字段";

    {
        System.out.println("代码块执行");
    }

    static {
        System.out.println("静态代码块");
    }

    public RTTIDemo(){
        System.out.println("RTTIDemo构造方法");
    }

    public void print(){
        System.out.println("print");
    }

    People mPeople = new People();

    public static void method(){
        System.out.println("静态方法");
    }

    public static void main(String[] args) {
        RTTIDemo rttiDemo = new RTTIDemo();
        RTTIDemo rttiDemo1 =new RTTIDemo();
//        rttiDemo1.method();
//
//        Class<People> peopleClass = People.class;
//        System.out.println(peopleClass);
//        try {
//            Class peopleClass1 = Class.forName("com.dahua.test.People");
//            System.out.println(peopleClass1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
