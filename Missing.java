/*write a logic to find the missing number in the given array
input: {2,4,5}
out put: {2,3,4,5} or 3*/
public class Missing{
	public static void main(String[] args) {
        int[] arr = {2, 4, 5}; // Given array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Missing numbers: ");
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}


	
