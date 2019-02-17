package groupingExample;

import org.testng.annotations.Test;

public class GroupExample {
  @Test(groups="Regression")
  public void testCase1() 
  {
	  System.out.println("Im in testCase1 - And in Regression Group");
  }
  
  @Test(groups="Regression")
  public void testCase2() 
  {
	  System.out.println("Im in testCase2 - And in Regression Group");
  }
  
  @Test(groups="Sanity Test")
  public void testCase3() 
  {
	  System.out.println("Im in testCase3 - And in Sanity Test Group");
  }
  
  @Test(groups="Smoke Test")
  public void testCase4() 
  {
	  System.out.println("Im in testCase4 - And in Smoke Test Group");
  }
}
