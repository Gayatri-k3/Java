//7. Rocket
class Rocket{
	String name;
    String manufacturer;
    double height;
    double diameter;
    double mass;
    int stages;
    double thrust;
    double payloadCapacity;
    String fuelType;
    String launchDate;
    boolean isReusable;
    String launchSite;
    boolean hasEscapeSystem;
    String missionType;
    String destination;
    String country;
    int successfulLaunches;
    int failedLaunches;
    String notableMissions;
    double cost;
    public Rocket(String name, String manufacturer, double height, double diameter, double mass, int stages, double thrust,
                  double payloadCapacity, String fuelType, String launchDate, boolean isReusable, String launchSite,
                  boolean hasEscapeSystem, String missionType, String destination, String country, int successfulLaunches,
                  int failedLaunches, String notableMissions, double cost) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.height = height;
        this.diameter = diameter;
        this.mass = mass;
        this.stages = stages;
        this.thrust = thrust;
        this.payloadCapacity = payloadCapacity;
        this.fuelType = fuelType;
        this.launchDate = launchDate;
        this.isReusable = isReusable;
        this.launchSite = launchSite;
        this.hasEscapeSystem = hasEscapeSystem;
        this.missionType = missionType;
        this.destination = destination;
        this.country = country;
        this.successfulLaunches = successfulLaunches;
        this.failedLaunches = failedLaunches;
        this.notableMissions = notableMissions;
        this.cost = cost;
    }
}

