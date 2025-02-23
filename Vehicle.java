//Write a Java program that determines the type of vehicle a person can drive based on their age (e.g., Bicycle, Scooter, Car)
public class Vehicle{
	public static void main(String args[]){
	int age = 24;
	if (age <= 16){
	System.out.println("Person can drive Bicycle");
	}else if (age > 16 && age <= 21 ){
	System.out.println("Person can drive Scooter");
	}else{
	System.out.println("person can drive Car");

	}
	}
}