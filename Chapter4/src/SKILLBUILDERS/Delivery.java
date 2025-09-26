package SKILLBUILDERS;
import java.util.Scanner;
public class Delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the package: ");
        double length = input.nextDouble();

        System.out.println("Enter the width of the package: ");
        double width = input.nextDouble();

        System.out.println("Enter the height of the package: ");
        double height = input.nextDouble();

        if (length > 10 || width > 10 || height > 10) {
            System.out.println("Reject");
        } else {
            System.out.println("Accept");
        }

        input.close();

	}

}
