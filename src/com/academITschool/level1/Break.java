package com.academITschool.level1;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        String fixedString = "guess";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите загаданную строку: ");
            String enteredString = scanner.nextLine();

            if (enteredString.equals(fixedString)) {
                System.out.println("Вы угадали!");
                break;
            }

            System.out.println("Вы не угадали, попробуйте еще раз.");
        } while (true);
    }
}

//    В программе должна быть некоторая загаданная
//    фиксированная строка
//• Далее программа предлагает пользователю ввести строку,
//        пользователь вводит
//        • Если введена та загаданная строка, то программа должна
//        завершаться
//        • Иначе пользователю дается следующая попытка для ввода
//        и т.д., пока не введет правильно. При этом каждый раз
//        пользователю должно выдаваться приглашение для ввода
//        • В этой задаче используйте бесконечный цикл и break