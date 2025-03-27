//2. Tab
public class Tab{
	String brand;
    String model;
    String processor;
    int ram;
    int storage;
    double displaySize;
    String resolution;
    String batteryCapacity;
    boolean hasStylus;
    String os;
    String connectivity;
    boolean supports5G;
    String color;
    double weight;
    boolean hasFaceUnlock;
    boolean hasFingerprintSensor;
    boolean expandableStorage;
    String cameraSpecs;
    int warrantyYears;
    double price;
    public Tab(String brand, double screenSize, String processor, int ram, int storage, String os, int batteryCapacity,
               boolean hasStylus, String connectivity, double weight, String color, String resolution,
               boolean hasFingerprintSensor, boolean hasFaceUnlock, String chargingType, boolean supports5G,
               String material, boolean hasExpandableStorage, int cameraResolution, boolean waterResistant) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.batteryCapacity = batteryCapacity;
        this.hasStylus = hasStylus;
        this.connectivity = connectivity;
        this.weight = weight;
        this.color = color;
        this.resolution = resolution;
        this.hasFingerprintSensor = hasFingerprintSensor;
        this.hasFaceUnlock = hasFaceUnlock;
        this.chargingType = chargingType;
        this.supports5G = supports5G;
        this.material = material;
        this.hasExpandableStorage = hasExpandableStorage;
        this.cameraResolution = cameraResolution;
        this.waterResistant = waterResistant;
    }
}