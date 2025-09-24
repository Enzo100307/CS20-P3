package Assignment1;


import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the time in minutes: "); 
        int totalMinutes = scanner.nextInt(); 
        int hours = totalMinutes / 60; 
        int minutes = totalMinutes % 60; 

       
        String formattedMinutes = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);

        
        System.out.println("The time is: " + hours + ":" + formattedMinutes);

        scanner.close(); 
		
		
		
		
		
		
		
	}

}
