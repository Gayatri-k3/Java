public class Diagonal{
	public static void main(String[] args) {
		int [][]arr ={
			{1,2,2},
			{3,4,5},
			{5,6,7}
		};
		int sum1= 0;
		int sum2 = 0;
		for (int i =0; i<arr.length;i++){
			sum1 += arr[i][i];
			sum2 += arr[i][arr.length-1-i];
		}
		System.out.println(sum1);
		System.out.println(sum2);

	}
}