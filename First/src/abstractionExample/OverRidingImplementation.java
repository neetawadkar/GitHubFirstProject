package abstractionExample;

public class OverRidingImplementation {

	public static void main (String args[])
	
	{
		OverRidingExapmle1 ex1 = new OverRidingExapmle1();
		OverRidingExapmle2 ex2 = new OverRidingExapmle2();
		OverRidingExapmle1 ex3 = new OverRidingExapmle2();
		ex1.MyName();
		ex2.MyName();
		ex3.MyName();
	}
}
