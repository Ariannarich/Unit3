package com.company;

import java.util.Scanner;

public class RightTriangle
{
    public static String isTriangle(int a, int b, int c)
    {
        if (a + b > c && b + c > a)
            return("The lengths of "+ a +", " + b +", and "+ c + " form a triangle");
        else
            return("The lengths of "+ a +", " + b +", and "+ c + " do not form a triangle");
    }

    public static String isRight(int a, int b, int c)
    {
      int d =(int)Math.pow(a, 2);
      int e =(int)Math.pow(b, 2);
       int f = (int) Math.pow(c, 2);
       if (f == d + e)
           return("The lengths of "+ a +", " + b +", and "+ c + " form a right triangle");
       else if (a + b > c && b + c > a)
           return(a+", "+ b+", "+ c+", form a triangle, but do not form a right triangle.");
else
        return("The lengths of "+ a +", " + b +", and "+ c + " do not form a triangle");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer sides of a triangle:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(isRight(a,b,c));



    }
}
