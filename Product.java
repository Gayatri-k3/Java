public class Product{
    static String []productName ={null,null,null,null};
    static int index;
    public static void storeProductNames(String name){
        if (productName != null) {
            if (index < productName.length) {
                productName[index] = name; 
                index++;
                System.out.println("Product Name added to the list successfully");
            } else {
                System.out.println("Product Name not added to the list, as list is full");
            }
        } else {
            System.out.println("List is null");
        }
    }
    
    public static void readProductName(){
        System.out.println();
        System.out.println("The Products Names stored in the array are: ");
        for (int i = 0; i < productName.length; i++) {
            System.out.println(productName[i]);
        }
    }

    public static void searchProductName(String name){
        System.out.println();
        for (int i = 0; i < index; i++) {
            if (productName[i].equalsIgnoreCase(name)) {
                System.out.println(name + " found at position " + (i + 1));
                return;
            }
        }
        System.out.println(name + " not found in the list.");
    }
}

