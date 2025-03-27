//10. Satelliete
class Satellite{
	String name;
    String country;
    String purpose;
    String launchDate;
    String launchVehicle;
    double mass;
    String orbitType;
    boolean isOperational;
    String operator;
    String missionDuration;
    String powerSource;
    boolean hasSolarPanels;
    boolean hasScientificInstruments;
    double altitude;
    String communicationFrequency;
    boolean isManned;
    boolean isInterplanetary;
    double cost;
    String missionOutcome;
    public Satellite(String name, String country, String purpose, String launchDate, String launchVehicle, double mass, String orbitType, boolean isOperational,
                      String operator, String missionDuration, String powerSource, boolean hasSolarPanels, boolean hasScientificInstruments, double altitude,
                      String communicationFrequency, boolean isManned, boolean isInterplanetary, double cost, String missionOutcome) {
        this.name = name;
        this.country = country;
        this.purpose = purpose;
        this.launchDate = launchDate;
        this.launchVehicle = launchVehicle;
        this.mass = mass;
        this.orbitType = orbitType;
        this.isOperational = isOperational;
        this.operator = operator;
        this.missionDuration = missionDuration;
        this.powerSource = powerSource;
        this.hasSolarPanels = hasSolarPanels;
        this.hasScientificInstruments = hasScientificInstruments;
        this.altitude = altitude;
        this.communicationFrequency = communicationFrequency;
        this.isManned = isManned;
        this.isInterplanetary = isInterplanetary;
        this.cost = cost;
        this.missionOutcome = missionOutcome;
    }
}