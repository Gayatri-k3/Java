class DiamondRunner {
    public static void main(String[] args) {
        Diamond diamond1 = new Diamond();
        diamond1.info();
        System.out.println();

        Diamond diamond2 = new Diamond(1);
        diamond2.info();
        System.out.println();

        Diamond diamond3 = new Diamond(2, "White");
        diamond3.info();
        System.out.println();

        Diamond diamond4 = new Diamond("Natural", 3, "Yellow");
        diamond4.info();
        System.out.println();

        Diamond diamond5 = new Diamond("Lab-grown", 4, "Pink", "VVS1");
        diamond5.info();
        System.out.println();

        Diamond diamond6 = new Diamond("Natural", 5, "Blue", "VS1", "Round");
        diamond6.info();
        System.out.println();

        Diamond diamond7 = new Diamond("Lab-grown", 6, "Green", "IF", "Oval", 5000.0);
        diamond7.info();
        System.out.println();

        Diamond diamond8 = new Diamond("Natural", 7, "Red", "SI1", "Cushion", 10000.0, true);
        diamond8.info();
        System.out.println();

        Diamond diamond9 = new Diamond("Natural", 8, "Purple", "FL", "Emerald", 20000.0, true, "Africa");
        diamond9.info();
        System.out.println();

        Diamond diamond10 = new Diamond("Lab-grown", 9, "Champagne", "VS2", "Heart", 15000.0, false, "USA", "Heart", "BrilliantGems");
        diamond10.info();
    }
}
