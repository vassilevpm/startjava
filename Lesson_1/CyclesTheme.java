public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int sumEven = 0;
        int sumOdd = 0;
        int i = -10;
        do {
            if(i % 2 == 0) {
                sumEven += i;
                i++;
            } else {
                sumOdd += i;
                i++;
            }
        } while(i < 22);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + 
                sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int a = 10;
        int b = 5;
        int c = -1;
        int min = 0;
        int max = 0;
        if (a < b){
            min = a;
        }else{
            min = b;
        }
        if (min > c){
            min = c;
        }
        if (a > b){
            max = a;
        }else{
            max = b;
        }
        if (max < c){
            max = c;
        }
        for(i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int srcNum = 1234;
        int sumDigits = 0;
        int digit = srcNum % 10;
        System.out.print("Реверсивное число: ");
        while(srcNum > 0) {
            System.out.print(digit);
            sumDigits += digit;
            srcNum /= 10;
        }
        System.out.println("\nСумма цифр числа 1234 равна " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int count = 0;
        for(i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            count++;
            if(count == 5) {
                System.out.println();
                count = 0;
            }
        }
        for(i = count; i < 5; i++) {
            System.out.printf("%3d", 0);    
        }

        System.out.println("\n\n5. Проверка количества единиц на четность\n");
        srcNum = 3141591;
        int digitCounter = 0;
        while(srcNum > 0) {
            if(srcNum % 10 == 1) {
                digitCounter++;
            }
            srcNum /= 10;
        }
        srcNum = 3141591;
        System.out.println("число " + srcNum + " содержит " + digitCounter + 
                ((digitCounter % 2 == 0) ? "(четное)" : "(нечетное)") + " количество единиц");

        System.out.println("\n6. Отображение фигур в консоли\n");
        for(i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        i = 5;
        int j = 0;
        while(i >= 0) {
            while(j <= i) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            j = 0;
            i--;
        }
        System.out.println();

        i = 1;
        j = 1;
        do {
            if(i <= 3) {
                j = 1;
                do {
                    System.out.print("$");
                    j++;
                } while(j <= i);
                System.out.println();
                i++;
            }
            if(i > 3) {
                j = 5 - i;
                do {
                    System.out.print("$");
                    j--;
                } while(j >= 0);
                System.out.println();
                i++;
            }
        } while(i < 6);        

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.println("Dec" + " Char");
        for(i = 0; i < 48; i++) {
            if(i % 2 == 1) {
                System.out.format("%3s %4s %n", i, (char) i);
            }
        }
        for(i = 97; i <= 122; i++) {
            if(i % 2 == 0) {
                System.out.format("%3s %4s %n", i, (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        srcNum = 1234321;
        int copySrcNum = srcNum;
        int reverse = 0;
        while (srcNum != 0) {
            digit = srcNum % 10;
            reverse = reverse * 10 + digit;
            srcNum /= 10;
        }
        System.out.println("число " + copySrcNum + ((copySrcNum == reverse) ? "" : "не") 
                + " является палиндромом");
                

        System.out.println("\n9. Определение, является ли число счастливым\n");
        srcNum = 785569;
        int step = 1;
        int sum1 = 0;
        int sum2 = 0;
        digit = 0;
        while(srcNum != 0) {
            digit = srcNum % 10;
            if(step <= 3) {
                sum2 += digit;
            } else {
                sum1 += digit;
            }
            step++;
            srcNum /= 10;
        }
        System.out.println("Сумма первой тройки цифр = " + sum1);
        System.out.println("Сумма второй тройки цифр = " + sum2);
        System.out.println((sum1 == sum2) ? "Число счастливое" : "Число несчастливое");

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        for (i = 1; i < 10; i++) {
            if(i == 2) {
                System.out.println(" ______________________________");
            }
            for (j = 1; j < 10; j++)
                if(j == 1) {
                    System.out.printf("%4d %1s", i * j, (char) 124);
                } else {
                    System.out.printf("%3d", i * j);
                }
            System.out.println();
        }    
    }
}