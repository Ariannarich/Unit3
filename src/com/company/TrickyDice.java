package com.company;

public class TrickyDice {


public static int regularRoll()
{
int num = (int)(Math.random() * 6 + 1);
System.out.println(num);
return num;
}
public static int trickyRoll()
{
    int num = (int)(Math.random() * 6 + 1);
    if (num >= 3 && num <=6  )
        System.out.println(num);
    else if (num == 2)
        System.out.println(num);
    else
        System.out.println(1);
    return num;
}
    public static void main(String[] args)
    {
       regularRoll();
       trickyRoll();

    }

}




