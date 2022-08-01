package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        int len = intArr.length;
        printArr(intArr);
        for(int i = 0; i < len / 2; i++) {
            int tmp = intArr[i];
            intArr[i] = intArr[len - 1 - i];
            intArr[len - 1 - i] = tmp;
        }
        printArr(intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;
        for(int i = 0; i < len; i++) {
            intArr[i] = i;
        }
        int prod = 1;
        for(int i = 1; i < len - 1; i++) {
            prod *= intArr[i];
            System.out.print(intArr[i] + ((i < len - 2) ? " * " :  " = " + prod));
        }
        System.out.printf("\nПод индексом '0' в массиве значение %d. " +
                "\nПод индексом '9' в массиве значение %d. \n", intArr[0], intArr[len - 1]);

        System.out.println("\n\nУдаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        double midpoint = doubleArr[len / 2];
        int counter = 0;
        System.out.println("Исходный массив");
        for (int i = 0; i < len; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f  ", doubleArr[i]);
        }
        System.out.println("\nИзмененный массив");
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > midpoint) {
                doubleArr[i] = 0;
                counter++;

            }
            if (i == 8) {
                System.out.println();
            }
            System.out.printf(doubleArr[i] == 0 ? "%.0f   " : "%.3f   ", doubleArr[i]);
        }

        System.out.print("\nКоличество обнуленных ячеек = " + counter);

        System.out.println("\n\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        len = charArr.length;
        for(int i = 0; i < len; i++) {
            charArr[i] = (char) (65 + i);
        }
        for(int i = 0; i <= len; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(charArr[len - 1 - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        Random random = new Random();
        int[] uniqueNums = new int[30];
        len = uniqueNums.length;
        for(int i = 0; i < len; i++) {
            while (true) {
                boolean unique = false;
                int number = random.nextInt(41) + 60;
                for(int j = 0; j < i; j++) {
                    if(number == uniqueNums[j]) {
                        unique = true;
                        break;
                    }
                }
                if(!unique) {
                    uniqueNums[i] = number;
                    break;
                }
            }
        }
        counter = 0;
        for(int j = 0; j < len; j++) {
            counter++;
            if(counter == 11) {
                System.out.println();
                counter = 1;
            }
            Arrays.sort(uniqueNums);
            System.out.printf("%4s", uniqueNums[j]);
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] arrWithEmptyStrings = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        len = arrWithEmptyStrings.length;
        int count = 0;
        for (String s : arrWithEmptyStrings) {
            if (!s.isBlank()) {
                count++;
            }
        }
        String[] arrWithoutEmptyStrings = new String[count];
        int numberRowsCopy = arrWithoutEmptyStrings.length;
        count = 0;
        for (int i = 0; i < arrWithoutEmptyStrings.length; i++) {
            for (int j = 0; j < len; j++) {
                j = count;
                if (!arrWithEmptyStrings[j].isBlank()) {
                    System.arraycopy(arrWithEmptyStrings, j, arrWithoutEmptyStrings, i, numberRowsCopy);
                    numberRowsCopy -= 1;
                    count++;
                    break;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(arrWithEmptyStrings));
        System.out.println(Arrays.toString(arrWithoutEmptyStrings));
    }

    private static void printArr(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}