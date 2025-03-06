public class UserName{
	static String []userName ={null,null,null,null};
	static int index;
	public static void storeUserNames(String name){
		if (userName != null) {
            if (index < userName.length) {
                userName[index] = name; 
                index++;
                System.out.println("Name added to the list successfully");
            } else {
                System.out.println("Name not added to the list, as list is full");
            }
        } else {
            System.out.println("List is null");
        }
    }
    
    public static void readUserName(){
    	System.out.println();
    	System.out.println("The User Names stored in the array are: ");
    	for (int i = 0; i < userName.length; i++) {
            System.out.println(userName[i]);
        }
    }

	public static void searchUserNames(String name){
		System.out.println();
		for (int i = 0; i < index; i++) {
            if (userName[i].equalsIgnoreCase(name)) {
                System.out.println(name + " found at position " + (i + 1));
                return;
            }
        }
        System.out.println(name + " not found in the list.");
    }
}

