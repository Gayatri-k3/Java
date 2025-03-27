class DustbinRunner{
        public static void main(String[] args) {
        Dustbin dustbin1 = new Dustbin("CleanBin", "Plastic", "Round", 30, true, true, "Blue", 50, 30, 30, "Indoor", "Kitchen", true, false, true, "Swing Lid", 2.5, 2, 19.99, false);
        Dustbin dustbin2 = new Dustbin("EcoBin", "Metal", "Rectangular", 50, true, false, "Silver", 70, 40, 35, "Outdoor", "Garden", false, true, true, "Step Pedal", 5.0, 3, 49.99, true);
        Dustbin dustbin3 = new Dustbin("SmartBin", "Stainless Steel", "Square", 20, true, true, "Black", 45, 25, 25, "Office", "Desk", false, false, true, "Touch Sensor", 3.2, 2, 59.99, false);

        System.out.println("Dustbin 1: \nBrand: " + dustbin1.brand + "\nMaterial: " + dustbin1.material + "\nShape: " + dustbin1.shape + "\nCapacity: " + dustbin1.capacity + "L\n" +
                           "Color: " + dustbin1.color + "\nDimensions: " + dustbin1.height + "x" + dustbin1.width + "x" + dustbin1.depth + " cm\n" +
                           "Usage: " + dustbin1.usage + "\nLocation: " + dustbin1.location + "\nFoot Pedal: " + dustbin1.hasFootPedal + "\nWheels: " + dustbin1.hasWheels + "\n" +
                           "Odor Resistant: " + dustbin1.isOdorResistant + "\nOpening Mechanism: " + dustbin1.openingMechanism + "\nWeight: " + dustbin1.weight + "kg\n" +
                           "Warranty: " + dustbin1.warrantyYears + " years\nPrice: $" + dustbin1.price + "\nFire Resistant: " + dustbin1.isFireResistant + "\n");
        
        System.out.println("Dustbin 2: \nBrand: " + dustbin2.brand + "\nMaterial: " + dustbin2.material + "\nShape: " + dustbin2.shape + "\nCapacity: " + dustbin2.capacity + "L\n" +
                           "Color: " + dustbin2.color + "\nDimensions: " + dustbin2.height + "x" + dustbin2.width + "x" + dustbin2.depth + " cm\n" +
                           "Usage: " + dustbin2.usage + "\nLocation: " + dustbin2.location + "\nFoot Pedal: " + dustbin2.hasFootPedal + "\nWheels: " + dustbin2.hasWheels + "\n" +
                           "Odor Resistant: " + dustbin2.isOdorResistant + "\nOpening Mechanism: " + dustbin2.openingMechanism + "\nWeight: " + dustbin2.weight + "kg\n" +
                           "Warranty: " + dustbin2.warrantyYears + " years\nPrice: $" + dustbin2.price + "\nFire Resistant: " + dustbin2.isFireResistant + "\n");
        
        System.out.println("Dustbin 3: \nBrand: " + dustbin3.brand + "\nMaterial: " + dustbin3.material + "\nShape: " + dustbin3.shape + "\nCapacity: " + dustbin3.capacity + "L\n" +
                           "Color: " + dustbin3.color + "\nDimensions: " + dustbin3.height + "x" + dustbin3.width + "x" + dustbin3.depth + " cm\n" +
                           "Usage: " + dustbin3.usage + "\nLocation: " + dustbin3.location + "\nFoot Pedal: " + dustbin3.hasFootPedal + "\nWheels: " + dustbin3.hasWheels + "\n" +
                           "Odor Resistant: " + dustbin3.isOdorResistant + "\nOpening Mechanism: " + dustbin3.openingMechanism + "\nWeight: " + dustbin3.weight + "kg\n" +
                           "Warranty: " + dustbin3.warrantyYears + " years\nPrice: $" + dustbin3.price + "\nFire Resistant: " + dustbin3.isFireResistant + "\n");
    }
}
