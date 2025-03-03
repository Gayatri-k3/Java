//Check if an array is a perfect square
public class PerfectSquare {
    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 16, 25}; // Example array

        boolean allPerfectSquares = true;

        for (int i = 0; i < arr.length; i++) {
            if (!isPerfectSquare(arr[i])) {
                allPerfectSquares = false;
                break; 
            }
        }

        if (allPerfectSquares) {
            System.out.println("All elements are perfect squares.");
        } else {
            System.out.println("Array contains non-square numbers.");
        }
    }

   
    private static boolean isPerfectSquare(int num) {
        if (num < 0) return false; 
        int i = 0;
        while (i * i <= num) { 
            if (i * i == num) {
                return true; 
            }
            i++;
        }
        return false; 
    }
}
