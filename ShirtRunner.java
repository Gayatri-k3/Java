class ShirtRunner{
	public static void main(String[] args) {
		Shirt shirt = new Shirt();
		System.out.println("Default value of occasion: "+shirt.occasion);
		System.out.println("Default value of fit: "+shirt.fit);
		System.out.println("Default value of color: "+shirt.color);
		System.out.println("Default value of style: "+shirt.style);
		shirt.occasion = "Formal";
		shirt.fit = "Skim fit";
		shirt.color = "blue";
		shirt.style = "button up";
		System.out.println("Updated value of occasion: "+shirt.occasion);
		System.out.println("Updated value of fit: "+shirt.fit);
		System.out.println("Updated value of color: "+shirt.color);
		System.out.println("Updated value of style: "+shirt.style);
	}

}