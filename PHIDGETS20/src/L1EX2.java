import com.phidget22.*;
public class L1EX2 
{
	public static void main(String[] args) throws Exception
	{
		//Create
		DigitalOutput redLED = new DigitalOutput();
		
		//Address
		redLED.setHubPort(0);
		redLED.setIsHubPortDevice(true);
		
		//Open
		redLED.open(1000);
		
		//Use Phidgets
		
		for(i = 0; i <= 3; i++)
		{
			
		}
			
		
	}


}
