public class Multiplication {

    // 1
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // 3
    public static double multiply(double a, double b) {
        return a * b;
    }

    // 4
    public static double multiply(double a, double b, double c) {
        return a * b * c;
    }

    // 5
    public static double multiply(int a, double b) {
        return a * b;
    }

    // 6
    public static double multiply(double a, int b) {
        return a * b;
    }

    // 7
    public static long multiply(long a, int b) {
        return a * b;
    }

    // 8
    public static long multiply(int a, long b) {
        return a * b;
    }

    // 9
    public static double multiply(long a, double b) {
        return a * b;
    }

    // 10
    public static double multiply(double a, long b) {
        return a * b;
    }

    // 11
    public static int multiply(short a, int b) {
        return a * b;
    }

    // 12
    public static int multiply(int a, short b) {
        return a * b;
    }

    // 13
    public static float multiply(float a, int b) {
        return a * b;
    }

    // 14
    public static float multiply(int a, float b) {
        return a * b;
    }

    // 15
    public static double multiply(float a, double b) {
        return a * b;
    }

    // 16
    public static double multiply(double a, float b) {
        return a * b;
    }

    // 17
    public static int multiply(byte a, int b) {
        return a * b;
    }

    // 18
    public static int multiply(int a, byte b) {
        return a * b;
    }

    // 19
    public static int multiply(char a, int b) {
        return a * b;
    }

    // 20
    public static int multiply(int a, char b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 10));
        System.out.println(multiply(5, 10, 2));
        System.out.println(multiply(5.5, 10.2));
        System.out.println(multiply(5.5, 10.2, 2.3));
        System.out.println(multiply(5, 10.2));
        System.out.println(multiply(5.5, 10));
        System.out.println(multiply(100000L, 10));
        System.out.println(multiply(5, 100000L));
        System.out.println(multiply(100000L, 10.5));
        System.out.println(multiply(10.5, 100000L));
        System.out.println(multiply((short) 5, 10));
        System.out.println(multiply(10, (short) 5));
        System.out.println(multiply(5.5f, 10));
        System.out.println(multiply(5, 10.5f));
        System.out.println(multiply(5.5f, 10.5));
        System.out.println(multiply(10.5, 5.5f));
        System.out.println(multiply((byte) 5, 10));
        System.out.println(multiply(10, (byte) 5));
        System.out.println(multiply('A', 2));
        System.out.println(multiply(2, 'A'));
    }
}