//13
public class Division {

    // 1
    public static int divide(int a, int b) {
        return a / b;
    }

    // 2
    public static int divide(int a, int b, int c) {
        return a / b / c;
    }

    // 3
    public static double divide(double a, double b) {
        return a / b;
    }

    // 4
    public static double divide(double a, double b, double c) {
        return a / b / c;
    }

    // 5
    public static double divide(int a, double b) {
        return a / b;
    }

    // 6
    public static double divide(double a, int b) {
        return a / b;
    }

    // 7
    public static long divide(long a, int b) {
        return a / b;
    }

    // 8
    public static long divide(int a, long b) {
        return a / b;
    }

    // 9
    public static double divide(long a, double b) {
        return a / b;
    }

    // 10
    public static double divide(double a, long b) {
        return a / b;
    }

    // 11
    public static int divide(short a, int b) {
        return a / b;
    }

    // 12
    public static int divide(int a, short b) {
        return a / b;
    }

    // 13
    public static float divide(float a, int b) {
        return a / b;
    }

    // 14
    public static float divide(int a, float b) {
        return a / b;
    }

    // 15
    public static double divide(float a, double b) {
        return a / b;
    }

    // 16
    public static double divide(double a, float b) {
        return a / b;
    }

    // 17
    public static int divide(byte a, int b) {
        return a / b;
    }

    // 18
    public static int divide(int a, byte b) {
        return a / b;
    }

    // 19
    public static int divide(char a, int b) {
        return a / b;
    }

    // 20
    public static int divide(int a, char b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(divide(50, 10));
        System.out.println(divide(50, 10, 5));
        System.out.println(divide(55.5, 10.2));
        System.out.println(divide(55.5, 10.2, 2.3));
        System.out.println(divide(50, 10.2));
        System.out.println(divide(55.5, 10));
        System.out.println(divide(100000L, 10));
        System.out.println(divide(50, 100000L));
        System.out.println(divide(100000L, 10.5));
        System.out.println(divide(10.5, 100000L));
        System.out.println(divide((short) 50, 10));
        System.out.println(divide(10, (short) 50));
        System.out.println(divide(55.5f, 10));
        System.out.println(divide(50, 10.5f));
        System.out.println(divide(55.5f, 10.5));
        System.out.println(divide(10.5, 55.5f));
        System.out.println(divide((byte) 50, 10));
        System.out.println(divide(10, (byte) 50));
        System.out.println(divide('A', 2));
        System.out.println(divide(2, 'A'));
    }
}