package JavaScriptExecutorExample;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnButtonandGenerateAlert {
	
public static WebDriver driver;
	
	public static void main(String args[]) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		//driver.navigate().to("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Launching the site
		driver.get("https://www.facebook.com/");
		
		WebElement button = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		//Login to Facebook
		driver.findElement(By.name("email")).sendKeys("8867457429");
		driver.findElement(By.name("pass")).sendKeys("Aug@2013");
		
		//Perform click on Login button using Javascript
		js.executeScript("arguments[0].click();",button);
		
		
		
		//To generate alert window
		driver.close();
		
	}
}
