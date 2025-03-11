public class CombinedCalculator {
    // 1
    public static void display(String name) {
        System.out.println("Name is: " + name);
    }

    // 2
    public static void display(String name, int a) {
        System.out.println(name + a);
    }

    // 3
    public static void display(int a, String name) {
        System.out.println(a + name);
    }

    // 4
    public static void display(String name, int a, double b) {
        System.out.println(a + name + b);
    }

    // 5
    public static void display(String name, int a, double b, char ch) {
        System.out.println(name + a + b + ch);
    }

    // 6
    public static void display(int c) {
        System.out.println(c);
    }

    // 7
    public static void display(double d) {
        System.out.println(d);
    }

    // 8
    public static void display(char f) {
        System.out.println(f);
    }

    // 9
    public static void display(long num) {
        System.out.println(num);
    }

    // 10
    public static void display(boolean isTrue) {
        System.out.println(isTrue);
    }

    // 11
    public static void add(int a, int b) {
        System.out.println("int " + (a + b));
    }

    // 12
    public static void add(double a, double b) {
        System.out.println("double " + (a + b));
    }

    // 13
    public static void add(byte a, byte b) {
        System.out.println("byte " + (a + b));
    }

    // 14
    public static void add(short a, short b) {
        System.out.println("short " + (a + b));
    }

    // 15
    public static void add(long a, long b) {
        System.out.println("long " + (a + b));
    }

    // 16
    public static void add(float a, float b) {
        System.out.println("float " + (a + b));
    }

    // 17
    public static void add(double a, float b) {
        System.out.println("double, float " + (a + b));
    }

    // 18
    public static void add(int a, double b) {
        System.out.println("int, double " + (a + b));
    }

    // 19
    public static void add(long a, int b) {
        System.out.println("long, int " + (a + b));
    }

    // 20
    public static void add(char a, int b) {
        System.out.println("char, int " + ((int) a + b));
    }

    public static void main(String[] args) {
        display("John");
        display("Alice", 8);
        display(10, "Bob");
        display("Jane", 5, 99.99);
        display("Tom", 7, 23.45, 'A');
        display(42);
        display(3.14159);
        display('Z');
        display(9876543210L);
        display(true);

        add(8, 8);
        add(8.5, 8.2);
        add((byte) 5, (byte) 3);
        add((short) 12, (short) 8);
        add(9876543210L, 1234567890L);
        add(3.5f, 2.2f);
        add(7.8, 4.3f);
        add(10, 20.5);
        add(500000L, 25);
        add('A', 5);
    }
}
