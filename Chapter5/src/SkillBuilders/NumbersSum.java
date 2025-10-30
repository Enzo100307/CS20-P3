package SkillBuilders;

import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		int sumOfCubes = 0;
		int digit = 0;
		
		//Preparing for user input 
		Scanner input = new Scanner(System.in);
		
		//Ask the user for the number of eggs
		System.out.println("Enter a positive integer: ");
		number = input.nextInt();
		
		//Sum the digits
		do
		{
			digit = number % 10;
			sumOfCubes +=  digit * digit * digit;
			number = number / 10;
			
		}while(number != 0);
		
		System.out.println("The sum of the cubes 0f the digits is: " +
							sumOfCubes);
	}

}
