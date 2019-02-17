package abstractionExample;

public class ImterfaceImplementation implements InterfaceExample{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("First method.");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Second method.");
	}
	
	/*public void method3()
	{
		System.out.println("Method3 override.");
	}
*/
	public static void main(String args[])
	{
		InterfaceExample ie = new ImterfaceImplementation();
		//a = 20; // Error coz values of final variable changed.
		System.out.println(InterfaceExample.a);
		ie.method1();
		ie.method2();
		ie.method3();
		InterfaceExample.method4();
	}
}
