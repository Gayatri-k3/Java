//Write a Java program that takes multiple strings as command-line arguments and converts them to uppercase.
public class UppercaseArguments {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }

        System.out.println("Uppercase Command-Line Arguments:");
        for (String arg : args) {
            System.out.println(arg.toUpperCase());
        }
    }
}
