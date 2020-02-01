package com.academITschool.level1;

import java.util.Scanner;

public class MaxSubstringLength {
    private static int getMaxSubstringLength(String string) {
        String s = string.toLowerCase();

        if (s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int maxSubstringLength = 1;
        int substringLength = 1;

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            char nextSymbol = s.charAt(i + 1);

            if (symbol == nextSymbol) {
                ++substringLength;

                if (i + 1 == s.length() - 1) {
                    if (substringLength > maxSubstringLength) {
                        maxSubstringLength = substringLength;
                    }

                    return maxSubstringLength;
                }
            } else {
                if (substringLength > maxSubstringLength) {
                    maxSubstringLength = substringLength;
                }
                substringLength = 1;
            }
        }

        return maxSubstringLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String enteredString = scanner.nextLine();

        System.out.println(getMaxSubstringLength(enteredString));
    }
}


//    Написать функцию, которая ищет в строке подстроку
//    максимальной длины, состоящую из одного и того же
//        символа, и выдает эту максимальную длину
//        •
//        Например, есть строка " аааббдеггггв ", должно выдаться
//        число 4, потому что есть 4 подряд символа «г», и это
//        максимальная подстрока, где подряд идет один и тот же
//        символ
//        •
//        Функция должна работать без учета регистра