class DusterRunner {
    public static void main(String[] args) {
        Duster duster1 = new Duster("CleanMax", "Plastic", "Home Cleaning", true, true, "Blue", 30.0,
                                    "Rubber", true, "Electrostatic", "Kitchen", true, false, true, "Wood, Glass, Metal",
                                    false, 1.2, true, 2, 25.99);

        Duster duster2 = new Duster("EcoDuster", "Metal", "Office Use", true, false, "Silver", 35.0,
                                    "Metal", false, "Magnetic", "Workspace", false, true, true, "Plastic, Glass",
                                    true, 2.5, true, 3, 40.75);

        Duster duster3 = new Duster("GreenClean", "Bamboo", "Outdoor Use", true, true, "Brown", 32.0,
                                    "Wood", true, "Microfiber", "Garden", true, true, false, "Metal, Stone",
                                    false, 2.0, false, 2, 35.50);

        System.out.println("Duster 1: " +
                "\nBrand: " + duster1.brand + 
                "\nMaterial: " + duster1.material + 
                "\nUsage: " + duster1.usage + 
                "\nIs Washable: " + duster1.isWashable + 
                "\nHas Extendable Handle: " + duster1.hasExtendableHandle + 
                "\nColor: " + duster1.color + 
                "\nLength: " + duster1.length + " cm" + 
                "\nHandle Material: " + duster1.handleMaterial + 
                "\nIs Reusable: " + duster1.isReusable + 
                "\nDust Attracting Technology: " + duster1.dustAttractingTechnology + 
                "\nApplication: " + duster1.application + 
                "\nAnti Static: " + duster1.antiStatic + 
                "\nHas Replaceable Head: " + duster1.hasReplaceableHead + 
                "\nErgonomic Grip: " + duster1.ergonomicGrip + 
                "\nSurface Compatibility: " + duster1.surfaceCompatibility + 
                "\nIs Foldable: " + duster1.isFoldable + 
                "\nWeight: " + duster1.weight + " kg" + 
                "\nHas Microfiber Head: " + duster1.hasMicrofiberHead + 
                "\nWarranty (Years): " + duster1.warrantyYears + 
                "\nPrice: $" + duster1.price );
        System.out.println();

        System.out.println("Duster 2: " +
                "\nBrand: " + duster2.brand + 
                "\nMaterial: " + duster2.material + 
                "\nUsage: " + duster2.usage + 
                "\nIs Washable: " + duster2.isWashable + 
                "\nHas Extendable Handle: " + duster2.hasExtendableHandle + 
                "\nColor: " + duster2.color + 
                "\nLength: " + duster2.length + " cm" + 
                "\nHandle Material: " + duster2.handleMaterial + 
                "\nIs Reusable: " + duster2.isReusable + 
                "\nDust Attracting Technology: " + duster2.dustAttractingTechnology + 
                "\nApplication: " + duster2.application + 
                "\nAnti Static: " + duster2.antiStatic + 
                "\nHas Replaceable Head: " + duster2.hasReplaceableHead + 
                "\nErgonomic Grip: " + duster2.ergonomicGrip + 
                "\nSurface Compatibility: " + duster2.surfaceCompatibility + 
                "\nIs Foldable: " + duster2.isFoldable + 
                "\nWeight: " + duster2.weight + " kg" + 
                "\nHas Microfiber Head: " + duster2.hasMicrofiberHead + 
                "\nWarranty (Years): " + duster2.warrantyYears + 
                "\nPrice: $" + duster2.price );
        System.out.println();

        System.out.println("Duster 3: " +
                "\nBrand: " + duster3.brand + 
                "\nMaterial: " + duster3.material + 
                "\nUsage: " + duster3.usage + 
                "\nIs Washable: " + duster3.isWashable + 
                "\nHas Extendable Handle: " + duster3.hasExtendableHandle + 
                "\nColor: " + duster3.color + 
                "\nLength: " + duster3.length + " cm" + 
                "\nHandle Material: " + duster3.handleMaterial + 
                "\nIs Reusable: " + duster3.isReusable + 
                "\nDust Attracting Technology: " + duster3.dustAttractingTechnology + 
                "\nApplication: " + duster3.application + 
                "\nAnti Static: " + duster3.antiStatic + 
                "\nHas Replaceable Head: " + duster3.hasReplaceableHead + 
                "\nErgonomic Grip: " + duster3.ergonomicGrip + 
                "\nSurface Compatibility: " + duster3.surfaceCompatibility + 
                "\nIs Foldable: " + duster3.isFoldable + 
                "\nWeight: " + duster3.weight + " kg" + 
                "\nHas Microfiber Head: " + duster3.hasMicrofiberHead + 
                "\nWarranty (Years): " + duster3.warrantyYears + 
                "\nPrice: $" + duster3.price );
    }
}
