import com.phidget22.*;

public class TugOfWar 
{
	public static void main(String[] args) throws Exception
	{
		//Create
		DigitalInput redButton = new DigitalInput();
		DigitalOutput redLED = new DigitalOutput();
		DigitalInput greenButton = new DigitalInput();
		DigitalOutput greenLED = new DigitalOutput();
		
		
		//Address
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		
		
		//Open
		redButton.open(1000);
		redLED.open(1000);
		greenButton.open(1000);
		greenLED.open(1000);
		
		//Use Phidgets
		int i = 0;
		
		while(i < 10)
		{
			if (redButton.getState())
			{
				redLED.setState(true);
				
			}
			
			else 
			{
				redLED.setState(false);

			}
			
			
			
		}
			
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
	}
	
	
}
