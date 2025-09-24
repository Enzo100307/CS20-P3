package Skillbuilders;

import java.util.Scanner;

public class GradeAvg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); {

        int numGrades;
        double sumGrades = 0; 
        double grade;

        System.out.print("Enter the number of grades to average: ");
        numGrades = input.nextInt();

        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            grade = input.nextDouble();
            sumGrades += grade; 
        }

        double average = sumGrades / numGrades;
        
        
        System.out.printf("The average grade is: %.2f%%%n", average);
        
		}

	}

}
