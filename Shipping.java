// Write a Java program to check if a customer is eligible for free shipping (minimum order value should be $50).
public class Shipping{
	public static void main(String args[]){
	int orderValue = 25;
	if (orderValue >=50){
	System.out.println("Customer is eligible for free shipping");
	}else{
	System.out.println("Total amount should be 50$ or above to avail Free Shipping");
	}
	}
}