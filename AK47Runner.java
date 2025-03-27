class AK47Runner {
    public static void main(String[] args) {
        AK47 ak1 = new AK47();
        ak1.info();
        System.out.println();

        AK47 ak2 = new AK47("AKM");
        ak2.info();
        System.out.println();

        AK47 ak3 = new AK47("AK-74", "Izhmash");
        ak3.info();
        System.out.println();

        AK47 ak4 = new AK47("AK-103", "Kalashnikov Concern", 7);
        ak4.info();
        System.out.println();

        AK47 ak5 = new AK47("AK-12", "Kalashnikov Concern", 5, 30);
        ak5.info();
        System.out.println();

        AK47 ak6 = new AK47("AK-47", "Soviet Union", 7, 30, 4.3);
        ak6.info();
        System.out.println();

        AK47 ak7 = new AK47("AK-15", "Russia", 7, 30, 3.5, 95);
        ak7.info();
        System.out.println();

        AK47 ak8 = new AK47("AK-19", "Kalashnikov Concern", 5, 30, 3.8, 91, 600);
        ak8.info();
        System.out.println();

        AK47 ak9 = new AK47("AK-200", "Kalashnikov Concern", 7, 30, 4.0, 94, 650, true);
        ak9.info();
        System.out.println();

        AK47 ak10 = new AK47("AK-203", "India-Russia", 7, 30, 3.9, 92, 700, true, "India", 2021);
        ak10.info();
    }
}
