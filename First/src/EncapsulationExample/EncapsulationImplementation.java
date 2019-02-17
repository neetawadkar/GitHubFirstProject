package EncapsulationExample;

public class EncapsulationImplementation {
	
	public static void main(String args[])
	
	{
		EncapsulationExample1 EE = new EncapsulationExample1();
		EE.setAppName("Sanvi");
		EE.setAppAge(2);
		EE.setAppUIDAI(23082016);
		System.out.println("Applicant Name : " + EE.getAppName());
		System.out.println("Applicant Age : " + EE.getAppAge());
		System.out.println("Applicant UIDAI : " + EE.getAppUIDAI());
	}

}
