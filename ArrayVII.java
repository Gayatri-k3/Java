//write a program to get the following output
//Array : {2,4,10,90,4,6}
//target number : 8
//output: [2,6], [4,4]
public class ArrayVII {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 90, 4, 6};
        int target = 8;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.print("[" + arr[i] + "," + arr[j] + "] ");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found.");
        }
    }
}
