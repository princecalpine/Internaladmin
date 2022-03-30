package internaladmin;

import org.testng.annotations.Test;

import excelhandling.ExcelData;
import objectrepositoryinternal.LoginPage;

import java.io.IOException;

import sapphiros.Base;

public class Logintest extends Base {
	
	
	static ExcelData reader=new ExcelData("/Users/prince/Documents/workspace/Internaladmin/src/main/java/exceldata/TestData.xlsx");
	
	static String username=reader.getCellData("Login", "Username", 2);
	static String password=reader.getCellData("Login", "Password", 2);
	
	
	@Test
	  public static void basePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://preproduction.telomerediagnostics.com/");
		LoginPage l=new LoginPage(driver);
		l.EmailId().sendKeys(username);
		l.Password().sendKeys(password);
		l.Submit().click();

}
}
