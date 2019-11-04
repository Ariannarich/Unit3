package com.company;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class DiscriminantAndRoots {
@Test
    public static String roots(int a, int b, int c)
    {

        int disc = (b * b) - (4 * (a * c));
        String disc2 = String.valueOf(disc);

        if (disc == 0) {
            return (a + "x^2 + " + b + "x + " + c + "has 1 real root");
        }
        else if (disc < 0) {
            return (a + "x^2 + " + b + "x + " + c + "has 2 imaginary roots");
        }
        else if (disc > 0)
            return (a + "x^2 + " + b + "x + " + c + "has 2 real roots");

        return disc2;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficients for the quadratic equation:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c  = input.nextInt();
        roots(a,b,c);
    }
}