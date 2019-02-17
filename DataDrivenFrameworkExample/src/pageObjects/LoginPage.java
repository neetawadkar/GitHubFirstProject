package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {
	
	private static WebElement element = null;
	
	public static WebElement txtbx_UserName(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@class='_2zrpKA']"));
		//element = driver.findElement(By.xpath("input[@type='text']"));
		
		return element;
		
	}
	
	public static WebElement txtbx_Password(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']"));
		//element = driver.findElement(By.xpath("input[@type='password']"));
		
		return element;
		
	}
	
	public static WebElement btn_LogIn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		
		return element;
		
	}
	
	public static WebElement LoginSignupButton(WebDriver driver)
	{
		element = driver.findElement(By.partialLinkText("Login & Signup"));
		
		return element;
		
	}
	

}
