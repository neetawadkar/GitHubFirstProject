package startBrowser;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebDriverPractice4 {
	
public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");
		Select oSelect = new Select(driver.findElement(By.id("programming-languages")));
		List<WebElement> oSize = oSelect.getOptions();
		
		int iListSize = oSize.size();
		
		for(int i = 0; i < iListSize; i++)
		{
			String sValue = oSelect.getOptions().get(i).getText();
			System.out.println(sValue);
			
			if(sValue.equals("PHP"))
			{
				oSelect.selectByVisibleText("PHP");
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}
