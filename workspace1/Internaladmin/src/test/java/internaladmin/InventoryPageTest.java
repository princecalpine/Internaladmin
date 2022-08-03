package internaladmin;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import excelhandling.ExcelData;
import sapphiros.Base;

public class InventoryPageTest extends Base {
	
	static ExcelData reader=new ExcelData("/Users/prince/Documents/workspace1/Internaladmin/src/main/java/exceldata/TestData.xlsx");
    static String Sample=reader.getCellData("Inventory", "Sample barcode", 2);
	
	@Test
	public void InventoryPage() throws IOException, InterruptedException
	{  
	objectrepositoryinternal.InventoryPage Ip=new objectrepositoryinternal.InventoryPage(driver);
	Ip.Inventorymodule().click();
	WebElement Productdropdown=Ip.Productselection();
	Select dropdown=new Select(Productdropdown);
	dropdown.selectByVisibleText("SUPERHERO");
	Ip.Sample().sendKeys(Sample);
	Ip.Sample().sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	
	}
}
