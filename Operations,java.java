//8
public class Operations {
    // Methods from Calculator3
    public static void add(int a, int b) {
        System.out.println("int " + (a + b));
    }

    public static void add(double a, double b) {
        System.out.println("double " + (a + b));
    }

    public static void add(byte a, byte b) {
        System.out.println("byte " + (a + b));
    }

    public static void add(short a, short b) {
        System.out.println("short " + (a + b));
    }

    public static void add(long a, long b) {
        System.out.println("long " + (a + b));
    }

    public static void add(float a, float b) {
        System.out.println("float " + (a + b));
    }

    public static void add(double a, float b) {
        System.out.println("double, float " + (a + b));
    }

    public static void add(int a, double b) {
        System.out.println("int, double " + (a + b));
    }

    public static void add(long a, int b) {
        System.out.println("long, int " + (a + b));
    }

    public static void add(float a, int b) {
        System.out.println("float, int " + (a + b));
    }

    // Methods from ArrayOperations
    public static void printArray(int arr[]) {
        System.out.print("int array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(char arr[]) {
        System.out.print("char array: ");
        for (char value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(String arr[]) {
        System.out.print("String array: ");
        for (String value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(byte arr[]) {
        System.out.print("byte array: ");
        for (byte value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(long arr[]) {
        System.out.print("long array: ");
        for (long value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(float arr[]) {
        System.out.print("float array: ");
        for (float value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void arrayLength(int arr[]) {
        System.out.println("Length of int array: " + arr.length);
    }

    public static void arrayLength(char arr[]) {
        System.out.println("Length of char array: " + arr.length);
    }

    public static void arrayLength(String arr[]) {
        System.out.println("Length of String array: " + arr.length);
    }

    public static void arrayLength(float arr[]) {
        System.out.println("Length of float array: " + arr.length);
    }

    // Methods from MathOperations
    public static void function(int a) {
        System.out.println("Square: " + (a * a));
    }

    public static void function(double a) {
        System.out.println("Cube: " + (a * a * a));
    }

    public static void function(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void function(double a, double b) {
        System.out.println("Product: " + (a * b));
    }

    public static void function(int a, double b) {
        System.out.println("Difference: " + (a - b));
    }

    public static void function(double a, int b) {
        System.out.println("Division: " + (a / b));
    }

    public static void function(int a, int b, int c) {
        System.out.println("Multiplication: " + (a * b * c));
    }

    public static void function(double a, double b, double c) {
        System.out.println("Average: " + ((a + b + c) / 3));
    }

    public static void function(String name) {
        System.out.println("Hello, " + name);
    }

    public static void function(int a, String name) {
        System.out.println(name + "'s lucky number is: " + a);
    }

    public static void main(String[] args) {
        add(5, 10);
        add(4.5, 2.3);
        add((byte) 3, (byte) 7);
        add((short) 5, (short) 6);
        add(1234567890123L, 9876543210L);
        add(1.5f, 2.5f);
        add(3.2, 4.1f);
        add(5, 2.3);
        add(9876543210L, 25);
        add(4.5f, 10);

        int[] arr = {1, 2, 3, 4, 5};
        char[] charArr = {'A', 'B', 'C'};
        String[] strArr = {"One", "Two", "Three"};
        float[] floatArr = {1.1f, 2.2f, 3.3f};

        printArray(arr);
        printArray(charArr);
        printArray(strArr);
        printArray(floatArr);

        arrayLength(arr);
        arrayLength(charArr);
        arrayLength(strArr);
        arrayLength(floatArr);

        function(4);
        function(2.5);
        function(3, 7);
        function(4.2, 5.1);
        function(10, 3.5);
        function(7.2, 2);
        function(2, 3, 4);
        function(1.1, 2.2, 3.3);
        function("Alice");
        function(9, "Bob");
    }
}
