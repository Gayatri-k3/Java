class SatelliteRunner{
	public static void main(String[] args) {
        Satellite satellite1 = new Satellite("Hubble", "USA", "Astronomy", "1990-04-24", "Space Shuttle Discovery", 11110, "Low Earth Orbit", true,
                "NASA", "30 years", "Solar Panels", true, true, 547, "X-band", false, false, 2.5, "Operational");

        Satellite satellite2 = new Satellite("Sputnik 1", "USSR", "Communication", "1957-10-04", "R-7 Rocket", 83.6, "Low Earth Orbit", false,
                "Soviet Space Program", "21 days", "Battery", false, false, 577, "Radio", false, false, 0.3, "Deorbited");

        Satellite satellite3 = new Satellite("Voyager 1", "USA", "Interstellar Exploration", "1977-09-05", "Titan IIIE", 825, "Heliocentric", true,
                "NASA", "Indefinite", "RTG", false, true, 22790000000.0, "S-band", false, true, 0.98, "Operational");

        System.out.println("Satellite 1: \nName: " + satellite1.name + ", \nCountry: " + satellite1.country + ", \nPurpose: " + satellite1.purpose +
                ", \nLaunch Date: " + satellite1.launchDate + ", \nLaunch Vehicle: " + satellite1.launchVehicle + ", \nMass: " + satellite1.mass +
                " kg, \nOrbit Type: " + satellite1.orbitType + ", \nOperational: " + satellite1.isOperational + ", \nOperator: " + satellite1.operator +
                ", \nMission Duration: " + satellite1.missionDuration + ", \nPower Source: " + satellite1.powerSource + ", \nHas Solar Panels: " + satellite1.hasSolarPanels +
                ", \nHas Scientific Instruments: " + satellite1.hasScientificInstruments + ", \nAltitude: " + satellite1.altitude + " km, \nCommunication Frequency: " + satellite1.communicationFrequency +
                ", \nManned: " + satellite1.isManned + ", \nInterplanetary: " + satellite1.isInterplanetary + ", \nCost: $" + satellite1.cost + " billion, \nMission Outcome: " + satellite1.missionOutcome);

        System.out.println("\nSatellite 2: \nName: " + satellite2.name + ", \nCountry: " + satellite2.country + ", \nPurpose: " + satellite2.purpose +
                ", \nLaunch Date: " + satellite2.launchDate + ", \nLaunch Vehicle: " + satellite2.launchVehicle + ", \nMass: " + satellite2.mass +
                " kg, \nOrbit Type: " + satellite2.orbitType + ", \nOperational: " + satellite2.isOperational + ", \nOperator: " + satellite2.operator +
                ", \nMission Duration: " + satellite2.missionDuration + ", \nPower Source: " + satellite2.powerSource + ", \nHas Solar Panels: " + satellite2.hasSolarPanels +
                ", \nHas Scientific Instruments: " + satellite2.hasScientificInstruments + ", \nAltitude: " + satellite2.altitude + " km, \nCommunication Frequency: " + satellite2.communicationFrequency +
                ", \nManned: " + satellite2.isManned + ", \nInterplanetary: " + satellite2.isInterplanetary + ", \nCost: $" + satellite2.cost + " billion, \nMission Outcome: " + satellite2.missionOutcome);

        System.out.println("\nSatellite 3: \nName: " + satellite3.name + ", \nCountry: " + satellite3.country + ", \nPurpose: " + satellite3.purpose +
                ", \nLaunch Date: " + satellite3.launchDate + ", \nLaunch Vehicle: " + satellite3.launchVehicle + ", \nMass: " + satellite3.mass +
                " kg, \nOrbit Type: " + satellite3.orbitType + ", \nOperational: " + satellite3.isOperational + ", \nOperator: " + satellite3.operator +
                ", \nMission Duration: " + satellite3.missionDuration + ", \nPower Source: " + satellite3.powerSource + ", \nHas Solar Panels: " + satellite3.hasSolarPanels +
                ", \nHas Scientific Instruments: " + satellite3.hasScientificInstruments + ", \nAltitude: " + satellite3.altitude + " km, \nCommunication Frequency: " + satellite3.communicationFrequency +
                ", \nManned: " + satellite3.isManned + ", \nInterplanetary: " + satellite3.isInterplanetary + ", \nCost: $" + satellite3.cost + " billion, \nMission Outcome: " + satellite3.missionOutcome);
    }
}