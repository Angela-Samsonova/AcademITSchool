package com.academITschool.level1;

import java.util.Arrays;

public class InsertionSort {
    private static void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int start = array[i];
            int j = i - 1;

            while (j >= 0 && start < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = start;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 6, 2, 7, 44, 1, 4};

        sortArray(array);
        System.out.println("Отсортированный массив - " + Arrays.toString(array));
    }
}

//    Пусть i индекс первого элемента неотсортированной части
//        •
//        Запоминаем в переменную temp элемент array[ i
//        •
//        Идем справа налево по отсортированной части при помощи
//        счетчика j , сначала он равен i 1
//        •
//        Если j 0 или temp array[j] j], то заканчиваем идти
//        •
//        Вставляем temp по индексу j + 1
//        •
//        На этом итерация завершена
//        •
//        Иначе сдвигаем array[j] вправо
//        •
//        array [j + 1] = array[