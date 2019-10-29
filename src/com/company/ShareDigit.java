package com.company;

import org.junit.Test;

public class ShareDigit {

    @Test
    public static int SharedDigit(int num, int num2) {
        if (num >= 10)
        {
            return num;
        }
        if (num2 >= 10)
        {
            return num2;
        }

        if (num / 10 == num2 / 10)
        {
            return num;
            return num2;
        }
            if (num % 10 == num2 % 10)
            {
                return num;
                return num2;
            }
        return num;
        return num2;
        }

    public static void main(String[] args)
    {
        int num = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);

        SharedDigit(num,num2);

}
    }
