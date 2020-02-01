package com.academITschool.level1;

import java.util.Arrays;

public class ArrayTasks {
    private static double getMaxNumber(double[] array) {
        double maxNumber = array[0];

        for (double e : array) {
            if (e > maxNumber) {
                maxNumber = e;
            }
        }

        return maxNumber;
    }

    private static int getNumberIndex(double[] array, double number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }

    private static double getAverageOfEvenNumbers(double[] array) {
        double evenSum = 0;
        int evenNumbersAmount = 0;

        for (double e : array) {
            if (e % 2 == 0) {
                evenSum += e;
                ++evenNumbersAmount;
            }
        }

        return evenSum / evenNumbersAmount;
    }

    private static void revertArray(double[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            double tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }

    private static void changeToUpperCase(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stringArray[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        double[] array = {1.2, 2, -6, 7, 1, 5, 3};

        System.out.println("Массив вещественных чисел = " + Arrays.toString(array));
        System.out.println();

        System.out.println("Наибольшее число в массиве = " + getMaxNumber(array));
        System.out.println();

        System.out.println("Индекс для числа -6 = " + getNumberIndex(array, -6));
        System.out.println("Индекс для числа 21 = " + getNumberIndex(array, 21));
        System.out.println();

        System.out.println("Среднее арифметическое для четных чисел в массиве = " + getAverageOfEvenNumbers(array));
        System.out.println();

        revertArray(array);
        System.out.println("Массив с элементами в обратном порядке = " + Arrays.toString(array));
        System.out.println();

        String[] stringsArray = {"март", "апрель", "май"};

        System.out.println("Массив строк = " + Arrays.toString(stringsArray));

        changeToUpperCase(stringsArray);
        System.out.println("Массив строк в верхнем регистре = " + Arrays.toString(stringsArray));
    }
}

