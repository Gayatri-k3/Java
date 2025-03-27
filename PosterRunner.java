class PosterRunner{
	public static void main(String[] args) {
		Poster poster1 = new Poster();
		poster1.info();
		System.out.println();

		int width3= 17;
		Poster poster4 = new Poster(width3);
		poster4.info();
		System.out.println();

		int length2 = 20;
		int width2= 10;
		Poster poster3 = new Poster(width2,length2);
		poster3.info();
		System.out.println();
		
		String content1 = "Song";
		String material1 = "Acrylic";
		int length1 = 24;
		Poster poster2 = new Poster(content1,material1,length1);
		poster2.info();
		System.out.println();

		String content4 = "Movie";
		String material4 = "Paper";
		int length4 = 29;
		int width4= 15;
		Poster poster5 = new Poster(content4, material4, width4, length4);
		poster5.info();

        Poster poster6 = new Poster("Nature", "Canvas", 30, 20, "Green");
        poster6.info();
        System.out.println();

        Poster poster7 = new Poster("Art", "Plastic", 25, 18, "Blue", "Abstract");
        poster7.info();
        System.out.println();

        Poster poster8 = new Poster("Sports", "Vinyl", 22, 16, "Red", "Athletics", "Football Poster");
        poster8.info();
        System.out.println();

        Poster poster9 = new Poster("Cityscape", "Fabric", 40, 30, "Black", "Urban", "New York Skyline", 49.99);
        poster9.info();
        System.out.println();

        Poster poster10 = new Poster("Abstract Art", "Linen", 35, 25, "Yellow", "Modern", "Sunset Vibes", 59.99, "Glossy");
        poster10.info();
        System.out.println();

        Poster poster11 = new Poster("Vintage", "Silk", 45, 35, "Beige", "Classic", "Retro Poster", 79.99, "Matte", true);
        poster11.info();
    }
}
