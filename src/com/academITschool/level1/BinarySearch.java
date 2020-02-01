package com.academITschool.level1;

public class BinarySearch {
    private static int getNumberIndex(int[] array, int number) {
        if (array.length == 0) {
            return -1;
        }

        int left = 0;
        int right = array.length - 1;
        int middle = (left + right) / 2;

        while (true) {
            if (array[middle] == number) {
                return middle;
            }

            if (array[middle] < number) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

            middle = (left + right) / 2;

            if (left > right) {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = new int[]{1, 2, 3, 6, 7, 9, 12, 15};

        System.out.println(getNumberIndex(sortedArray, 6));
        System.out.println(getNumberIndex(sortedArray, 9));
        System.out.println(getNumberIndex(sortedArray, 10));
    }
}

