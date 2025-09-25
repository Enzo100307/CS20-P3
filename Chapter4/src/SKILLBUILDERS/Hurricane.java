package SKILLBUILDERS;
import java.util.Scanner;
public class Hurricane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the hurricane category (1-5): ");
        int category = scanner.nextInt();

        String message;
        if (category == 1) {
            message = "Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr";
        } else if (category == 2) {
            message = "Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr";
        } else if (category == 3) {
            message = "Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr";
        } else if (category == 4) {
            message = "Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr";
        } else if (category == 5) {
            message = "Category 5: greater than 155 mph or 135 kt or 249 km/hr";
        } else {
            message = "Invalid category. Please enter a number between 1 and 5.";
        }

        System.out.println(message);
        scanner.close();
	}

}
