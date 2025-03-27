class MirrorRunner{
	public static void main(String[] args) {
		Mirror mirror1 = new Mirror("ABC Mirrors", "Oval", "Wood", "Wall-mounted", 120, 60, 5, "Recyclable",
                2, 150.99, "Personal", "Modern", "Glossy", "Beveled", "Glass", true, "Tempered Glass", "Light Gray", "Vertical", true);

        Mirror mirror2 = new Mirror("XYZ Glassworks", "Rectangle", "Metal", "Floor-standing", 180, 90, 6, "Partially Recyclable",
                3, 250.75, "Commercial", "Classic", "Matte", "Polished", "Aluminum", false, "Laminated Glass", "None", "Horizontal", true);

        Mirror mirror3 = new Mirror("GlassTech", "Round", "Plastic", "Handheld", 30, 30, 3, "Non-Recyclable",
                1, 50.00, "Portable", "Vintage", "Metallic", "Flat", "Acrylic", false, "Standard Glass", "Bronze", "Any", false);

        
       System.out.println("Mirror 1:\nBrand: " + mirror1.brand + "\nShape: " + mirror1.shape + "\nFrame Material: " + mirror1.frameMaterial + "\nType: " + mirror1.type + "\nDimensions: " + mirror1.height + "x" + mirror1.width + " cm\nThickness: " + mirror1.thickness + " mm\nRecyclability: " + mirror1.recyclability + "\nWarranty: " + mirror1.warrantyYears + " years\nPrice: $" + mirror1.price + "\nUsage: " + mirror1.usage + "\nStyle: " + mirror1.style + "\nFrame Finish: " + mirror1.frameFinish + "\nEdge Type: " + mirror1.edgeType + "\nMaterial: " + mirror1.material + "\nSwivel: " + mirror1.swivel + "\nGlass Type: " + mirror1.glassType + "\nTint: " + mirror1.tint + "\nOrientation: " + mirror1.orientation + "\nAntique: " + mirror1.isAntique + "\n");

       System.out.println("Mirror 2:\nBrand: " + mirror2.brand + "\nShape: " + mirror2.shape + "\nFrame Material: " + mirror2.frameMaterial + "\nType: " + mirror2.type + "\nDimensions: " + mirror2.height + "x" + mirror2.width + " cm\nThickness: " + mirror2.thickness + " mm\nRecyclability: " + mirror2.recyclability + "\nWarranty: " + mirror2.warrantyYears + " years\nPrice: $" + mirror2.price + "\nUsage: " + mirror2.usage + "\nStyle: " + mirror2.style + "\nFrame Finish: " + mirror2.frameFinish + "\nEdge Type: " + mirror2.edgeType + "\nMaterial: " + mirror2.material + "\nSwivel: " + mirror2.swivel + "\nGlass Type: " + mirror2.glassType + "\nTint: " + mirror2.tint + "\nOrientation: " + mirror2.orientation + "\nAntique: " + mirror2.isAntique + "\n");

       System.out.println("Mirror 3:\nBrand: " + mirror3.brand + "\nShape: " + mirror3.shape + "\nFrame Material: " + mirror3.frameMaterial + "\nType: " + mirror3.type + "\nDimensions: " + mirror3.height + "x" + mirror3.width + " cm\nThickness: " + mirror3.thickness + " mm\nRecyclability: " + mirror3.recyclability + "\nWarranty: " + mirror3.warrantyYears + " years\nPrice: $" + mirror3.price + "\nUsage: " + mirror3.usage + "\nStyle: " + mirror3.style + "\nFrame Finish: " + mirror3.frameFinish + "\nEdge Type: " + mirror3.edgeType + "\nMaterial: " + mirror3.material + "\nSwivel: " + mirror3.swivel + "\nGlass Type: " + mirror3.glassType + "\nTint: " + mirror3.tint + "\nOrientation: " + mirror3.orientation + "\nAntique: " + mirror3.isAntique + "\n");
    }
}