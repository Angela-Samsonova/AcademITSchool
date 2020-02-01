package com.academITschool.level1;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число верхней границы: ");
        int maxNumber = scanner.nextInt();

        for (int i = 2; i <= maxNumber; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

//    Прочитать с консоли целое число
//        • Найти и распечатать все простые числа, не превышающие
//        введенное число
//
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109,