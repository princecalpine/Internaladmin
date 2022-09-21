package com.internal.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.internal.base.TestBase;
import com.internal.datahandler.ExcelDataHandler;
import com.internal.objectrepository.PGVPageObjects;
import com.internal.objectrepository.ReceiveswabObjects;

import org.openqa.selenium.JavascriptExecutor;


public class PGVPage extends TestBase {
	ExcelDataHandler pgvData = new ExcelDataHandler();
	public void createGene(WebDriver driver) throws Exception {
		String geneName = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 1);
		String snpName = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 2);
		String snpComment = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 3);
		String snpshortDes = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 4);
		String Varient1 = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 5);
		String Varient1Des = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 6);
		String Varient1Short = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 7);
		String Varient2 = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 8);
		String Varient2Des = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 9);
		String Varient2Short = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 10);
		String Varient3= pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 11);
		String Varient3Des = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 12);
		String Varient3Short = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 13);
		String Refference = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 14);
		String weblink = pgvData.getCellData(TESTDATAEXCEL, "PGV", 2, 15);
		
		driver.findElement(By.xpath(PGVPageObjects.PGV_TAB_PATH)).click();
		//driver.findElement(By.xpath(PGVPageObjects.PGV_INSIDETAB_PATH)).click();
		//driver.findElement(By.xpath(PGVPageObjects.PGV_PGV_XPATH)).click();
        driver.findElement(By.id(PGVPageObjects.GENE_NAME_ID)).sendKeys(geneName);
		driver.findElement(By.xpath(PGVPageObjects.VISIBILITY_PATH)).click();
		driver.findElement(By.id(PGVPageObjects.SAVE_ID)).click();
		Thread.sleep(3000);
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		// Now you are in the popup window, perform necessary actions here
		driver.findElement(By.xpath(PGVPageObjects.GENE_POPUP_CLOSE_PATH)).click();
		driver.switchTo().window(parentWindowHandler);
	
	   
		
