class BulbRunner {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb();
        bulb1.info();
        System.out.println();

        Bulb bulb2 = new Bulb("LED");
        bulb2.info();
        System.out.println();

        Bulb bulb3 = new Bulb("Incandescent", "Philips");
        bulb3.info();
        System.out.println();

        Bulb bulb4 = new Bulb("CFL", "GE", 15);
        bulb4.info();
        System.out.println();

        Bulb bulb5 = new Bulb("Halogen", "Osram", 40, "Warm White");
        bulb5.info();
        System.out.println();

        Bulb bulb6 = new Bulb("LED", "Syska", 10, "Cool White", 25000);
        bulb6.info();
        System.out.println();

        Bulb bulb7 = new Bulb("Fluorescent", "Panasonic", 20, "Daylight", 20000, true);
        bulb7.info();
        System.out.println();

        Bulb bulb8 = new Bulb("LED", "Havells", 12, "Soft White", 30000, true, "A19");
        bulb8.info();
        System.out.println();

        Bulb bulb9 = new Bulb("CFL", "Wipro", 23, "Yellow", 15000, false, "Spiral", 5.99);
        bulb9.info();
        System.out.println();

        Bulb bulb10 = new Bulb("Smart LED", "Philips Hue", 9, "Multicolor", 25000, true, "Globe", 29.99, "E26", true);
        bulb10.info();
    }
}
