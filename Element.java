//Find the 2nd Largest element in the array
public class Element{
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
        int largest = arr[arr.length-1];
        int secondLargest = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                //break;
            }
            
            
        }
        if (secondLargest != -1){
        	System.out.println(secondLargest);
        }
    }
}