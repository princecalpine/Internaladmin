package covidconsole;

import org.testng.annotations.Test;

import excelhandling.ExcelData;

import java.io.IOException;

import sapphiros.Base;

public class CovidLoginTest extends Base {
	
	
	static ExcelData reader=new ExcelData("/Users/prince/Documents/workspace/Internaladmin/src/main/java/exceldata/CovidConsole.xlsx");
	
	static String email=reader.getCellData("CovidConsoleLogin", "Email", 2);
	static String password=reader.getCellData("CovidConsoleLogin", "Password", 2);
	
	
	@Test
	  public static void basePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://covidstage.gotoknowtest.com/");
		objectrepositorycovid.CovidConsoleLogin cc=new objectrepositorycovid.CovidConsoleLogin(driver);
		cc.LoginLink().click();
		cc.Email().sendKeys(email);
		cc.Password().sendKeys(password);
		cc.Login().click();
		

}
}
