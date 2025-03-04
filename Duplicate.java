// Write a program to remove all duplicate elements in the given array
public class Duplicate{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 5, 6, 7, 7, 8, 9};
        int n = arr.length;
        n = removeDuplicates(arr, n);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) { 
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--; 
                    j--; 
                }
            }
        }
        return n; 
    }
}
