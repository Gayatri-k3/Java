//8. Drone
class Drone{
	String brand;
    String model;
    double weight;
    double maxFlightTime;
    double maxSpeed;
    double range;
    String cameraSpecs;
    boolean hasGPS;
    boolean obstacleD;
    boolean isFoldable;
    String batteryCapacity;
    String remoteControlType;
    boolean isRemoteControlling;
    boolean hasNightVision;
    String usage;
    boolean isWaterproof;
    int warrantyYears;
    double price;
    boolean goProAttached;
    public Drone(String brand, String model, double weight, double maxFlightTime, double maxSpeed, double range, String cameraSpecs,
                 boolean hasGPS, boolean obstacleD, boolean isFoldable, String batteryCapacity, String remoteControlType,
                 boolean isRemoteControlling, boolean hasNightVision, String usage, boolean isWaterproof, int warrantyYears, double price,
                 boolean goProAttached) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.maxFlightTime = maxFlightTime;
        this.maxSpeed = maxSpeed;
        this.range = range;
        this.cameraSpecs = cameraSpecs;
        this.hasGPS = hasGPS;
        this.obstacleD = obstacleD;
        this.isFoldable = isFoldable;
        this.batteryCapacity = batteryCapacity;
        this.remoteControlType = remoteControlType;
        this.isRemoteControlling = isRemoteControlling;
        this.hasNightVision = hasNightVision;
        this.usage = usage;
        this.isWaterproof = isWaterproof;
        this.warrantyYears = warrantyYears;
        this.price = price;
        this.goProAttached = goProAttached;
    }
}
