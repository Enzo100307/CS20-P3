package Mastery;

import java.util.Scanner;

public class YourOrder 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		LunchOrder LunchOrder = new LunchOrder();
		
		LunchOrder hamburger = new LunchOrder();
		LunchOrder salad = new LunchOrder();
		LunchOrder frenchfries = new LunchOrder();
		LunchOrder soda = new LunchOrder();
		int userinput;
		
		
		
		//Price
		float hamburgerPrice = 1.85f;
		float saladPrice = 2.00f;
		float frenchfriesPrice = 1.30f;
		float sodaPrice = 0.95f;
		
		//Fat
		float hamburgerFat = 9.00f;
	    float saladFat = 1.00f;
	    float freshfriesFat = 11.0f;
	    float sodaFat = 0.00f;
	    
	    //Carbohydrates
	    float hamburgerCarbs = 33.0f;
	    float saladCarbs = 11.0f;
	    float frenchfriesCarbs = 36.0f;
	    float sodaCarbs = 38.0f;
	    
	    //Fiber
	    float hamburgerFiber = 1.00f;
	    float saladFiber = 5.00f;
	    float frenchfriesFiber = 4.00f;
	    float sodaFiber = 0.00f;
	    
	    //HamburgerInput
	    System.out.println("Enter number of hamburger: ");
	    userinput = input.nextInt();
	    
	    float total1 = hamburgerPrice * userinput;
	    
	    System.out.println("Each hamburgers has " + hamburgerFat + "g of fat, " + hamburgerCarbs + "g of carbs, and " + hamburgerFiber + "g of fiber.");
	    
	    //salads Input
	    System.out.println("Enter a number of salads: ");
	    userinput = input.nextInt();
	    
	    float total2 = saladPrice *  userinput;
	    
	    System.out.println("Each salad has " + saladFat + "g of fat, " + saladCarbs + "g of carbs, and " + saladFiber + "g of fiber.");
	    
	    //fries input
	    System.out.println("Enter a number of fries: ");
	    userinput = input.nextInt();
	    
	    float total3 =  frenchfriesPrice * userinput;
	    
	    System.out.println("French fries have " + freshfriesFat + "g of fat, " + frenchfriesCarbs + "g of carbs, and " + frenchfriesFiber + "g of fiber.");
	    
	    //soda input
	    
	    System.out.println("Enter a number of sodas: ");
	    userinput = input.nextInt();
	    
	    float total4 = sodaPrice * userinput;
	    
	    System.out.println("Each soda has " + sodaFat + "g of fat " + sodaCarbs + "g of carbs, and " + sodaFiber + "g of fiber.");
	    
	    float total =  (total1 + total2 + total3 + total4);
	    
	    System.out.println("Your order comes to: $" + total);
	    
	    input.close();

	    
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
		
		
		

	}

}
