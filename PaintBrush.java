//11. PaintBrush
class PaintBrush{
	String brand;
    String bristleMaterial;
    String handleMaterial;
    double length;
    boolean isWashable;
    String shape;
    boolean hasComfortGrip;
    boolean hasReplaceableBristles;
    String application;
    String color;
    boolean isSynthetic;
    boolean isEcoFriendly;
    String usageType;
    double weight;
    boolean isDoubleSided;
    boolean hasProtectiveCover;
    int warrantyYears;
    double price;
    boolean hasAntiSheddingBristles;
    public PaintBrush(String brand, String bristleMaterial, String handleMaterial, double length, boolean isWashable, String shape,
                       boolean hasComfortGrip, boolean hasReplaceableBristles, String application, String color, boolean isSynthetic,
                       boolean isEcoFriendly, String usageType, double weight, boolean isDoubleSided, boolean hasProtectiveCover,
                       int warrantyYears, double price, boolean hasAntiSheddingBristles) {
        this.brand = brand;
        this.bristleMaterial = bristleMaterial;
        this.handleMaterial = handleMaterial;
        this.length = length;
        this.isWashable = isWashable;
        this.shape = shape;
        this.hasComfortGrip = hasComfortGrip;
        this.hasReplaceableBristles = hasReplaceableBristles;
        this.application = application;
        this.color = color;
        this.isSynthetic = isSynthetic;
        this.isEcoFriendly = isEcoFriendly;
        this.usageType = usageType;
        this.weight = weight;
        this.isDoubleSided = isDoubleSided;
        this.hasProtectiveCover = hasProtectiveCover;
        this.warrantyYears = warrantyYears;
        this.price = price;
        this.hasAntiSheddingBristles = hasAntiSheddingBristles;
    }
}