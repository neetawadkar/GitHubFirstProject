package testSuiteExample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestSuiteExamplewithYahoo {
	
	public static WebDriver driver;
	
  @Test
  public void f() 
  {
	  driver.get("https://in.yahoo.com/");
	  String FBTitle = driver.getTitle();
	  System.out.println(FBTitle);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  	System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
  }

}
