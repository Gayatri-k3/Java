class Bulb {
    String type;
    String brand;
    int wattage;
    String color;
    int lifespan;
    boolean isDimmable;
    String shape;
    double price;
    String baseType;
    boolean isSmart;

    public Bulb() {
        System.out.println("Default Constructor");
    }

    public Bulb(String type) {
        this.type = type;
        System.out.println("Constructor 1 String");
    }

    public Bulb(String type, String brand) {
        this(type);
        this.brand = brand;
        System.out.println("Constructor 2 String, String");
    }

    public Bulb(String type, String brand, int wattage) {
        this(type, brand);
        this.wattage = wattage;
        System.out.println("Constructor 3 String, String, int");
    }

    public Bulb(String type, String brand, int wattage, String color) {
        this(type, brand, wattage);
        this.color = color;
        System.out.println("Constructor 4 String, String, int, String");
    }

    public Bulb(String type, String brand, int wattage, String color, int lifespan) {
        this(type, brand, wattage, color);
        this.lifespan = lifespan;
        System.out.println("Constructor 5 String, String, int, String, int");
    }

    public Bulb(String type, String brand, int wattage, String color, int lifespan, boolean isDimmable) {
        this(type, brand, wattage, color, lifespan);
        this.isDimmable = isDimmable;
        System.out.println("Constructor 6 String, String, int, String, int, boolean");
    }

    public Bulb(String type, String brand, int wattage, String color, int lifespan, boolean isDimmable, String shape) {
        this(type, brand, wattage, color, lifespan, isDimmable);
        this.shape = shape;
        System.out.println("Constructor 7 String, String, int, String, int, boolean, String");
    }

    public Bulb(String type, String brand, int wattage, String color, int lifespan, boolean isDimmable, String shape, double price) {
        this(type, brand, wattage, color, lifespan, isDimmable, shape);
        this.price = price;
        System.out.println("Constructor 8 String, String, int, String, int, boolean, String, double");
    }

    public Bulb(String type, String brand, int wattage, String color, int lifespan, boolean isDimmable, String shape, double price, String baseType, boolean isSmart) {
        this(type, brand, wattage, color, lifespan, isDimmable, shape, price);
        this.baseType = baseType;
        this.isSmart = isSmart;
        System.out.println("Constructor 9 String, String, int, String, int, boolean, String, double, String, boolean");
    }

    public void info() {
        System.out.println("Bulb Details:");
        System.out.println("Type: " + this.type);
        System.out.println("Brand: " + this.brand);
        System.out.println("Wattage: " + this.wattage);
        System.out.println("Color: " + this.color);
        System.out.println("Lifespan: " + this.lifespan + " hours");
        System.out.println("Dimmable: " + (this.isDimmable ? "Yes" : "No"));
        System.out.println("Shape: " + this.shape);
        System.out.println("Price: $" + this.price);
        System.out.println("Base Type: " + this.baseType);
        System.out.println("Smart: " + (this.isSmart ? "Yes" : "No"));
    }
}