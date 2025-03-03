//Write a Java program that concatenates all the command-line arguments into a single string and prints it.
public class ConcatenateArgs {
    public static void main(String[] args) {
     
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }

      
        StringBuilder result = new StringBuilder();
        for (String arg : args) {
            result.append(arg).append(" "); // Append each argument with a space
        }


        System.out.println("Concatenated String: " + result.toString().trim());
    }
}
