class FloorRunner{
	public static void main(String[] args) {
		Floor floor = new Floor();
		System.out.println("Default value of material: "+floor.material);
		System.out.println("Default value of measurement: "+floor.measurement);
		System.out.println("Default value of insulation: "+floor.insulation);
		System.out.println("Default value of finish: "+floor.finish);
		floor.material = "Tile";
		floor.measurement = "20 sq.feet";
		floor.insulation = "Thermal Insulation";
		floor.finish = "matt";
		System.out.println("Updated value of material: "+floor.material);
		System.out.println("Updated value of measurement: "+floor.measurement);
		System.out.println("Updated value of insulation: "+floor.insulation);
		System.out.println("Updated value of finish: "+floor.finish);
	}
}
