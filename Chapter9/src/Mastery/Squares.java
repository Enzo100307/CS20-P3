package Mastery;

public class Squares 
{

	public static void main(String[] args) 
	{
		int [] Squares = new int[10];
		
		for(int i = 0; i < Squares.length; i++)
		{
			Squares[i] = i * i;
		}
		
		for(int i = 0; i < Squares.length; i++)
		{
			System.out.println(Squares[i]);
		}

	}

}
