package Mastery;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) 
	{
		int secret_num;
		int userGuess;
		int tries = 0;
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		secret_num = random.nextInt(20) + 1;
		
		
		
		while (true) {
			System.out.println("Enter a number between 1 and 20: ");
			userGuess = input.nextInt();
			tries++;
			
			if (secret_num == userGuess) {
				System.out.println("You won!");
				break;
			} else {
				giveHint(userGuess, secret_num);
			}
			
		}
		
		input.close();
		
	}
	
	public static void giveHint(int userGuess, int secret_num) 
	{
		if (secret_num <= userGuess) {
			System.out.println("Hint: try a lower number");
		} else {
		    System.out.println("Hint: Try a higher number");             
	
	}
		
		
		
		
		

	}

}
