//5. Duster
class Duster{
	String brand;
    String material;
    String usage;
    boolean isWashable;
    boolean hasExtendableHandle;
    String color;
    double length;
    String handleMaterial;
    boolean isReusable;
    String dustAttractingTechnology;
    String application;
    boolean antiStatic;
    boolean hasReplaceableHead;
    boolean grip;
    String surfaceCompatibility;
    boolean isFoldable;
    double weight;
    boolean hasMicrofiberHead;
    int warrantyYears;
    double price;
    public Duster(String brand, String material, String usage, boolean isWashable, boolean hasExtendableHandle,
                  String color, double length, String handleMaterial, boolean isReusable, String dustAttractingTechnology,
                  String application, boolean antiStatic, boolean hasReplaceableHead, boolean grip,
                  String surfaceCompatibility, boolean isFoldable, double weight, boolean hasMicrofiberHead,
                  int warrantyYears, double price) {
        this.brand = brand;
        this.material = material;
        this.usage = usage;
        this.isWashable = isWashable;
        this.hasExtendableHandle = hasExtendableHandle;
        this.color = color;
        this.length = length;
        this.handleMaterial = handleMaterial;
        this.isReusable = isReusable;
        this.dustAttractingTechnology = dustAttractingTechnology;
        this.application = application;
        this.antiStatic = antiStatic;
        this.hasReplaceableHead = hasReplaceableHead;
        this.grip = grip;
        this.surfaceCompatibility = surfaceCompatibility;
        this.isFoldable = isFoldable;
        this.weight = weight;
        this.hasMicrofiberHead = hasMicrofiberHead;
        this.warrantyYears = warrantyYears;
        this.price = price;
    }
}
