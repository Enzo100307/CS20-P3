package SKILLBUILDERS;
import java.util.Scanner;
import java.util.Random;
public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the minimum value: ");
        int min = input.nextInt();

        System.out.print("Enter the maximum value: ");
        int max = input.nextInt();

        
        if (min > max) {
            System.out.println("Error: Minimum value cannot be greater than the maximum value.");
            input.close();
            return;
        }

        
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("A random number between " + min + " and " + max + " is: " + randomNumber);

        input.close();

	}

}
