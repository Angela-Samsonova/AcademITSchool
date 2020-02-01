package com.academITschool.level1;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a1 = 15;
        int b1 = 3;
        System.out.println("a1 = " + a1 + ", b1 = " + b1);
        int c1 = a1 + b1;
        System.out.println("a1 + b1 = " + c1);
        c1 = a1 - b1;
        System.out.println("a1 - b1 = " + c1);
        c1 = a1 * b1;
        System.out.println("a1 * b1 = " + c1);
        c1 = a1 / b1;
        System.out.println("a1 / b1 = " + c1);
        c1 = a1 % b1;
        System.out.println("a1 % b1 = " + c1);
        System.out.println();

        double a2 = 15.5;
        double b2 = 3.0;
        System.out.println("a2 = " + a2 + ", b2 = " + b2);
        double c2 = a2 + b2;
        System.out.println("a2 + b2 = " + c2);
        c2 = a2 - b2;
        System.out.println("a2 - b2 = " + c2);
        c2 = a2 * b2;
        System.out.println("a2 * b2 = " + c2);
        c2 = a2 / b2;
        System.out.println("a2 / b2 = " + c2);
        System.out.println();

        int a3 = 7;
        int b3 = 3;
        System.out.println("int a3 = " + a3 + ", int b3 = " + b3);
        int c3 = a3 / b3;
        System.out.println("a3 / b3 = " + c3);
        double c4 = (double) a3 / b3;
        System.out.println("(double)a3 / b3 = " + c4);
    }
}
