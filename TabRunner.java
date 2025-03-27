class TabRunner{
	public static void main(String[] args) {
        Tab tab1 = new Tab("Samsung", "Galaxy Tab S7", "Snapdragon 865", 8, 256, 11.0, "2560x1600", "Android", "WiFi & LTE", true, true, "Black", 498, true, true, true, "13MP + 5MP", 2, 799.99);
        Tab tab2 = new Tab("Apple", "iPad Pro", "Apple M1", 16, 512, 12.9, "2732x2048", "iOS", "WiFi", false, true, "Silver", 682, true, true, false, "12MP Ultra-Wide", 3, 1099.99);
        Tab tab3 = new Tab("Lenovo", "Tab P11", "Snapdragon 730G", 6, 128, 11.5, "2000x1200", "Android", "WiFi", false, false, "Gray", 490, false, true, true, "8MP", 1, 499.99);
        
        System.out.println("Tab 1: " + tab1.brand + ", " + tab1.model + ", " + tab1.processor + ", " + tab1.ram + "GB RAM, " + tab1.storage + "GB Storage, " + tab1.screenSize + " inch, " + tab1.resolution + ", " + tab1.os + ", " + tab1.connectivity + ", Stylus: " + tab1.hasStylus + ", Fingerprint Sensor: " + tab1.hasFingerprintSensor + ", " + tab1.color + ", " + tab1.weight + "g, Face Unlock: " + tab1.hasFaceUnlock + ", 5G: " + tab1.supports5G + ", Expandable Storage: " + tab1.hasExpandableStorage + ", Camera: " + tab1.camera + ", Speakers: " + tab1.numberOfSpeakers + ", Price: $" + tab1.price);
        
        System.out.println("Tab 2: " + tab2.brand + ", " + tab2.model + ", " + tab2.processor + ", " + tab2.ram + "GB RAM, " + tab2.storage + "GB Storage, " + tab2.screenSize + " inch, " + tab2.resolution + ", " + tab2.os + ", " + tab2.connectivity + ", Stylus: " + tab2.hasStylus + ", Fingerprint Sensor: " + tab2.hasFingerprintSensor + ", " + tab2.color + ", " + tab2.weight + "g, Face Unlock: " + tab2.hasFaceUnlock + ", 5G: " + tab2.supports5G + ", Expandable Storage: " + tab2.hasExpandableStorage + ", Camera: " + tab2.camera + ", Speakers: " + tab2.numberOfSpeakers + ", Price: $" + tab2.price);
        
        System.out.println("Tab 3: " + tab3.brand + ", " + tab3.model + ", " + tab3.processor + ", " + tab3.ram + "GB RAM, " + tab3.storage + "GB Storage, " + tab3.screenSize + " inch, " + tab3.resolution + ", " + tab3.os + ", " + tab3.connectivity + ", Stylus: " + tab3.hasStylus + ", Fingerprint Sensor: " + tab3.hasFingerprintSensor + ", " + tab3.color + ", " + tab3.weight + "g, Face Unlock: " + tab3.hasFaceUnlock + ", 5G: " + tab3.supports5G + ", Expandable Storage: " + tab3.hasExpandableStorage + ", Camera: " + tab3.camera + ", Speakers: " + tab3.numberOfSpeakers + ", Price: $" + tab3.price);
    }
}
