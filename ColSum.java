//Find the column with the maximum sum in a matrix.
public class ColSum{
	public static void main(String[] args) {
		int [][]arr = {
			{1,2,3},
			{3,4,5}, 
			{5,6,7},
			{7,8,9}
		};
		int highest = 0;
		int col=0;
		for(int j =0; j<arr[0].length;j++){
			int sum=0;
			for(int i = 0; i < arr.length; i++){
				System.out.println(arr[i][j]+" ");
				sum = sum+arr[i][j];
				if(sum>highest){
				highest=sum;
				col = i;
				}
			}
			System.out.println("Sum of array: "+sum);
			System.out.println("===========");
		}
		System.out.println("Column which has the max sum of its elements is "+col);
	}
}
