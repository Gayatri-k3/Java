//give me the count of multiple of the target value
public class ArrayV{
	static public int arr[] ={2,4,5,6,81,76,8,9,10};
	static int multiple;
	public static void main(String[] args){
		int target = 9;
		for( int i = 0; i < arr.length ; i++){
			if(arr[i]%target == 0)
				multiple++;
		}
			System.out.println(multiple);
	}

}