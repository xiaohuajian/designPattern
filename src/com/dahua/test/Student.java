package com.dahua.test;

public class Student extends People{
    Animal animal1 = new Animal();

    public Student() {
        System.out.println("student");
    }

    Animal animal = new Animal();

    public static void main(String[] args) {
        new Student();

    }

}
