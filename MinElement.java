//Find the 2n Minimun element in the given array
public class MinElement{
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
        /*int secondLargest = arr[arr.length-2];
        System.out.println("Second Largest Element:"+secondLargest);*/
        int smallest = arr[0];
        int secondSmallest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > smallest) {
                secondSmallest = arr[i];
                break;
            }
            
            
        }
        if (secondSmallest != -1){
        	System.out.println(secondSmallest);
        }
        else{
        	System.out.println("No");
        }
    }
}