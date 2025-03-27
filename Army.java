class Army {
    String name;
    String country;
    int soldiers;
    int tanks;
    int aircrafts;
    int submarines;
    boolean hasNuclearWeapons;
    String rank;
    int budget;
    String motto;

    public Army() {
        System.out.println("Default Constructor");
    }

    public Army(String name) {
        this.name = name;
        System.out.println("Constructor 1 String");
    }

    public Army(String name, String country) {
        this(name);
        this.country = country;
        System.out.println("Constructor 2 String, String");
    }

    public Army(String name, String country, int soldiers) {
        this(name, country);
        this.soldiers = soldiers;
        System.out.println("Constructor 3 String, String, int");
    }

    public Army(String name, String country, int soldiers, int tanks) {
        this(name, country, soldiers);
        this.tanks = tanks;
        System.out.println("Constructor 4 String, String, int, int");
    }

    public Army(String name, String country, int soldiers, int tanks, int aircrafts) {
        this(name, country, soldiers, tanks);
        this.aircrafts = aircrafts;
        System.out.println("Constructor 5 String, String, int, int, int");
    }

    public Army(String name, String country, int soldiers, int tanks, int aircrafts, int submarines) {
        this(name, country, soldiers, tanks, aircrafts);
        this.submarines = submarines;
        System.out.println("Constructor 6 String, String, int, int, int, int");
    }

    public Army(String name, String country, int soldiers, int tanks, int aircrafts, int submarines, boolean hasNuclearWeapons) {
        this(name, country, soldiers, tanks, aircrafts, submarines);
        this.hasNuclearWeapons = hasNuclearWeapons;
        System.out.println("Constructor 7 String, String, int, int, int, int, boolean");
    }

    public Army(String name, String country, int soldiers, int tanks, int aircrafts, int submarines, boolean hasNuclearWeapons, String rank) {
        this(name, country, soldiers, tanks, aircrafts, submarines, hasNuclearWeapons);
        this.rank = rank;
        System.out.println("Constructor 8 String, String, int, int, int, int, boolean, String");
    }

    public Army(String name, String country, int soldiers, int tanks, int aircrafts, int submarines, boolean hasNuclearWeapons, String rank, int budget, String motto) {
        this(name, country, soldiers, tanks, aircrafts, submarines, hasNuclearWeapons, rank);
        this.budget = budget;
        this.motto = motto;
        System.out.println("Constructor 9 String, String, int, int, int, int, boolean, String, int, String");
    }

    public void info() {
        System.out.println("Army Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Country: " + this.country);
        System.out.println("Soldiers: " + this.soldiers);
        System.out.println("Tanks: " + this.tanks);
        System.out.println("Aircrafts: " + this.aircrafts);
        System.out.println("Submarines: " + this.submarines);
        System.out.println("Has Nuclear Weapons: " + (this.hasNuclearWeapons ? "Yes" : "No"));
        System.out.println("Rank: " + this.rank);
        System.out.println("Budget: $" + this.budget + " billion");
        System.out.println("Motto: " + this.motto);
    }
}