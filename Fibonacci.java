//Write a method to find the Fibonacci of the number
public class Fibonacci{
	public static void fib(){
	int n = 10;
	int sum = 0;
	int a= 0, b = 1;
	for(int i =2;i<=n;i++){
		sum=a+b;
		a=b;
		b=sum;
	}
	System.out.println("Fibonacci of given number is: "+sum);
}
}