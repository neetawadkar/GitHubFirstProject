package StaticBlockExample;

public class FinalVariableExample {
	
	final int f = 9; // final variable
	
	void change()
	{
		//f = 90;
		System.out.println("Value of final variable = " + f);
	}

	public static void main(String args[])
	{
		FinalVariableExample FV = new FinalVariableExample();
		FV.change();
	}
}
