// I pledge my Honor that I have not cheated, and will not cheat, on this test.

// This page uses the Car class to display a person's automobile history
import java.util.*;

public class CarTest
{
	// Makes three Car objects
	private static Car car1;
	private static Car car2;
	private static Car car3;
	
	public static void main(String[] args){

		// Sets up Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Customizes the Car classes 
		car1 = new Car("Ford", "Taurus", 2015);
		car2 = new Car("Honda", "Accord", 2007);
		car3 = new Car();
		
		// Prints the data for the cars 
		System.out.println("Automobile Data: ");
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		// Customizes the third Car object
		System.out.println("No data for Automobile #3. Please input data.");
		System.out.println("Make: ");
		car3.setMake(input.next());
		System.out.println("Model: ");
		car3.setModel(input.next());
		System.out.println("Year: ");
		car3.setYear(input.nextInt());
		
		// Changes the data of the first two Car objects
		System.out.println("Automobile #1 was traded for a different model. Insert new model: ");
		car1.setModel(input.next());
		System.out.println("Automobile #2 was traded for a newer version. Insert new year: ");
		car2.setYear(input.nextInt());
		
		// Prints out the finished table of Car objects with their respective data
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);

		
	}
}