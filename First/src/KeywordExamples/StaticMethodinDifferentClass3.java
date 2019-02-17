package KeywordExamples;

public class StaticMethodinDifferentClass3 {
	
	public static void main(String args[])
	{
		StaticMethodinDifferentClass2.change();
		StaticMethodinDifferentClass2 S1 = new StaticMethodinDifferentClass2(1,"abc");
		StaticMethodinDifferentClass2 S2 = new StaticMethodinDifferentClass2(2,"pqr");
		StaticMethodinDifferentClass2 S3 = new StaticMethodinDifferentClass2(3,"xyz");
		S1.display();
		S2.display();
		S3.display();
	}

}
