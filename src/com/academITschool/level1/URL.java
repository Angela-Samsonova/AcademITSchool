package com.academITschool.level1;

public class URL {
    private static String getServerNameFromURL(String url) {
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf("/", startIndex);

        if (endIndex == -1) {
            return url.substring(startIndex);
        }

        return url.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String url = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";
        String shortURL = "http://SomeServerName";

        System.out.println(getServerNameFromURL(url));
        System.out.println(getServerNameFromURL(shortURL));
    }
}

//    Написать функцию, которая вычленяет из URL адреса имя
//        сервера. Имеется в виду следующее. Для строки вида
//        http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf
//        вычленить SomeServerName
//        •
//        Строка может начинаться не обязательно с http , но и с https
//        или чего то другого. Но :// есть всегда
//        •
//        Учесть случай, когда после :// больше нет слэша
//        •
//        http://SomeServerName
//        •
//        Использовать indexOf и substring