package internaladmin;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import excelhandling.ExcelData;
import objectrepositoryinternal.CreateInternalUser;
import sapphiros.Base;

public class CreateInternalUserTest extends Base {
	
	static ExcelData reader=new ExcelData("/Users/prince/Documents/workspace/Internaladmin/src/main/java/exceldata/TestData.xlsx");
    static String Email=reader.getCellData("Internaluser", "Email", 2);
    static String FirstName=reader.getCellData("Internaluser", "First Name", 2);
    static String LastName=reader.getCellData("Internaluser", "Last Name", 2);
    
    
    @Test
	public void CreateCategory() throws IOException, InterruptedException
	{
		CreateInternalUser Iu=new CreateInternalUser(driver);
		Iu.Internaluserpage().click();
		Iu.UserEmail().sendKeys(Email);
		Iu.Firstname().sendKeys(FirstName);
		Iu.Lastname().sendKeys(LastName);
		Iu.Checkboxfullaccess().click();
		WebElement Roleselection=Iu.Diagonisticroles();
		Select Diarole=new Select(Roleselection);
		Diarole.selectByVisibleText("Diagnostics Console Admin");
		Iu.DiaSelectionarrow().click();
		Iu.UserSave().click();
		
	}

}
