package com.academITschool.level1;

import java.util.Arrays;

public class HeapSortNonRecursive {
    private static void convertToHeap(int[] array, int arrayLength, int i) {
        int largestElementIndex = i;

        while (largestElementIndex * 2 + 1 < arrayLength) {
            int maxChildIndex = largestElementIndex * 2 + 1;
            int rightChildIndex = largestElementIndex * 2 + 2;

            if (rightChildIndex < arrayLength && array[maxChildIndex] < array[rightChildIndex]) {
                maxChildIndex = rightChildIndex;
            }

            if (array[largestElementIndex] < array[maxChildIndex]) {
                int tmp = array[largestElementIndex];
                array[largestElementIndex] = array[maxChildIndex];
                array[maxChildIndex] = tmp;

                largestElementIndex = maxChildIndex;
            } else {
                return;
            }
        }
    }

    private static void sortArray(int[] a) {
        if (a.length <= 1) {
            return;
        }

        int length = a.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            convertToHeap(a, length, i);
        }

        for (int i = length - 1; i >= 1; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            convertToHeap(a, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 9, 0, 6, 5, 6, 3, 7, 2};

        sortArray(array);

        System.out.println("Отсортированный массив - " + Arrays.toString(array));
    }
}
