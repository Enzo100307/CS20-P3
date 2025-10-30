package Mastery;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int player_num;
		int secret_num;
		int tries = 0;
		
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		secret_num = random.nextInt(20) + 1;
		
		do
		{
		System.out.println("Enter a number between 1 and 20: ");
		player_num = input.nextInt();
		tries++;
		
		
		
		
		if (secret_num == player_num) {
            System.out.println("You won!");
        } else if (secret_num > player_num) {
            System.out.println("Try again.");
        } else { 
            System.out.println("Try again.");
        }
    } while (secret_num != player_num);

    input.close();
		
			

	}

}
