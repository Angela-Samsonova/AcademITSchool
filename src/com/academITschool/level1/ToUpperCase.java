package com.academITschool.level1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter("output.txt");
             Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine().toUpperCase());
            }
        }
    }
}


//
//    Написать программу, которая читает строки файла,
//        переводит их в верхний регистр и записывает
//        результат во второй файл