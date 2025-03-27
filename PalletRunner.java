class PalletRunner {
    public static void main(String[] args) {
        Pallet pallet1 = new Pallet();
        pallet1.info();
        System.out.println();

        Pallet pallet2 = new Pallet(20);
        pallet2.info();
        System.out.println();

        Pallet pallet3 = new Pallet(25, 15);
        pallet3.info();
        System.out.println();

        Pallet pallet4 = new Pallet("Wood", 30);
        pallet4.info();
        System.out.println();

        Pallet pallet5 = new Pallet("Plastic", 35, 25);
        pallet5.info();
        System.out.println();

        Pallet pallet6 = new Pallet("Metal", 40, 30, "Silver");
        pallet6.info();
        System.out.println();

        Pallet pallet7 = new Pallet("Composite", 45, 35, "Blue", 500.0);
        pallet7.info();
        System.out.println();

        Pallet pallet8 = new Pallet("Aluminum", 50, 40, "Gray", 750.0, true);
        pallet8.info();
        System.out.println();

        Pallet pallet9 = new Pallet("Steel", 55, 45, "Black", 1000.0, true, "StrongHold");
        pallet9.info();
        System.out.println();

        Pallet pallet10 = new Pallet("Fiber", 60, 50, "Red", 1200.0, false, "EcoPallet", "Lightweight", 299.99);
        pallet10.info();
    }
}
