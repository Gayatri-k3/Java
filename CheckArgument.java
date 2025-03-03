 //Write a Java program that checks if a specific string (e.g., "Java") exists as a command-line argument and prints whether or not it is present.
 public class CheckArgument {
    public static void main(String[] args) {
        String target = "Java";
        boolean found = false;

        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }
        for (String arg : args) {
            if (arg.equals(target)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The string \"" + target + "\" is present in the command-line arguments.");
        } else {
            System.out.println("The string \"" + target + "\" is NOT present in the command-line arguments.");
        }
    }
}
