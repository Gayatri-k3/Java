// Find all unique triplets in an array that sum up to a given number.
public class UniqueTriplets {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -2, -1, 3, 0};
        int target = 0; // Given sum
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Unique Triplets that sum to " + target + ":");
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println(arr[i] + ", " + arr[left] + ", " + arr[right])
                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < target) {
                    left++; 
                } else {
                    right--; 
                }
            }
        }
    }
}
