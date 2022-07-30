package com.startjava.lesson_2_3_4.animal;

public class Wolf {
    private String sex;
    private String name;
    private double weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Идёт");
    }

    public void seat() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void hawl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}