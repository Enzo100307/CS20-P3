package SkillBuilders;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students stA = new Students();
		
		System.out.println(stA.getFirstName());
		System.out.println(stA.getLastName());
		System.out.println(stA.getstudentID());
		System.out.println(stA.getAddress());
		
		System.out.println("------------------");
		
		Students stB = new Students("Carl", "Johnson", "67 Grove Street", 123456789);
		
		/*System.out.println(stB.getFirstName());
		System.out.println(stB.getLastName());
		System.out.println(stB.getstudentID());
		System.out.println(stB.getAddress());
		*/
		
		System.out.println(stB);

	
	}

}
