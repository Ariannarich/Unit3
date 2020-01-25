package com.company;

public class TrickyDice {


public static int regularRoll()
{
int num = (int)(Math.random() * 6 + 1);
return num;
}
public static int trickyRoll()
{
    int num = (int)(Math.random() * 6 + 1);
    if (num >= 3 && num <=6  )
        return num;
    else if (num == 2)
        return num;
    else
    return num;
}
    public static void main(String[] args)
    {
        System.out.println(regularRoll());
       System.out.println(trickyRoll());


    }

}




