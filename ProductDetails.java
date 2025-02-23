public class ProductDetails{
	public static void main(String args[]){
	System.out.println("The product Details are");
	String productName = "Laptop";
	int price = 21000;
	byte discount = 30;
	String brandName = "Asus";
	float gst = 4.3f;
	int donation = 5;
	int deliveryFee = 10;
	int platformFee = 10;
    double total = price - discount + gst + donation + deliveryFee + platformFee;
    double totalwoGST = price - discount + donation + deliveryFee + platformFee;
    double actualAmt = price - discount;
	System.out.println("Product Name:"+ productName);
	System.out.println("Brand: "+brandName);
	System.out.println("Price:"+price);
	System.out.println("Discount: "+discount);
	System.out.println("GST: "+gst);
	System.out.println("Donation: "+donation);
	System.out.println("Delivery fee: "+deliveryFee);
	System.out.println("Platform fee: "+platformFee);
	System.out.println("Total Bill is: "+total);
	System.out.println("Total Bill without GST is: "+totalwoGST);
	System.out.println("Actual Payable Amount: "+actualAmt);
	}
} 