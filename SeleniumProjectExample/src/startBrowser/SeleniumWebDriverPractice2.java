package startBrowser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverPractice2 {
	
	public static WebDriver driver;
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int s = links.size();
		System.out.println("Number of Clickable links on facebook page : "+s);
		System.out.println("The links on facebook page are as below : " );
		
		for(int i = 0; i < s; i++)
		{
			String name = links.get(i).getText();
			System.out.println(name);
			
			}
		
		driver.quit();
		}
		
		
	}
	
