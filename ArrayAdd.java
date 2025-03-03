public class ArrayAdd{
	public static int[] addOneToArray(int[] arr) {
        int n = arr.length;
        int carry = 1;  // Initialize carry with 1 since we are adding 1

        for (int i = n - 1; i >= 0; i--) {
            // Add carry to the current digit
            arr[i] += carry;

            // If the sum is less than 10, there's no carry needed anymore
            if (arr[i] < 10) {
                carry = 0;
                break;
            } else {
                // If the sum is 10, set current digit to 0 and keep carry as 1
                arr[i] = 0;
            }
        }

        // If there's still carry left, it means we need to add a new digit at the beginning
        if (carry == 1) {
            int[] newArr = new int[n + 1];
            newArr[0] = 1;
            for (int i = 0; i < n; i++) {
                newArr[i + 1] = arr[i];
            }
            return newArr;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 9};
        int[] outputArray = addOneToArray(inputArray);

        // Print the output array
        for (int digit : outputArray) {
            System.out.print(digit + " ");
        }
    }
}
