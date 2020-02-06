//Cody Barnes - Yahtzee Upper Section Scoring
//Coding Challenge: 
//https://www.reddit.com/r/dailyprogrammer/comments/dv0231/20191111_challenge_381_easy_yahtzee_upper_section/

package com.company;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void yahtzeeUpper(int[] roll) {
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0; //Variable declarations.

        for(int i = 0; i < roll.length; i++) { //For loop to assign a random dice roll to each element of the array.
            roll[i] = ThreadLocalRandom.current().nextInt(1, 7); //Lower inclusive, upper exclusive.
        }
        System.out.println("Your Yahtzee roll: " + Arrays.toString(roll));

        for(int i = 0; i < roll.length; i++) { //For loop to increment each variable by the number of times rolled.
            if(roll[i] == 1) {
                one++;
            }
            if(roll[i] == 2) {
                two++;
            }
            if(roll[i] == 3) {
                three++;
            }
            if(roll[i] == 4) {
                four++;
            }
            if(roll[i] == 5) {
                five++;
            }
            if(roll[i] == 6) {
                six++;
            }
        }

        one *= 1; //Multiply each value by the number of times it was rolled.
        two *= 2;
        three *= 3;
        four *= 4;
        five *= 5;
        six *= 6;

        //If else statements that check which variable has the higher score and returns that score.
        if(six >= five && six >= four && six >= three && six >= two && six >= one) {
            System.out.println("Your maximum possible score: " + six + " (6 * " + six / 6 + ")");
        }
        else if(five >= six && five >= four && five >= three && five >= two && five >= one) {
            System.out.println("Your maximum possible score: " + five + " (5 * " + five / 5 + ")");
        }
        else if(four >= six && four >= five && four >= three && four >= two && four >= one) {
            System.out.println("Your maximum possible score: " + four + " (4 * " + four / 4 + ")");
        }
        else if(three >= six && three >= five && three >= four && three >= two && three >= one) {
            System.out.println("Your maximum possible score: " + three + " (3 * " + three / 3 + ")");
        }
        else if(two >= six && two >= five && two >= four && two >= three && two >= one) {
            System.out.println("Your maximum possible score: " + two + " (2 * " + two / 2 + ")");
        }
        else {
            System.out.println("Your maximum possible score: " + one + " (1 * " + one / 1 + ")");
        }
    }

    public static void main(String[] args) {
        System.out.println("---Yahtzee Upper Section Scoring---");
        int[] roll = new int[5]; //Array of size five created.
        yahtzeeUpper(roll); //Method call with an array passed through.
    }
}