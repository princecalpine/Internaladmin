package com.internal.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.internal.base.TestBase;
import com.internal.objectrepository.PGVPageObjects;
import com.internal.objectrepository.ReceiveswabObjects;

import org.openqa.selenium.JavascriptExecutor;

public class PGVPage extends TestBase {

	public void createGene(WebDriver driver) throws Exception {
		
		driver.findElement(By.xpath(PGVPageObjects.PGV_TAB_PATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.PGV_INSIDETAB_PATH)).click();
		//driver.findElement(By.xpath(PGVPageObjects.PGV_PGV_XPATH)).click();
        driver.findElement(By.id(PGVPageObjects.GENE_NAME_ID)).sendKeys("abc21234");
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
		driver.findElement(By.xpath(PGVPageObjects.SNP_NAME_XPATH)).sendKeys("SnpABG");
		driver.findElement(By.xpath(PGVPageObjects.SNP_COMMENTS_XPATH)).sendKeys("Test Comment");
		driver.findElement(By.xpath(PGVPageObjects.SNP_SHORTDES_XPATH)).sendKeys("Test Short");
		driver.findElement(By.xpath(PGVPageObjects.SNP_VISIBILITY_XPATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.VARNAME_ONE_XPATH)).sendKeys("AC");
		new Select(driver.findElement(By.xpath(PGVPageObjects.VARQUAL_ONE_XPATH))).selectByVisibleText("Gifted");
		driver.findElement(By.xpath(PGVPageObjects.VARDESC_ONE_XPATH)).sendKeys("Var1");
		driver.findElement(By.xpath(PGVPageObjects.SHORTCMT_ONE_XPATH)).sendKeys("short1");
		driver.findElement(By.xpath(PGVPageObjects.VARNAME_TWO_XPATH)).sendKeys("AD");
		new Select(driver.findElement(By.xpath(PGVPageObjects.VARQUAL_TWO_XPATH))).selectByVisibleText("Normal");
		driver.findElement(By.xpath(PGVPageObjects.VARDESC_TWO_XPATH)).sendKeys("Var2");
		driver.findElement(By.xpath(PGVPageObjects.SHORTCMT_TWO_XPATH)).sendKeys("short2");
		driver.findElement(By.xpath(PGVPageObjects.VARNAME_THREE_XPATH)).sendKeys("AK");
		new Select(driver.findElement(By.xpath(PGVPageObjects.VARQUAL_THREE_XPATH))).selectByVisibleText("Adapt");
		driver.findElement(By.xpath(PGVPageObjects.VARDESC_THREE_XPATH)).sendKeys("Var3");
		driver.findElement(By.xpath(PGVPageObjects.SHORTCMT_THREE_XPATH)).sendKeys("short3");
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
		driver.findElement(By.xpath(PGVPageObjects.REFER_PATH_XPATH)).sendKeys("Refer");
		driver.findElement(By.xpath(PGVPageObjects.REFER_WEBLINK_XPATH)).sendKeys("www.google.com");
		driver.findElement(By.xpath(PGVPageObjects.REFER_ORDER_XPATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.REFER_SAVE_XPATH)).click();
		
		
		

	}
	
	public void createCategory(WebDriver driver) throws Exception {
		
		driver.findElement(By.xpath(PGVPageObjects.PGV_TAB_PATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.PGV_INSIDETAB_PATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.PGV_CATE_PATH)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(PGVPageObjects.CATE_NAME_ID)).sendKeys("TESTCATE3");
        driver.findElement(By.id(PGVPageObjects.CATE_IMAGE_ID)).sendKeys("/Users/prince/Desktop/Background.jpg");
		driver.findElement(By.id(PGVPageObjects.CATE_ICON_ID)).sendKeys("/Users/prince/Desktop/Background12.jpg");
		//driver.findElement(By.id(PGVPageObjects.CATE_SORT_ID)).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.id(PGVPageObjects.CATE_DESC_ID)).sendKeys("Test");
		Thread.sleep(2000);
		new Select(driver.findElement(By.id(PGVPageObjects.CATE_SELECT_GENE_ID))).selectByVisibleText("ACE");
		Thread.sleep(2000);
		new Select(driver.findElement(By.name("categorySNPs"))).selectByVisibleText("rs4343");
		driver.findElement(By.xpath(PGVPageObjects.CATE_VISIBILITY_XPATH)).click();
		driver.findElement(By.id(PGVPageObjects.CATE_SAVE_ID)).click();



		
		
	}
	
	public void createProduct(WebDriver driver) throws Exception {
		driver.findElement(By.xpath(PGVPageObjects.PGV_TAB_PATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.PGV_INSIDETAB_PATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.PGV_PRO_PATH)).click();
		Thread.sleep(3000);
		driver.findElement(By.id(PGVPageObjects.PRO_PREFIX_ID)).sendKeys("TESTPRO1");
		driver.findElement(By.id(PGVPageObjects.PRO_NAME_ID)). sendKeys("TESTPRODUCT A1");
		driver.findElement(By.id(PGVPageObjects.PRO_SYNO_ID)). sendKeys("TESTPRO ABCD");
		driver.findElement(By.id(PGVPageObjects.PRO_STORE_ID)). sendKeys("3423423434");
		driver.findElement(By.id(PGVPageObjects.PRO_HERO_ID)). sendKeys("TEST ID1");
		driver.findElement(By.id(PGVPageObjects.PRO_HERODES_ID)). sendKeys("TEST ID1");
		Thread.sleep(3000);
		driver.findElement(By.id(PGVPageObjects.PRO_ICON_ID)). sendKeys("/Users/prince/Desktop/Background.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id(PGVPageObjects.PRO_DES_ID)).sendKeys("Test Description 1");
		new Select(driver.findElement(By.name("productCategories"))).selectByVisibleText("Diet");
		Thread.sleep(3000);
		driver.findElement(By.xpath(PGVPageObjects.PRO_VISIBILITY_XPATH)).click();
		driver.findElement(By.id(PGVPageObjects.PRO_SAVE_ID)).click();
		
		
	}
		
	public void createInapp(WebDriver driver) throws Exception {
		driver.findElement(By.xpath(PGVPageObjects.PGV_TAB_PATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.PGV_INSIDETAB_PATH)).click();
		driver.findElement(By.xpath(PGVPageObjects.PGV_INAPP_PATH)).click();
		Thread.sleep(3000);
		new Select(driver.findElement(By.id(PGVPageObjects.INAPP_PRO_ID))).selectByVisibleText("SUPERHERO");
		Thread.sleep(3000);
		driver.findElement(By.id(PGVPageObjects.INAPP_IMAGE_ID)).sendKeys("/Users/prince/Desktop/Background.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id(PGVPageObjects.INAPP_URL_ID)).sendKeys("http://google.com");
		driver.findElement(By.id(PGVPageObjects.INAPP_LABEL_ID)).sendKeys("Buy Now");
		driver.findElement(By.id(PGVPageObjects.INAPP_SNP_SELECT_ID)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(PGVPageObjects.INAPP_VISIBILITY_XPATH)).click();
		driver.findElement(By.id(PGVPageObjects.INAPP_SAVE_ID)).click();
	
	}

}	
