package com.academITschool.level1;

public class DoWhile {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 15;
        int numbersAmount = (number2 - number1) + 1;
        int sum = 0;
        int i = number1;
        do {
            sum += i;
            ++i;
        } while (i <= number2);

        double average = (double) sum / numbersAmount;
        System.out.println("Среднее арифметическое всех чисел диапазона - " + average);

        int evenSum = 0;
        int evenNumbersAmount = 0;
        i = number1;
        do {
            if (i % 2 == 0) {
                evenSum += i;
                ++evenNumbersAmount;
            }
            ++i;
        } while (i <= number2);

        double evenAverage = (double) evenSum / evenNumbersAmount;
        System.out.println("Среднее арифметическое четных чисел диапазона - " + evenAverage);
    }
}


//    Сделать задачу про среднее арифметическое с
//циклом do-while