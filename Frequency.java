// find the frequency of the each elements
//input: {2,2,3,4,5,6,6,3}
//output: 2-2,3-2,4-1,6-2
public class Frequency{
	public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 6, 6, 3}; // Given array
        boolean[] visited = new boolean[arr.length]; // To track counted elements

        System.out.println("Element Frequencies:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) // Skip already counted elements
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // Mark as counted
                }
            }
            System.out.println(arr[i] + "-" + count);
        }
    }
}
