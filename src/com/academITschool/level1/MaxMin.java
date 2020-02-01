package com.academITschool.level1;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        int max;
        int min;

        if (number1 > number2) {
            max = number1;
            min = number2;
        } else {
            min = number1;
            max = number2;
        }
        System.out.printf("Max = %d, min = %d", max, min);
        System.out.println();
        System.out.println();

        System.out.println("Введите третье целое число: ");
        int number3 = scanner.nextInt();

        System.out.println("Введите четвертое целое число: ");
        int number4 = scanner.nextInt();

        max = (number3 > number4) ? number3 : number4;
        min = (number3 < number4) ? number3 : number4;
        System.out.printf("Max = %d, min = %d", max, min);
    }
}

