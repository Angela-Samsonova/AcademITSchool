package com.academITschool.level1;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер квартиры: ");
        int flatNumber = scanner.nextInt();

        System.out.println("Введите количество этажей: ");
        int storeysAmount = scanner.nextInt();

        System.out.println("Введите количество подъездов: ");
        int entrancesAmount = scanner.nextInt();

        int flatsAmountPerStorey = 4;
        int flatsAmountPerEntrance = flatsAmountPerStorey * storeysAmount;
        int totalFlatsAmount = (flatsAmountPerEntrance * entrancesAmount);

        if (flatNumber > totalFlatsAmount) {
            System.out.println("Квартиры " + flatNumber + " в этом доме нет.");
        } else if (flatNumber <= 0) {
            System.out.println("Квартир с такими номерами не существует.");
        } else {
            int storeyNumber = ((flatNumber - 1) % flatsAmountPerEntrance) / flatsAmountPerStorey + 1;
            System.out.println("Квартира находится на " + storeyNumber + " этаже.");

            int entranceNumber = ((flatNumber - 1) / flatsAmountPerEntrance) + 1;
            System.out.println("Квартира находится в подъезде " + entranceNumber + ".");

            if (flatNumber % flatsAmountPerStorey == 1) {
                System.out.println("Квартира - ближняя слева.");
            } else if (flatNumber % flatsAmountPerStorey == 2) {
                System.out.println("Квартира - дальняя слева.");
            } else if ((flatNumber % flatsAmountPerStorey) == 3) {
                System.out.println("Квартира - дальняя справа.");
            } else {
                System.out.println("Квартира - ближняя справа.");
            }
        }
    }
}



