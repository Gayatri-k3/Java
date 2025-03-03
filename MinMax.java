//Find the Min and Max elements in the given array
public class MinMax{
	public static void main(String[] args) {
		int[] arr = {5, 2, 7, 1, 7, 7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int max = arr[arr.length-1];
        int min = arr[0];
        System.out.println("Min Number:"+min);
        System.out.println("Max Number:"+max);

	}
	
}