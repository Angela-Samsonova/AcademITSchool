package com.academITschool.level1;

import java.util.Arrays;

public class SelectionSort {
    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minElementIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }

            int temp = array[minElementIndex];
            array[minElementIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] newArray = new int[]{3, 6, 2, 7, 44, 1, 4};

        sortArray(newArray);
        System.out.println("Отсортированный массив - " + Arrays.toString(newArray));
    }
}

