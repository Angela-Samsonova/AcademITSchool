package com.academITschool.level1;

import java.util.Arrays;

public class HeapSort {
    private static void convertToHeap(int[] array, int arrayLength, int i) {
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;
        int largestElementIndex = i;

        if (leftChildIndex < arrayLength && array[leftChildIndex] > array[largestElementIndex]) {
            largestElementIndex = leftChildIndex;
        }

        if (rightChildIndex < arrayLength && array[rightChildIndex] > array[largestElementIndex]) {
            largestElementIndex = rightChildIndex;
        }

        if (largestElementIndex != i) {
            int temp = array[i];
            array[i] = array[largestElementIndex];
            array[largestElementIndex] = temp;
            convertToHeap(array, arrayLength, largestElementIndex);
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

        for (int i = length - 1; i >= 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            convertToHeap(a, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{11, 6, 22, 8, 3, 1, 5, 9, 15, 2};

        sortArray(array);

        System.out.println("Отсортированный массив - " + Arrays.toString(array));
    }
}

//1. Нужно сделать эту задачу без рекурсии
//
//        2. В sortArray во втором цикле for нужно уменьшить количество итераций

