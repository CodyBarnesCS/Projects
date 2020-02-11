//Cody Barnes - The Revised Julian Calendar
//Coding Challenge:
//https://www.reddit.com/r/dailyprogrammer/comments/b0nuoh/20190313_challenge_376_intermediate_the_revised/

//Still need to implement method to handle larger years

package com.company;

import java.util.Scanner;

public class Main {

    public static void leaps (long yearA, long yearB) {
        int leapYears = 0; //Start leap years count at 0

        if(yearB < yearA) {
            System.out.println("Error: Second year must be greater than the first year.");
        }
        else {
            for(long i = yearA; i <= yearB; i++) { //For loop used to test each year inclusively
                if(i % 100 == 0) { //Years evenly divisible by 100 are not leap years
                    if(i % 900 == 200 || i % 900 == 600) { //Unless their remainders are also 200 or 600 when
                        leapYears++;                       //divided by 900
                    }
                }
                else if(i % 4 == 0 && i % 100 != 0) { //Years evenly divisible by 4 but not 100 are leap years
                    leapYears++;
                }
            }
        }

        System.out.println(leapYears + " leap years between " + yearA + " and " + yearB + "."); //Output
    }

    public static void main(String[] args) {
        Scanner scanA = new Scanner(System.in); //Scanners used to take in user input
        Scanner scanB = new Scanner(System.in);

        System.out.println("Please enter the first year: ");
        long yearA = scanA.nextLong(); //Assign input 1
        System.out.println("Please enter the second year: ");
        long yearB = scanB.nextLong(); //Assign input 2

        leaps(yearA, yearB); //Method call
    }
}
