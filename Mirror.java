//1. Mirror
class Mirror{
	String brand;
    String shape;
    String frameMaterial;
    String type;
    double height;
    double width;
    double thickness;
    String recyclability;
    int warrantyYears;
    double price;
    String usage;
    String style;
    String frameFinish;
    String edgeType;
    String material;
    boolean swivel;
    String glassType;
    String tint;
    String orientation;
    boolean isAntique;

    public Mirror(String brand, String shape, String frameMaterial, String type, double height, double width, double thickness,
                  String recyclability, int warrantyYears, double price, String usage, String style, String frameFinish,
                  String edgeType, String material, boolean swivel, String glassType, String tint, String orientation, boolean isAntique) {
        this.brand = brand;
        this.shape = shape;
        this.frameMaterial = frameMaterial;
        this.type = type;
        this.height = height;
        this.width = width;
        this.thickness = thickness;
        this.recyclability = recyclability;
        this.warrantyYears = warrantyYears;
        this.price = price;
        this.usage = usage;
        this.style = style;
        this.frameFinish = frameFinish;
        this.edgeType = edgeType;
        this.material = material;
        this.swivel = swivel;
        this.glassType = glassType;
        this.tint = tint;
        this.orientation = orientation;
        this.isAntique = isAntique;
    }
}
