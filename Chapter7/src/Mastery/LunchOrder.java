package Mastery;

public class LunchOrder 
{
	private String Item;
	private float Price;
	private float Fat;
	private float Carbohydrates;
	private float Fiber;
	
	public LunchOrder()
	{
		Item = " ";
		Price = 0;
		Fat = 0;
		Carbohydrates = 0;
		Fiber = 0;
	}
	
	public LunchOrder(String I, float P, float Fa, float C, float Fi)
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
	
	public float getPrice()
	{
		return Price;
	}
	
	public float getFat()
	{
		return Fat;
	}
	
	public float getCarbs()
	{
		return Carbohydrates;
	}
	
	public float getFiber()
	{
		return Fiber;
	}
	
	public void setItem(String I)
	{
		Item = I;
	}
	
	public void setPrice(float P)
	{
		Price = P;
	}
	
	public void setFat(float Fa)
	{
		Fat = Fa;
	}
	
	public void setCarbs(float C)
	{
		Carbohydrates = C;
	}
	
	public void setFiber(float Fi)
	{
		Fiber = Fi;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
