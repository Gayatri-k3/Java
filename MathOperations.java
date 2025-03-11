//3
public class MathOperations {
    // 1
    public static void function(int a) {
        System.out.println("Square: " + (a * a));
    }
    // 2
    public static void function(double a) {
        System.out.println("Cube: " + (a * a * a));
    }
    // 3
    public static void function(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    // 4
    public static void function(double a, double b) {
        System.out.println("Product: " + (a * b));
    }
    // 5
    public static void function(int a, double b) {
        System.out.println("Difference: " + (a - b));
    }
    // 6
    public static void function(double a, int b) {
        System.out.println("Division: " + (a / b));
    }
    // 7
    public static void function(int a, int b, int c) {
        System.out.println("Multiplication: " + (a * b * c));
    }
    // 8
    public static void function(double a, double b, double c) {
        System.out.println("Average: " + ((a + b + c) / 3));
    }
    // 9
    public static void function(String name) {
        System.out.println("Hello, " + name);
    }
    // 10
    public static void function(int a, String name) {
        System.out.println(name + "'s lucky number is: " + a);
    }
    // 11
    public static void function(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }
    // 12
    public static void function(boolean isTrue) {
        System.out.println("Boolean value: " + isTrue);
    }
    // 13
    public static void function(char ch) {
        System.out.println("Character received: " + ch);
    }
    // 14
    public static void function(long num) {
        System.out.println("Long number: " + num);
    }
    // 15
    public static void function(int a, long b) {
        System.out.println("Sum (int & long): " + (a + b));
    }
    // 16
    public static void function(long b, int a) {
        System.out.println("Sum (long & int): " + (a + b));
    }
    // 17
    public static void function(byte b) {
        System.out.println("Byte value: " + b);
    }
    // 18
    public static void function(short s) {
        System.out.println("Short value: " + s);
    }
    // 19
    public static void function(float f) {
        System.out.println("Float value: " + f);
    }
    // 20
    public static void function(String name, double value) {
        System.out.println(name + " has a value of: " + value);
    }

    public static void main(String[] args) {
        function(5);
        function(3.2);
        function(5, 10);
        function(2.5, 3.5);
        function(7, 4.2);
        function(8.4, 2);
        function(2, 3, 4);
        function(2.5, 3.0, 4.5);
        function("xyz");
        function(7, "abc");
        function("jhg", 25);
        function(true);
        function('A');
        function(9876543210L);
        function(9, 123456789L);
        function(987654321L, 8);
        function((byte) 2);
        function((short) 45);
        function(4.5f);
        function("poi", 99.9);
    }
}
