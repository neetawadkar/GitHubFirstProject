package StaticBlockExample;

public class FinalMethodImplementation extends FinalMethodExample {

	void method1()
	{
		System.out.println("Final Class Example");
	}
	
	public static void main(String args[])
	{
		FinalMethodImplementation fn = new FinalMethodImplementation();
		fn.method1();
		fn.finalexample1();
	}
}
