package StaticBlockExample;

public class ThisConstructorExample {
	
	//int a;
	//int b;
	
	ThisConstructorExample()
	{
		this(1,2);
		System.out.println("This is default constructor");
	}
	
	ThisConstructorExample(int a, int b)
	{
		//this.a = a;
		//this.b = b;
		System.out.println("This is parameterised constructor");
	}
	
	public static void main(String args[])
	{
		ThisConstructorExample TC = new ThisConstructorExample();
		//ThisConstructorExample TC1 = new ThisConstructorExample(10,20);
	}

}
