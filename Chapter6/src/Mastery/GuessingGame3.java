package Mastery;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int secretNum;
		int userNum;
		int tries = 0;
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		secretNum = random.nextInt(20) + 1;
		
		do
		{
			System.out.println("Enter a number between 1 and 20: ");
			userNum = input.nextInt();
			tries++;
			
			if (secretNum == userNum) {
				System.out.println("You won!");
			} else if (secretNum >= userNum) {
				System.out.println("Hint: try a higher number");
			} else if (secretNum <= userNum) {
				System.out.println("Hint: try a lower number");
			} else {
				System.out.println("Invalid input!");
			}
				
		} 
		while (secretNum != userNum);
		
		input.close();
		
		
		
		
		
		
		
		
		
		
	 
	    
	    	
	    
		
		

	}

}
