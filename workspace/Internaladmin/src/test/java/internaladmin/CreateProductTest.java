package internaladmin;


import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import excelhandling.ExcelData;
import sapphiros.Base;

public class CreateProductTest extends Base {
	
	static ExcelData reader=new ExcelData("/Users/prince/Documents/workspace/Internaladmin/src/main/java/exceldata/TestData.xlsx");
    static String ProductPrefix=reader.getCellData("ProData", "ProductPrefix", 2);
	static String ProductName=reader.getCellData("ProData", "Product Name", 2);
	static String ProductSynonyms=reader.getCellData("ProData", "ProductSynonyms", 2);
	static String StoreID=reader.getCellData("ProData", "StoreID", 2);
	static String Herotitle=reader.getCellData("ProData", "Herotitle", 2);
	static String Herodiscription=reader.getCellData("ProData", "Herodiscription", 2);
	static String ProductDesc=reader.getCellData("ProData", "ProductDesc", 2);
	
	@Test
	public void CreateProduct() throws InterruptedException
	{
		objectrepositoryinternal.CreateProduct Cp=new objectrepositoryinternal.CreateProduct(driver);
		//Cp.PGVmodule().click();
		//Cp.PGVimage().click();
		//Thread.sleep(2000);
		
		Cp.PGVpage().click();
        Cp.ProductPrefix().sendKeys(ProductPrefix);
        Cp.Productname().sendKeys(ProductName);
        Cp.Productsynonym().sendKeys(ProductSynonyms);
        Cp.ProductStoreID();
        Cp.Productherotitle().sendKeys(Herotitle);
        Cp.Productherodesc().sendKeys(Herodiscription);
        File ProductImage = new File("/Users/prince/Documents/workspace/Internaladmin/src/main/java/projectfiles/2mb.jpg");
		Cp.Productimage().sendKeys(ProductImage.getAbsolutePath());
		Thread.sleep(2000);
		Cp.Productinfo();
		Cp.Productsummary();
		Cp.Productdesc().sendKeys(ProductDesc);
		WebElement Selectcategory=Cp.ProductCategory();
		Select category=new Select(Selectcategory);
		category.selectByVisibleText("Energy");
		Cp.ProductVisibility().click();
		Cp.Productsave().click();
		        
}
}