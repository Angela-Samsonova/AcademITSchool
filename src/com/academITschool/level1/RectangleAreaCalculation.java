package com.academITschool.level1;

import java.util.Scanner;

public class RectangleAreaCalculation {
    private static int calculateArea(int height, int width) {
        return height * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer for height:");
        int height = scanner.nextInt();

        System.out.println("Enter an integer for width:");
        int width = scanner.nextInt();

        System.out.println(calculateArea(height, width)); // пришлось вывести на печать, иначе были ворнинги
    }
}
