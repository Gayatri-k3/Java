public class ArrayAssesment{
	public static int [][]arr={{1,2},{2,3},{3,4}};
	public static void main(String[] args) {
		for(int i = 0; i < arr.length; i++){
			int sum=0;
			for(int j =0; j<arr[i].length;j++){
				System.out.println(arr[i][j]+"");
				sum += arr[i][j];
			}
			System.out.println("Sum of this row is: "+sum);
			System.out.println();
		}
		for(int j =0; j<arr[0].length;j++){
			int sumC=0;
			for(int i = 0; i < arr.length; i++){
				System.out.println(arr[i][j]+" ");
				sumC +=arr[i][j];
				}
				System.out.println("Sum of this column is: "+sumC);
				System.out.println();
			}
		}
	}