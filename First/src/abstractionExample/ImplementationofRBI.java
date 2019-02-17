package abstractionExample;

public class ImplementationofRBI {
	
	public static void main (String args[])
	
	{
		RBIRateOfInterest rb = new HDFC();
		System.out.println("The Rate of interest for HDFC :-" + rb.ROI());
		RBIRateOfInterest rb1 = new AXIS();
		System.out.println("The Rate of interest for AXIS :-" + rb1.ROI());
		
	}

}
