package com.startjava.lesson_2_3.guess;

public class Player {
    
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number <= 0 || number > 100) {
            System.out.println("Введите корректное число!");
        } else {
            this.number = number;
        }
    }
}