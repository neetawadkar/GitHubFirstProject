package KeywordExamples;

public class StaticMethodinDifferentClass2 {
	
	int rollnum;
	String name;
	static String college = "COEP";
	
	static void change()
	{
		college = "Pune University";
	}
	
	StaticMethodinDifferentClass2(int r, String n)
	{
		rollnum = r;
		name = n;
	}
	
	void display()
	{
		System.out.println(rollnum+" " +name+" "+college);
	}

}
