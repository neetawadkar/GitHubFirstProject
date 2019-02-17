package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import utility.ExcelUtils;

public class SignIn_Action {
	
	public static void Execute(WebDriver driver) throws Exception {
		
		//This is to get the values from Excel sheet
		
		String sUserName = ExcelUtils.getCellData(1,1);
		
		String sPassword = ExcelUtils.getCellData(1, 2);
		
		//LoginPage.LoginSignupButton(driver).click();
		
		//HomePage.lnk.MyAccount(driver).click();
		
		LoginPage.txtbx_UserName(driver).sendKeys(sUserName);
		
		LoginPage.txtbx_Password(driver).sendKeys(sPassword);
		
		LoginPage.btn_LogIn(driver).click();
		
		Thread.sleep(5000);
		
		boolean isHomePageButton = driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/span/div")).size()>0;
		//boolean isHomePageButton = driver.findElements(By.xpath("//div[contains(text(),'Logout')]")).size()>0;
		
		System.out.println(isHomePageButton);
		
		if (isHomePageButton)
		{
			System.out.println("Login Successful, now it is the time to Log off buddy"); 
		}
		else
		{
			System.out.println("Login unsuccessful");
			ExcelUtils.setCellData("Fail",1,3);
			
			driver.close();
			
			System.exit(0);
			
		}
	}

}
