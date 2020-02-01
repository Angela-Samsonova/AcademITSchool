package com.academITschool.level1;

public class Circumference {
    public static void main(String[] args) {
        double circleRadius = 3.0;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        double circumferenceLength = Math.PI * 2 * circleRadius;
        System.out.println("circle area = " + circleArea + ", circumference length = " + circumferenceLength);
        System.out.println();

        circleArea = 5.0;
        circleRadius = Math.sqrt(circleArea / Math.PI);
        System.out.println("circle radius = " + circleRadius);
        System.out.println();

        circleRadius = 4.0;
        double angle = 30.0;
        double sectorArea = Math.PI * Math.pow(circleRadius, 2) * (angle / 360);
        System.out.println("sector area = " + sectorArea);
    }
}

