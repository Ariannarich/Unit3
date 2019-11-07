package com.company;

import java.util.Scanner;

public class CookieOrders  {
    public static String totalCost(int input) {
        double price = 0;
        if ((input > 1) && (input <= 4))
        {
            price = input * 6.95;
            return ("You bought " + input + " boxes of cookies at $" + 6.95 + " per box. Your total bill is $" + price);
        } else if (input >= 5 && input <= 9) {
            price = input * 5.95;
            return ("You bought " + input + " boxes of cookies at $" + 5.95 + " per box. Your total bill is $" + price);
        } else if (input >= 10 && input <= 15) {
            price = input * 5.50;
            return ("You bought " + input + " boxes of cookies at $" + 5.50 + " per box. Your total bill is $" + price);
        }
        else if (input >= 16) {
            price = input * 4.95;
            return ("You bought " + input + " boxes of cookies at $" + 4.95 + " per box. Your total bill is $" + price);
        }
      return String.valueOf(price);
    }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("1-4 boxes = ");
            System.out.println("Enter the number of boxes you wish to purchase:");
            int box = input.nextInt();
       if (box < 1)
           System.out.println("Your input is invalid.");
       else
        System.out.println(totalCost(box));

    }
}
