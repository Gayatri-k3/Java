//Write a method to display the information of the software use static variables
public class InfoSystem{
	static String softwareName;
	static String version;
	static String company;
	public static void systemDisplay(){
		InfoSystem.softwareName = "MS Word";
		InfoSystem.version = "1.0.8";
		InfoSystem.company = "Microsoft";
		System.out.println("Software Information");
		System.out.println("Software Name: "+InfoSystem.softwareName+"\nVersion: "+InfoSystem.version+"\nComapany: "+InfoSystem.company);
	}
}