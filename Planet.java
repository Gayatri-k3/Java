//6. Planet
class Planet{
	String name;
  double mass;
  double radius;
  double gravity;
  String type;
  String atmosphere;
  boolean hasRings;
  int numberOfMoons;
  String discoveryDate;
  String discoveredBy;
  double orbitalPeriod;
  double rotationPeriod;
  double distanceFromSun;
  boolean supportsLife;
  String coreComposition;
  double surfaceTemperature;
  String surfaceFeatures;
  boolean hasMagneticField;
  String spaceMissions;
  String planetCategory;

    public Planet(String name, double mass, double radius, double gravity, String type, String atmosphere,
                  boolean hasRings, int numberOfMoons, String discoveryDate, String discoveredBy, double orbitalPeriod,
                  double rotationPeriod, double distanceFromSun, boolean supportsLife, String coreComposition,
                  double surfaceTemperature, String surfaceFeatures, boolean hasMagneticField, String spaceMissions,
                  String planetCategory) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.gravity = gravity;
        this.type = type;
        this.atmosphere = atmosphere;
        this.hasRings = hasRings;
        this.numberOfMoons = numberOfMoons;
        this.discoveryDate = discoveryDate;
        this.discoveredBy = discoveredBy;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
        this.distanceFromSun = distanceFromSun;
        this.supportsLife = supportsLife;
        this.coreComposition = coreComposition;
        this.surfaceTemperature = surfaceTemperature;
        this.surfaceFeatures = surfaceFeatures;
        this.hasMagneticField = hasMagneticField;
        this.spaceMissions = spaceMissions;
        this.planetCategory = planetCategory;
    }
}