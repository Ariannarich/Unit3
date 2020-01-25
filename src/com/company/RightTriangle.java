package com.company;

import java.util.Scanner;

public class RightTriangle
{
    public static boolean isTriangle(int a, int b, int c)
    {
        if (a + b > c && b + c > a)
        { System.out.println("The lengths of "+ a +", " + b +", and "+ c + " form a triangle");
       return true;}
        else
            System.out.println("The lengths of "+ a +", " + b +", and "+ c + " do not form a triangle");
        return false;
    }

    public static boolean isRight(int a, int b, int c)
    {
      int d =(int)Math.pow(a, 2);
      int e =(int)Math.pow(b, 2);
       int f = (int) Math.pow(c, 2);
       if (f == d + e)
       {System.out.println("The lengths of "+ a +", " + b +", and "+ c + " form a right triangle");
      return true;
       }
       else if (a + b > c && b + c > a)
       {System.out.println(a+", "+ b+", "+ c+", form a triangle, but do not form a right triangle.");
    return false;}
       else
        System.out.println("The lengths of "+ a +", " + b +", and "+ c + " do not form a triangle");
    return false;
    }
    public static void main(boolean[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer sides of a triangle:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(isRight(a,b,c));



    }
}
