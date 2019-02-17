package startBrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassExample {
	
	public static WebDriver driver;
	
	public static void main(String args[]) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
		//driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls)]).
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
