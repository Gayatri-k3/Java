//1
public class Calculator2 {
    // 1
    public static void show(String text) {
        System.out.println("Text: " + text);
    }

    // 2
    public static void show(int number) {
        System.out.println("Number: " + number);
    }

    // 3
    public static void show(double decimal) {
        System.out.println("Decimal: " + decimal);
    }

    // 4
    public static void show(char letter) {
        System.out.println("Letter: " + letter);
    }

    // 5
    public static void show(boolean flag) {
        System.out.println("Boolean: " + flag);
    }

    // 6
    public static void show(String text, int num) {
        System.out.println("Text: " + text + ", Number: " + num);
    }

    // 7
    public static void show(int num, String text) {
        System.out.println("Number: " + num + ", Text: " + text);
    }

    // 8
    public static void show(String text, double value) {
        System.out.println("Text: " + text + ", Decimal: " + value);
    }

    // 9
    public static void show(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    // 10
    public static void show(long bigNum) {
        System.out.println("Long Number: " + bigNum);
    }

    // 11
    public static void show(float smallDecimal) {
        System.out.println("Float: " + smallDecimal);
    }

    // 12
    public static void show(byte smallNum) {
        System.out.println("Byte: " + smallNum);
    }

    // 13
    public static void show(short mediumNum) {
        System.out.println("Short: " + mediumNum);
    }

    // 14
    public static void show(int num, double decimal) {
        System.out.println("Int: " + num + ", Decimal: " + decimal);
    }

    // 15
    public static void show(double decimal, int num) {
        System.out.println("Decimal: " + decimal + ", Int: " + num);
    }

    // 16
    public static void show(String text, boolean flag) {
        System.out.println("Text: " + text + ", Boolean: " + flag);
    }

    // 17
    public static void show(int num, boolean flag) {
        System.out.println("Number: " + num + ", Boolean: " + flag);
    }

    // 18
    public static void show(char ch, int num) {
        System.out.println("Char: " + ch + ", Number: " + num);
    }

    // 19
    public static void show(boolean flag, char ch) {
        System.out.println("Boolean: " + flag + ", Char: " + ch);
    }

    // 20
    public static void show(float decimal, long bigNum) {
        System.out.println("Float: " + decimal + ", Long: " + bigNum);
    }

    public static void main(String[] args) {
        show("Hello");
        show(10);
        show(5.5);
        show('A');
        show(true);
        show("Test", 100);
        show(200, "Test");
        show("Example", 3.14);
        show(4, 5);
        show(9999999999L);
        show(3.4f);
        show((byte) 127);
        show((short) 30000);
        show(12, 4.56);
        show(7.89, 21);
        show("Text", false);
        show(77, true);
        show('Z', 9);
        show(false, 'Y');
        show(1.23f, 456789L);
    }
}
