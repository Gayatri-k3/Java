public class College{
    static String []collegeName ={null,null,null,null};
    static int index;
    public static void storeCollegeNames(String name){
        if (collegeName != null) {
            if (index < collegeName.length) {
                collegeName[index] = name; 
                index++;
                System.out.println("College Name added to the list successfully");
            } else {
                System.out.println("College Name not added to the list, as list is full");
            }
        } else {
            System.out.println("List is null");
        }
    }
    
    public static void readCollegeName(){
        System.out.println();
        System.out.println("The College Names stored in the array are: ");
        for (int i = 0; i < collegeName.length; i++) {
            System.out.println(collegeName[i]);
        }
    }

    public static void searchCollegeName(String name){
        System.out.println();
        for (int i = 0; i < index; i++) {
            if (collegeName[i].equalsIgnoreCase(name)) {
                System.out.println(name + " found at position " + (i + 1));
                return;
            }
        }
        System.out.println(name + " not found in the list.");
    }
}

