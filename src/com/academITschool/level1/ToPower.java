package com.academITschool.level1;

public class ToPower {
    private static int pow(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return pow(number, power - 1) * number;
    }

    private static int powNoRecursion(int number, int power) {
        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(pow(4, 2));
        System.out.println(pow(0, 2));
        System.out.println(pow(2, 4));
        System.out.println(pow(4, 0));

        System.out.println(powNoRecursion(2, 3));
    }
}
//Задача «Возведение в степень»
////        • Написать рекурсивную функцию возведения целого числа в
////        целую неотрицательную степень (упрощенный аналог
////        Math.pow)
////        • Нельзя использовать Math.pow
////        • Когда закончите – напишите тут же нерекурсивную
////        функцию