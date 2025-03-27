class Wine {
    String name;
    String type;
    String region;
    int year;
    double alcoholContent;
    double volume;
    String grapeVariety;
    boolean isAged;
    String producer;
    double price;

    public Wine() {
        System.out.println("Default Constructor");
    }

    public Wine(String name) {
        this.name = name;
        System.out.println("Constructor 1 String");
    }

    public Wine(String name, String type) {
        this(name);
        this.type = type;
        System.out.println("Constructor 2 String, String");
    }

    public Wine(String name, String type, String region) {
        this(name, type);
        this.region = region;
        System.out.println("Constructor 3 String, String, String");
    }

    public Wine(String name, String type, String region, int year) {
        this(name, type, region);
        this.year = year;
        System.out.println("Constructor 4 String, String, String, int");
    }

    public Wine(String name, String type, String region, int year, double alcoholContent) {
        this(name, type, region, year);
        this.alcoholContent = alcoholContent;
        System.out.println("Constructor 5 String, String, String, int, double");
    }

    public Wine(String name, String type, String region, int year, double alcoholContent, double volume) {
        this(name, type, region, year, alcoholContent);
        this.volume = volume;
        System.out.println("Constructor 6 String, String, String, int, double, double");
    }

    public Wine(String name, String type, String region, int year, double alcoholContent, double volume, String grapeVariety) {
        this(name, type, region, year, alcoholContent, volume);
        this.grapeVariety = grapeVariety;
        System.out.println("Constructor 7 String, String, String, int, double, double, String");
    }

    public Wine(String name, String type, String region, int year, double alcoholContent, double volume, String grapeVariety, boolean isAged) {
        this(name, type, region, year, alcoholContent, volume, grapeVariety);
        this.isAged = isAged;
        System.out.println("Constructor 8 String, String, String, int, double, double, String, boolean");
    }

    public Wine(String name, String type, String region, int year, double alcoholContent, double volume, String grapeVariety, boolean isAged, String producer, double price) {
        this(name, type, region, year, alcoholContent, volume, grapeVariety, isAged);
        this.producer = producer;
        this.price = price;
        System.out.println("Constructor 9 String, String, String, int, double, double, String, boolean, String, double");
    }

    public void info() {
        System.out.println("Wine Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Region: " + this.region);
        System.out.println("Year: " + this.year);
        System.out.println("Alcohol Content: " + this.alcoholContent + "%");
        System.out.println("Volume: " + this.volume + " ml");
        System.out.println("Grape Variety: " + this.grapeVariety);
        System.out.println("Aged: " + (this.isAged ? "Yes" : "No"));
        System.out.println("Producer: " + this.producer);
        System.out.println("Price: $" + this.price);
    }
}