//Write a Java program to calculate the total bill of a shopping cart. Apply a discount of 10% if the total bill exceeds $100.
public class Discount{
	public static void main(String args[]){
	int fruits = 35;
	int vegetables = 5;
	int paints = 25;
	int utensils = 40;
	int total = fruits + vegetables + paints + utensils;
        double afterDiscount = total*0.10;
	System.out.println("The Bill is/n");
        System.out.println("Fruits:"+ fruits+ "\nVegetables: "+vegetables+ "\nPaints :"+paints+ "\nUtensils :"+utensils+ "\nTotal Amount payable is :"+ total);
        if (total>100){
            System.out.println("Ater 10% Discount the payable amount is :"+ (total-afterDiscount) );
        }else {
            System.out.println("You can avail Discount on total above 100$");
        }
	}
}