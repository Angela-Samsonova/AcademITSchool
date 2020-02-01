package com.academITschool.level1;

import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел ряда: ");
        int numbersCount = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= numbersCount; i++) {
            if (i % 2 != 0) {
                sum += (i * i);
            } else {
                sum -= (i * i);
            }
        }

        System.out.println("Сумма ряда = " + sum);
    }
}

//    Написать программу, которая находит результат такого
//        выражения:
//        • 1 – 4 + 9 – 16 + 25 – 36 ...
//        • Количество чисел в этом выражении должно быть
//        параметром программы

//RowSum:

//        2. Количество чисел должно вводиться с консоли.
//        При этом оно может быть любым положительным числом.
//        Сейчас для некоторых количеств работает неверно
//        3. Слово digit неверное по смыслу, т.к. оно переводится "цифра"