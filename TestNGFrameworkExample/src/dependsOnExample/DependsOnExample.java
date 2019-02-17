package dependsOnExample;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnExample {
	
	public WebDriver driver;
	
  @Test (dependsOnMethods = {"OpenBrowser"})
  
  public void OpenURL() 
  {
	  System.out.println("This will open specified URL");
	  driver.get("https://www.facebook.com/");
  }
  
 @Test 
  
  public void OpenBrowser() 
  {
	  System.out.println("This will execute first (Open Browser)");
	  System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
  }
 
 @Test (dependsOnMethods = {"OpenURL"})
 
 public void CloseBrowser() 
 {
	  System.out.println("This will close browser");
	  driver.quit();
 }
}
