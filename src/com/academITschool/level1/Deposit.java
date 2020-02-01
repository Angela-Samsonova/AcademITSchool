package com.academITschool.level1;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальную сумму вклада: ");
        double initialAmount = scanner.nextDouble();

        System.out.println("Введите срок вклада в месяцах: ");
        int periodInMonths = scanner.nextInt();

        System.out.println("Введите годовую процентную ставку (например, 12): ");
        double interest = scanner.nextDouble();

        final int monthsInYearCount = 12;
        final int percentsTotalCount = 100;

        double multiplicationCoefficient = interest / monthsInYearCount / percentsTotalCount;
        double resultingAmount = initialAmount;

        for (int i = 1; i <= periodInMonths; i++) {
            resultingAmount += resultingAmount * multiplicationCoefficient;
        }

        double income = resultingAmount - initialAmount;

        System.out.println("Итоговая сумма = " + resultingAmount);
        System.out.println("Доход = " + income);
    }
}

//    Напишите программу, которая рассчитывает сумму банковского вклада с заданной ставкой % годовых на заданное число месяцев
//       •Вклад с капитализацией – считаем, что после истечения каждого месяца к сумме вклада прибавляется процент от
//        суммы вклада на начало месяца
//       •Также распечатать прибыль
