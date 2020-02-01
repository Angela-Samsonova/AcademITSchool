package com.academITschool.level1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 100;
        Random random = new Random();
        int number = random.nextInt((maxNumber - minNumber) + 1) + minNumber;
        int guessesCount = 0;

        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            ++guessesCount;

            System.out.println("Введите число от " + minNumber + " до " + maxNumber + ":");
            int enteredNumber = scanner.nextInt();

            if (enteredNumber == number) {
                System.out.println("Вы угадали, количество попыток = " + guessesCount);
                break;
            }

            if (enteredNumber > number) {
                System.out.println("Введенное число больше");
            } else {
                System.out.println("Введенное число меньше");
            }
        }
    }
}


//
//    Напишите программу-игру, которая делает следующее:
//        •Компьютер загадывает случайное число от 1 до 100 включительно
//        •Для генерации случайного числа используйте класс Random
//        •Далее задача пользователя – отгадать число
//        •Вы вводите свою догадку. Если ввели верно, то игра завершается, и компьютер выводит за сколько попыток вы отгадали число
//        •Если ввели неверно, то компьютер должен сообщить, загаданное число больше или меньше
//        •Число попыток у пользователя не ограничено

