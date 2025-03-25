class SirenRunner{
	public static void main(String[] args) {
		Siren siren = new Siren();
		System.out.println("Default value of powerSource: "+siren.powerSource);
		System.out.println("Default value of range: "+siren.range);
		System.out.println("Default value of type: "+siren.type);
		System.out.println("Default value of material: "+siren.material);
		siren.powerSource = "Battery";
		siren.range = "1km";
		siren.type = "Ambulance Siren";
		siren.material = "Plastic";
		System.out.println("Updated value of powerSource: "+siren.powerSource);
		System.out.println("Updated value of range: "+siren.range);
		System.out.println("Updated value of type: "+siren.type);
		System.out.println("Updated value of material: "+siren.material);
	}
}