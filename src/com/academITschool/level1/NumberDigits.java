package com.academITschool.level1;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        String numberString = scanner.nextLine();

        int digitsCount = numberString.length();
        int number = Integer.parseInt(numberString);
        int allDigitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        while (digitsCount > 0) {
            int digit = number % 10;
            allDigitsSum += digit;

            if (digit % 2 != 0) {
                oddDigitsSum += digit;
            }

            if (digit > maxDigit) {
                maxDigit = digit;
            }

            number /= 10;
            --digitsCount;
        }

        System.out.println("Сумма всех цифр числа = " + allDigitsSum);
        System.out.println("Сумма всех нечетных цифр числа = " + oddDigitsSum);
        System.out.println("Максимальная цифра числа = " + maxDigit);
    }
}

//• Прочитать с консоли целое число
//        • Найдите сумму его цифр
//        • Найдите сумму только тех цифр числа, которые являются
//        нечетными числами
//        • Найдите максимальную цифру числа

