package StaticBlockExample;

public class ThiswithMethodExample {
	
	void method1()
	{
		System.out.println("This is 1st method");
	}
	
	void method2()
	{
		System.out.println("This is 2nd method calling 1st method");
		method1();
		//this.method1(); // same as above.
	}

	public static void main(String args[])
	{
		ThiswithMethodExample TM = new ThiswithMethodExample();
		TM.method1();
		TM.method2();
	}
}
