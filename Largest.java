// Write a program to find the largest element in each row of a array.
public class Largest{
	public static void main(String[] args) {
	int [][]arr ={{1,2,3},{3,4,5},{5,6,7},{7,8,9}};
		for(int i = 0; i<arr.length;i++){
			int maxNum = arr[i][0];
			for(int j =0; j<arr[i].length;j++){
				if(arr[i][j] > maxNum){
					maxNum = arr[i][j];
				}
				
			}
			System.out.println(maxNum);
		}
	}
}

	