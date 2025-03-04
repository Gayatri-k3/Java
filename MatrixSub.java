//Write a program to subtract two matrices.
public class MatrixSub {
    public static void main(String[] args) {
        int[][] A = {
            {5, 8, 3},
            {4, 7, 9},
            {6, 2, 1}
        };
        int[][] B = {
            {1, 4, 2},
            {3, 5, 8},
            {7, 6, 0}
        };
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        System.out.println("Matrix after subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
