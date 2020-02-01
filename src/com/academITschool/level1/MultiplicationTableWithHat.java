package com.academITschool.level1;

public class MultiplicationTableWithHat {
    public static void main(String[] args) {
        int size = 12;

        System.out.print("       |");

        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int i = 0; i < size + 2; i++) {
            System.out.print("  --");
        }
        System.out.println();

        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d   |", i);

            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }
    }
}


//    Вывести в консоль таблицу умножения чисел от 1 до 10 при помощи циклов for
//        •Но программа должна работать верно и если попросят таблицу от 1 до другого числа
//        •Примерно так, только без границ клеток, консоль этого не позволяет
//        •Добейтесь чтобы числа были выровнены по столбцам (добейте числа нужным количеством пробелов)
//        •Добавьте «шапку» таблицы, отделите ее символами, например, | и --

//
//        2. System.out.printf("%4d", (i + 1));
//        Чтобы не приходилось на каждой итерации вычислять значение выражения (i + 1), нужно изменить границы соответствующего цикла.
//        Это нужно поправить почти во всех циклах
//
//        3. System.out.printf("%4d", (i + 1));
//        System.out.print("   |");
//        Это можно распечатать одним вызовом printf
