package com.academITschool.level1;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password = "coolpassword";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пароль: ");
        String enteredPassword = scanner.nextLine();

        if (password.equals(enteredPassword)) {
            System.out.println("Пароль верный.");
        } else {
            if (enteredPassword.length() > password.length()) {
                System.out.println("Неверный пароль. Строка слишком длинная.");
            } else if (enteredPassword.length() < password.length()) {
                System.out.println("Неверный пароль. Строка слишком короткая.");
            } else {
                System.out.println("Неверный пароль.");
            }
        }
    }
}

