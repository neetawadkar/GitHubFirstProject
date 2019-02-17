package startBrowser;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchToWindowExample1 {
	
public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		//Store and print the name of the first window on the 
		String handle = driver.getWindowHandle();
		//System.out.println(handle);
		
		//click on the button Click to open a new browser window!
		
		driver.findElement(By.xpath("//button[text()='Click to open a new browser window!']")).click();
		
		//Store and print the name of all the windows open
		
		Set handles = driver.getWindowHandles();
		
		System.out.println(handles.size());
		
		//System.out.println(handles);
		
		//Pass a window handle to the other window
		
		for (String handle1 : driver.getWindowHandles())
		{
			System.out.println(handle1);
			driver.switchTo().window(handle1);
		}
		
		driver.close();
		
		
		Thread.sleep(5000);
		driver.quit();
	
	}

}
