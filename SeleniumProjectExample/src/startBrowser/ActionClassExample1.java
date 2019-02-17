package startBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample1 {
	
public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.linkText("Women"))).perform();
				
		// WebElement Test = driver.findElement(By.linkText("Women"));
		 //act.moveToElement(Test).perform();
		 
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Tops, T-Shirts & Shirts")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
