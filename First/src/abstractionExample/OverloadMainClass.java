package abstractionExample;

public class OverloadMainClass {
	// As we can overload static method we can overload main class
	public static void main(String args[])
	{
		System.out.println("Main with String args[]");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main with String[] args");
	}
	
	public static void main(String args)
	{
		System.out.println("Main with String args");
	}

}
