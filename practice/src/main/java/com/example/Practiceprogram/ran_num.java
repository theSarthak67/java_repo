
//guessing which number is choosen at first
//do not randomly choose every iteration
//more likly find the number than the guess

package com.example.Practiceprogram;

import java.util.Random;
import java.util.Scanner;

public class ran_num 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randnum = rand.nextInt(100) +1;
        boolean abs = true;
        while (abs) 
        {   System.out.println("Choose operation:");
            System.out.println("1. Guess the number");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choose = sc.nextInt();
            
        
        switch (choose) 
        {
            case 1 ->
        {       
             System.out.println("Guess a number between 1 and 100:");
    int guessint;
    int attempts=0;

    while (true) {
        guessint = sc.nextInt();
        attempts++;
        if (guessint == randnum) {
            System.out.println("Correct guess!!! Congrats :) \n\n");
             System.out.println("You guessed it in " + attempts + " attempts.\n\n");
            break;
        } 
        else if (guessint < randnum && randnum - guessint <= 10) {
            System.out.println("Your guess is close but a little small\n\n");
        } 
        else if (guessint > randnum && guessint - randnum <= 10) {
            System.out.println("Your guess is close but a little big\n\n");
        } 
        else {
            System.out.println("Wrong guess\n\n");
        }

        System.out.print("Try again: ");
    }

            }
            case 2 ->
            {
                System.out.println("See you again");  
                abs = false;
                sc.close();
                break;
            }
            default ->{
                System.out.println("Wrong choice try.");
                System.out.println("Choose from given options\n\n");
            }
        
        }
             
    }
 
}
}
