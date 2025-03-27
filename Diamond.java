class Diamond {
    String material;
    int carat;
    String color;
    String clarity;
    String cut;
    double price;
    boolean isCertified;
    String origin;
    String shape;
    String brand;

    public Diamond() {
        System.out.println("Default Constructor");
    }

    public Diamond(int carat) {
        this.carat = carat;
        System.out.println("Constructor 1 int");
    }

    public Diamond(int carat, String color) {
        this(carat);
        this.color = color;
        System.out.println("Constructor 2 int, String");
    }

    public Diamond(String material, int carat, String color) {
        this.material = material;
        this.carat = carat;
        this.color = color;
        System.out.println("Constructor 3 String, int, String");
    }

    public Diamond(String material, int carat, String color, String clarity) {
        this(material, carat, color);
        this.clarity = clarity;
        System.out.println("Constructor 4 String, int, String, String");
    }

    public Diamond(String material, int carat, String color, String clarity, String cut) {
        this(material, carat, color, clarity);
        this.cut = cut;
        System.out.println("Constructor 5 String, int, String, String, String");
    }

    public Diamond(String material, int carat, String color, String clarity, String cut, double price) {
        this(material, carat, color, clarity, cut);
        this.price = price;
        System.out.println("Constructor 6 String, int, String, String, String, double");
    }

    public Diamond(String material, int carat, String color, String clarity, String cut, double price, boolean isCertified) {
        this(material, carat, color, clarity, cut, price);
        this.isCertified = isCertified;
        System.out.println("Constructor 7 String, int, String, String, String, double, boolean");
    }

    public Diamond(String material, int carat, String color, String clarity, String cut, double price, boolean isCertified, String origin) {
        this(material, carat, color, clarity, cut, price, isCertified);
        this.origin = origin;
        System.out.println("Constructor 8 String, int, String, String, String, double, boolean, String");
    }

    public Diamond(String material, int carat, String color, String clarity, String cut, double price, boolean isCertified, String origin, String shape, String brand) {
        this(material, carat, color, clarity, cut, price, isCertified, origin);
        this.shape = shape;
        this.brand = brand;
        System.out.println("Constructor 9 String, int, String, String, String, double, boolean, String, String, String");
    }

    public void info() {
        System.out.println("Diamond Details:");
        System.out.println("Material: " + this.material);
        System.out.println("Carat: " + this.carat);
        System.out.println("Color: " + this.color);
        System.out.println("Clarity: " + this.clarity);
        System.out.println("Cut: " + this.cut);
        System.out.println("Price: $" + this.price);
        System.out.println("Certified: " + (this.isCertified ? "Yes" : "No"));
        System.out.println("Origin: " + this.origin);
        System.out.println("Shape: " + this.shape);
        System.out.println("Brand: " + this.brand);
    }
}