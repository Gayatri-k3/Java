class CementRunner {
    public static void main(String[] args) {
        Cement cement1 = new Cement();
        cement1.info();
        System.out.println();

        Cement cement2 = new Cement("UltraTech");
        cement2.info();
        System.out.println();

        Cement cement3 = new Cement("ACC", "OPC");
        cement3.info();
        System.out.println();

        Cement cement4 = new Cement("Ambuja", "PPC", 43);
        cement4.info();
        System.out.println();

        Cement cement5 = new Cement("JK", "PSC", 53, 50);
        cement5.info();
        System.out.println();

        Cement cement6 = new Cement("Shree", "OPC", 33, 25, "Gray");
        cement6.info();
        System.out.println();

        Cement cement7 = new Cement("Birla", "PPC", 43, 50, "Light Gray", 350.0);
        cement7.info();
        System.out.println();

        Cement cement8 = new Cement("Ramco", "PSC", 53, 50, "Dark Gray", 400.0, true);
        cement8.info();
        System.out.println();

        Cement cement9 = new Cement("Dalmia", "OPC", 43, 50, "Gray", 375.0, false, "India");
        cement9.info();
        System.out.println();

        Cement cement10 = new Cement("Jaypee", "PPC", 53, 50, "White", 450.0, true, "India", "Construction", 12);
        cement10.info();
    }
}
