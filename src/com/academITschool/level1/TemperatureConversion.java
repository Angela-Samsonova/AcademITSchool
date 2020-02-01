package com.academITschool.level1;

import java.util.Scanner;

public class TemperatureConversion {
    private static double convertFromCelsiusToKelvin(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

    private static double convertFromCelsiusToFahrenheit(double celsiusTemperature) {
        return celsiusTemperature * 1.8 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число, обозначающее температуру по Цельсию: ");
        double temperatureInCelsius = scanner.nextDouble();

        System.out.println("Температура по Кельвину = " + convertFromCelsiusToKelvin(temperatureInCelsius));
        System.out.println("Температура по Фаренгейту = " + convertFromCelsiusToFahrenheit(temperatureInCelsius));
    }
}

//    Написать программу, которая переводит температуру из
//        градусов Цельсия в градусы Кельвина и Фаренгейта
//        • Прочитать число – температуру в шкале Цельсия и
//        напечатать две строки – в градусах Кельвина и Фаренгейта
//        • Перевод градусов Цельсия в градусы Кельвина и перевод в
//        градусы Фаренгейта оформить отдельными функциями
//        • Формулы найти в интернете

//    Кельвин (K)
//
//= K
//
//        = С + 273,15
//
//        = (F + 459,67) / 1,8
//
//        Цельсий (°C)
//
//        = K − 273,15
//
//        = C
//
//        = (F − 32) / 1,8
//
//        Фаренгейт (°F)
//
//        = K · 1,8 − 459,67
//
//        = C · 1,8 + 32
//
//        = F