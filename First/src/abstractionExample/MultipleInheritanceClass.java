package abstractionExample;

public class MultipleInheritanceClass implements MultipleInheritance1, MultipleInheritance2 {

	@Override
	public void check1() {
		// TODO Auto-generated method stub
		MultipleInheritance1.super.check1();
		MultipleInheritance2.super.check1();
	}

	public static void main(String args[])
	{
		MultipleInheritanceClass m1 = new MultipleInheritanceClass();
		m1.check1();
	}
}
