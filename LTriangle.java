//sum of rows in a lower triangle matrix
public class LTriangle{
	public static void main(String[] args) {
		int [][]arr={
			{1,0,0},
			{3,4,0},
			{5,6,7}
		};
		int sum = 0;
		for(int i = 0; i<arr.length;i++){
			for(int j =0; j<arr[i].length;j++){
				System.out.println(arr[i][j]+" ");
				sum += arr[i][j];
			}
			System.out.println();
			System.out.println("===========");
		}
		System.out.println("Sum of all arrays: "+sum);
	}
}