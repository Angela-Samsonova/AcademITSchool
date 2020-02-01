package com.academITschool.level1;

import java.util.Arrays;

public class SortingCheck {
    private static boolean isSortedIncrease(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isSortedDecrease(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};

        System.out.println("Массив array1 = " + Arrays.toString(array1));
        System.out.println("Массив array1 отсортирован по возрастанию - " + isSortedIncrease(array1));
        System.out.println("Массив array1 отсортирован по убыванию - " + isSortedDecrease(array1));
        System.out.println();

        int[] array2 = {6, 5, 4, 3, 2, 1};

        System.out.println("Массив array2 = " + Arrays.toString(array2));
        System.out.println("Массив array2 отсортирован по возрастанию - " + isSortedIncrease(array2));
        System.out.println("Массив array2 отсортирован по убыванию - " + isSortedDecrease(array2));
    }
}

//    Задача на дом «Проверка сортировки»
//        • Написать функцию, которая проверяет, что массив
//        отсортирован по возрастанию
//        • И написать функцию, которая проверяет, что массив
//        отсортирован по убыванию

