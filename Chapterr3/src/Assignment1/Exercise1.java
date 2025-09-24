



package Assignment1;

import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a time less than 4.5 seconds: ");
		double time = input.nextDouble();
		double height = 100 - 4.9 * time * time;
			
			
		System.out.println("The height of the object is: "+ height + " meters");
			
		
		
		
		
		
	}

}
