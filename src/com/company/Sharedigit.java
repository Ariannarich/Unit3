package com.company;

public class Sharedigit {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);

        if (num >=10)
        {
            System.out.println(num);
            if (num2 >=10)
            {
                System.out.println(num2);
            }
        }
    }
}
