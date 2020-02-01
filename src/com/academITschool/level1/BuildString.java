package com.academITschool.level1;

public class BuildString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            sb.append(i).append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        String result = sb.toString();
        System.out.println(result);
    }
}
