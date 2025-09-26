package SKILLBUILDERS;
import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Scanner input = new Scanner(System.in);
	     
	     System.out.print("Enter an integer: ");
	        int number = input.nextInt();

	       
	        double squareRoot = Math.sqrt(number);
	        int truncatedSquareRoot = (int) squareRoot;

	        
	        int squaredTruncatedRoot = truncatedSquareRoot * truncatedSquareRoot;

	        
	        if (number == squaredTruncatedRoot) {
	            System.out.println(number + " is a perfect square.");
	        } else {
	            System.out.println(number + " is not a perfect square.");
	        }

	        input.close();
	     
		
		
		
		

	}

}
