package com.academITschool.level1;

import java.util.Arrays;

public class BubbleSort {
    private static void sortArray(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            boolean hasSwaps = false;

            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    hasSwaps = true;
                }
            }

            if (!hasSwaps) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 1, 2, 7, 44, 1, 4, 8};

        sortArray(array);

        System.out.println("Отсортированный массив - " + Arrays.toString(array));
    }
}