public class Food {
    static String[] foodList = {null, null, null};
    static int index = 0;

    public static boolean isDuplicate(String foodName) {
        for (int i = 0; i < index; i++) {
            if (foodList[i] != null && foodList[i].equalsIgnoreCase(foodName)) {
                return true;
            }
        }
        return false;
    }

    public static String storeFood(String foodName) {
        if (isDuplicate(foodName)) {
            return "Food item '" + foodName + "' already exists. Cannot add duplicate.";
        }
        if (index < foodList.length) {
            foodList[index] = foodName;
            index++;
            return "Food item '" + foodName + "' added successfully.";
        }
        return "List is full. Cannot add more food items.";
    }

    public static void readFoods() {
        System.out.println("\nStored Food Items:");
        for (String food : foodList) {
            if (food != null) {
                System.out.println(food);
            }
        }
    }

    public static void searchFood(String foodName) {
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (foodList[i] != null && foodList[i].equalsIgnoreCase(foodName)) {
                System.out.println(foodName + " found at position " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(foodName + " not found in the list.");
        }
    }

    public static void main(String[] args) {
        System.out.println(storeFood("Pizza"));  
        System.out.println(storeFood("Burger")); 
        System.out.println(storeFood("Pizza")); 
        System.out.println(); 
        readFoods();
        System.out.println();
        searchFood("Pizza");
        searchFood("Pasta");
    }
}
