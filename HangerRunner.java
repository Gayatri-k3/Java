class HangerRunner{
	public static void main(String[] args) {
		Hanger hanger = new Hanger();
		System.out.println("Default value of usedFor: "+hanger.usedFor);
		System.out.println("Default value of collapsible: "+hanger.collapsible);
		System.out.println("Default value of color: "+hanger.color);
		System.out.println("Default value of rotatable: "+hanger.rotatable);
		hanger.usedFor = "skirts";
		hanger.collapsible = true;
		hanger.color = "black";
		hanger.rotatable = true;
		System.out.println("Updated value of usedFor: "+hanger.usedFor);
		System.out.println("Updated value of collapsible: "+hanger.collapsible);
		System.out.println("Updated value of color: "+hanger.color);
		System.out.println("Updated value of rotatable: "+hanger.rotatable);
	}

}