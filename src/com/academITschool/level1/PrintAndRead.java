package com.academITschool.level1;

import java.util.Scanner;

public class PrintAndRead {
    public static int inviteAndRead(String invite) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(invite);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println(inviteAndRead("Введите число:"));

        System.out.println(inviteAndRead("Введите целое число:"));
    }
}


//    Написать функцию, которая объединяет в себе две
//операции: вывод пользователю приглашения для ввода в
//        консоль и чтение int’а с консоли
//        • Функция должна принимать строку и возвращать
//        прочитанное число
//        • Из функции main несколько раз вызвать данную функцию с
//        разными значениями аргументов
//        • Пример, как функция будет вызываться:
//        int a = printAndRead(“Введите число:”)