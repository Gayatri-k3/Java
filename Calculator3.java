public class Calculator3 {
    // 1
    public static void add(int a, int b) {
        System.out.println("int " + (a + b));
    }

    // 2
    public static void add(double a, double b) {
        System.out.println("double " + (a + b));
    }

    // 3
    public static void add(byte a, byte b) {
        System.out.println("byte " + (a + b));
    }

    // 4
    public static void add(short a, short b) {
        System.out.println("short " + (a + b));
    }

    // 5
    public static void add(long a, long b) {
        System.out.println("long " + (a + b));
    }

    // 6
    public static void add(float a, float b) {
        System.out.println("float " + (a + b));
    }

    // 7
    public static void add(double a, float b) {
        System.out.println("double, float " + (a + b));
    }

    // 8
    public static void add(int a, double b) {
        System.out.println("int, double " + (a + b));
    }

    // 9
    public static void add(long a, int b) {
        System.out.println("long, int " + (a + b));
    }

    // 10
    public static void add(float a, int b) {
        System.out.println("float, int " + (a + b));
    }

    // 11
    public static void add(int a, long b) {
        System.out.println("int, long " + (a + b));
    }

    // 12
    public static void add(byte a, long b) {
        System.out.println("byte, long " + (a + b));
    }

    // 13
    public static void add(short a, double b) {
        System.out.println("short, double " + (a + b));
    }

    // 14
    public static void add(float a, long b) {
        System.out.println("float, long " + (a + b));
    }

    // 15
    public static void add(long a, double b) {
        System.out.println("long, double " + (a + b));
    }

    // 16
    public static void add(byte a, float b) {
        System.out.println("byte, float " + (a + b));
    }

    // 17
    public static void add(double a, long b) {
        System.out.println("double, long " + (a + b));
    }

    // 18
    public static void add(int a, short b) {
        System.out.println("int, short " + (a + b));
    }

    // 19
    public static void add(char a, int b) {
        System.out.println("char, int " + ((int) a + b));
    }

    // 20
    public static void add(byte a, int b) {
        System.out.println("byte, int " + (a+b));
    }

    public static void main(String[] args) {
        Calculator3.add(8, 8);
        Calculator3.add(8.5, 8.2);
        Calculator3.add((byte) 5, (byte) 3);
        Calculator3.add((short) 12, (short) 8);
        Calculator3.add(9876543210L, 1234567890L);
        Calculator3.add(3.5f, 2.2f);
        Calculator3.add(7.8, 4.3f);
        Calculator3.add(10, 20.5);
        Calculator3.add(500000L, 25);
        Calculator3.add(3.4f, 12);
        Calculator3.add(14, 9876543210L);
        Calculator3.add((byte) 2, 5000L);
        Calculator3.add((short) 7, 6.4);
        Calculator3.add(2.9f, 987654321L);
        Calculator3.add(1234567890123L, 45.8);
        Calculator3.add((byte) 9, 3.7f);
        Calculator3.add(6.3, 987654321L);
        Calculator3.add(25, (short) 5);
        Calculator3.add('A', 5);
        Calculator3.add(8, 10);
    }
}
