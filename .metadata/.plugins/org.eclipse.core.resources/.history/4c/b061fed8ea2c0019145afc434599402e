package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	private static WebElement element = null;
	
	public static WebElement lnk_MyAccount(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//div[text()='My Account']"));
	
		return element;
		
	}
	
	public static WebElement MouseHoverlnk_Logout(WebDriver driver)
	{
		//element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div"));
		
		//element = driver.findElement(By.xpath("//div[@class='_2aUbKa']"));
		
		//element = driver.findElement(By.xpath("//svg[@class='_34Yjv1 AzsqDH']"));
		
		Actions act = new Actions(driver);
		
		element = driver.findElement(By.xpath("//div[text()='More']//preceding::div[1]"));
		
		act.moveToElement(element).build().perform();
				
		return element;
	}
	
	public static WebElement lnk_LogOut(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[contains(text(),'Logout')]"));
		
		//element = driver.findElement(By.xpath("//div[@class='_1Q5BxB']"));
		
		return element;
		
	}

}
