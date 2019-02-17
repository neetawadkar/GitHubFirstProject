package StaticBlockExample;

public class staticBlock1 {

	static int a = 10;
	static int b;
	
	static
	{
		System.out.println("Static block initialized.");
		b = a * 5;
	}
	
	public static void main(String args[])
	{
		System.out.println("Valus of a : "+a);
		System.out.println("Valus of b : "+b);
	}
}
