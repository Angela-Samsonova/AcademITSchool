package com.academITschool.level1;

public class Overload {
    public static int getTypeSize(byte byteNumber) {
        return 1;
    }

    public static int getTypeSize(short shortNumber) {
        return 2;
    }

    public static int getTypeSize(int intNumber) {
        return 4;
    }

    public static int getTypeSize(long longNumber) {
        return 8;
    }

    public static int getTypeSize(float floatNumber) {
        return 4;
    }

    public static int getTypeSize(double doubleNumber) {
        return 8;
    }

    public static void main(String[] args) {
        int bytesInByte = getTypeSize((byte) 10);
        System.out.println("байтов в типе byte - " + bytesInByte);

        int bytesInShort = getTypeSize((short) 200);
        System.out.println("байтов в типе short - " + bytesInShort);

        int bytesInInt = getTypeSize(1000);
        System.out.println("байтов в типе int - " + bytesInInt);

        int bytesInFloat = getTypeSize(20.5f);
        System.out.println("байтов в типе float - " + bytesInFloat);

        int bytesInDouble = getTypeSize(20.5555555);
        System.out.println("байтов в типе double - " + bytesInDouble);

        int bytesInLong = getTypeSize(1000000000000L);
        System.out.println("байтов в типе long - " + bytesInLong);
    }
}

//    Объявить в классе несколько функций с именем getTypeSize
//• Каждая функция должна принимать один аргумент одного
//        из следующих типов: byte, short, int, long, float, double
//        • Функция должна возвращать int – количество байт,
//        требуемых под переменную данного типа
//        • В функции main сделать по одному примеру использования
//        для каждой перегруженной функции
//        • В этой задаче может быть warning, что аргумент не