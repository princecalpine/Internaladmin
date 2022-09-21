package internaladmin;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import excelhandling.ExcelData;
import objectrepositoryinternal.CreateCategory;
import sapphiros.Base;

public class CreateCategoryTest extends Base {
	
	static ExcelData reader=new ExcelData("/Users/prince/Documents/workspace1/Internaladmin/src/main/java/exceldata/TestData.xlsx");

	static String catename=reader.getCellData("CateData", "CateName", 2);
	static String cateDesc=reader.getCellData("CateData", "CateDesc", 2);
	
	
	
	@Test
	public void CreateCategory() throws IOException, InterruptedException
	{  
		CreateCategory Cc=new CreateCategory(driver);
		//Cc.PGVmodule().click();
		//Cc.PGVimage().click();
		//Thread.sleep(2000);
		
		Cc.Createpage().click();
		Cc.Categoryname().sendKeys(catename);
		File categoryImage = new File("/Users/prince/Documents/workspace/Internaladmin/src/main/java/projectfiles/2mb.jpg");
		Cc.CategoryImage().sendKeys(categoryImage.getAbsolutePath());
		Thread.sleep(2000);
		File categoryIcon = new File("/Users/prince/Documents/workspace/Internaladmin/src/main/java/projectfiles/7Mb.jpg");
		Cc.CategoryIcon().sendKeys(categoryIcon.getAbsolutePath());
		Cc.CategoryDescripition().sendKeys(cateDesc);
		WebElement GeneDropdown=Cc.SelectGene();
		Thread.sleep(1000);
		Select dropdowngene=new Select(GeneDropdown);
		Thread.sleep(1000);
		dropdowngene.selectByVisibleText("ACE");
		Thread.sleep(1000);
		WebElement SNPDropdown=Cc.Selectsnp();
		Thread.sleep(1000);
		Select dropdownsnp=new Select(SNPDropdown);
		dropdownsnp.selectByVisibleText("rs4343");
		Cc.CategoryVisibility().click();
		Cc.CategorySave().click();
		Thread.sleep(3000);
		Cc.Categorypopupclose().click();
		Thread.sleep(3000);
		
		
		}

}
