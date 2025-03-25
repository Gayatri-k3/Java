class CraneRunner{
	public static void main(String[] args) {
		Crane crane = new Crane();
		System.out.println("Default value of species: "+crane.species);
		System.out.println("Default value of habitat: "+crane.habitat);
		System.out.println("Default value of diet: "+crane.diet);
		System.out.println("Default value of lifespan: "+crane.lifespan);
		crane.species = "SandHill Crane";
		crane.habitat = "grasslands";
		crane.diet = "omnivorous";
		crane.lifespan = "20 years";
		System.out.println("Updated value of species: "+crane.species);
		System.out.println("Updated value of habitat: "+crane.habitat);
		System.out.println("Updated value of diet: "+crane.diet);
		System.out.println("Updated value of lifespan: "+crane.lifespan);
	}
}
