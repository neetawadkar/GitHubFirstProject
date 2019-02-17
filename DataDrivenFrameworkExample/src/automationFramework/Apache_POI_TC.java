package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import appModules.SignIn_Action;
import pageObjects.HomePage;
import utility.ExcelUtils;
import utility.constant;

public class Apache_POI_TC {
	
	private static WebDriver driver = null;
	
	//public static int i = 1;
	
	public static void main(String args[]) throws Exception
	{
		ExcelUtils.setExcelFile(constant.TestDataLocation, "Sheet1");
		//for (i=1;i<=ExcelUtils.getRowCount()-1;i++){
		//System.out.println(i);
		
		//This is to open the Excel file. Excel path, file name and sheet name
		
		
			System.setProperty("webdriver.chrome.driver","D:\\exes\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get(constant.URL);
			
			SignIn_Action.Execute(driver);
			
			HomePage.MouseHoverlnk_Logout(driver);
			
			Thread.sleep(5000);
			
			HomePage.lnk_LogOut(driver).click();
			
			Thread.sleep(5000);
			
			driver.quit();
			
			//This is to send the PASS value to the excel sheet in the result column
			
			ExcelUtils.setCellData("Pass", 1, 3);
		}
	}
