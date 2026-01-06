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
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        //Variables
        int redCount = 0;
        int greenCount = 0;
        boolean gameOver = false;

        //Use Phidgets
        while (true)
        {
            //Red button pressed
            if (redButton.getState() && !gameOver)
            {
                redCount++;
                System.out.println("Red count: " + redCount);
                Thread.sleep(200); 

                if (redCount == 10)
                {
                    gameOver = true;

                    //Both LEDs flash once
                    redLED.setState(true);
                    greenLED.setState(true);
                    Thread.sleep(500);
                    redLED.setState(false);
                    greenLED.setState(false);
                    Thread.sleep(500);

                    //Red LED flashes 5x
                    for (int i = 0; i < 5; i++)
                    {
                        redLED.setState(true);
                        Thread.sleep(300);
                        redLED.setState(false);
                        Thread.sleep(300);
                    }
                }
            }

            //Green button pressed
            if (greenButton.getState() && !gameOver)
            {
                greenCount++;
                System.out.println("Green count: " + greenCount);
                Thread.sleep(200); 

                if (greenCount == 10)
                {
                    gameOver = true;

                    //Both LEDs flash once
                    redLED.setState(true);
                    greenLED.setState(true);
                    Thread.sleep(500);
                    redLED.setState(false);
                    greenLED.setState(false);
                    Thread.sleep(500);

                    //Green LED flashes 5 times
                    for (int i = 0; i < 5; i++)
                    {
                        greenLED.setState(true);
                        Thread.sleep(300);
                        greenLED.setState(false);
                        Thread.sleep(300);
                    }
                }
            }

            Thread.sleep(50);
        }
    }
}

		
		
		
		
		
		
		
		
	
	
	

