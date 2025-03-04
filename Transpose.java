//transpose matrix
public class Transpose{
	static int [][]arr = {
			{1,2,3},
			{3,4,5},
		};
	static int [][]trans = new int[arr[0].length][arr.length];
	public static void main(String[] args) {
		 for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[i].length; j++) { 
                trans[j][i] = arr[i][j];
            }
		}
		System.out.println("Transpose of the given matrix:");
        for (int[] row : trans) { 
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}