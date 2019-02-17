package StaticBlockExample;

public class SuperVariableImplementation extends SuperVariableExample {

	String var1 = "This is implemented class";
	
	void msg()
	{
		System.out.println(var1);
		System.out.println(super.var1);
	}
	
	public static void main(String args[])
	{
		SuperVariableImplementation SV = new SuperVariableImplementation();
		SV.msg();
		SV.display();
	}
}
