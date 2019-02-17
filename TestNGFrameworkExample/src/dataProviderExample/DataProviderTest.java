package dataProviderExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	private static WebDriver driver;
	
	@DataProvider(name = "Authentication")
	
	public static Object[][] credentials()
	{
		return new Object[][]
				{
			{"abc","xyz","1234","testuser_1"},
			{"xyz","abc","4321","testuser_2"},
			{"efg","lmn","efg@gmail.com","testuser_3"},
			{"lmn","efg","lmn@gmail.com","testuser_4"}
				};
	}
	
	//Here we are calling the Data Provider object with it's Name
	
  @Test (dataProvider = "Authentication")
  public void test(String sFirstName, String sLastName, String sEmailAdd, String sNewPass) throws InterruptedException 
  {
	  	System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys(sFirstName);
		
		driver.findElement(By.name("lastname")).sendKeys(sLastName);
		
		driver.findElement(By.name("reg_email__")).sendKeys(sEmailAdd);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys(sNewPass);
		
		Thread.sleep(5000);
		
		driver.close();
		
  }
}
