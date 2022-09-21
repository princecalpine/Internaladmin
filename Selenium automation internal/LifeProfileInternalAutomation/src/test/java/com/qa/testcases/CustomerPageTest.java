package com.qa.testcases;

import org.testng.annotations.Test;

import com.internal.base.TestBase;
import com.internal.pages.CustomerPage;
import com.internal.pages.LoginPage;

public class CustomerPageTest extends TestBase {
	LoginPage loginPage = new LoginPage();
	CustomerPage customerPage = new CustomerPage();

	public CustomerPageTest() {
		super();
	}

	@Test(priority = 6)
	public void searchCustomerTest() throws Exception {
		loginPage.login(driver);
		customerPage.searchCustomer(driver);
	}

	/*
	 * Author:Harish 
	 * Customer operations from customer page
	 */
	@Test(priority = 1)
	public void customerPageTest() throws Exception {
		loginPage.login(driver);
		customerPage.CustomerSearch(driver);
		Thread.sleep(3000);
		//customerPage.CustomerEdit(driver);
		Thread.sleep(3000);
		customerPage.CustomerExport(driver);
		//customerPage.CustomerSelectAllInPageAndExport(driver);
		//customerPage.CustomerAllExport(driver);
	}
	
	@Test(priority = 2) 
	/*
	 * Author:Abin
	 * Customer operations from customer page
	 */
	public void viewCustomerInfo() throws Exception {
		//loginPage.login(driver);
		customerPage.viewInfo(driver);
		customerPage.viewUserInfo(driver);
		customerPage.verifyUserInfo(driver);
		customerPage.viewBuccalInfo(driver);
		customerPage.verifyBuccalInfo(driver);
		//inventoryPage.addSingleInventory(driver);
		
		
	}
}
