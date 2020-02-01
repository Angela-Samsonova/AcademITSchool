package com.academITschool.level1;

public class Palindrome {
    private static boolean isPalindrome(String string) {
        String s = string.toLowerCase();

        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            while (!Character.isLetter(s.charAt(leftIndex)) && leftIndex < rightIndex) {
                ++leftIndex;
            }

            if (leftIndex == rightIndex) {
                return true;
            }

            while (!Character.isLetter(s.charAt(rightIndex))) {
                --rightIndex;
            }

            if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                return false;
            }

            ++leftIndex;
            --rightIndex;
        }

        return true;
    }

    public static void main(String[] args) {
        String enteredString = "1234";
        System.out.println("Строка является палиндромом - " + isPalindrome(enteredString));
    }
}

// "а роза упала на лапу азора  ", "1234", "Ф/*-+=Ф", "абБА".

//    Объявить некоторую строковую переменную в программе
//•
//        Проверить, что данная строка является палиндромом то
//        есть читается одинаково слева направо и справа налево.
//        •
//        При проверке не учитывать регистр символов, учитывать
//        только буквы
//        •
//        Пример палиндрома: «Аргентина манит негра »
//        •
//        Требование : сделать без создания новой строки и без
//        удаления символов из строки
