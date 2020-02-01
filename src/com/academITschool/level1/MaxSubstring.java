package com.academITschool.level1;

import java.util.Scanner;

public class MaxSubstring {
    private static int getMaxSubstringLength(String string) {
        int maxSubstringLength = 1;
        int substringLength = 1;

        if (string.length() == 0) {
            return 0;
        } else if (string.length() == 1) {
            return 1;
        } else {
            String s = string.toLowerCase();

            for (int i = 0; i < s.length() - 1; i++) {
                char symbol = s.charAt(i);
                char nextSymbol = s.charAt(i + 1);

                if (symbol == nextSymbol) {
                    ++substringLength;

                    if (i + 1 == s.length() - 1) {
                        if (substringLength > maxSubstringLength) {
                            maxSubstringLength = substringLength;
                            substringLength = 1;
                        }
                    }
                } else {
                    if (substringLength > maxSubstringLength) {
                        maxSubstringLength = substringLength;
                        substringLength = 1;
                    }
                }
            }

            return maxSubstringLength;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String enteredString = scanner.nextLine();

        System.out.println("Длина максимальной подстроки = " + getMaxSubstringLength(enteredString));
    }
}


