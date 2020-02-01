package com.academITschool.level1;

import java.util.Scanner;

public class FibonacciNumbers {
    private static int getFibonacciNumberByIndex(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int number1 = 0;
        int number2 = 1;
        int number3 = 1;

        for (int i = 1; i < n; i++) {
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }
        return number3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер числа Фибоначчи в последовательности: ");
        int fibonacciNumberIndex = scanner.nextInt();

        System.out.println("Число Фибоначчи с номером " + fibonacciNumberIndex + " равно " + getFibonacciNumberByIndex(fibonacciNumberIndex));
    }
}

//    Написать программу, которая принимает с консоли
//        целое число n и возвращает число Фибоначчи с
//        номером n.
//        • Числа Фибоначчи задаются следующим образом:
//        • fo = 0, f1 = 1, fn = fn-1 + fn-2
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946
