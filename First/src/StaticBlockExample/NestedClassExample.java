package StaticBlockExample;

public class NestedClassExample {
	private int a = 10;
	private static int b = 20;
	
	private class NonStatic
	{
		void display()
		{
			System.out.println("Private int a = " + a);
			System.out.println(+b);
		}
	}

	public static class StaticNested
	{
		void display()
		{
			//System.out.println("Private int a = " + a); // can not access non static members inside nested static class
			
			System.out.println("Private Static int b = " + b);// can only access static members inside nested static class.
		}
	}
	
	public static void main(String args[])
	{
		NestedClassExample NC = new NestedClassExample();
		NestedClassExample.NonStatic NST = NC.new NonStatic();//instantiation of inner non-static class.
		NST.display();
		
		StaticNested SN = new StaticNested();//can directly instantiate nested static class.
		SN.display();
		
	}
}
