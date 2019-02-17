package virtualMachine;

public class Staticvariable {
	
	int Empid;
	String Empname;
	static String Company = "TCS";
	
	Staticvariable (int a, String b)
	{
		Empid = a;
		Empname = b;
	}

	void display()
	{
		System.out.println(Empid+" "+Empname+" "+Company);
	}
	
	public static void main(String args[])
	{
		Staticvariable s1 = new Staticvariable (573855, "Neeta");
		Staticvariable s2 = new Staticvariable (540404, "Yogesh");
		
		s1.display();
		s2.display();
	}
}
