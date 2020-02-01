package com.academITschool.level1;

public class OrderCost {
    private static double calculateOrderCost(int item1Quantity, double item1Price, int item2Quantity, double item2Price) {
        final int itemsQuantityForDiscount = 10;
        final double costForDiscount = 1000.0;
        final double discountQuantityAndCost = 0.9;
        final double discountQuantityOrCost = 0.95;

        double totalCost = item1Quantity * item1Price + item2Quantity * item2Price;
        int totalItemsQuantity = item1Quantity + item2Quantity;

        if (totalItemsQuantity >= itemsQuantityForDiscount && totalCost >= costForDiscount) {
            return totalCost * discountQuantityAndCost;
        } else if (totalItemsQuantity >= itemsQuantityForDiscount || totalCost >= costForDiscount) {
            return totalCost * discountQuantityOrCost;
        } else {
            return totalCost;
        }
    }

    public static void main(String[] args) {
        System.out.println("Стоимость заказа = " + calculateOrderCost(5, 100, 5, 200));
    }
}

//    Написать функцию для расчета стоимости заказа с учетом скидок
//        •Всего есть два вида товаров, в заказ может входить некоторое количество товаров одного типа и другого типа
//        •Скидка 5% начисляется, если суммарное количество товаров в заказе не меньше 10
//        •Скидка 5% начисляется, если суммарная стоимость заказа не меньше 1000 рублей
//        •Если выполняются оба условия, то скидка 10% от начальной стоимости