//		WebElement elementName = driver.findElement(By.id("createSNPVariantsUrl"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('type','text')", elementName);
		Thread.sleep(5000);
		//driver.findElement(By.id(PGVPageObjects.SNP_SAVE_ID)).click();
		driver.findElement(By.xpath(PGVPageObjects.SNP_NAME_XPATH)).sendKeys(snpName);
		driver.findElement(By.xpath(PGVPageObjects.SNP_COMMENTS_XPATH)).sendKeys(snpComment);
		driver.findElement(By.xpath(PGVPageObjects.SNP_SHORTDES_XPATH)).sendKeys(snpshortDes);
		driver.findElement(By.xpath(PGVPageObjects.SNP_VISIBILITY_XPATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.VARNAME_ONE_XPATH)).sendKeys(Varient1);
		new Select(driver.findElement(By.xpath(PGVPageObjects.VARQUAL_ONE_XPATH))).selectByVisibleText("Gifted");
		driver.findElement(By.xpath(PGVPageObjects.VARDESC_ONE_XPATH)).sendKeys(Varient1Des);
		driver.findElement(By.xpath(PGVPageObjects.SHORTCMT_ONE_XPATH)).sendKeys(Varient1Short);
		driver.findElement(By.xpath(PGVPageObjects.VARNAME_TWO_XPATH)).sendKeys(Varient2);
		new Select(driver.findElement(By.xpath(PGVPageObjects.VARQUAL_TWO_XPATH))).selectByVisibleText("Normal");
		driver.findElement(By.xpath(PGVPageObjects.VARDESC_TWO_XPATH)).sendKeys(Varient2Des);
		driver.findElement(By.xpath(PGVPageObjects.SHORTCMT_TWO_XPATH)).sendKeys(Varient2Short);
		driver.findElement(By.xpath(PGVPageObjects.VARNAME_THREE_XPATH)).sendKeys(Varient3);
		new Select(driver.findElement(By.xpath(PGVPageObjects.VARQUAL_THREE_XPATH))).selectByVisibleText("Adapt");
		driver.findElement(By.xpath(PGVPageObjects.VARDESC_THREE_XPATH)).sendKeys(Varient3Des);
		driver.findElement(By.xpath(PGVPageObjects.SHORTCMT_THREE_XPATH)).sendKeys(Varient3Short);
		driver.findElement(By.xpath(PGVPageObjects.SNP_SAVE_XPATH)).click();
		Thread.sleep(3000);
		String parentWindowHandler1 = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler1 = null;
		Set<String> handles1 = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator1 = handles.iterator();
		while (iterator.hasNext()) {
			subWindowHandler1 = iterator1.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		// Now you are in the popup window, perform necessary actions here
		
		driver.findElement(By.xpath(PGVPageObjects.VAR_POPUP_CLOSE_PATH)).click();
		driver.switchTo().window(parentWindowHandler1);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(PGVPageObjects.REFER_PATH_XPATH)).sendKeys(Refference);
		driver.findElement(By.xpath(PGVPageObjects.REFER_WEBLINK_XPATH)).sendKeys(weblink);
		driver.findElement(By.xpath(PGVPageObjects.REFER_ORDER_XPATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.REFER_SAVE_XPATH)).click();
		
		
		

	}
	

	public void createCategory(WebDriver driver) throws Exception {
		String CategoryName = pgvData.getCellData(TESTDATAEXCEL, "PGV", 8, 1);
		String CategoryDes = pgvData.getCellData(TESTDATAEXCEL, "PGV", 8, 2);
		String SelectGene = pgvData.getCellData(TESTDATAEXCEL, "PGV", 8, 3);
		String SelectSnp = pgvData.getCellData(TESTDATAEXCEL, "PGV", 8, 4);
	
		driver.findElement(By.xpath(PGVPageObjects.PGV_TAB_PATH)).click();
		//driver.findElement(By.xpath(PGVPageObjects.PGV_INSIDETAB_PATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.PGV_CATE_PATH)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(PGVPageObjects.CATE_NAME_ID)).sendKeys(CategoryName);
        driver.findElement(By.id(PGVPageObjects.CATE_IMAGE_ID)).sendKeys("/Users/prince/Desktop/Background.jpg");
		driver.findElement(By.id(PGVPageObjects.CATE_ICON_ID)).sendKeys("/Users/prince/Desktop/Background.jpg");
		//driver.findElement(By.id(PGVPageObjects.CATE_SORT_ID)).sendKeys("1");
		driver.findElement(By.id(PGVPageObjects.CATE_DESC_ID)).sendKeys(CategoryDes);
		Thread.sleep(2000);
		new Select(driver.findElement(By.id(PGVPageObjects.CATE_SELECT_GENE_ID))).selectByVisibleText(SelectGene);
		Thread.sleep(2000);
		new Select(driver.findElement(By.name("categorySNPs"))).selectByVisibleText(SelectSnp);
		driver.findElement(By.xpath(PGVPageObjects.CATE_VISIBILITY_XPATH)).click();
		driver.findElement(By.id(PGVPageObjects.CATE_SAVE_ID)).click();


		
		
	}

	public void createProduct(WebDriver driver) throws Exception {
		String ProductPrefix = pgvData.getCellData(TESTDATAEXCEL, "PGV", 8, 6);
		String ProductName = pgvData.getCellData(TESTDATAEXCEL, "PGV", 8, 7);
		String ProductSynonym = pgvData.getCellData(TESTDATAEXCEL, "PGV", 8, 8);
		String ProductID = pgvData.getCellData(TESTDATAEXCEL, "PGV", 8, 9);
		String HeroTitle = pgvData.getCellData(TESTDATAEXCEL, "PGV", 8, 10);
		String HeroDesc = pgvData.getCellData(TESTDATAEXCEL, "PGV", 8, 11);
		String ProductDesc = pgvData.getCellData(TESTDATAEXCEL, "PGV", 8, 12);
		String Category = pgvData.getCellData(TESTDATAEXCEL, "PGV", 8, 13);


		driver.findElement(By.xpath(PGVPageObjects.PGV_TAB_PATH)).click();
		//driver.findElement(By.xpath(PGVPageObjects.PGV_INSIDETAB_PATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.PGV_PRO_PATH)).click();
		Thread.sleep(3000);
		driver.findElement(By.id(PGVPageObjects.PRO_PREFIX_ID)).sendKeys(ProductPrefix);
		driver.findElement(By.id(PGVPageObjects.PRO_NAME_ID)). sendKeys(ProductName);
		driver.findElement(By.id(PGVPageObjects.PRO_SYNO_ID)). sendKeys(ProductSynonym);
		driver.findElement(By.id(PGVPageObjects.PRO_STORE_ID)). sendKeys(ProductID);
		driver.findElement(By.id(PGVPageObjects.PRO_HERO_ID)). sendKeys(HeroTitle);
		driver.findElement(By.id(PGVPageObjects.PRO_HERODES_ID)). sendKeys(HeroDesc);
		Thread.sleep(3000);
		driver.findElement(By.id(PGVPageObjects.PRO_ICON_ID)).sendKeys("/Users/prince/Desktop/Background.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id(PGVPageObjects.PRO_DES_ID)).sendKeys(ProductDesc);
		new Select(driver.findElement(By.name("productCategories"))).selectByVisibleText(Category);
		Thread.sleep(3000);
		driver.findElement(By.xpath(PGVPageObjects.PRO_VISIBILITY_XPATH)).click();
		driver.findElement(By.id(PGVPageObjects.PRO_SAVE_ID)).click();
	}

	public void createInapp(WebDriver driver) throws Exception {
		
		String Inappurl = pgvData.getCellData(TESTDATAEXCEL, "PGV", 13, 2);
		String InappLabel = pgvData.getCellData(TESTDATAEXCEL, "PGV", 13, 3);
		
		driver.findElement(By.xpath(PGVPageObjects.PGV_TAB_PATH)).click();
		//driver.findElement(By.xpath(PGVPageObjects.PGV_INSIDETAB_PATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.PGV_INAPP_PATH)).click();
		Thread.sleep(3000);
		new Select(driver.findElement(By.id(PGVPageObjects.INAPP_PRO_ID))).selectByVisibleText("SUPERHERO");
		Thread.sleep(3000);
		driver.findElement(By.id(PGVPageObjects.INAPP_IMAGE_ID)).sendKeys("/Users/prince/Desktop/Background.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id(PGVPageObjects.INAPP_URL_ID)).sendKeys(Inappurl);
		driver.findElement(By.id(PGVPageObjects.INAPP_LABEL_ID)).sendKeys(InappLabel);
		driver.findElement(By.id(PGVPageObjects.INAPP_SNP_SELECT_ID)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(PGVPageObjects.INAPP_VISIBILITY_XPATH)).click();
		driver.findElement(By.id(PGVPageObjects.INAPP_SAVE_ID)).click();

	
	}

}	

