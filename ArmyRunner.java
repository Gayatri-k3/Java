class ArmyRunner {
    public static void main(String[] args) {
        Army army1 = new Army();
        army1.info();
        System.out.println();

        Army army2 = new Army("Red Army");
        army2.info();
        System.out.println();

        Army army3 = new Army("Blue Army", "USA");
        army3.info();
        System.out.println();

        Army army4 = new Army("Green Army", "UK", 500000);
        army4.info();
        System.out.println();

        Army army5 = new Army("Yellow Army", "China", 1000000, 5000);
        army5.info();
        System.out.println();

        Army army6 = new Army("Black Army", "Russia", 900000, 6000, 3500);
        army6.info();
        System.out.println();

        Army army7 = new Army("Silver Army", "France", 300000, 2000, 1500, 50);
        army7.info();
        System.out.println();

        Army army8 = new Army("Golden Army", "India", 1200000, 7000, 4000, 75, true);
        army8.info();
        System.out.println();

        Army army9 = new Army("Steel Army", "Germany", 250000, 1500, 1000, 30, false, "Elite");
        army9.info();
        System.out.println();

        Army army10 = new Army("Titan Army", "Japan", 180000, 1300, 1200, 40, false, "Advanced", 50, "Defend with Honor");
        army10.info();
    }
}