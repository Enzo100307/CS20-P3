import com.phidget22.*;
public class L1EX1 
{
	public static void main(String[] args) throws Exception
	{
		//Create
		DigitalOutput redLED = new DigitalOutput();
		
		//Address
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		
		//Open
		redLED.open(2000);
		
		//Use your Phidgets
		while(true)
		{
			redLED.setState(true);
			Thread.sleep(2000);
			redLED.setState(false);
			Thread.sleep(1000);
			
			
		}
	}

}
