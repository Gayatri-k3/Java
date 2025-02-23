//Write a Java program to swap two integer values without using a third variable
public class Swap{
	public static void main(String args[]){
	int a = 2; int b = 3;
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("a :"+a+"\nB :"+b);
	}
}