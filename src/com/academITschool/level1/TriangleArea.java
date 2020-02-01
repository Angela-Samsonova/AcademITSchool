package com.academITschool.level1;

import java.util.Scanner;

public class TriangleArea {
    private static double calculateTriangleSide(double startPointX, double startPointY, double endPointX, double endPointY) {
        return Math.sqrt(Math.pow((endPointX - startPointX), 2) + Math.pow((endPointY - startPointY), 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты первой точки: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Введите координаты второй точки: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Введите координаты третьей точки: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(((x3 - x1) * (y2 - y1)) - ((x2 - x1) * (y3 - y1))) <= epsilon) {
            System.out.println("Все точки лежат на одной прямой!");
        } else {
            double side1 = calculateTriangleSide(x1, y1, x2, y2);
            double side2 = calculateTriangleSide(x1, y1, x3, y3);
            double side3 = calculateTriangleSide(x2, y2, x3, y3);

            double halfPerimeter = (side1 + side2 + side3) / 2;
            double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));

            System.out.println("Площадь данного треугольника = " + triangleArea);
        }
    }
}
//    • Прочитать с консоли координаты трёх точек на плоскости:
//            (x1, y1), (x2, y2), (x3, y3)
//            • Вычислить и вывести на экран площадь данного треугольника
//• Для вычисления площади можно воспользоваться формулой Герона:
//            • 𝑆∆ = 𝑝(𝑝 − 𝑎)(𝑝 − 𝑏)(𝑝 − 𝑐),
//    где 𝑝 −полупериметр треугольника 𝑝=(𝑎+𝑏+𝑐)/2,
//    𝑎, 𝑏, 𝑐 −длины сторон треугольника
//• Проверить на случай, когда эти точки лежат на одной прямой – в этом
//    случае вычислять площадь не нужно, а нужно вывести сообщение об
//            этом
//• Для вычисления корня использовать команду
//Math.sqrt(значение)

//5. В условии лежания на одной прямой нужно заменить деление на умножение "крест накрест".
//    Тогда не будет случая деления на ноль

