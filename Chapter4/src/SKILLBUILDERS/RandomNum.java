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

        // Validate that min is not greater than max
        if (min > max) {
            System.out.println("Error: Minimum value cannot be greater than the maximum value.");
            input.close();
            return; // Exit the program
        }

        // Generate a random integer between min (inclusive) and max (inclusive)
        // random.nextInt(bound) generates a number from 0 (inclusive) to bound (exclusive).
        // So, to get a range of (max - min + 1), we add min to the result.
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("A random number between " + min + " and " + max + " is: " + randomNumber);

        input.close();

	}

}
