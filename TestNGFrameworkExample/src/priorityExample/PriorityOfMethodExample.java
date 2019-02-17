package priorityExample;

import org.testng.annotations.Test;

public class PriorityOfMethodExample 
{

	@Test(priority = 0, enabled=false)
  public void One() 
  {
	  System.out.println("This is the test case number One");
  }
	
	@Test(priority = 1)
	  public void Two() 
	  {
		  System.out.println("This is the test case number Two");
	  }
	
	@Test(priority = 2)
	  public void Three()
	  {
		  System.out.println("This is the test case number Three");
	  }
	
	@Test(priority = 3)
	  public void Four()
	  {
		  System.out.println("This is the test case number Four");
	  }
}
