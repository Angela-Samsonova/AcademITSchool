package com.academITschool.level1;

public class ExpressionsCalculations {
    public static void main(String[] args) {
        double x = 3 - (((56 - 12) / 44.0) * (4.0 / 2));
        System.out.println("x = " + x);
        System.out.println();

        double y = (2.0 * x) / (33 - x);
        System.out.println("y = " + y);
        System.out.println();

        double z = -x / (2.0 * y);
        System.out.println("z = " + z);
    }
}
