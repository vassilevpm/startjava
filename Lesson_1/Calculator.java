public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 7;
        int secondNumber = 3;
        char operation = '^';
        int result = 1;
        if(operation == '+') {
            result = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + result);
        }
        if(operation == '-') {
            result = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + result);
        }
        if(operation == '*') {
            result = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        }
        if(operation == '%') {
            result = firstNumber % secondNumber;
            System.out.println(firstNumber + " % " + secondNumber + " = " + result);
        }
        if(operation == '/') {
            if(secondNumber != 0) {
                result = firstNumber / secondNumber;
                System.out.println(firstNumber + " / " + secondNumber + " = " + result);
            } else {
                System.out.println("Error!!! Делить на ноль нельзя!");
            }
        }
        if(operation == '^') {
            int i = 1;
            //result = firstNumber;
            if(secondNumber == 0) {
                System.out.println(firstNumber + " ^ " + secondNumber + " = " + 1);
            } else {
                while(i <= secondNumber) {
                    i++;
                    result *= firstNumber;
                }
                System.out.println(firstNumber + " ^ " + secondNumber + " = " + result);
            }
        }
    }
}