package com.academITschool.level1;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициент a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите коэффициент b: ");
        double b = scanner.nextDouble();

        System.out.println("Введите коэффициент c: ");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(a) <= epsilon && Math.abs(b) <= epsilon) {
            if (Math.abs(c) <= epsilon) {
                System.out.println("Уравнение имеет бесконечное множество решений.");
            } else {
                System.out.println("Нет решения.");
            }
        } else if (Math.abs(a) <= epsilon) {
            double x = -c / b;
            System.out.println("x = " + x);
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant < -epsilon) {
                System.out.println("Нет решения.");
            } else if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);
                System.out.println("x = " + x);
            } else {
                double discriminantSqrt = Math.sqrt(discriminant);
                double x1 = (-b + discriminantSqrt) / (2 * a);
                double x2 = (-b - discriminantSqrt) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}





