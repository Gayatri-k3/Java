class Cement {
    String brand;
    String type;
    int grade;
    double weight;
    String color;
    double price;
    boolean isWaterResistant;
    String origin;
    String usage;
    int shelfLife;

    public Cement() {
        System.out.println("Default Constructor");
    }

    public Cement(String brand) {
        this.brand = brand;
        System.out.println("Constructor 1 String");
    }

    public Cement(String brand, String type) {
        this(brand);
        this.type = type;
        System.out.println("Constructor 2 String, String");
    }

    public Cement(String brand, String type, int grade) {
        this(brand, type);
        this.grade = grade;
        System.out.println("Constructor 3 String, String, int");
    }

    public Cement(String brand, String type, int grade, double weight) {
        this(brand, type, grade);
        this.weight = weight;
        System.out.println("Constructor 4 String, String, int, double");
    }

    public Cement(String brand, String type, int grade, double weight, String color) {
        this(brand, type, grade, weight);
        this.color = color;
        System.out.println("Constructor 5 String, String, int, double, String");
    }

    public Cement(String brand, String type, int grade, double weight, String color, double price) {
        this(brand, type, grade, weight, color);
        this.price = price;
        System.out.println("Constructor 6 String, String, int, double, String, double");
    }

    public Cement(String brand, String type, int grade, double weight, String color, double price, boolean isWaterResistant) {
        this(brand, type, grade, weight, color, price);
        this.isWaterResistant = isWaterResistant;
        System.out.println("Constructor 7 String, String, int, double, String, double, boolean");
    }

    public Cement(String brand, String type, int grade, double weight, String color, double price, boolean isWaterResistant, String origin) {
        this(brand, type, grade, weight, color, price, isWaterResistant);
        this.origin = origin;
        System.out.println("Constructor 8 String, String, int, double, String, double, boolean, String");
    }

    public Cement(String brand, String type, int grade, double weight, String color, double price, boolean isWaterResistant, String origin, String usage, int shelfLife) {
        this(brand, type, grade, weight, color, price, isWaterResistant, origin);
        this.usage = usage;
        this.shelfLife = shelfLife;
        System.out.println("Constructor 9 String, String, int, double, String, double, boolean, String, String, int");
    }

    public void info() {
        System.out.println("Cement Details:");
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Grade: " + this.grade);
        System.out.println("Weight: " + this.weight + " kg");
        System.out.println("Color: " + this.color);
        System.out.println("Price: $" + this.price);
        System.out.println("Water Resistant: " + (this.isWaterResistant ? "Yes" : "No"));
        System.out.println("Origin: " + this.origin);
        System.out.println("Usage: " + this.usage);
        System.out.println("Shelf Life: " + this.shelfLife + " months");
    }
}