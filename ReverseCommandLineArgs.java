// Write a Java program that takes multiple strings as command-line arguments and prints them in reverse order.
public class ReverseCommandLineArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }
        System.out.println("Arguments in reverse order:");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
