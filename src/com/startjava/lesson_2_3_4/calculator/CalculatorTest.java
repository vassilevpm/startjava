package com.startjava.lesson_2_3_4.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;
        do {
            System.out.println("Введите первое число:");
            int x = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите знак математической операции:");
            char operation = sc.nextLine().charAt(0);
            System.out.println("Введите второе число:");
            int y = sc.nextInt();
            calculator.calculate(x, y, operation);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = sc.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}