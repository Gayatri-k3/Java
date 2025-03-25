class TerraceRunner{
	public static void main(String[] args) {
		Terrace terrace = new Terrace();
		System.out.println("Default value of Railing type: "+terrace.railingType);
		System.out.println("Default value of Floor: "+terrace.floor);
		System.out.println("Default value of size: "+terrace.material);
		System.out.println("Default value of mattressType: "+terrace.purpose);
		terrace.railingType = "Iron railing";
		terrace.floor = "5th Floor";
		terrace.material = "Concrete";
		terrace.purpose = "Gardening";
		System.out.println("Updated value of Railing type: "+terrace.railingType);
		System.out.println("Updated value of Floor: "+terrace.floor);
		System.out.println("Updated value of size: "+terrace.material);
		System.out.println("Updated value of mattressType: "+terrace.purpose);

	}
}