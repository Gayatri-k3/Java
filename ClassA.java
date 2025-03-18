public class ClassA{
	public static void display(int a){
		System.out.println("int: "+a);
	}
	public static void display(double a){
		System.out.println("double: "+a);
	}
	public static void display(short a){
		System.out.println("short: "+a);
	}
	public static void display(long a){
		System.out.println("long: "+a);
	}
	public static void display(byte a){
		System.out.println("byte: "+a);
	}
	public static void display(char a){
		System.out.println("char: "+a);
	}
	public static void display(float a){
		System.out.println("float: "+a);
	}
	public static void display(int[] arr) { 
		System.out.println("Array: " + java.util.Arrays.toString(arr));
	}
	public static void display(boolean a){
		System.out.println("boolean: "+a);
	}
	public static void display(String a){
		System.out.println("String: "+a);
	}
	public static void main(String[] args) {
		display(10);
        display(10.5f);
        display(20.5);
        display('A');
        display(true);
        display(100000L);
        display((short) 5);
        display((byte) 2);
        display("Hello");
        display(new int[]{1, 2, 3});

	}
}