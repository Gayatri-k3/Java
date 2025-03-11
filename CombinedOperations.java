//7
public class CombinedOperations {

    // 1 - Print int array
    public static void printArray(int arr[]) {
        System.out.print("int array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 2 - Print String array
    public static void printArray(String arr[]) {
        System.out.print("String array: ");
        for (String value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 3 - Print float array
    public static void printArray(float arr[]) {
        System.out.print("float array: ");
        for (float value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 4 - Print double array
    public static void printArray(double arr[]) {
        System.out.print("double array: ");
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 5 - Print boolean array
    public static void printArray(boolean arr[]) {
        System.out.print("boolean array: ");
        for (boolean value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 6 - Print 2D int array
    public static void printArray(int arr[][]) {
        System.out.println("2D int array: ");
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // 7 - Print 2D char array
    public static void printArray(char arr[][]) {
        System.out.println("2D char array: ");
        for (char[] row : arr) {
            for (char value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // 8 - Square of a number
    public static void function(int a) {
        System.out.println("Square: " + (a * a));
    }

    // 9 - Cube of a number
    public static void function(double a) {
        System.out.println("Cube: " + (a * a * a));
    }

    // 10 - Sum of two numbers
    public static void function(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // 11 - Product of two numbers
    public static void function(double a, double b) {
        System.out.println("Product: " + (a * b));
    }

    // 12 - Difference of two numbers
    public static void function(int a, double b) {
        System.out.println("Difference: " + (a - b));
    }

    // 13 - Division of two numbers
    public static void function(double a, int b) {
        System.out.println("Division: " + (a / b));
    }

    // 14 - Multiplication of three numbers
    public static void function(int a, int b, int c) {
        System.out.println("Multiplication: " + (a * b * c));
    }

    // 15 - Average of three numbers
    public static void function(double a, double b, double c) {
        System.out.println("Average: " + ((a + b + c) / 3));
    }

    // 16 - Print a greeting message
    public static void function(String name) {
        System.out.println("Hello, " + name);
    }

    // 17 - Print a lucky number
    public static void function(int a, String name) {
        System.out.println(name + "'s lucky number is: " + a);
    }

    // 18 - Print age
    public static void function(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }

    // 19 - Print a boolean value
    public static void function(boolean isTrue) {
        System.out.println("Boolean value: " + isTrue);
    }

    // 20 - Print a character received
    public static void function(char ch) {
        System.out.println("Character received: " + ch);
    }

    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5};
        String[] strArray = {"apple", "banana", "cherry"};
        float[] floatArray = {1.2f, 3.4f, 5.6f};
        double[] doubleArray = {2.4, 5.7, 8.9};
        boolean[] boolArray = {true, false, true};
        int[][] matrix2D = {{1, 2}, {3, 4}};
        char[][] charMatrix = {{'A', 'B'}, {'C', 'D'}};

        printArray(numArray);
        printArray(strArray);
        printArray(floatArray);
        printArray(doubleArray);
        printArray(boolArray);
        printArray(matrix2D);
        printArray(charMatrix);
        
        function(5);
        function(3.2);
        function(5, 10);
        function(2.5, 3.5);
        function(7, 4.2);
        function(8.4, 2);
        function(2, 3, 4);
        function(2.5, 3.0, 4.5);
        function("Alice");
        function(7, "Bob");
        function("Charlie", 25);
        function(true);
        function('X');
    }
}
