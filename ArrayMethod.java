// Write a method to display array elements
public class ArrayMethod{
	static int[] arr={0,0};
	public static void arrayDisplay(){
		ArrayMethod.arr[0]=1;
		ArrayMethod.arr[1]=2;
		for(int i=0;i<ArrayMethod.arr.length;i++){
			System.out.println("Array: "+ArrayMethod.arr[i]);
		}
	}
}