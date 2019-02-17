package abstractionExample;

public class MethodOverloadingExample {

	public int sum(int a, int b)
	{
		return(a+b);
	}
	
	public int sum(int a, int b, int c)
	{
		return(a+b+c);
	}
	
	public double sum(double a, double b)
	{
		return(a+b);
	}
	
	public static void main(String args[])
	
	{
		MethodOverloadingExample me = new MethodOverloadingExample();
		System.out.println(me.sum(11,22));
		System.out.println(me.sum(11,22,33));
		System.out.println(me.sum(11.11,22.22));
	}
			
}
