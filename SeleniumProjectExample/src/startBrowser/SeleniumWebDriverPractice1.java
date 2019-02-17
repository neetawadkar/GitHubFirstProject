package startBrowser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverPractice1 {
	
	public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver.findElement(By.xpath("//input[@id='novels-radio-btn']")).click();
		List<WebElement> chkboxle = driver.findElements(By.name("books"));
		int isize = chkboxle.size();
		System.out.println("Size : " +isize);
		
		for(int i = 0; i < isize; i++)
		{
			String names = chkboxle.get(i).getAttribute("value");
			System.out.println(names);
			
			if(names.equals("Self help books"))
			{
				chkboxle.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@name='vehicle7']")).click();
		List<WebElement> chkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int size = chkbox.size();
		System.out.println("Size : " +size);
		
		for (int a = 0; a< size; a++)
		{
			String name = chkbox.get(a).getAttribute("TestNG");
			System.out.println(name);
			
		}
		
		/*boolean bValue = true;
		
		bValue = chkbox.get(0).isSelected();
		
		if(bValue == true)
		{
			chkbox.get(1).click();
		}
		
		else
		{
			chkbox.get(0).click();
		}
		
		for(int a = 0; a < size; a++)
		{
			String name = chkbox.get(a).getText();
			System.out.println(name);
			
			if(name.equals("SUV"))
			{
				chkbox.get(a).click();
				break;
			}
		}*/
		
		Thread.sleep(5000);		
		driver.quit();
		
	}

}
