//17
public class Drinks {
    // 1
    public static void oJ(String name) {
        System.out.println("Drink: " + name);
    }
    // 2
    public static void oJ(String[] ingredients) {
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println();
    }

    // 3
    public static void Coffee(String name) {
        System.out.println("Drink: " + name);
    }
    // 4
    public static void Coffee(String[] ingredients) {
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println();
    }

    // 5
    public static void Tea(String name) {
        System.out.println("Drink: " + name);
    }
    // 6
    public static void Tea(String[] ingredients) {
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println();
    }

    // 7
    public static void Lemonade(String name) {
        System.out.println("Drink: " + name);
    }
    // 8
    public static void Lemonade(String[] ingredients) {
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println();
    }

    // 9
    public static void Smoothie(String name) {
        System.out.println("Drink: " + name);
    }
    // 10
    public static void Smoothie(String[] ingredients) {
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println();
    }

    // 11
    public static void Milkshake(String name) {
        System.out.println("Drink: " + name);
    }
    // 12
    public static void Milkshake(String[] ingredients) {
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println();
    }

    // 13
    public static void Mojito(String name) {
        System.out.println("Drink: " + name);
    }
    // 14
    public static void Mojito(String[] ingredients) {
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println();
    }

    // 15
    public static void HotChocolate(String name) {
        System.out.println("Drink: " + name);
    }
    // 16
    public static void HotChocolate(String[] ingredients) {
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println();
    }

    // 17
    public static void IcedTea(String name) {
        System.out.println("Drink: " + name);
    }
    // 18
    public static void IcedTea(String[] ingredients) {
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println();
    }

    // 19
    public static void Cappuccino(String name) {
        System.out.println("Drink: " + name);
    }
    // 20
    public static void Cappuccino(String[] ingredients) {
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        oJ("Orange Juice");
        oJ(new String[]{"Oranges", "Sugar", "Water"});
        
        Coffee("Coffee");
        Coffee(new String[]{"Coffee Beans", "Water", "Milk", "Sugar"});
        
        Tea("Tea");
        Tea(new String[]{"Tea Leaves", "Water", "Milk", "Sugar"});
        
        Lemonade("Lemonade");
        Lemonade(new String[]{"Lemon", "Water", "Sugar"});
        
        Smoothie("Smoothie");
        Smoothie(new String[]{"Banana", "Milk", "Honey"});
        
        Milkshake("Milkshake");
        Milkshake(new String[]{"Milk", "Ice Cream", "Chocolate Syrup"});
        
        Mojito("Mojito");
        Mojito(new String[]{"Mint Leaves", "Lime", "Sugar", "Soda"});
        
        HotChocolate("Hot Chocolate");
        HotChocolate(new String[]{"Milk", "Cocoa Powder", "Sugar"});
        
        IcedTea("Iced Tea");
        IcedTea(new String[]{"Tea", "Ice", "Lemon", "Sugar"});
        
        Cappuccino("Cappuccino");
        Cappuccino(new String[]{"Espresso", "Milk", "Foam"});
    }
}
