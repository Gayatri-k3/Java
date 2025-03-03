//Count the number of elements greater than a specific value in an array.
public class Greater {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 9, 7, 3}; 
        int target = 5; 
        int count = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                count++;
            }
        }

        System.out.println("Number of elements greater than " + target + ": " + count);
    }
}
