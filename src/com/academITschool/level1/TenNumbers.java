package com.academITschool.level1;

import java.util.Scanner;

public class TenNumbers {
    public static void main(String[] args) {
        //простой вывод

        int number1 = 1;
        int number2 = 100;
        int i = number1;
        while (i <= number2) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
            ++i;
        }

        //форматированный вывод

        i = number1;
        while (i <= number2) {
            System.out.printf("%4d", i);
            if (i % 10 == 0) {
                System.out.println();
            }
            ++i;
        }
        System.out.println();

        /*Возможность задать начальное и конечное число, и по
        сколько чисел в строке выводить */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число: ");
        number1 = scanner.nextInt();

        System.out.println("Введите конечное число: ");
        number2 = scanner.nextInt();

        System.out.println("Введите количество чисел в строке: ");
        int numbersPerLine = scanner.nextInt();
        System.out.println();

        i = number1;
        int numbersPerLineCounter = 0;
        while (i <= number2) {
            numbersPerLineCounter++;
            System.out.printf("%4d", i);
            if (numbersPerLineCounter % numbersPerLine == 0) {
                System.out.println();
            }
            ++i;
        }
    }
}


//    Распечатать числа от 1 до 100 при помощи цикла while, но
//        выводить по 10 чисел в строке, дальше делать перевод
//        строки
//        • 1 2 3 4 5 6 7 8 9 10
//        11 12 13 14 15 16 17 18 19 20
//        …
//        • Сложная версия задачи:
//        • Выводить числа ровно, чтобы они были друг под
//        другом. Использовать System.out.printf
//        • Возможность задать начальное и конечное число, и по
//        сколько чисел в строке выводить
