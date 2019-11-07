package com.company;

import java.util.Scanner;
// Arianna Richardson
// November 7th, 2019
//Takes the user's input of  and plays a game against a computer.

//Start of code.
public class RockPaperScissors {
    // getComputerChoice randomly generates rock, paper, or scissors.
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
//getUserChoice() method returns user's input.
    public static String getUserChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose rock, paper, or, scissors:");

        return input.nextLine();

    }
// whoWins() method evaluates the winner of the game.

    public static String whoWins(String computer, String person)
    {
        //User input for rock:

        if (computer.equals("rock") && person.equals("rock"))
            return ("You chose rock.\nThe computer chose rock.\nYou tied!");
        else if ((computer.equals("scissors") && person.equals("rock")))
            return ("You chose rock.\nThe computer chose scissors.\nYou win!");
        else if ((computer.equals("paper") && person.equals("rock")))
            return ("You chose rock.\nThe computer chose paper.\nThe computer wins!");

        //User input for paper:

        else if (computer.equals("paper") && person.equals("paper"))
            return ("You chose paper.\nThe computer chose paper.\nYou tied!");
        else if ((computer.equals("scissors") && person.equals("paper")))
            return ("You chose scissors.\nThe computer chose paper.\nYou win!");
        if (computer.equals("rock") && person.equals("paper"))
            return ("You chose paper.\nThe computer chose rock.\nYou win!");

        //User input for scissors:

        else if (computer.equals("rock") && person.equals("scissors"))
            return ("You chose scissors.\nThe computer chose paper.\nYou win!");
        else if (computer.equals("paper") && person.equals("scissors"))
            return ("You chose scissors.\nThe computer chose paper.\nYou win!");
        else if (computer.equals("scissors") && person.equals("scissors"))
            return ("You chose scissors.\nThe computer chose scissors.\nYou tied!");
        else
            return ("invalid input");
    }
// Prints results:
    public static void main(String[] args) {
       String computer = getComputerChoice();
      String person = getUserChoice();
     System.out.println(whoWins(computer,person));

    }
}
// End of code.
