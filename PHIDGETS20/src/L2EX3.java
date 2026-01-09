import com.phidget22.*;

public class L2EX3 
{
	public static void main(String[] args) throws Exception
	{
		//Create
		DigitalInput redButton = new DigitalInput();
		DigitalOutput redLED = new DigitalOutput();
		
		
		
		//Address
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		
		
		//Open
		redButton.open(1000);
		redLED.open(1000);
		
		
		//Use Phidgets
		while(true)
		{
			if 
		}
		
		
		
		
		
		
		
		
		
	}

}
