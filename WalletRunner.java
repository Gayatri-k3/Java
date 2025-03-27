class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet();
        wallet1.info();
        System.out.println();

        Wallet wallet2 = new Wallet("Gucci");
        wallet2.info();
        System.out.println();

        Wallet wallet3 = new Wallet("Louis Vuitton", "Leather");
        wallet3.info();
        System.out.println();

        Wallet wallet4 = new Wallet("Prada", "Synthetic", "Black");
        wallet4.info();
        System.out.println();

        Wallet wallet5 = new Wallet("Coach", "Fabric", "Brown", 120.0);
        wallet5.info();
        System.out.println();

        Wallet wallet6 = new Wallet("Fossil", "Leather", "Tan", 80.0, 6);
        wallet6.info();
        System.out.println();

        Wallet wallet7 = new Wallet("Hermes", "Leather", "Red", 200.0, 8, true);
        wallet7.info();
        System.out.println();

        Wallet wallet8 = new Wallet("Michael Kors", "Vegan Leather", "Pink", 75.0, 5, true, true);
        wallet8.info();
        System.out.println();

        Wallet wallet9 = new Wallet("Tommy Hilfiger", "Canvas", "Blue", 65.0, 4, false, true, "Medium");
        wallet9.info();
        System.out.println();

        Wallet wallet10 = new Wallet("Armani", "Leather", "Gray", 150.0, 7, true, true, "Large", "Italy", true);
        wallet10.info();
    }
}
