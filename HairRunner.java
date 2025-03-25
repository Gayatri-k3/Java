class HairRunner{
	public static void main(String[] args) {
		Hair hair = new Hair();
		System.out.println("Default value of length: "+hair.length);
		System.out.println("Default value of porosity: "+hair.porosity);
		System.out.println("Default value of texture: "+hair.texture);
		System.out.println("Default value of color: "+hair.color);
		hair.length = "below shoulder";
		hair.porosity = "High porosity";
		hair.texture = "curly";
		hair.color = "Brown";
		System.out.println("Updated value of length: "+hair.length);
		System.out.println("Updated value of porosity: "+hair.porosity);
		System.out.println("Updated value of texture: "+hair.texture);
		System.out.println("Updated value of color: "+hair.color);
	}
}