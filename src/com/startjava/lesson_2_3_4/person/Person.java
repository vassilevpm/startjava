package com.startjava.lesson_2_3_4.person;

public class Person {
    String name = "Павел";
    String sex = "мужской";
    double height = 1.94;
    double weight = 100;
    int age = 36;

    boolean sleep() {
        return false;
    }

    void move() {
        System.out.println("moving");
    }

    String run() {
        return "running";
    }

    void talk(){
        System.out.println("talking");
    }

    void learnJava() {
        System.out.println("learning");
    }
}