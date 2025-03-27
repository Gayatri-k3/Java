class AK47 {
    String model;
    String manufacturer;
    int caliber;
    int magazineCapacity;
    double weight;
    double length;
    int rateOfFire;
    boolean isAutomatic;
    String countryOfOrigin;
    int productionYear;

    public AK47() {
        System.out.println("Default Constructor");
    }

    public AK47(String model) {
        this.model = model;
        System.out.println("Constructor 1 String");
    }

    public AK47(String model, String manufacturer) {
        this(model);
        this.manufacturer = manufacturer;
        System.out.println("Constructor 2 String, String");
    }

    public AK47(String model, String manufacturer, int caliber) {
        this(model, manufacturer);
        this.caliber = caliber;
        System.out.println("Constructor 3 String, String, int");
    }

    public AK47(String model, String manufacturer, int caliber, int magazineCapacity) {
        this(model, manufacturer, caliber);
        this.magazineCapacity = magazineCapacity;
        System.out.println("Constructor 4 String, String, int, int");
    }

    public AK47(String model, String manufacturer, int caliber, int magazineCapacity, double weight) {
        this(model, manufacturer, caliber, magazineCapacity);
        this.weight = weight;
        System.out.println("Constructor 5 String, String, int, int, double");
    }

    public AK47(String model, String manufacturer, int caliber, int magazineCapacity, double weight, double length) {
        this(model, manufacturer, caliber, magazineCapacity, weight);
        this.length = length;
        System.out.println("Constructor 6 String, String, int, int, double, double");
    }

    public AK47(String model, String manufacturer, int caliber, int magazineCapacity, double weight, double length, int rateOfFire) {
        this(model, manufacturer, caliber, magazineCapacity, weight, length);
        this.rateOfFire = rateOfFire;
        System.out.println("Constructor 7 String, String, int, int, double, double, int");
    }

    public AK47(String model, String manufacturer, int caliber, int magazineCapacity, double weight, double length, int rateOfFire, boolean isAutomatic) {
        this(model, manufacturer, caliber, magazineCapacity, weight, length, rateOfFire);
        this.isAutomatic = isAutomatic;
        System.out.println("Constructor 8 String, String, int, int, double, double, int, boolean");
    }

    public AK47(String model, String manufacturer, int caliber, int magazineCapacity, double weight, double length, int rateOfFire, boolean isAutomatic, String countryOfOrigin, int productionYear) {
        this(model, manufacturer, caliber, magazineCapacity, weight, length, rateOfFire, isAutomatic);
        this.countryOfOrigin = countryOfOrigin;
        this.productionYear = productionYear;
        System.out.println("Constructor 9 String, String, int, int, double, double, int, boolean, String, int");
    }

    public void info() {
        System.out.println("AK47 Details:");
        System.out.println("Model: " + this.model);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Caliber: " + this.caliber + " mm");
        System.out.println("Magazine Capacity: " + this.magazineCapacity + " rounds");
        System.out.println("Weight: " + this.weight + " kg");
        System.out.println("Length: " + this.length + " cm");
        System.out.println("Rate of Fire: " + this.rateOfFire + " rounds per minute");
        System.out.println("Automatic: " + (this.isAutomatic ? "Yes" : "No"));
        System.out.println("Country of Origin: " + this.countryOfOrigin);
        System.out.println("Production Year: " + this.productionYear);
    }
}