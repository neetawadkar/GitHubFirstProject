package StaticBlockExample;

public class SuperMethodImplementation extends SuperMethodExample {

	void method1()
	{
		System.out.println("This is method of implemented class");
	}
	
	void method2()
	{
		super.method1();
		//method1();
	}
	
	public static void main(String args[])
	{
		SuperMethodImplementation SM = new SuperMethodImplementation();
		SM.method1();
		SM.method2();
	}
}
