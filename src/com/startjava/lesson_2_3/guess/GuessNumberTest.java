package com.startjava.lesson_2_3.guess;
import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(sc.next());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(sc.next());

        GuessNumber game = new GuessNumber(player1, player2);
        String answer;

        do {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = sc.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));

        System.out.println("Игра окончена...");
    }
}