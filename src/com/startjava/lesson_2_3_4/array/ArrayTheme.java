package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int len = arr.length;
        printArr(arr);
        for(int i = 0; i < len / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = tmp;
        }
        printArr(arr);

        System.out.println("\n2. Вывод произведения элементов массива");
        arr = new int[10];
        len = arr.length;
        for(int i = 0; i < len; i++) {
            arr[i] = i;
        }
        int prod = 1;
        for(int i = 1; i < len - 1; i++) {
            prod *= arr[i];
            System.out.print(arr[i] + ((i < len - 2) ? " * " :  " = " + prod));
        }
        System.out.printf("\nПод индексом '0' в массиве значение %d. " +
                "\nПод индексом '9' в массиве значение %d. \n", arr[0], arr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for(int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        int middle = (len / 2) + 2;
        int counter = 0;
        System.out.println("Исходный массив");
        for(int j = 0; j < len; j++) {
            counter++;
            if(counter == middle) {
                System.out.print("    ");
            }
            System.out.printf("%.2f  ", doubleArr[j]);
        }
        System.out.println("\nПолученный массив");
        counter = 0;
        int lenArray = 0;
        for(int j = 0; j < len; j++) {
            lenArray++;
            if(lenArray == middle) {
                System.out.print("    ");
            }
            if(doubleArr[j] > doubleArr[middle]) {
                doubleArr[j] = 0;
                counter++;
            }
            String format = doubleArr[j] == 0 ? "%.0f   " : "%.2f   ";
            System.out.printf(format, doubleArr[j]);
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
                System.out.print(charArr[25 - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        Random random = new Random();
        int[] arrUnique = new int[30];
        len = arrUnique.length;
        for(int i = 0; i < len; i++) {
            while (true) {
                boolean isUnique = false;
                int number = random.nextInt(41) + 60;
                for(int j = 0; j < i; j++) {
                    if(number == arrUnique[j]) {
                        isUnique = true;
                        break;
                    }
                }
                if(!isUnique) {
                    arrUnique[i] = number;
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
            Arrays.sort(arrUnique);
            System.out.printf("%4s", arrUnique[j]);
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] stringArr = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        len = stringArr.length;
        counter = 0;
        for(String s : stringArr) {
            if(!s.isBlank()) {
                counter++;
            }
        }
        String[] stringArrFull = new String[counter];
        counter = 0;
        for (int i = 0; i < len; i++) {
            if (!stringArr[i].isBlank()) {
                System.arraycopy(stringArr, i, stringArrFull, counter, 1);
                counter++;
            }
        }
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(stringArrFull));
    }

    private static void printArr(int[] numbs) {
        for (int num : numbs) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}