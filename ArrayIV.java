//check target value is equals to the sum of all the array elements
public class ArrayIV{
	static public int[] arr = {1,2,4,5,3};
	static int sum;
	public static void main(String[] args) {
		//int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		int target = 25;
		{
			sum += arr[i];
		}
		if(sum == target)
			System.out.println("Target equals sum of all elements of array");
		else
			System.out.println("Target does not equals sum of all elements of array");
	}
}

//n((n+1))/2