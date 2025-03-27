class Wallet {
    String brand;
    String material;
    String color;
    double price;
    int compartments;
    boolean hasZipper;
    boolean hasCardHolder;
    String size;
    String origin;
    boolean isWaterResistant;

    public Wallet() {
        System.out.println("Default Constructor");
    }

    public Wallet(String brand) {
        this.brand = brand;
        System.out.println("Constructor 1 String");
    }

    public Wallet(String brand, String material) {
        this(brand);
        this.material = material;
        System.out.println("Constructor 2 String, String");
    }

    public Wallet(String brand, String material, String color) {
        this(brand, material);
        this.color = color;
        System.out.println("Constructor 3 String, String, String");
    }

    public Wallet(String brand, String material, String color, double price) {
        this(brand, material, color);
        this.price = price;
        System.out.println("Constructor 4 String, String, String, double");
    }

    public Wallet(String brand, String material, String color, double price, int compartments) {
        this(brand, material, color, price);
        this.compartments = compartments;
        System.out.println("Constructor 5 String, String, String, double, int");
    }

    public Wallet(String brand, String material, String color, double price, int compartments, boolean hasZipper) {
        this(brand, material, color, price, compartments);
        this.hasZipper = hasZipper;
        System.out.println("Constructor 6 String, String, String, double, int, boolean");
    }

    public Wallet(String brand, String material, String color, double price, int compartments, boolean hasZipper, boolean hasCardHolder) {
        this(brand, material, color, price, compartments, hasZipper);
        this.hasCardHolder = hasCardHolder;
        System.out.println("Constructor 7 String, String, String, double, int, boolean, boolean");
    }

    public Wallet(String brand, String material, String color, double price, int compartments, boolean hasZipper, boolean hasCardHolder, String size) {
        this(brand, material, color, price, compartments, hasZipper, hasCardHolder);
        this.size = size;
        System.out.println("Constructor 8 String, String, String, double, int, boolean, boolean, String");
    }

    public Wallet(String brand, String material, String color, double price, int compartments, boolean hasZipper, boolean hasCardHolder, String size, String origin, boolean isWaterResistant) {
        this(brand, material, color, price, compartments, hasZipper, hasCardHolder, size);
        this.origin = origin;
        this.isWaterResistant = isWaterResistant;
        System.out.println("Constructor 9 String, String, String, double, int, boolean, boolean, String, String, boolean");
    }

    public void info() {
        System.out.println("Wallet Details:");
        System.out.println("Brand: " + this.brand);
        System.out.println("Material: " + this.material);
        System.out.println("Color: " + this.color);
        System.out.println("Price: $" + this.price);
        System.out.println("Compartments: " + this.compartments);
        System.out.println("Has Zipper: " + (this.hasZipper ? "Yes" : "No"));
        System.out.println("Has Card Holder: " + (this.hasCardHolder ? "Yes" : "No"));
        System.out.println("Size: " + this.size);
        System.out.println("Origin: " + this.origin);
        System.out.println("Water Resistant: " + (this.isWaterResistant ? "Yes" : "No"));
    }
}