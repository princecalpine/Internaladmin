package internaladmin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import excelhandling.ExcelData;
import objectrepositoryinternal.LoginPage;

import java.io.IOException;

import sapphiros.Base;

public class Logintest extends Base {
	
	
	static ExcelData reader=new ExcelData("/Users/prince/Documents/workspace1/Internaladmin/src/main/java/exceldata/TestData.xlsx");
	
	static String username=reader.getCellData("Login", "Username", 2);
	static String password=reader.getCellData("Login", "Password", 2);
	
	
	@Test
	  public static void basePageNavigation() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get("https://redwoodpreproduction.sapphiroslabs.com/");
		LoginPage l=new LoginPage(driver);
		l.EmailId().sendKeys(username);
		l.Password().sendKeys(password);
		WebElement Lab=l.LabLocation();
		Thread.sleep(1000);
		Select dropdownlab=new Select(Lab);
		dropdownlab.selectByVisibleText("REDWOOD");
		l.Submit().click();

}
}
