package SkillBuilders;

public class Students 
{
	private String firstName;
	private String lastName;
	private String address;
	private int stuID;
	
	public Students()//Constructor method
	{
		firstName = "";
		lastName = "";
		address = "####";
		stuID = 0000000;
		
    }
	
	public Students(String f, String l, String ad, int ID) // Overload Constructor
	{
		firstName = f;
		lastName = l;
		address = ad;
		stuID = ID;
		
	
    }
	//Accessor Methods
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
	    return lastName;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public int getstudentID()
	{
		return stuID;
	}
	//Modifier Methods
	public void setFirstName(String f)
	{
		firstName = f;
	}
		
	public void setLastName(String l)
	{
		lastName = l;
	}
	
	public void setAddress(String ad)
	{
		address = ad;
	}
       
	public void setstudentID(int ID)
	{
		stuID = ID;
	}
		
	}


