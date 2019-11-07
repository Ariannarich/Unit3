package com.company;

import java.util.Scanner;

public class RockPaperScissors

{
    public static String getComputerChoice()
    {
        int num =(int) (Math.random() * 3 + 1);
         int rock = 3;
        int paper = 2;
        int scissors = 1;
        if (num == rock)
            return ("rock");
        else if (num == paper)
            return ("paper");
        else if (num == scissors)
            return ("scissors");
        return String.valueOf(num).toLowerCase();
    }
    public static String getUserChoice()
    {
        Scanner input = new Scanner(System.in);
        String rock = input.nextLine();
        String paper = input.nextLine();
        String scissors = input.nextLine();
        return getUserChoice().toLowerCase();

    }
    public static String whoWins(String computer, String person)
    {
        computer = getComputerChoice();
        person = getUserChoice();

        if (computer && )
    }
    public static void main(String[] args) {
    }
}

