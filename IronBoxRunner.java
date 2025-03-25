class IronBoxRunner{
	public static void main(String[] args) {
		IronBox ironBox = new IronBox();
		System.out.println("Default value of brand: "+ironBox.brand);
		System.out.println("Default value of steam: "+ironBox.steam);
		System.out.println("Default value of soleMaterial: "+ironBox.soleMaterial);
		System.out.println("Default value of watts: "+ironBox.watts);
		ironBox.brand = "Bajaj";
		ironBox.steam = true;
		ironBox.soleMaterial = "Iron";
		ironBox.watts = "200watts";
		System.out.println("Updated value of brand: "+ironBox.brand);
		System.out.println("Updated value of steam: "+ironBox.steam);
		System.out.println("Updated value of soleMaterial: "+ironBox.soleMaterial);
		System.out.println("Updated value of watts: "+ironBox.watts);
	}
}