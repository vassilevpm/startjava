public class Calculator {
    public static void main(String[] args) {
        int x = 7;
        int y = 3;
        char operation = '^';
        int result = 1;
        if(operation == '/' && y == 0) {
            System.out.println("Error!!! Делить на ноль нельзя!");
        } else {
            if(operation == '+') {
                result = x + y;
            } else if(operation == '-') {
                result = x - y;
            } else if(operation == '*') {
                result = x * y;
            } else if(operation == '%') {
                result = x % y;
            } else if(operation == '/') {
                result = x / y;
            } else if(operation == '^') {
                int i = 1;
                while(i <= y) {
                    i++;
                    result *= x;
                }
            }
            System.out.println(x + " " + operation + " "+ y + " = " + result);
        }
    }
}