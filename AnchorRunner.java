class AnchorRunner{
	public static void main(String[] args) {
		Anchor anchor = new Anchor();
		System.out.println("Default value of weight: "+anchor.weight);
		System.out.println("Default value of type: "+anchor.type);
		System.out.println("Default value of compatibility: "+anchor.compatibility);
		System.out.println("Default value of stowage: "+anchor.stowage);
		anchor.weight = "15kg";
		anchor.type = "Plow anchor";
		anchor.compatibility = "30 feet boat";
		anchor.stowage = "anchor well";
		System.out.println("Updated value of weight: "+anchor.weight);
		System.out.println("Updated value of type: "+anchor.type);
		System.out.println("Updated value of compatibility: "+anchor.compatibility);
		System.out.println("Updated value of stowage: "+anchor.stowage);
	}
}
