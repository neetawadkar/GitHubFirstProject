package pkgExtendReport;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportJava {
	
	public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException, IOException
	
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		//create ExtentReports and attach reporter(s)
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		//create a toggle for given the given test, add all log events under it
		
		ExtentTest test = extent.createTest("VerifyHomePageTitle","Checking the title of page");
		
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		//log(Status, details
		
		test.log(Status.INFO,"Chrome Browser launched successfully.");
		
		String appUrl = "https://www.facebook.com/";
		
		driver.get(appUrl);
		
		test.log(Status.INFO,"Navigate to URL");
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Forgotten account?")).click();
		
		//can write code for login to FB page and logout.
		
		test.log(Status.INFO,"Find Your Account page opened");
		
		Thread.sleep(5000);
		
		//Go back to home page
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		test.log(Status.INFO,"Back on Home page");
		
		//Go forward to Find your account page

		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		test.log(Status.INFO,"Back on Find Your Account page opened");
		
		//Go back to Home Page
		
		driver.navigate().to(appUrl);
		
		Thread.sleep(5000);
		
		//Refresh Browser
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		//test with snapshot
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotFile, new File("D:\\Selenium\\capturescreenshotexample.png"));
		
		test.addScreenCaptureFromPath("screenshot.png");
		
		test.addScreenCaptureFromPath("D:\\Selenium\\capturescreenshotexample.png");
		
		//calling flush writes everything to the log file
		
		extent.flush();
		
		//close browser
		
		driver.close();
	}

}
