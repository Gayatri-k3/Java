class WineRunner {
    public static void main(String[] args) {
        Wine wine1 = new Wine();
        wine1.info();
        System.out.println();

        Wine wine2 = new Wine("Chardonnay");
        wine2.info();
        System.out.println();

        Wine wine3 = new Wine("Merlot", "Red");
        wine3.info();
        System.out.println();

        Wine wine4 = new Wine("Cabernet Sauvignon", "Red", "France");
        wine4.info();
        System.out.println();

        Wine wine5 = new Wine("Pinot Noir", "Red", "USA", 2018);
        wine5.info();
        System.out.println();

        Wine wine6 = new Wine("Sauvignon Blanc", "White", "New Zealand", 2020, 13.5);
        wine6.info();
        System.out.println();

        Wine wine7 = new Wine("Riesling", "White", "Germany", 2019, 12.0, 750);
        wine7.info();
        System.out.println();

        Wine wine8 = new Wine("Zinfandel", "Red", "California", 2017, 14.0, 750, "Zinfandel Grapes");
        wine8.info();
        System.out.println();

        Wine wine9 = new Wine("Malbec", "Red", "Argentina", 2016, 14.5, 750, "Malbec Grapes", true);
        wine9.info();
        System.out.println();

        Wine wine10 = new Wine("Champagne", "Sparkling", "France", 2015, 12.5, 750, "Chardonnay, Pinot Noir, Pinot Meunier", true, "Moet & Chandon", 150.0);
        wine10.info();
    }
}
