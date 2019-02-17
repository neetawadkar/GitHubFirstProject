package KeywordExamples;

public class StaticVariableExample {
	
	//int incr=0; //will get memory each time
	
	static int incr=0; // will get memory only once and retained.
	
	StaticVariableExample()
	{
		incr++;
		System.out.println(incr);
	}

	public static void main(String args[])
	{
		StaticVariableExample E1 = new StaticVariableExample();
		StaticVariableExample E2 = new StaticVariableExample();
		StaticVariableExample E3 = new StaticVariableExample();
	}
}
