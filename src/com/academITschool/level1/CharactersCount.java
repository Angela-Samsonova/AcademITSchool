package com.academITschool.level1;

import java.util.Scanner;

public class CharactersCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String enteredString = scanner.nextLine();

        int whitespacesCount = 0;
        int symbolsCount = 0;
        int digitsCount = 0;
        int lettersCount = 0;

        for (int i = 0; i < enteredString.length(); ++i) {
            if (Character.isWhitespace(enteredString.charAt(i))) {
                whitespacesCount++;
            } else if (Character.isLetter(enteredString.charAt(i))) {
                lettersCount++;
            } else if (Character.isDigit(enteredString.charAt(i))) {
                digitsCount++;
            } else {
                symbolsCount++;
            }
        }

        System.out.println("Число букв в строке = " + lettersCount);
        System.out.println("Число цифр в строке = " + digitsCount);
        System.out.println("Число пробелов в строке = " + whitespacesCount);
        System.out.println("Число остальных символов в строке = " + symbolsCount);
    }
}

//    Прочитать с консоли строку
//•
//        Вывести число букв в этой строке
//        •
//        Вывести число цифр в этой строке
//        •
//        Вывести число пробелов в этой строке
//        •
//        Вывести число остальных символов в строке