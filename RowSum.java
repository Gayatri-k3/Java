public class RowSum{
	public static void main(String[] args) {
		int [][]arr = {{1,2,3},{3,4,5},{5,6,7},{7,8,9}};
		
		for(int i = 0; i < arr.length; i++){
			int sum=0;
			for(int j =0; j<arr[i].length;j++){
				System.out.println(arr[i][j]+" ");
				sum = sum+arr[i][j];
			}
					System.out.println("Sum of array: "+sum);
			System.out.println("===========");
		}
	}
}