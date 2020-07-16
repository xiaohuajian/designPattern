package com.dahua.test;



import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class People {

    private volatile String name;

    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People() {
        System.out.println("People");
    }



    private People(String name) {
        this.name = name;
    }

    private People(String name, int age) {
        this.name = name;
    }


    public static void main(String[] args) {

        Class<People> peopleClass = People.class;
        try {
            Constructor constructor = peopleClass.getConstructor(String.class);
            Constructor constructor2 = peopleClass.getDeclaredConstructor(String.class, int.class);
            Constructor[] constructor1 =  peopleClass.getConstructors();
            System.out.println(constructor1.length);
            System.out.println(constructor2.newInstance("sjh", 2));
            try {
                People people = (People) constructor.newInstance("sjh");
                System.out.println(people.getName());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
