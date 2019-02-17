package virtualMachine;

public class Instancevariable {

	public String name;
	
	private int age;
	
	private int sal;
	
	public void setName ( String EmpName)
	{
		name = EmpName;
	}
	
	public void setAge (int EmpAge)
	
	{
		age = EmpAge;
	}
	
	public void setSal (int EmpSal)
	
	{
		sal = EmpSal;
	}
	
	
	public void printRec ()
	{
		System.out.println("Emp Name : " + name);
		System.out.println("Emp Age : " + age);
		System.out.println("Emp Sal : " + sal);
	}
	
	public static void main (String args[])
	
	{
		Instancevariable I = new Instancevariable ();
		I.setAge(32);
		I.setName("Neeta");
		I.setSal(30000);
		I.printRec();
	}

}
