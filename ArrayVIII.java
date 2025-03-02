// Write a logic to display the even and odd count in a array.
public class ArrayVIII{
	static public int arr[]= {1,2,3,4,5};
	static int n;
	static int even;
	static int odd;
	public static void main(String[] args) {
		for(int i = 0; i<arr.length; i++){
			n = arr[i];
		if (n  % 2 == 0){
            even++;
        }else{
            odd++;
        }
    }
        System.out.println("Even numbers:"+even+ "/nOdd numbers:"+odd);
		
	}
}