//Write a Java program that prints each command-line argument along with its index.
public class CommandLineIndex {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }
        System.out.println("Command-Line Arguments with Index:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Index " + i + ": " + args[i]);
        }
    }
}
