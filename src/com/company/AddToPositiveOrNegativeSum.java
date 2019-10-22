package com.company;

import java.util.Scanner;

public class AddToPositiveOrNegativeSum {

    public static void main(String[] args)    {
            Scanner input = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
            for (int i = 1; i <= 10; i++)        {
                System.out.println("Enter number: ");
                int num = input.nextInt();
              if (num < 0)
              {
                  neg += num;
              }
             if (num > 0)
              {
                 pos += num;
              }
            }
            System.out.println("The sum of positive numbers is :"+pos);
        System.out.println("The sum of negative numbers is :" + neg);

        }


    }
