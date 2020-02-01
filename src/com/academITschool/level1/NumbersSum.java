package com.academITschool.level1;

public class NumbersSum {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 9) {
            sum += i;
            ++i;
        }
        System.out.println("Сумма чисел от 1 до 9 - " + sum);

        i = 3;
        sum = 0;
        int evenNumbersSum = 0;
        while (i <= 21) {
            if (i % 2 == 0) {
                sum += i;
                ++evenNumbersSum;
            }
            ++i;
        }
        System.out.println("Сумма чисел от 3 до 21 - " + sum);
        System.out.println("Количество четных чисел - " + evenNumbersSum);
    }
}

//    Найти сумму чисел от 0 до 9
//        • Переделать программу, чтобы найти сумму от 3 до
//        21 включительно
//        • Переделать программу, чтобы найти сумму только
//        четных чисел от 3 до 21 включительно
//        • Дополнительно найти количество четных чисел от 3
//        до 21 включительно