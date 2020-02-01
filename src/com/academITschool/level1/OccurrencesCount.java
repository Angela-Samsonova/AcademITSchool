package com.academITschool.level1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OccurrencesCount {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        String searchedString = "ЖОРЖ".toLowerCase();

        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            while (scanner.hasNextLine()) {
                String scannedString = scanner.nextLine().toLowerCase();
                int startIndex = 0;

                while (startIndex < scannedString.length()) {
                    int index = scannedString.indexOf(searchedString, startIndex);

                    if (index == -1) {
                        break;
                    }

                    count++;
                    startIndex = index + searchedString.length();
                }
            }
        }

        System.out.println("Число вхождений = " + count);
    }
}


//•
////        Прочитать текст из файла, и написать функцию, которая
////        считает количество вхождений некоторой строки в этот
////        текст без учета регистра символов
////        •
////        Использовать цикл и indexOf , который принимает
////        начальный индекс, с которого искать