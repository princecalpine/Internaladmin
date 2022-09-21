package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internal.base.TestBase;
import com.internal.pages.InventoryPage;
import com.internal.pages.LoginPage;

public class InventoryPageTest extends TestBase {
	LoginPage loginPage = new LoginPage();
	InventoryPage inventoryPage = new InventoryPage();
	public InventoryPageTest() {
		super();
	}
	@Test(priority = 2)        
	public void addSingleInventory() throws Exception {
		loginPage.login(driver);
		inventoryPage.addSingleInventory(driver);
		
	}
	@Test(priority = 3)
	public void addMultipleInventory() throws Exception {
		inventoryPage.addMultipleInventory(driver);
		
	}
}
