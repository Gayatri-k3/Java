public class ArrayIII{
	public static int[] arr = {1,2,3,4,5};
	public static void main(String[] args){
		boolean present = false;
		for( int i = 0; i < arr.length ; i++){
		if (arr[i] == 9)
			present = true;
		}
		if(present == true)
			System.out.println("Target present");
		else
			System.out.println("Target absent");
	}
}
