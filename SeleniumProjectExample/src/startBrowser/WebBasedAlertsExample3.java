package startBrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBasedAlertsExample3 {

	public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		//To click ok on the Alert box
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		
		Alert oAlt = driver.switchTo().alert();
		String Alt = oAlt.getText();
		oAlt.accept();
		
		System.out.println("Alert Test :" +Alt);
		System.out.println("Accepted the Alert");
		Thread.sleep(2000);
		
		//To cancel the alert box
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		
		Alert alt = driver.switchTo().alert();
		String oalt = oAlt.getText();
		alt.dismiss();
		
		System.out.println("Alert Text : " +oalt);
		System.out.println("Dismissed the Alert by clicking the Cancel button");
		Thread.sleep(2000);
		
		//to enter text in alert box and click ok
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		
		Alert OALT = driver.switchTo().alert();
		String ALT = oAlt.getText();
		OALT.sendKeys("TestNG");
		OALT.accept();
		
		System.out.println("Alert Text : " +ALT);
		System.out.println("Send the values to Alert");
		
		Thread.sleep(5000);
		driver.quit();
		

	}
	
	
}
