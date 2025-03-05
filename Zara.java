public class Zara{
	static String []products = {null,null,null};
	static int noOfProducts;
	static String location;

	public static void displayZara(){
		System.out.println("Welcome to Zara");
		Zara.products[0]="Clothes";
		Zara.products[1]="Perfumes";
		Zara.products[2]="Accessories";
		Zara.noOfProducts = 3;
		Zara.location = "Bengaluru";
		System.out.println("Number of Products sold: "+Zara.noOfProducts);
		System.out.println("Products sold: \n"+Zara.products[0]+"\n"+Zara.products[1]+"\n"+Zara.products[2]);
		System.out.println("Location of the store: "+Zara.location);
	}
	
}