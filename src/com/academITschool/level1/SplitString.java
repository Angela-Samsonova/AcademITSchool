package com.academITschool.level1;

public class SplitString {
    public static void main(String[] args) {
        String numbersLine = "1, 2, 3, 4, 5";
        String[] numbersString = numbersLine.split(", ");
        int numbersSum = 0;

        for (String number : numbersString) {
            int parsedNumber = Integer.parseInt(number);
            numbersSum += parsedNumber;
        }

        System.out.println(numbersSum);
    }
}

//Задача «Разбиение строки»
//        •
//        Разбить строку “1, 2, 3, 4, 5” и получить массив из
//        этих чисел и найти их сумму
//        •
//        Использовать split и Integer .parseInt