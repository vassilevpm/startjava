package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    public static int calculate(String mathExpression) {
        String[] mathArr = mathExpression.split(" ");
        if (mathArr.length != 3) {
            throw new IllegalArgumentException("Вы ввели неправильное выражение!\n" + "Пример: 67 + 45");
        }
        int x = Integer.parseInt(mathArr[0]);
        int y = Integer.parseInt(mathArr[2]);
        if (x < 1 || y < 1 || x % 1 != 0 || y % 1 != 0) {
            throw new IllegalArgumentException("Вы ввели число неверного формата. " +
                    "Числа должны быть целыми положительными");
        }
        char operation = mathArr[1].charAt(0);
        return switch (operation) {
            case '+' -> Math.addExact(x, y);
            case '-' -> Math.subtractExact(x, y);
            case '*' -> Math.multiplyExact(x, y);
            case '%' -> Math.floorMod(x, y);
            case '/' -> Math.floorDiv(x, y);
            case '^' -> (int) Math.pow(x, y);
            default -> throw new IllegalStateException("Введен неверный математический знак! " + operation +
                    "Разрешены знаки: +, -, *, /, %. ^");
        };
    }
}