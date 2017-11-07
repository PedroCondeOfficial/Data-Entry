// I pledge my Honor that I have not cheated, and will not cheat, on this test.

// Creates a class for the CarTest driver to use

public class Car
{
	// Sets up the variables for make, model and year
	private String make;
	private String model;
	private int year; 
	
	// Sets up the object parameters, and initializes 
	public Car(String make,String model, int year){
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public Car(){
		make = "--";
		model = "--";
		year = 0;
	}
	// Sets up 6 methods. Three for returning the data, and three for setting the data of the three parameters
	public String getMake(){
		return make;
	}
	public void setMake(String make){
		this.make = make;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model = model;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
	public String toString(){
		return year + "\t" + make + "\t" + model;
	}
}