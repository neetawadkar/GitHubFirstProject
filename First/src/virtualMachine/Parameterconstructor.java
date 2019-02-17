package virtualMachine;

public class Parameterconstructor {

	int i =10;
	public String name;	
	public float Salary;
	
	public void methodA ()
	
	{
		i = i+20;
		System.out.println(i);
	}

	public void methodB ()
	
	{
		i = i+40;
		System.out.println(i);
	}

	public void setName (String MyName)
	
	{
		name = MyName;
		System.out.println(name);
	}
	
	Parameterconstructor (float sal)
	{
		Salary = sal;
		System.out.println(Salary);
	}
	
	public static void main (String[] args)
	
	{
		Parameterconstructor pc = new Parameterconstructor (30000.33f);
		pc.setName("Neeta");
		pc.methodA();
		pc.methodB();
	}
}
