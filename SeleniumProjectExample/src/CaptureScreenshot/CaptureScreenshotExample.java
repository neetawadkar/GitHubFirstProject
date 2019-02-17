package CaptureScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotExample {
	
	public static WebDriver driver;
	
	public static void main(String args[]) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		/*Date dt = new Date();
		String todaysdt = dt.toString();*/
		
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("D:\\Sat Feb 02 102832 IST 2019.png"));
		
		System.out.println("Screenshot saved on D Drive with name as 1.png");
		
		driver.close();
		driver.quit();
	}

}
