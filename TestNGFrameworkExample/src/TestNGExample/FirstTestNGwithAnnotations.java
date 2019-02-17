package TestNGExample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FirstTestNGwithAnnotations {
	
	public static WebDriver driver;
	
  @Test
  public void firstmethod() 
  {
	  	driver.get("https://www.facebook.com/");
	  	//driver.findElement(By.name("firstname")).sendKeys("abc");
		//driver.findElement(By.name("lastname")).sendKeys("xyz");
		//driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		//driver.findElement(By.name("reg_passwd__")).sendKeys("p@ssw0rd");
		//driver.findElement(By.name("websubmit")).click();
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
