package com.company;

import java.util.Scanner;

public class NumericComparisons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isZero(int num) {
        return num == 0;
    }

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isNegative(int num) {
        return num <= 0;
    }
}
