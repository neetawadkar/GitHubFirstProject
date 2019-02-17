package startBrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Open chrome Browser
Open https://www.facebook.com/ via navigate command
Click on forgotten account link
Come back to previous page
Go again on the registration page
Refresh your page
Close browser */
public class ChromeNavigationCommandExample {
	
	public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Forgotten account?")).click();//click on Forgotten account link on FB login page
		driver.navigate().back();//going back to home page
		Thread.sleep(5000);
		driver.navigate().forward();//going forward to registration page
		Thread.sleep(5000);
		
		driver.quit();
	}

}
