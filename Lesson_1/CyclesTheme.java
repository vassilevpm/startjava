public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int evenSum = 0;
        int oddSum = 0;
        int i = -10;
        do {
            if(i % 2 == 0) {
                evenSum += i;
                i++;
            } else {
                oddSum += i;
                i++;
            }
        } while(i < 22);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + 
                evenSum + ", а нечетных = " + oddSum + "\n");

        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int a = 10;
        int b = 5;
        int c = -1;
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        for(i = max; i >= min; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("3. Вывод реверсивного числа и суммы его цифр\n");
        int srcNum = 1234;
        int digitsSum = 0;
        System.out.print("Реверсивное число: ");
        while(srcNum > 0) {
            System.out.print(srcNum % 10);
            digitsSum += srcNum % 10;
            srcNum /= 10;
        }
        System.out.println("\nСумма цифр числа 1234 равна " + digitsSum + "\n");

        System.out.println("4. Вывод чисел на консоль в несколько строк\n");
        int count = 0;
        for(i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            count++;
            if(count == 5){
                System.out.println();
                count = 0;
            }
        
            }
        for(i = count; i < 5; i++) {
            System.out.printf("%3d", 0);    
        }

        System.out.println("\n5. Проверка количества единиц на четность\n");
        srcNum = 3141591;
        int counter = 0;
        while(srcNum > 0) {
            if(srcNum % 10 == 1){
                counter++;
                srcNum /= 10;
            } else {
                srcNum /= 10;
            }
        }
        System.out.println((counter % 2 == 0)? "число 3141591 содержит " + counter + 
                " (четное) количество единиц\n" : "число 3141591 содержит " + counter + 
                " (нечетное) количество единиц\n");

        System.out.println("6. Отображение фигур в консоли\n");
        for(i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        i = 5;
        int j = 0;
        while(i >= 0){
            while(j <= i) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            j = 0;
            i--;
        }
        i = 1;
        j = 1;
        do {
            if(i <=3) {
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
        System.out.println();

        System.out.println("7. Отображение ASCII-символов\n");
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
        System.out.println();
        System.out.println("8. Проверка, является ли число палиндромом\n");
        srcNum = 1234321;
        int g = srcNum;
        int reverse = 0;
        while (srcNum != 0) {
        int remainder = srcNum % 10;
        reverse = reverse * 10 + remainder;
        srcNum /= 10;
        }
        System.out.println((g == reverse) ? "число " + g + " является палиндромом\n" :
                "число " + srcNum + " не является палиндромом\n");

        System.out.println("9. Определение, является ли число счастливым\n");
        srcNum = 785569;
        int step = 1;
        int sum1 = 0;
        int sum2 = 0;
        int digit = 0;
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
        System.out.println((sum1 == sum2) ? "Число счастливое\n" : "Число несчастливое\n");

        System.out.println("10. Вывод таблицы умножения Пифагора\n");
        for (i = 1; i < 10; i++) {
            if(i == 2){
                System.out.println(" ______________________________");
            }
            for (j = 1; j < 10; j++)
                if(j == 1) {
                    System.out.printf("%4d %1s", i * j, (char) 124);
                } else {
                    System.out.printf("%3d", i * j);
                }
            System.out.print("\n");
        }    
    }
}