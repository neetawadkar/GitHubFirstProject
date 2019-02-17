package abstractionExample;

public class ImplementationOfAbstractClass1 extends AbstractClass1  {
	
	public void method2()
	{
		System.out.println("This is Abstract method");
	}
	
	public static void main(String args[])
	
	{
		//AbstractClass1 ab = new AbstractClass1(); //Error
		//AbstractClass1 ab = new ImplementationOfAbstractClass1();
		ImplementationOfAbstractClass1 ab = new ImplementationOfAbstractClass1();
		
		ab.method2();
		ab.method1();
	}

}
