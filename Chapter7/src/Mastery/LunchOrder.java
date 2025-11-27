package Mastery;

public class LunchOrder 
{
	private String Item;
	private int Price;
	private int Fat;
	private int Carbohydrates;
	private int Fiber;
	
	public LunchOrder()
	{
		Item = " ";
		Price = 000;
		Fat = 00;
		Carbohydrates = 00;
		Fiber = 00;
	}
	
	public LunchOrder(String I, int P, int Fa, int C, int Fi)
	{
		Item = I;
		Price = P;
		Fat = Fa;
		Carbohydrates = C;
		Fiber = Fi;
	}
	
	public String getItem()
	{
		return Item;
	}
	
	public int getPrice()
	{
		return Price;
	}
	
	public int getFat()
	{
		return Fat;
	}
	
	public int getCarbs()
	{
		return Carbohydrates;
	}
	
	public int getFiber()
	{
		return Fiber;
	}
	
	public void setItem(String I)
	{
		Item = I;
	}
	
	public void setPrice(int P)
	{
		Price = P;
	}
	
	public void setFat(int Fa)
	{
		Fat = Fa;
	}
	
	public void setCarbs(int C)
	{
		Carbohydrates = C;
	}
	
	public void setFiber(int Fi)
	{
		Fiber = Fi;
	}
	
	
	
	
	
	
	
	
	
	

}
