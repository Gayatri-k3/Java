//Write a program to find the row in a matrix that has the maximum sum of its elements.
public class MaxEle{
	public static void main(String[] args) {
		int [][]arr = {
			{1,2,3},
			{3,4,5},
			{5,6,7},
			{7,8,9}
		};
		int highest = 0;
		int row=0;
		for(int i = 0; i < arr.length; i++){
			int sum=0;
			for(int j =0; j<arr[i].length;j++){
				System.out.println(arr[i][j]+" ");
				sum = sum+arr[i][j];
				if(sum>highest){
				highest=sum;
				row = i;
				}
			}
			System.out.println("Sum of array: "+sum);
			System.out.println("===========");
		}
		System.out.println("Row which has the max sum of its elements is "+row);
	}
}