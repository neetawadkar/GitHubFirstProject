package startBrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBasedAlertsExample2 {
	
public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		
		Alert oAlt = driver.switchTo().alert();
		String Alt = oAlt.getText();
		oAlt.dismiss();
		
		System.out.println("Alert Text : " +Alt);
		System.out.println("Dismissed the Alert by clicking the Cancel button");
		
		Thread.sleep(5000);
		driver.quit();
	}


}
