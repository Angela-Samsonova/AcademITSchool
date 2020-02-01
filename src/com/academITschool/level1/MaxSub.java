package com.academITschool.level1;

import java.util.Scanner;

public class MaxSub {
    private static int getMaxSubstringLength(String s) {
        int maxSubstringLength = 1;
        int SubstringLength = 1;

        if (s.length() == 1) {
            return 1;
        } else {
            for (int i = 0; i < s.length() - 1; i++) {
                char symbol = s.charAt(i);
                char nextSymbol = s.charAt(i + 1);

                if (symbol == nextSymbol) {
                    ++SubstringLength;

                    if (i + 1 == s.length() - 1) {
                        if (SubstringLength > maxSubstringLength) {
                            maxSubstringLength = SubstringLength;
                            SubstringLength = 1;
                        }
                    }
                } else {
                    if (SubstringLength > maxSubstringLength) {
                        maxSubstringLength = SubstringLength;
                        SubstringLength = 1;
                    }
                }
            }

            return maxSubstringLength;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String enteredString = scanner.nextLine().toLowerCase();

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