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
		int hamburgerPrice = (int)(1.85);
		int saladPrice = (int)(2.00);
		int frenchfriesPrice = (int)(1.30);
		int sodaPrice = (int)(0.95);
		
		//Fat
		int hamburgerFat = (int)(9.00);
	    int saladFat = (int)(1.00);
	    int freshfriesFat = (int)(11.00);
	    int sodaFat = (int)(0.00);
	    
	    //Carbohydrates
	    int hamburgerCarbs = (int)(33.00);
	    int saladCarbs = (int)(11.00);
	    int frenchfriesCarbs = (int)(36.00);
	    int sodaCarbs = (int)(38.00);
	    
	    //Fiber
	    int hamburgerFiber = (int)(1.00);
	    int saladFiber = (int)(5.00);
	    int frenchfriesFiber = (int)(4.00);
	    int sodaFiber = (int)(0.00);
	    
	    //HamburgerInput
	    System.out.println("Enter number of hamburger: ");
	    userinput = input.nextInt();
	    
	    int total1 = hamburgerPrice * userinput;
	    
	    System.out.println("Each hamburgers has " + hamburgerFat + "g of fat, " + hamburgerCarbs + "g of carbs, and " + hamburgerFiber + "g of fiber.");
	    
	    //salads Input
	    System.out.println("Enter a number of salads: ");
	    userinput = input.nextInt();
	    
	    int total2 = saladPrice *  userinput;
	    
	    System.out.println("Each salad has " + saladFat + "g of fat, " + saladCarbs + "g of carbs, and " + saladFiber + "g of fiber.");
	    
	    //fries input
	    System.out.println("Enter a number of fries: ");
	    userinput = input.nextInt();
	    
	    int total3 =  frenchfriesPrice * userinput;
	    
	    System.out.println("French fries have " + freshfriesFat + "g of fat, " + frenchfriesCarbs + "g of carbs, and " + frenchfriesFiber + "g of fiber.");
	    
	    //soda input
	    
	    System.out.println("Enter a number of sodas: ");
	    userinput = input.nextInt();
	    
	    int total4 = sodaPrice * userinput;
	    
	    System.out.println("Each soda has " + sodaFat + "g of fat " + sodaCarbs + "g of carbs, and " + sodaFiber + "g of fiber.");
	    
	    int total =  (total1 + total2 + total3 + total4);
	    
	    System.out.println("Your order comes to: $" + total);
	    
	    

	    
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
		
		
		

	}

}
