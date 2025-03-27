class Poster{
	String content;
	String material;
	int width;
	int length;
	String color;
	String category;
	String title;
	double price;
	String finish;
	boolean isFramed;

	public Poster(){
		System.out.println("Default Constructor");
	}

	public Poster(int width){
		this.width=width;
		System.out.println("Constructor 1 int");
	}

	public Poster(int width, int length){
		this(width);
		this.length=length;
		System.out.println("Constructor 2 int, int");
	}
	public Poster(String content, String material, int length){
		this.length= length;
		this.material= material;
		this.content= content;
		System.out.println("Constructor 3 String, String, int");
	}

	public Poster(String content, String material, int length,int width){
		this(content,material,length);
		this.width=width;
		System.out.println("Constructor 4 String, String, int, int");
	}
	public Poster(String content, String material, int length,int width, String color){
		this(content,material,length, width);
		this.color=color;
		System.out.println("Constructor 5 String, String, int, int, String");
	}

	public Poster(String content, String material, int length,int width, String color, String category){
		this(content,material,length, width, color);
		this.category=category;
		System.out.println("Constructor 6 String, String, int, int, String, String");
	}

	public Poster(String content, String material, int length,int width, String color, String category, String title){
		this(content,material,length, width, color, category);
		this.title=title;
		System.out.println("Constructor 7 String, String, int, int, String, String, String");
	}

	public Poster(String content, String material, int length,int width, String color, String category, String title, double price){
		this(content,material,length, width, color, category, title);
		this.price = price;
		System.out.println("Constructor 8 String, String, int, int, String, String, String, double");
	}
	public Poster(String content, String material, int length,int width, String color, String category, String title, double price, String finish){
		this(content,material,length, width, color, category, title, price);
		this.finish= finish;
		System.out.println("Constructor 9 String, String, int, int, String, String, String, double, String");
	}

	public Poster(String content, String material, int length,int width, String color, String category, String title, double price, String finish, boolean isFramed){
		this(content,material,length, width, color, category, title, price, finish);
		this.isFramed = isFramed;
		System.out.println("Constructor 10 String, String, int, int, String, String, String, double, String, Boolean");
	}
	public void info() {
        System.out.println("Poster Details:");
        System.out.println("Title: " + this.title);
        System.out.println("Content: " + this.content);
        System.out.println("Material: " + this.material);
        System.out.println("Dimensions: " + this.width + " x " + this.length);
        System.out.println("Color: " + this.color);
        System.out.println("Category: " + this.category);
        System.out.println("Price: $" + this.price);
        System.out.println("Finish: " + this.finish);
        System.out.println("Framed: " + (this.isFramed ? "Yes" : "No"));
    }
}