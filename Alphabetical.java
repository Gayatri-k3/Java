// Write a Java program that takes multiple strings as command-line arguments and prints them in alphabetical order
public class Alphabetical {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = 0; j < args.length - 1 - i; j++) {
                if (compareStrings(args[j], args[j + 1]) > 0) {
                    // Swap args[j] and args[j+1]
                    String temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }
        System.out.println("Arguments in Alphabetical Order:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
    public static int compareStrings(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        return str1.length() - str2.length();
    }
}

