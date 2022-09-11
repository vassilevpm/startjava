package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите математическое выражение:");
            try {
                System.out.println("Результат вычисления: " + Calculator.calculate(sc.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println("Введено число неверного формата! Числа должны быть целыми.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = sc.nextLine();
                sc.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}