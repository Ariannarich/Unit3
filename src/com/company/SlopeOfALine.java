package com.company;

import java.util.Scanner;

public class SlopeOfALine {


        public static String slope(int x1, int y1, int x2, int y2)
        {

            if (x2 - x1 == 0) {
              return ("The line defined by the points (" + x1 + "," + y1 +") and (" + x2 + "," + y2 + ") is a vertical line and the slope is undefined." );

            }
            else
            {
                double changeY = y2 - y1;
                double changeX = x2 - x1;
                double slope = changeY /changeX;
               return ("The line defined by the points (" + x1 + "," + y1 +") and (" + x2 + "," + y2 + ") has a slope of " + slope );


            }

            }

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1:");
        int x1 = input.nextInt();
        System.out.println("Enter y1:");
    int y1 = input.nextInt();
        System.out.println("Enter x2:");
    int x2 = input.nextInt();
        System.out.println("Enter y2:");
    int y2 = input.nextInt();
    System.out.println(slope(x1, y1, x2, y2));


}


    }
