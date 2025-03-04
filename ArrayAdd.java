public class ArrayAdd{
    public static int[] arr = {9, 9, 9};
    public static void main(String[] args) {
        boolean istrue = true;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] + 1;
            if (arr[i] == 10) {
                arr[i] = 0;
            } else {
                istrue = false;
                break;
            }
        }
         if (istrue) {
            System.out.print(1 + " ");
            for (int num : arr) {
                System.out.print(num + " "); 
            }
        } else {
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}



 //9,9,99
