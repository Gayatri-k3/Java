class BedRunner{
	public static void main(String[] args) {
		Bed bed = new Bed();
		System.out.println("Default value of Style: "+bed.style);
		System.out.println("Default value of Frame: "+bed.frame);
		System.out.println("Default value of size: "+bed.size);
		System.out.println("Default value of mattressType: "+bed.mattressType);
		bed.style = "Canopy";
		bed.frame = "Wooden frame";
		bed.size = "California";
		bed.mattressType = "Memory Foam";
		System.out.println("Updated value of Style: "+bed.style);
		System.out.println("Updated value of Frame: "+bed.frame);
		System.out.println("Updated value of size: "+bed.size);
		System.out.println("Updated value of mattressType: "+bed.mattressType);
	}
}