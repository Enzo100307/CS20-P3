package SkillBuilders;

public class Visistors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numVisitors = 0;
		int totalVistors = 0;
		int avgVisitor = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int day  1; day <= 5; day++) 
			
		 { System.out.println("Enter the number + "
					+ " of visitor on day " 
					+ day );
			
			numVisitors = input.nextInt();
			totalVistors = totalVistors + numVisitors; 
			
		 }
	      avgVisitor = (totalVisitors / 5);
	      System.out.println(
	    		  "The ")
			
		}
		

	}

}
