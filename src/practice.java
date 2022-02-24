
import java.util.Random;

import java.util.Scanner;

public class practice {


    public static void main(String[] args) {

        // HsaunEn Wang
        // ITSS 3311.003
        // 02/24/2022
        // Project 2

        // Declare vars

        // Declare Vars
        String name;
        int die1;
        int die2;
        int sum;
        int pairBonus;
        int seven11Bonus;
        int total;
        int tempDie;
        int turns;
        String playAgain;

        // Create the utility objects you need - Scanner and Random
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Get player's name
        System.out.print("Please enter your name: ");
        name = input.next();
        System.out.println();

        // Print Rules and Welcome message
        System.out.println("                        Hi, " + name + ". Welcome to the 3311 Dice Game!");
        System.out.println("     Playing the game is easy - just \"roll\" the dice and "
                + "the computer does the rest.");
        System.out.println("       The sum of the dice is worth points. You earn 5 bonus if "
                + "you roll a 7 or 11.");
        System.out.println("                      You earn 6 bonus points if you roll doubles.");
        System.out.println("                   Now let's begin - enter any character key to begin.");
        input.next();
        System.out.println();
        System.out.println();


        do{

            System.out.print("Enter the number of turns you wish to play: ");
            turns= input.nextInt();
            System.out.println();



            System.out.println("*** Turn "+ turns+ " *** ");
            // Roll the dice, sort the dice, display the roll
            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;

            //die1 = 6;  die2 = 5;  // For testing purposes only.  Comment out before submitting.
            //System.out.println("Dice roll: " + die1 + "," + die2);  // For testing purposes only.

            if (die1 > die2) {
                tempDie = die1;
                die1 = die2;
                die2 = tempDie;
            }
            //System.out.println("Dice roll: " + die1 + "," + die2);  Interim testing


            // Evaluate the roll, calculate points
            sum = die1 + die2;
            if (die1 == die2) {
                pairBonus = 6;
            } else {
                pairBonus = 0;
            }



            if ( (die1 + die2 ==7 ) || (die1+die2 == 11) ) {
                seven11Bonus = 5;
            }else {
                seven11Bonus = 0;
            }


            total = sum + pairBonus + seven11Bonus;



            for (int t =0; t < 1; turns++){

                // Display roll (sorted), sum, bonus points, total points
                System.out.println("Dice Roll:  " + die1 + "," + die2);
                System.out.println("Dice Sum:   " + sum);
                System.out.println("Pair Bonus: " + pairBonus);
                System.out.println("7-11 Bonus: " + seven11Bonus);
                System.out.println("Total Pts:  " + total);
                System.out.println();
                t ++;
            }



            System.out.print("Would you like to play again? Enter Y or N: ");
            System.out.println();
            playAgain= input.next();
            playAgain=playAgain.toUpperCase();

        }while (playAgain.equals("Y"));


        // Display the end-of-game message
        System.out.println("                    Thank you for playing 3311 Dice Game, " + name + ".");
        System.out.println("                         Come back and play again any time!");

        input.close();
    }

}