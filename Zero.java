//Write a program that sets an entire row and an entire column to zero if an element in the matrix is zero.
public class Zero{
    static int[][] arr = {
        {1, 2, 3},
        {4, 0, 6},
        {7, 8, 9}
    };

    public static void main(String[] args) {
        boolean firstRowZero = false, firstColZero = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0; 
                    arr[0][j] = 0; 
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }
        if (firstRowZero) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[0][j] = 0;
            }
        }
        if (firstColZero) {
            for (int i = 0; i < arr.length; i++) {
                arr[i][0] = 0;
            }
        }
        System.out.println("Modified Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
