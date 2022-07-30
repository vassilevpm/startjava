package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    public void calculate(int x, int y, char operation) {
        int result = 1;
        if(operation == '/' && y == 0) {
            System.out.println("Error!!! Делить на ноль нельзя!");
        } else {
            switch(operation) {
                case '+' :
                    result = x + y;
                    break;
                case '-' :
                    result = x - y;
                    break;
                case '*' :
                    result = x * y;
                    break;
                case '%' :
                    result = x % y;
                    break;
                case '/' :
                    result = x / y;
                    break;
                case '^' :
                    int i = 1;
                    while(i <= y) {
                        i++;
                        result *= x;
                    }
                    break;
            }
            System.out.println(x + " " + operation + " "+ y + " = " + result);
        }
    }
}