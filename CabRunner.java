class CabRunner{
	public static void main(String[] args) {
        Cab cab1 = new Cab("Toyota", "Camry", "Petrol", "Automatic", 5, true, true, true,
                "White", 15.0, 2500, "ABS, Traction Control", true, true,
                "High", "Personal", false, 5, 30000.0);
        
        Cab cab2 = new Cab("Hyundai", "Elantra", "Diesel", "Manual", 5, true, true, true,
                "Black", 18.5, 1600, "Airbags, Stability Control", true, true,
                "Very High", "Commercial", false, 3, 25000.0);
        
        Cab cab3 = new Cab("Honda", "Civic", "Hybrid", "Automatic", 5, true, true, true,
                "Blue", 20.0, 2000, "Lane Assist, Adaptive Cruise", true, true,
                "Excellent", "Personal", true, 6, 35000.0);
        
        System.out.println("Cab 1: " + cab1.brand + ", " + cab1.model + ", " + cab1.fuelType + ", " + cab1.transmission + ", " + 
                           cab1.seatingCapacity + " seats, " + cab1.hasAirConditioning + ", " + cab1.hasGPS + ", " + cab1.hasMusicSystem + ", " + 
                           cab1.color + ", " + cab1.mileage + " km/l, " + cab1.engineCapacity + " cc, " + cab1.safetyFeatures + ", " + 
                           cab1.isAutomatic + ", " + cab1.hasSunroof + ", " + cab1.comfortLevel + ", " + cab1.usageType + ", " + 
                           cab1.hasLeatherSeats + ", " + cab1.doors + " doors, $" + cab1.price);
        
        System.out.println("Cab 2: " + cab2.brand + ", " + cab2.model + ", " + cab2.fuelType + ", " + cab2.transmission + ", " + 
                           cab2.seatingCapacity + " seats, " + cab2.hasAirConditioning + ", " + cab2.hasGPS + ", " + cab2.hasMusicSystem + ", " + 
                           cab2.color + ", " + cab2.mileage + " km/l, " + cab2.engineCapacity + " cc, " + cab2.safetyFeatures + ", " + 
                           cab2.isAutomatic + ", " + cab2.hasSunroof + ", " + cab2.comfortLevel + ", " + cab2.usageType + ", " + 
                           cab2.hasLeatherSeats + ", " + cab2.doors + " doors, $" + cab2.price);
        
        System.out.println("Cab 3: " + cab3.brand + ", " + cab3.model + ", " + cab3.fuelType + ", " + cab3.transmission + ", " + 
                           cab3.seatingCapacity + " seats, " + cab3.hasAirConditioning + ", " + cab3.hasGPS + ", " + cab3.hasMusicSystem + ", " + 
                           cab3.color + ", " + cab3.mileage + " km/l, " + cab3.engineCapacity + " cc, " + cab3.safetyFeatures + ", " + 
                           cab3.isAutomatic + ", " + cab3.hasSunroof + ", " + cab3.comfortLevel + ", " + cab3.usageType + ", " + 
                           cab3.hasLeatherSeats + ", " + cab3.doors + " doors, $" + cab3.price);
    }
}
