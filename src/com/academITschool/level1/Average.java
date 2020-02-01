package com.academITschool.level1;

public class Average {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 15;
        int sum = 0;
        int numbersAmount = (number2 - number1) + 1;
        int i = number1;
        while (i <= number2) {
            sum += i;
            ++i;
        }
        double average = (double) sum / numbersAmount;
        System.out.println("Среднее арифметическое всех чисел диапазона - " + average);

        int evenSum = 0;
        i = number1;
        int evenNumbersAmount = 0;
        while (i <= number2) {
            if (i % 2 == 0) {
                evenSum += i;
                ++evenNumbersAmount;
            }
            ++i;
        }
        double evenAverage = (double) evenSum / evenNumbersAmount;
        System.out.println("Среднее арифметическое четных чисел диапазона - " + evenAverage);
    }
}

//    Написать программу, вычисляющую среднее
//        арифметическое чисел из некоторого диапазона чисел
//        (например, от 3 до 17)
//        • Концы диапазона задать переменными, начальное число
//        берите > 1, чтобы было посложнее
//        • Среднее арифметическое чисел – нужно сумму всех чисел
//        поделить на количество этих чисел
//        • Ниже в этом же классе - найти среднее арифметическое
//        только четных чисел из этого диапазона чисел