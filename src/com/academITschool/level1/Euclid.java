package com.academITschool.level1;

import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число a: ");
        int a = scanner.nextInt();

        System.out.println("Введите целое число b: ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Оба числа не должны быть равными 0.");
        } else if (b == 0) {
            System.out.println("Наибольший общий делитель = " + a);
        } else {
            while (a % b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            System.out.println("Наибольший общий делитель = " + b);
        }
    }
}





