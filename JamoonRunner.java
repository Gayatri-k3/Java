class JamoonRunner{
	public static void main(String[] args) {
		Jamoon jamoon = new Jamoon();
		System.out.println("Default value of season: "+jamoon.season);
		System.out.println("Default value of medicinalProperty: "+jamoon.medicinalProperty);
		System.out.println("Default value of taste: "+jamoon.taste);
		System.out.println("Default value of color: "+jamoon.color);
		jamoon.season = "summer";
		jamoon.medicinalProperty = "boosts immunity";
		jamoon.taste = "Sour";
		jamoon.color = "purple";
		System.out.println("Updated value of season: "+jamoon.season);
		System.out.println("Updated value of medicinalProperty: "+jamoon.medicinalProperty);
		System.out.println("Updated value of taste: "+jamoon.taste);
		System.out.println("Updated value of color: "+jamoon.color);
	}
}