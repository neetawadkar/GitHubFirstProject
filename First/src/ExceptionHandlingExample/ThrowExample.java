package ExceptionHandlingExample;

public class ThrowExample {

	static void physicaltest(int age, int weight)
	{
		if(age>18 && weight>40)
		{
			System.out.println("Welcome to registration");
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("Age and weight not in range");
		}
	}
	
	public static void main(String args[])
	{
		physicaltest(19, 45);
		System.out.println("Have a nice day ahead.....");
	}
}
