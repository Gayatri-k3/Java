//Write a static method to find the palindrome
public class Palindrome{
	public static void paliDisplay(){
		int n = 212;
		String temp = "" + n;
		String sb = new StringBuilder(temp).reverse().toString();
		if (temp.equals(sb)){
			System.out.println(n +" is a palindrome");
		}else{
			System.out.println(n +" is not a palindrome");
		}
	}
}