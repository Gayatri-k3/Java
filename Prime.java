//Write a program to check number is a prime number or not
public class Prime{
	public static void main(String args[]){
	int n = 3;
	boolean isPrime = true;
	if (n <=1){
            isPrime = false;
        }
        for (int i =2; i <=n / 2; i++){
            if (n % i ==0){
                isPrime = false;
            }
        }
            if (isPrime){
                System.out.println(n + " is a prime number.");
            }else{
                System.out.println(n + " is not a prime number");
        }
    }
}