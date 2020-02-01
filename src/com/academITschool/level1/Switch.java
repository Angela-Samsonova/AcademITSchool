package com.academITschool.level1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.println("Введите код команды от 1 до 4: ");
        int code = scanner.nextInt();

        switch (code) {
            case 1:
                System.out.println("Cумма двух чисел - " + (number1 + number2));
                break;
            case 2:
                System.out.println("Разность двух чисел - " + (number1 - number2));
                break;
            case 3:
                System.out.println("Результат умножения двух чисел - " + (number1 * number2));
                break;
            case 4:
                System.out.println("Результат деления двух чисел - " + ((double) number1 / number2));
                break;
            default:
                System.out.println("Неизвестная операция.");
        }
    }
}


//    Прочитать с консоли три числа – два операнда и
//        код команды
//        • Код команды должен быть от 1 до 4
//        • Если он равен 1, то выполнить сложение первых
//        двух чисел. Если 2, то вычитание, если 3, то
//        умножение, если 4, то деление.
//        • Если ввели число не от 1 до 4, то вывести, что
//        неизвестная операция
//        • Использовать switch