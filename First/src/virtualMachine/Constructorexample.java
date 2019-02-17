package virtualMachine;

public class Constructorexample {

	Constructorexample() //Constructor will have same name as that of class
	
	{
		int num = 2008;
		num = num +10;
		System.out.println(num);
	}
	
	public void name()
	
	{ float f = 10.50f;
	
	int a = (int) f; // This is called as type casting (from float to int) (int to float type casting not required)
	System.out.println(a);
	
	}
	
	public static void main (String args[])
	{
	System.out.println("This is year");
	Constructorexample ce = new Constructorexample ();
		ce.name();
	}
}
