public class MultiOperations {

    // 1. Add two integers
    public static void calculate(int a, int b) {
        System.out.println("Sum (int, int): " + (a + b));
    }

    // 2. Add three integers
    public static void calculate(int a, int b, int c) {
        System.out.println("Sum (int, int, int): " + (a + b + c));
    }

    // 3. Add two doubles
    public static void calculate(double a, double b) {
        System.out.println("Sum (double, double): " + (a + b));
    }

    // 4. Subtract two integers
    public static void calculate(int a, int b, boolean subtract) {
        if (subtract) {
            System.out.println("Subtraction (int, int): " + (a - b));
        }
    }

    // 5. Multiply two integers
    public static void calculate(int a, int b, char operation) {
        if (operation == '*') {
            System.out.println("Multiplication (int, int): " + (a * b));
        }
    }

    // 6. Multiply two doubles
    public static void calculate(double a, double b, char operation) {
        if (operation == '*') {
            System.out.println("Multiplication (double, double): " + (a * b));
        }
    }

    // 7. Divide two integers
    public static void calculate(int a, int b, String operation) {
        if (operation.equals("/")) {
            if (b != 0) {
                System.out.println("Division (int, int): " + (a / b));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        }
    }

    // 8. Find the square of a number
    public static void calculate(int a) {
        System.out.println("Square (int): " + (a * a));
    }

    // 9. Find the cube of a number
    public static void calculate(double a) {
        System.out.println("Cube (double): " + (a * a * a));
    }

    // 10. Find the power of a number
    public static void calculate(int base, int exponent, boolean power) {
        if (power) {
            System.out.println("Power (int, int): " + Math.pow(base, exponent));
        }
    }

    // 11. Convert string to uppercase
    public static void process(String text) {
        System.out.println("Uppercase: " + text.toUpperCase());
    }

    // 12. Convert string to lowercase
    public static void process(String text, boolean toLower) {
        if (toLower) {
            System.out.println("Lowercase: " + text.toLowerCase());
        }
    }

    // 13. Reverse a string
    public static void process(String text, char reverse) {
        if (reverse == 'R') {
            String reversed = new StringBuilder(text).reverse().toString();
            System.out.println("Reversed: " + reversed);
        }
    }

    // 14. Find the length of a string
    public static void process(String text, int dummy) {
        System.out.println("Length: " + text.length());
    }

    // 15. Extract a substring
    public static void process(String text, int start, int end) {
        System.out.println("Substring: " + text.substring(start, end));
    }

    // 16. Replace a character in a string
    public static void process(String text, char oldChar, char newChar) {
        System.out.println("Replaced: " + text.replace(oldChar, newChar));
    }

    // 17. Check if string contains another string
    public static void process(String text, String search) {
        System.out.println("Contains '" + search + "': " + text.contains(search));
    }

    // 18. Trim whitespace from a string
    public static void process(String text, double dummy) {
        System.out.println("Trimmed: '" + text.trim() + "'");
    }

    // 19. Concatenate two strings
    public static void process(String text1, String text2, boolean concatenate) {
        if (concatenate) {
            System.out.println("Concatenated: " + text1 + text2);
        }
    }

    // 20. Compare two strings
    public static void process(String text1, String text2, char compare) {
        if (compare == 'C') {
            System.out.println("Are they equal? " + text1.equals(text2));
        }
    }

    public static void main(String[] args) {
        // Math operations
        calculate(5, 3);
        calculate(2, 4, 6);
        calculate(2.5, 4.1);
        calculate(10, 4, true);
        calculate(7, 3, '*');
        calculate(2.5, 3.5, '*');
        calculate(10, 2, "/");
        calculate(6);
        calculate(2.0);
        calculate(3, 3, true);

        // String operations
        process("Hello World");
        process("JAVA PROGRAMMING", true);
        process("Palindrome", 'R');
        process("Overloading", 0);
        process("Method Overloading", 2, 8);
        process("Replace Test", 'e', 'a');
        process("Does this contain?", "contain");
        process("   Trim this text   ", 0.0);
        process("Hello", " World", true);
        process("Java", "Java", 'C');
    }
}
