package com.internal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.internal.base.TestBase;
import com.internal.datahandler.ExcelDataHandler;
import com.internal.objectrepository.InventoryPageObjects;;

public class InventoryPage extends TestBase{
	ExcelDataHandler inventoryData = new ExcelDataHandler();
	static String filePath = "/Users/jithinkannoth/Desktop/InternalTestData.xlsx";

	public void addSingleInventory(WebDriver driver) throws Exception {
		
		String barcode = inventoryData.getCellData(filePath, "Inventory", 2, 1);
		
		driver.findElement(By.xpath(InventoryPageObjects.INVENTORY_TAB_XPATH)).click();
		new Select(driver.findElement(By.id(InventoryPageObjects.PRODUCT_SELECTION_DROPDOWN_ID)))
				.selectByVisibleText("SUPERHERO");
		new Select(driver.findElement(By.id(InventoryPageObjects.OPTION_SELECTION_DROPDOWN_ID)))
				.selectByVisibleText("CVS");
		driver.findElement(By.id(InventoryPageObjects.BARCODE_INPUT_ID)).sendKeys(barcode);
		driver.findElement(By.id(InventoryPageObjects.BARCODE_INPUT_ID)).sendKeys(Keys.ENTER);

	}
	public void addMultipleInventory(WebDriver driver) throws Exception {
		
		String barcode = inventoryData.getCellData(filePath, "Inventory", 2, 1);
		driver.findElement(By.xpath(InventoryPageObjects.INVENTORY_TAB_XPATH)).click();
		driver.findElement(By.xpath(InventoryPageObjects.ADD_MULTIPLE_XAPATH)).click();
		driver.findElement(By.id(InventoryPageObjects.BARCODE_INPUT_ID)).sendKeys(barcode);
		driver.findElement(By.id(InventoryPageObjects.BARCODE_INPUT_ID)).sendKeys(Keys.ENTER);
		new Select(driver.findElement(By.id(InventoryPageObjects.OPTION_SELECTION_DROPDOWN_ID)))
				.selectByVisibleText("CVS");
		driver.findElement(By.xpath(InventoryPageObjects.OPEN_COREPRODUCTS_XPATH)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(InventoryPageObjects.BEAUTY_PRODUCT_ID)).click();
		driver.findElement(By.id(InventoryPageObjects.FITNESS_PRODUCT_ID)).click();
		driver.findElement(By.id(InventoryPageObjects.NUTRITION_PRODUCT_ID)).click();
		driver.findElement(By.id(InventoryPageObjects.SUBMIT_BUTTON_ID)).click();

	}

}
