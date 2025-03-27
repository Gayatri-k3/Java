class Pallet {
    String material;
    int width;
    int length;
    int height;
    String color;
    double weightCapacity;
    boolean isReusable;
    String brand;
    String type;
    double price;

    public Pallet() {
        System.out.println("Default Constructor");
    }

    public Pallet(int width) {
        this.width = width;
        System.out.println("Constructor 1 int");
    }

    public Pallet(int width, int length) {
        this(width);
        this.length = length;
        System.out.println("Constructor 2 int, int");
    }

    public Pallet(String material, int length) {
        this.material = material;
        this.length = length;
        System.out.println("Constructor 3 String, int");
    }

    public Pallet(String material, int length, int width) {
        this(material, length);
        this.width = width;
        System.out.println("Constructor 4 String, int, int");
    }

    public Pallet(String material, int length, int width, String color) {
        this(material, length, width);
        this.color = color;
        System.out.println("Constructor 5 String, int, int, String");
    }

    public Pallet(String material, int length, int width, String color, double weightCapacity) {
        this(material, length, width, color);
        this.weightCapacity = weightCapacity;
        System.out.println("Constructor 6 String, int, int, String, double");
    }

    public Pallet(String material, int length, int width, String color, double weightCapacity, boolean isReusable) {
        this(material, length, width, color, weightCapacity);
        this.isReusable = isReusable;
        System.out.println("Constructor 7 String, int, int, String, double, boolean");
    }

    public Pallet(String material, int length, int width, String color, double weightCapacity, boolean isReusable, String brand) {
        this(material, length, width, color, weightCapacity, isReusable);
        this.brand = brand;
        System.out.println("Constructor 8 String, int, int, String, double, boolean, String");
    }

    public Pallet(String material, int length, int width, String color, double weightCapacity, boolean isReusable, String brand, String type) {
        this(material, length, width, color, weightCapacity, isReusable, brand);
        this.type = type;
        System.out.println("Constructor 9 String, int, int, String, double, boolean, String, String");
    }

    public Pallet(String material, int length, int width, String color, double weightCapacity, boolean isReusable, String brand, String type, double price) {
        this(material, length, width, color, weightCapacity, isReusable, brand, type);
        this.price = price;
        System.out.println("Constructor 10 String, int, int, String, double, boolean, String, String, double");
    }

    public void info() {
        System.out.println("Pallet Details:");
        System.out.println("Material: " + this.material);
        System.out.println("Dimensions: " + this.width + " x " + this.length + " x " + this.height);
        System.out.println("Color: " + this.color);
        System.out.println("Weight Capacity: " + this.weightCapacity + " kg");
        System.out.println("Reusable: " + (this.isReusable ? "Yes" : "No"));
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Price: $" + this.price);
    }
}
