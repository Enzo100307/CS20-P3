package Mastery;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame1 {

	public static void main(String[] args) 
	{
		int secret_num;
        int userGuess;
        int tries = 0;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        secret_num = random.nextInt(20) + 1; // Generates a number between 1 and 20

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 20.");

        // Loop until the user guesses correctly
        while (true) {
            System.out.print("Enter your guess: ");
            userGuess = input.nextInt();
            tries++;

            if (secret_num == userGuess) {
                System.out.println("Congratulations! You guessed the number " + secret_num + " in " + tries + " tries!");
                break; // Exit the loop if the guess is correct
            } else {
                giveHint(userGuess, secret_num); // Provide a hint
            }
        }

        input.close(); // Close the scanner
    }

    // Method to provide a hint
    public static void giveHint(int userGuess, int secret_num) {
        if (userGuess > secret_num) {
            System.out.println("Hint: Try a lower number.");
        } else { // userGuess < secret_num
            System.out.println("Hint: Try a higher number.");
        }
			
		
	
		
	}
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
	}


