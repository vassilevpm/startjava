package com.startjava.lesson_1;

public class MyFirstGame {
    public static void main(String[] args) {
        int startRange = 0;
        int endRange = 100;
        int playerAnswer  = 0;
        int targetNumber = 49;
        while(playerAnswer  != targetNumber) {
            playerAnswer  += (endRange - startRange) / 2;
            if(playerAnswer  > targetNumber) {
                System.out.println("число " + playerAnswer  + " больше того, что загадал компьютер");
                endRange = playerAnswer ;
                playerAnswer  = startRange;
            } else if(playerAnswer  < targetNumber) {
                System.out.println("число " + playerAnswer  + " меньше того, что загадал компьютер");
                startRange = playerAnswer ;
            }
        }
        System.out.println("Вы победили!");
    }
}