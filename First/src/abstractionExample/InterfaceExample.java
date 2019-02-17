package abstractionExample;

public interface InterfaceExample {
	
	int a = 100; //by default it will be public, static and final.
	void method1(); //by default it will be abstract and public.
	void method2();
	
	default void method3()
	{
		System.out.println("This is a default method introduced after JAVA 7.");
	}
	
	static void method4() //can not override it.
	{
		System.out.println("This is a static method introduced after JAVA 7.");
	}


}
