package startBrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebDriverPractice3 {
	
public static WebDriver driver;
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");
		Select oSelect = new Select(driver.findElement(By.id("programming-languages")));
		oSelect.selectByVisibleText("PHP");
		
		Select S = new Select(driver.findElement(By.id("selenium_suite")));
		S.selectByValue("IDE");
		S.selectByValue("WebDriver");
		S.selectByValue("RC");
		S.selectByValue("Grid");
		driver.quit();
	}
}
