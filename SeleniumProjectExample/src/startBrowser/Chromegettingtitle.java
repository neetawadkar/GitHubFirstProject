package startBrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Launch a new chrome browser
Open url https://www.facebook.com
Get the title of page and length of page
Fetch current URL and check current URL opened or not
Close the browser. */

public class Chromegettingtitle {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String GT = driver.getTitle();
		String URL = driver.getCurrentUrl();
		int L;
		L = URL.length();
			
		System.out.println("Title of page : " +GT);
		System.out.println("Current URL of page : " +URL);
		System.out.println("Length of URL : " +L);
		
		if (URL.equals("https://www.facebook.com/"))
		{
			System.out.println("Same URL opened");
		}
		else
		{
			System.out.println("Different URL opened");
		}
		driver.quit();
	}

}
