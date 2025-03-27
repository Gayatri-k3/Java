//9. Chocolate
class Chocolate{
	String brand;
    String type;
    double weight;
    boolean hasNuts;
    boolean isDarkChocolate;
    boolean isVegan;
    boolean isSugarFree;
    String flavor;
    boolean hasFilling;
    String originCountry;
    double cocoaPercentage;
    String texture;
    boolean isHandmade;
    String packagingType;
    boolean isOrganic;
    double price;
    int expiryMonths;
    boolean hasCaramel;
    boolean hasFruitPieces;
    boolean isGlutenFree;
    public Chocolate(String brand, String type, double weight, boolean hasNuts, boolean isDarkChocolate, boolean isVegan, boolean isSugarFree,
                      String flavor, boolean hasFilling, String originCountry, double cocoaPercentage, String texture, boolean isHandmade,
                      String packagingType, boolean isOrganic, double price, int expiryMonths, boolean hasCaramel, boolean hasFruitPieces,
                      boolean isGlutenFree) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.hasNuts = hasNuts;
        this.isDarkChocolate = isDarkChocolate;
        this.isVegan = isVegan;
        this.isSugarFree = isSugarFree;
        this.flavor = flavor;
        this.hasFilling = hasFilling;
        this.originCountry = originCountry;
        this.cocoaPercentage = cocoaPercentage;
        this.texture = texture;
        this.isHandmade = isHandmade;
        this.packagingType = packagingType;
        this.isOrganic = isOrganic;
        this.price = price;
        this.expiryMonths = expiryMonths;
        this.hasCaramel = hasCaramel;
        this.hasFruitPieces = hasFruitPieces;
        this.isGlutenFree = isGlutenFree;
    }
}