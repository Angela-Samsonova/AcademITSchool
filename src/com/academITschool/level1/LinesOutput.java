package com.academITschool.level1;

public class LinesOutput {
    public static void main(String[] args) {
        String string1 = "Вот первая строка.";
        String string2 = "А вот и вторая.";
        System.out.println(string1 + System.lineSeparator() + string2);

        System.out.println("\"30\" августа 2014г." + System.lineSeparator() + "C:\\Windows\\System32\\Drivers\\etc\\hosts");

        byte a = 2;
        byte b = 2;
        byte c = (byte) (a * b);
        System.out.println("Результат = " + c);
    }
}
