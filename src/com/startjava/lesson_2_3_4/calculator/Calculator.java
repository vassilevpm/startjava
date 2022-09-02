package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    public static int calculate(String mathExpression) {
        String[] mathArr = mathExpression.split(" ");
        int x = Integer.parseInt(mathArr[0]);
        int y = Integer.parseInt(mathArr[2]);
        char operation = mathArr[1].charAt(0);
        return switch (operation) {
            case '+' -> Math.addExact(x, y);
            case '-' -> Math.subtractExact(x, y);
            case '*' -> Math.multiplyExact(x, y);
            case '%' -> Math.floorMod(x, y);
            case '/' -> Math.floorDiv(x, y);
            case '^' -> (int) Math.pow(x, y);
            default -> throw new IllegalStateException("Введен неверный математический знак! " + operation);
        };
    }
}