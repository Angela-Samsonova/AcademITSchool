package com.academITschool.level1;

import java.util.Arrays;

public class QuickSort {
    private static void quickSort(int[] a, int left, int right) {
        if (right <= left) {
            return;
        }

        if (right == left + 1) {
            if (a[left] > a[right]) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }

            return;
        }

        int x = a[left];
        int i = left;
        int j = right;

        while (i <= j) {
            while (a[i] < x) {
                i++;
            }

            while (a[j] > x) {
                j--;
            }

            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        if (i < right) {
            quickSort(a, i, right);
        }

        if (j > left) {
            quickSort(a, left, j);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{22, 6, 11, 8, 3, 1, 5, 9};
        int left = 0;
        int right = array.length - 1;

        quickSort(array, left, right);

        System.out.println("Отсортированный массив - " + Arrays.toString(array));
    }
}

