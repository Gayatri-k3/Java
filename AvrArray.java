// Find the avg of all the array elements
public class AvrArray{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		double avg = 0;
		for(int i =0; i<arr.length;i++){
			avg += arr[i];
		}
		System.out.println("The Avg of the array is: "+(avg/arr.length));
	}
}