public class Calc{
	public static void calculate(int a, int b) { 
		System.out.println("Sum (int): " + (a + b)); 
	}
    public static void calculate(float a, float b) { 
    	System.out.println("Sum (float): " + (a + b)); 
    }
    public static void calculate(double a, double b) { 
    	System.out.println("Sum (double): " + (a + b)); 
    }
    public static void calculate(long a, long b) { 
    	System.out.println("Sum (long): " + (a + b)); 
    }
    public static void calculate(short a, short b) { 
    	System.out.println("Sum (short): " + (a + b)); 
    }
    public static void calculate(byte a, byte b) { 
    	System.out.println("Sum (byte): " + (a + b)); 
    }
    public static void calculate(String a, String b) { 
    	System.out.println("Concatenation: " + (a + b)); 
    }
    public static void calculate(short b, int a){ 
    	System.out.println("int and short Sum: " + (a+b)); 
    }
    public static void calculate(boolean a, boolean b) { 
    	System.out.println("Boolean AND: " + (a && b)); 
    }
    public static void calculate(char a, char b) { 
    	System.out.println("Char Sum (ASCII): " + ((int) a + (int) b));
    }
    public static void main(String[] args) {
    	calculate(5, 10);
        calculate(5.5f, 2.2f);
        calculate(10.5, 20.5);
        calculate(100000L, 50000L);
        calculate((short) 2, (short) 3);
        calculate((byte) 1, (byte) 2);
        calculate("Hello", " World");
        calculate((short)8,198);
        calculate(true, false);
        calculate('A', 'B');
    }
}