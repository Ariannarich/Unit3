package com.company;

import java.util.Scanner;

public class NumericComparisons {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num + " is odd: "  + isOdd(num));
        System.out.println(num + " is even: "  + isEven(num));
        System.out.println(num + " is zero: "  + isZero(num));
        System.out.println(num + " is positive: "  + isPositive(num));
        System.out.println(num + " is negative: "  + isNegative(num));
        System.out.println(num + " is non negative: "  + isNonNegative(num));
        System.out.println(num + " is non positive: "  + isNonPositive(num));
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
        return num  < 0;
    }
    public static boolean isNonNegative(int num) {
        return num  >= 0;
    }
    public static boolean isNonPositive(int num) {
        return num  <= 0;
    }
}


