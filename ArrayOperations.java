public class ArrayOperations {

    // 1 
    public static void printArray(int arr[]) {
        System.out.print("int array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 2 
    public static void printArray(char arr[]) {
        System.out.print("char array: ");
        for (char value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 3 
    public static void printArray(String arr[]) {
        System.out.print("String array: ");
        for (String value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 4 
    public static void printArray(byte arr[]) {
        System.out.print("byte array: ");
        for (byte value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 5
    public static void printArray(long arr[]) {
        System.out.print("long array: ");
        for (long value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 6 
    public static void printArray(float arr[]) {
        System.out.print("float array: ");
        for (float value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 7 - Print double array
    public static void printArray(double arr[]) {
        System.out.print("double array: ");
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 8 - Print boolean array
    public static void printArray(boolean arr[]) {
        System.out.print("boolean array: ");
        for (boolean value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 9
    public static void printArray(int arr[][]) {
        System.out.println("2D int array: ");
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // 10 
    public static void printArray(char arr[][]) {
        System.out.println("2D char array: ");
        for (char[] row : arr) {
            for (char value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // 11 
    public static void arrayLength(int arr[]) {
        System.out.println("Length of int array: " + arr.length);
    }

    // 12 
    public static void arrayLength(char arr[]) {
        System.out.println("Length of char array: " + arr.length);
    }

    // 13 
    public static void arrayLength(String arr[]) {
        System.out.println("Length of String array: " + arr.length);
    }

    // 14 
    public static void arrayLength(float arr[]) {
        System.out.println("Length of float array: " + arr.length);
    }

    // 15
    public static void arrayLength(double arr[]) {
        System.out.println("Length of double array: " + arr.length);
    }

    // 16 - Length of two arrays (int and char)
    public static void arrayLength(int arr1[], char arr2[]) {
        System.out.println("Length of int array: " + arr1.length + ", Length of char array: " + arr2.length);
    }

    // 17 
    public static void arrayLength(String arr1[], float arr2[]) {
        System.out.println("Length of String array: " + arr1.length + ", Length of float array: " + arr2.length);
    }

    // 18
    public static void arrayLength(byte arr1[], long arr2[]) {
        System.out.println("Length of byte array: " + arr1.length + ", Length of long array: " + arr2.length);
    }

    // 19
    public static void arrayLength(double arr1[], boolean arr2[]) {
        System.out.println("Length of double array: " + arr1.length + ", Length of boolean array: " + arr2.length);
    }

    // 20 
    public static void arrayLength(int arr1[][], char arr2[][]) {
        System.out.println("Number of rows in int 2D array: " + arr1.length + ", Number of rows in char 2D array: " + arr2.length);
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String[] S = {"one", "two", "three", "four", "five", "six"};
        byte[] matrix = {1, 2, 3, 4, 5, 6};
        float[] floatArray = {1.2f, 3.4f, 5.6f};
        double[] doubleArray = {2.4, 5.7, 8.9};
        long[] longArray = {100000L, 200000L, 300000L};
        boolean[] boolArray = {true, false, true, false};

        int[][] matrix2 = {{1, 3, 6}, {6, 4, 7}, {3, 567, 3454}, {755, 9864, 900}};
        char[][] charMatrix = {{'A', 'B'}, {'C', 'D'}};

        printArray(num);
        printArray(ch);
        printArray(S);
        printArray(matrix);
        printArray(longArray);
        printArray(floatArray);
        printArray(doubleArray);
        printArray(boolArray);
        printArray(matrix2);
        printArray(charMatrix);

        arrayLength(num);
        arrayLength(ch);
        arrayLength(S);
        arrayLength(floatArray);
        arrayLength(doubleArray);

        arrayLength(num, ch);
        arrayLength(S, floatArray);
        arrayLength(matrix, longArray);
        arrayLength(doubleArray, boolArray);
        arrayLength(matrix2, charMatrix);
    }
}
