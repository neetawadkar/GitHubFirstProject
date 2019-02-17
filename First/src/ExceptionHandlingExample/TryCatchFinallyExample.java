package ExceptionHandlingExample;

public class TryCatchFinallyExample {
	
	public static void main(String args[]) {
	try
	{
		int a[]=new int[5];
		a[2]=30/3;
		System.out.println(a[2]);
	}
	
	catch(ArithmeticException f) 
	{
		System.out.println("task1 is completed");
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("task2 is completed");
	}
	
	catch(Exception e)
	{
		System.out.println("Common task completed");
	}
	
	finally
	{
		System.out.println("Task completed");
	}
System.out.println("rest of the code executed.....");
}
}
