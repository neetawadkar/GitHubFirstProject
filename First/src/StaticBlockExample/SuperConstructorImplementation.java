package StaticBlockExample;

public class SuperConstructorImplementation extends SuperConstructorExample {
	
	SuperConstructorImplementation()
	{
		super();
		System.out.println("This is Implemented class default constructor");
	}
	
	SuperConstructorImplementation(int b)
	{
		super(2);
		System.out.println("This is Implemented class parameterised constructor");
	}
	
	public static void main(String args[])
	{
		SuperConstructorImplementation SC = new SuperConstructorImplementation();
		SuperConstructorImplementation SC1 = new SuperConstructorImplementation(4);
	}

}
