package com.academITschool.level1;

public class MultiplicationTable {
    private static int[][] createMultiplicationTable(int size) {
        int[][] table = new int[size][size];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (j + 1) * (i + 1);
            }
        }

        return table;
    }

    public static void main(String[] args) {
        int[][] multiplicationTable = createMultiplicationTable(10);

        for (int[] row : multiplicationTable) {
            for (int e : row) {
                System.out.printf("%4d", e);
            }
            System.out.println();
        }
    }
}

//    Задача на дом «Таблица умнож массив»
//        • Написать функцию, которая создает двумерный массив с
//        таблицей умножения
//        • Размер таблицы должен быть параметром функции
//        • Вызвать функцию и распечатать результат в main

//        for (int i = 0; i < multiplicationTable.length; i++) {
//            for (int j = 0; j < multiplicationTable.length; j++) {
//                System.out.printf("%4d", multiplicationTable[i][j]);
//            }
//            System.out.println();
//        }