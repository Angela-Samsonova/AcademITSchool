package com.academITschool.level1;

public class BinarySearchRecursion {
    private static int getNumberIndexRecursively(int[] a, int left, int right, int number) {
        if (left > right) {
            return -1;
        }

        int middle = (right + left) / 2;

        if (a[middle] == number) {
            return middle;
        }

        if (a[middle] < number) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }

        return getNumberIndexRecursively(a, left, right, number);
    }

    public static void main(String[] args) {
        int[] sortedArray = new int[]{1, 3, 6, 7, 9, 12, 15};

        System.out.println(getNumberIndexRecursively(sortedArray, 0, 6, 7));
        System.out.println(getNumberIndexRecursively(sortedArray, 0, 6, 9));
        System.out.println(getNumberIndexRecursively(sortedArray, 0, 6, 10));
    }
}
