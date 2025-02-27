public class Team{
	static String team = "Static Variable";
	static{
		System.out.println("Static block");
	}
	public static void show(){
		System.out.println("Static method");
	}
	}