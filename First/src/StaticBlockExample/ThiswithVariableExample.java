package StaticBlockExample;

public class ThiswithVariableExample {

	int rollno;
	String name;
	float fees;
	
	ThiswithVariableExample(int rollno, String name, float fees)
	{
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+fees);
	}
	
	public static void main(String args[])
	{
		ThiswithVariableExample TV = new ThiswithVariableExample(123,"abc",5000);
		ThiswithVariableExample TV1 = new ThiswithVariableExample(456,"xyz",5500);
		TV.display();
		TV1.display();
	}
}
