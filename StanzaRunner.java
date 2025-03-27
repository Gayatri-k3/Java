class StanzaRunner {
    public static void main(String[] args) {
        Stanza stanza1 = new Stanza();
        stanza1.info();
        System.out.println();

        Stanza stanza2 = new Stanza("Roses are red...");
        stanza2.info();
        System.out.println();

        Stanza stanza3 = new Stanza("Twinkle twinkle little star...", "Nursery Rhyme");
        stanza3.info();
        System.out.println();

        Stanza stanza4 = new Stanza("Shall I compare thee to a summer’s day?", "Love", 14);
        stanza4.info();
        System.out.println();

        Stanza stanza5 = new Stanza("The woods are lovely, dark and deep...", "Nature", 4, "AABA");
        stanza5.info();
        System.out.println();

        Stanza stanza6 = new Stanza("Hope is the thing with feathers...", "Inspirational", 8, "ABCB", "English");
        stanza6.info();
        System.out.println();

        Stanza stanza7 = new Stanza("I wandered lonely as a cloud...", "Nature", 6, "ABAB", "English", true);
        stanza7.info();
        System.out.println();

        Stanza stanza8 = new Stanza("Do not go gentle into that good night...", "Death", 19, "ABA", "English", true, "Dylan Thomas");
        stanza8.info();
        System.out.println();

        Stanza stanza9 = new Stanza("Ode to a Nightingale", "Melancholy", 10, "ABAB", "English", true, "John Keats", 1819);
        stanza9.info();
        System.out.println();

        Stanza stanza10 = new Stanza("The Raven", "Gothic", 18, "ABCBBB", "English", true, "Edgar Allan Poe", 1845, "Narrative Poem", "The Raven");
        stanza10.info();
    }
}
