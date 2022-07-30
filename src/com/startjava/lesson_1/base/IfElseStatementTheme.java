package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 40;
        if(age > 21) {
            System.out.println("Можете налить себе пару бокалов виски");
        } else {
            System.out.println("А мама разрешает?");
        }
        boolean isMale = true;
        if(!isMale) {
            System.out.println("Красота спасёт мир");
        }
        double height = 1.94;
        if(height < 1.80) {
            System.out.println("Людям маленького роста жить на свете очень просто!");
        } else {
            System.out.println("Дядь, достань воробушка!");
        }
        char firstLetterName = "Pavel".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Здорова, мужик");
        } else if(firstLetterName == 'I') {
            System.out.println("Здравствуйте, Ирина Васильевна");
        } else {
            System.out.println("Добрый день, мой повелитель\n");
        }

        System.out.println("2. Поиск max и min числа\n");
        int number1 = 15;
        int number2 = 194;
        if(number1 > number2) {
            System.out.println(number1 + " больше, чем " + number2);
        } else if(number1 < number2) {
            System.out.println(number2 + " больше, чем " + number1 + "\n");
        } else {
            System.out.println(number2 + " равно " + number1 + "\n");
        }

        System.out.println("3. Работа с числом\n");
        int srcNum = -48;
        System.out.print(srcNum + " это ");
        if(srcNum == 0) {
            System.out.print("ноль!");
        } else {
            if(srcNum % 2 == 0) {
                System.out.print("четное ");
            } else {
                System.out.print("нечетное ");
            }
            if(srcNum > 0) {
                System.out.print("положительное");
            } else {
                System.out.print("отрицательное");
            }
            System.out.println(" число\n");
        }

        System.out.println("4. Поиск одинаковых цифр в числах\n");
        int srcNum1 = 159;
        int srcNum2 = 953;
        System.out.println("У чисел " + srcNum1 + " и " + srcNum2 + " :");
        if(srcNum1 % 10 == srcNum2 % 10) {
            System.out.println("одинаковая цифра " + srcNum1 % 10 + " в разряде №1\n");
        } else if((srcNum1 / 10) % 10 == (srcNum2 / 10) % 10) {
            System.out.println("одинаковая цифра " + (srcNum1 / 10) % 10 + " в разряде №2\n");
        } else if(srcNum1 % 100 == srcNum2 % 100) {
            System.out.println("одинаковая цифра " + srcNum1 % 100 + " в разряде №3\n");
        }

        System.out.println("5. Определение буквы, числа или символа по их коду\n");
        char srcChar = '\u0057';
        System.out.print(srcChar + " это ");
        if(srcChar >= '0' && srcChar <= '9') {
            System.out.print("цифра\n");
        } else if(srcChar >= 'A' && srcChar <= 'Z') {
            System.out.print("большая буква\n");
        } else if(srcChar >= 'a' && srcChar <= 'z') {
            System.out.print("маленькая буква\n");
        } else {
            System.out.print("не буква и не число\n");
        }

        System.out.println("6. Определение суммы вклада и начисленных банком %\n");
        int deposit = 300000;
        double percent;
        if(deposit < 100000) {
            percent = 0.05;
        } else if(deposit >= 100000 && deposit < 300000) {
            percent = 0.07;
        } else {
            percent = 0.1;
        }
        double yearProfit = deposit * percent;
        System.out.println("сумма вклада: " + deposit);
        System.out.println("начисленный процент: " + yearProfit);
        System.out.println("итоговая сумма с процентами: " + (deposit + yearProfit) + "\n");

        System.out.println("7. Определение оценки по предметам\n");
        int historyPercent = 59;
        int programmingPercent = 91;
        int marksSum = 0;
        if(historyPercent <= 60) {
            System.out.println("История - "+ (marksSum += 2));
        } else if(historyPercent > 60 && historyPercent <= 73) {
            System.out.println("История - "+ (marksSum += 3));
        } else if(historyPercent > 73 && historyPercent <= 91) {
            System.out.println("История - "+ (marksSum += 4));
        } else {
            System.out.println("История - "+ (marksSum += 5));
        }
        if(programmingPercent <= 60) {
            System.out.println("Программирование - "+ 2);
            marksSum += 2;
        } else if(programmingPercent > 60 && programmingPercent <= 73) {
            System.out.println("Программирование - "+ 3);
            marksSum += 3;
        } else if(programmingPercent > 73 && programmingPercent <= 91) {
            System.out.println("Программирование - "+ 4);
            marksSum += 4;
        } else {
            System.out.println("Программирование - "+ 5);
            marksSum += 5;
        }
        System.out.println("Средний балл оценок по предметам: " + marksSum / 2);
        System.out.println("Cредний % по предметам: " + 
            (historyPercent + programmingPercent) / 2 + "\n");

        System.out.println("8. Расчет прибыли\n");
        int rentPerMonth = 5000;
        int tradingSum = 13000;
        int costValue = 9000;
        int totalProfit = (tradingSum - costValue - rentPerMonth) * 12;
        if(totalProfit > 0) {
            System.out.println("Прибыль за год составила: +" + totalProfit + " руб.\n");
        } else if(totalProfit <= 0) {
            System.out.println("Прибыль за год составила: " + totalProfit + " руб.\n");
        }

        System.out.println("9. Подсчет количества банкнот\n");
        int totalSum = 567;
        int banknote100 = 0;
        int banknote10 = 0;
        int banknote1 = 0;
        banknote100 = totalSum / 100;
        if(totalSum % 100 >= 50) {
            banknote10 = 5;
            banknote1 = totalSum % 100 - banknote10 * 10;
        } else {
            banknote10 = (totalSum % 100) / 10;
            banknote1 = (totalSum % 10);
        }
        System.out.println("Банкнота 100$: " + banknote100 + " штук");
        System.out.println("Банкнота 10$: " + banknote10 + " штук");
        System.out.println("Банкнота 1$: " + banknote1 + " штук");
        System.out.println("Снято из банкомата: " + 
            (banknote100 * 100 + banknote10 * 10 + banknote1));
    }
}