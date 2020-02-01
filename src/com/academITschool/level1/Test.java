package com.academITschool.level1;

public class Test {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void printFibonacci(int length) {
        for (int i = 0; i < length; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
//        printFibonacci(10);
//        System.out.println();
//        System.out.println(fibonacci(7));

        System.out.println(4 % 5);
    }
}
