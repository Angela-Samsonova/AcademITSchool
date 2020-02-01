package com.academITschool.level1;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int day = scanner.nextInt();

        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        int daysInMonthNumber;

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonthNumber = 30;
        } else if (month == 2 && !isLeapYear) {
            daysInMonthNumber = 28;
        } else if (month == 2) {
            daysInMonthNumber = 29;
        } else {
            daysInMonthNumber = 31;
        }

        if (day < 1 || day > daysInMonthNumber || month < 1 || month > 12 || year < 1) {
            System.out.println("Дата некорректна.");
        } else {
            if (day == daysInMonthNumber && month == 12) {
                System.out.println("01.01." + (year + 1));
            } else if (day == daysInMonthNumber) {
                System.out.printf("01.%02d.%d", (month + 1), year);
            } else {
                System.out.printf("%02d.%02d.%d", (day + 1), month, year);
            }
        }
    }
}

//•
//        Программа запрашивает сегодняшнюю дату, и выдает дату
//        следующего дня
//        •
//        Например, входные данные: 31 12 2015, на выходе:
//        01.01.2016
//        •
//        День, месяц и год можно запрашивать у пользователя с
//        консоли по очереди
//        •
//        Еще сделать проверку даты на корректность

//        2. firstDay - можно обойтись без этой переменной.
//        Либо стоит объявить ее позже, ближе к месту первого использования
