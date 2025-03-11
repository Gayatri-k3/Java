public class Email {
    static String[] emailList = {null, null, null};
    static int index = 0;

    public static boolean isDuplicate(String email) {
        for (int i = 0; i < index; i++) {
            if (emailList[i] != null && emailList[i].equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }

    public static String storeEmail(String email) {
        if (isDuplicate(email)) {
            return "Email '" + email + "' already exists. Cannot add duplicate.";
        }
        if (index < emailList.length) {
            emailList[index] = email;
            index++;
            return "Email '" + email + "' added successfully.";
        }
        return "List is full. Cannot add more emails.";
    }

    public static void readEmails() {
        System.out.println("\nStored Emails:");
        for (String email : emailList) {
            if (email != null) {
                System.out.println(email);
            }
        }
    }

    public static void searchEmail(String email) {
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (emailList[i] != null && emailList[i].equalsIgnoreCase(email)) {
                System.out.println(email + " found at position " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(email + " not found in the list.");
        }
    }


    public static void main(String[] args) {
        System.out.println(storeEmail("abc@gamil.com"));  
        System.out.println(storeEmail("xyz@gamil.com"));  
        System.out.println(storeEmail("abc@gamil.com"));  
        System.out.println();
        readEmails();
        System.out.println(); 
        searchEmail("xyz@gamil.com");
        searchEmail("dfg@gamil.com");  
    }
}
