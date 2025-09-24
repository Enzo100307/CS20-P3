package Skillbuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in); 

        System.out.print("Enter a two-digit number: "); 
        int number = input.nextInt(); 

        
        int tensPlace = number / 10; 
        int onesPlace = number % 10; 

        System.out.println("Tens place digit: " + tensPlace); 
        System.out.println("Ones place digit: " + onesPlace); 

        input.close(); 

	}

}
