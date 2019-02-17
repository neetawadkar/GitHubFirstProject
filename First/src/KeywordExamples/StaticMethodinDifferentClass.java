package KeywordExamples;

public class StaticMethodinDifferentClass {

	static void method()
	{
		System.out.println("This is Static Method");
	}
	
	void Method2()
	{
		System.out.println("This is non Static Method.");
	}
	
	public static void main(String args[])
	
	{
		StaticMethodinDifferentClass.method();
		StaticMethodinDifferentClass SMDC = new StaticMethodinDifferentClass();
		SMDC.Method2();
	}
}
