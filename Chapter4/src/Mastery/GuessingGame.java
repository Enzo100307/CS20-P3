package Mastery;
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Enter a number between 1 and 20: ");
		int player_num = input.nextInt();
		
		int secret_num = random.nextInt(20) + 1;
		System.out.println("Computer's number: " + secret_num);
		
		System.out.println("Player's Number:" + player_num);
		
		if (secret_num == player_num) {
			System.out.println("You won!");
		} else if (secret_num >= player_num) {
			System.out.println("Better luck next time.");
		} else if (secret_num <= player_num) {
			System.out.println("Better luck next time.");
		} else
			System.out.println("Invalid Input!");
		
		 input.close();
	     
	    
	      
		
		
		
		
		
		
		
		

	}

}
