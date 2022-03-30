package internaladmin;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import excelhandling.ExcelData;
import sapphiros.Base;


public class ExtractSwabTest extends Base {
	
	static ExcelData reader=new ExcelData("/Users/prince/Documents/workspace/Internaladmin/src/main/java/exceldata/TestData.xlsx");
    static String Plate=reader.getCellData("Extractswab", "Plate", 2);
    static String SampleBarcode=reader.getCellData("Extractswab", "Sample Barcode", 2);
  
    @Test
	public void ExtractSwab() throws IOException, InterruptedException
	{ 
    	objectrepositoryinternal.ExtractSwab Es=new objectrepositoryinternal.ExtractSwab(driver);
    	Es.SamplePairinglink().click();
    	Es.Extractswabimage().click();
    	Es.Platebarcode().sendKeys(Plate);
    	Es.Platebarcode().sendKeys(Keys.ENTER);
    	Es.Swabbarcode().sendKeys(SampleBarcode);
    	Es.Swabbarcode().sendKeys(Keys.ENTER);
	}
}