//3. Dustbin
class Dustbin{
	String brand;
    String material;
    String shape;
    double capacity;
    boolean hasLid;
    boolean isRecyclable;
    String color;
    double height;
    double width;
    double depth;
    String usage;
    String location;
    boolean hasFootPedal;
    boolean hasWheels;
    boolean isOdorResistant;
    String openingMechanism;
    double weight;
    int warrantyYears;
    double price;
    boolean isFireResistant;

    public Dustbin(String brand, String material, String shape, double capacity, boolean hasLid, boolean isRecyclable,
                   String color, double height, double width, double depth, String usage, String location,
                   boolean hasFootPedal, boolean hasWheels, boolean isOdorResistant, String openingMechanism,
                   double weight, int warrantyYears, double price, boolean isFireResistant) {
        this.brand = brand;
        this.material = material;
        this.shape = shape;
        this.capacity = capacity;
        this.hasLid = hasLid;
        this.isRecyclable = isRecyclable;
        this.color = color;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.usage = usage;
        this.location = location;
        this.hasFootPedal = hasFootPedal;
        this.hasWheels = hasWheels;
        this.isOdorResistant = isOdorResistant;
        this.openingMechanism = openingMechanism;
        this.weight = weight;
        this.warrantyYears = warrantyYears;
        this.price = price;
        this.isFireResistant = isFireResistant;
    }
}
