package com.company;


public class ShareDigit {


    @org.junit.jupiter.api.Test
    public static boolean SharedDigit(int num, int num2) {

             if (num / 10 == num2 / 10)
                 return true;
             else if (num % 10 == num2 % 10)
                 return true;
             else if ((num / 10) == (num2 % 10))
                 return true;
            else if ((num % 10) == (num2 / 10))
                 return true;
            else
                 return false;
    }

    public static void main(String[] args)
    {

        int num = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        if (num >= 10 == num2 >= 10 && num <= 99 == num2 <= 99)
                 System.out.println("SharedDigit("+num +","+ num2 +") ->" + SharedDigit(num,num2));
        else
            System.out.println("SharedDigit("+num +"," +num2 +") ->" + SharedDigit(num,num2));

}
    }
