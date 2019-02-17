package multiBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class MultiBrowserTest {
	
	public static WebDriver driver;
	
	@Parameters("browser")
  
  @BeforeClass
  //Passing Browser parameter from TestNG XML
  public void beforeClass(String browser) 
	{
		//If the browser is chrome, then do this.
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			//setting path for gecko driver
			System.setProperty("webdriver.gecko.driver","D:\\exes\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		
		/*else
		{
			System.setProperty("webdriver.ie.driver","D:\\exes\\IEDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.MINUTES);
		}*/
		
		driver.get("https://www.facebook.com/");
  }
//once before method is completed, test method will start
  
	@Test
	public void login()
	{
		driver.findElement(By.name("email")).sendKeys("testuser_1");
		driver.findElement(By.name("pass")).sendKeys("Test@123");
	}
	
	@AfterClass
  public void afterClass() {
		driver.quit();
  }

}
