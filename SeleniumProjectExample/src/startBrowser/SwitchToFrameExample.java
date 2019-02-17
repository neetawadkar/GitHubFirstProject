package startBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameExample {
	
public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.switchTo().frame("a077aa5e"); //Switching to frame
		
		System.out.println("We are switch to iFrame.");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/a/img")).click();
		//driver.findElement(By.tagName("img")).click();
		driver.findElement(By.tagName("a")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(50000);
		driver.quit();
	
	}
}
