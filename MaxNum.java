public class MaxNum {
	static int [][]arr ={{1,2,3},{3,4,5},{5,6,7},{7,8,9}};
	public static void main(String[] args) {
	int maxNum = arr[0][0];
	int row = 0;
	for(int i = 0; i<arr.length;i++){
		for(int j =0; j<arr[i].length;j++){
			if(arr[i][j] > maxNum){
				maxNum = arr[i][j];
				row = i;
			}
		}
	}
	System.out.println(maxNum);
		System.out.println(row);
	}
}