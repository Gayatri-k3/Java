// Write a Java program to determine the type of fuel needed for a vehicle based on the engine type (Petrol, Diesel, Electric)
public class Fuel{
    public static void main(String args[]){
	String engine = "Petrol_Engine";
	if (engine.equals ("Petrol_Engine")){
	System.out.println("Fuel needed for this Engine is Petrol");
	}else if (engine.equals ("Diesel_Engine")){
	System.out.println("Fuel needed for this Engine is Diesel");
	}else if (engine.equals("Electric")){
	System.out.println("No Fuel Needed");
	}
	}
}