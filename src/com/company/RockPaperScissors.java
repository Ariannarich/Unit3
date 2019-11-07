package com.company;

import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int num = (int) (Math.random() * 3 + 1);
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

    public static String getUserChoice() {
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
       return answer;

    }

    public static String whoWins(String computer, String person) {
        computer = getComputerChoice();
        person = getUserChoice();

        if (computer.equals("rock") && person.equals("rock"))
            return ("You chose rock.\nThe computer chose rock.\nYou tied!");
        else if (computer.equals("paper") && person.equals("paper"))
            return ("You chose paper.\nThe computer chose paper.\nYou tied!");
        else if (computer.equals("scissors") && person.equals("scissors"))
            return ("You chose scissors.\nThe computer chose scissors.\nYou tied!");
        if (computer.equals("rock") && person.equals("paper"))
            return ("You chose paper.\nThe computer chose rock.\nYou win!");
        else if (computer.equals("rock") && person.equals("scissors"))
            return ("You chose scissors.\nThe computer chose paper.\nYou win!");
        else if (computer.equals("paper") && person.equals("scissors"))
            return ("You chose scissors.\nThe computer chose paper.\nYou win!");
        else if ((computer.equals("scissors") && person.equals("paper")))
            return ("You chose scissors.\nThe computer chose paper.\nYou win!");
        else
            return ("invalid input");
    }

    public static void main(String[] args) {


    }
}

