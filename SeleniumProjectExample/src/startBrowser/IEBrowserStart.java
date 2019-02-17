package startBrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserStart {
	
public static WebDriver driver;
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.ie.driver","D:\\exes\\IEDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();//to close the browser
		
		System.out.println("Internet Explorer browser launched successfully.");
	}


}
