
//15
public class Modulus {

    // 1
    public static int modulus(int a, int b) {
        return a % b;
    }

    // 2
    public static double modulus(double a, double b) {
        return a % b;
    }

    // 3
    public static float modulus(float a, float b) {
        return a % b;
    }

    // 4
    public static long modulus(long a, long b) {
        return a % b;
    }

    // 5
    public static short modulus(short a, short b) {
        return (short) (a % b);
    }

    // 6
    public static byte modulus(byte a, byte b) {
        return (byte) (a % b);
    }

    // 7
    public static int modulus(int a, short b) {
        return a % b;
    }

    // 8
    public static int modulus(int a, byte b) {
        return a % b;
    }

    // 9
    public static double modulus(double a, int b) {
        return a % b;
    }

    // 10
    public static float modulus(float a, int b) {
        return a % b;
    }

    // 11
    public static long modulus(long a, int b) {
        return a % b;
    }

    // 12
    public static double modulus(double a, float b) {
        return a % b;
    }

    // 13
    public static float modulus(float a, double b) {
        return (float) (a % b);
    }

    // 14
    public static int modulus(int a, long b) {
        return (int) (a % b);
    }

    // 15
    public static long modulus(long a, double b) {
        return (long) (a % b);
    }

    // 16
    public static short modulus(short a, byte b) {
        return (short) (a % b);
    }

    // 17
    public static int modulus(byte a, short b) {
        return a % b;
    }

    // 18
    public static long modulus(long a, short b) {
        return a % b;
    }

    // 19
    public static double modulus(double a, long b) {
        return a % b;
    }

    // 20
    public static float modulus(float a, short b) {
        return a % b;
    }

    public static void main(String[] args) {
        System.out.println(modulus(10, 3));
        System.out.println(modulus(10.5, 3.2));
        System.out.println(modulus(10.5f, 3.2f));
        System.out.println(modulus(100000L, 30000L));
        System.out.println(modulus((short) 10, (short) 3));
        System.out.println(modulus((byte) 10, (byte) 3));
        System.out.println(modulus(10, (short) 3));
        System.out.println(modulus(10, (byte) 3));
        System.out.println(modulus(10.5, 3));
        System.out.println(modulus(10.5f, 3));
        System.out.println(modulus(100000L, 3));
        System.out.println(modulus(10.5, 3.2f));
        System.out.println(modulus(10.5f, 3.2));
        System.out.println(modulus(10, 30000L));
        System.out.println(modulus(100000L, 3.2));
        System.out.println(modulus((short) 10, (byte) 3));
        System.out.println(modulus((byte) 10, (short) 3));
        System.out.println(modulus(100000L, (short) 3));
        System.out.println(modulus(10.5, 30000L));
        System.out.println(modulus(10.5f, (short) 3));
    }
}
