package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите математическое выражение:");
            System.out.println("Результат вычисления: " + Calculator.calculate(sc.nextLine()));
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = sc.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}