//4. Cab
class Cab{
	String brand;
    String model;
    String fuelType;
    String transmission;
    int seatingCapacity;
    boolean hasAirConditioning;
    boolean hasGPS;
    boolean hasMusicSystem;
    String color;
    double mileage;
    int engineCapacity;
    String safetyFeatures;
    boolean isAutomatic;
    boolean hasSunroof;
    String comfortLevel;
    String usageType;
    boolean hasLeatherSeats;
    int doors;
    double price;

    public Cab(String brand, String model, String fuelType, String transmission, int seatingCapacity, 
               boolean hasAirConditioning, boolean hasGPS, boolean hasMusicSystem, String color, double mileage, 
               int engineCapacity, String safetyFeatures, boolean isAutomatic, boolean hasSunroof, String comfortLevel, 
               String usageType, boolean hasLeatherSeats, int doors, double price) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.seatingCapacity = seatingCapacity;
        this.hasAirConditioning = hasAirConditioning;
        this.hasGPS = hasGPS;
        this.hasMusicSystem = hasMusicSystem;
        this.color = color;
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
        this.safetyFeatures = safetyFeatures;
        this.isAutomatic = isAutomatic;
        this.hasSunroof = hasSunroof;
        this.comfortLevel = comfortLevel;
        this.usageType = usageType;
        this.hasLeatherSeats = hasLeatherSeats;
        this.doors = doors;
        this.price = price;
    }
}