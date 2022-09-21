package com.internal.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.internal.base.TestBase;
import com.internal.datahandler.ExcelDataHandler;
import com.internal.objectrepository.CustomerPageObjects;
import com.internal.objectrepository.LoginPageObjects;
import com.relevantcodes.extentreports.model.Test;
import org.openqa.selenium.JavascriptExecutor;

public class CustomerPage extends TestBase {
	ExcelDataHandler custData = new ExcelDataHandler();
	ExcelDataHandler userInfo = new ExcelDataHandler();

	String filePath = "/Users/jithinkannoth/Desktop/InternalTestData.xlsx";
	String custEmail = custData.getCellData(filePath, "Customer", 3, 1);
	public static String userId, emailID, fName, lName, sex, dob, phone, address, city, state, postal, country,
			countryOfPurchase, addedOn, ppTos, userAccepted, isVerified, ownedProducts;
	public static String barcode, products, registeredFrom, comments, registeredDate;

	public void searchCustomer(WebDriver driver) throws Exception {

		driver.findElement(By.xpath(CustomerPageObjects.CUSTOMER_TAB_XPATH)).click();
		driver.findElement(By.xpath(CustomerPageObjects.VIEW_ALL_CUSTOMER_XPATH)).click();
		driver.findElement(By.id(CustomerPageObjects.SEARCH_INPUT_ID)).sendKeys("jithinkannoth@gmail.com");
		driver.findElement(By.id(CustomerPageObjects.SEARCH_INPUT_ID)).sendKeys(Keys.ENTER);

	}

	/*
	 * Author:Harish Search for customer from customer page
	 */
	public void CustomerSearch(WebDriver driver) throws Exception {

		driver.findElement(By.xpath(CustomerPageObjects.CUSTOMER_TAB_XPATH)).click();
		driver.findElement(By.xpath(CustomerPageObjects.VIEW_EXISTING_USERS)).click();
		driver.findElement(By.id(CustomerPageObjects.SEARCH_INPUT)).sendKeys(custEmail);
		driver.findElement(By.id(CustomerPageObjects.SEARCH_INPUT)).sendKeys(Keys.ENTER);

	}

	/*
	 * Author:Harish Edit and Save a customer information from customer page
	 */
	public void CustomerEdit(WebDriver driver) throws Exception {

		String custFirst = custData.getCellData(filePath, "Customer", 3, 2);
		String custLast = custData.getCellData(filePath, "Customer", 3, 3);
		// String custGender = custData.getCellData(filePath, "Customer", 3, 4);
		String custDOB = custData.getCellData(filePath, "Customer", 3, 5);
		String custPhone = custData.getCellData(filePath, "Customer", 3, 6);
		String custCountry = custData.getCellData(filePath, "Customer", 3, 7);
		String custState = custData.getCellData(filePath, "Customer", 3, 8);
		String custAddressLine1 = custData.getCellData(filePath, "Customer", 3, 9);
		String custAddressLine2 = custData.getCellData(filePath, "Customer", 3, 10);
		String custCity = custData.getCellData(filePath, "Customer", 3, 11);
		String custPostalCode = custData.getCellData(filePath, "Customer", 3, 12);

		driver.findElement(By.xpath(CustomerPageObjects.EDIT_USER_IMG)).click();
		Thread.sleep(3000);
		driver.findElement(By.id(CustomerPageObjects.FIRST_NAME_INPUT)).clear();
		driver.findElement(By.id(CustomerPageObjects.FIRST_NAME_INPUT)).sendKeys(custFirst);
		driver.findElement(By.id(CustomerPageObjects.LAST_NAME_INPUT)).clear();
		driver.findElement(By.id(CustomerPageObjects.LAST_NAME_INPUT)).sendKeys(custLast);

		WebElement DOB_INPUT = driver.findElement(By.id(CustomerPageObjects.DATE_OF_BIRTH_INPUT));
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", DOB_INPUT);
		driver.findElement(By.id(CustomerPageObjects.DATE_OF_BIRTH_INPUT)).clear();
		driver.findElement(By.id(CustomerPageObjects.DATE_OF_BIRTH_INPUT)).sendKeys(custDOB);
		driver.findElement(By.id(CustomerPageObjects.PHONE_NUMBER_INPUT)).clear();
		driver.findElement(By.id(CustomerPageObjects.PHONE_NUMBER_INPUT)).sendKeys(custPhone);
		new Select(driver.findElement(By.id(CustomerPageObjects.COUNTRY_DROPDOWN))).selectByVisibleText(custCountry);
		driver.findElement(By.id(CustomerPageObjects.STATE_INPUT)).clear();
		driver.findElement(By.id(CustomerPageObjects.STATE_INPUT)).sendKeys(custState);
		driver.findElement(By.id(CustomerPageObjects.ADDRESSLINE1_INPUT)).clear();
		driver.findElement(By.id(CustomerPageObjects.ADDRESSLINE1_INPUT)).sendKeys(custAddressLine1);
		driver.findElement(By.id(CustomerPageObjects.ADDRESSLINE2_INPUT)).clear();
		driver.findElement(By.id(CustomerPageObjects.ADDRESSLINE2_INPUT)).sendKeys(custAddressLine2);
		driver.findElement(By.id(CustomerPageObjects.CITY_INPUT)).clear();
		driver.findElement(By.id(CustomerPageObjects.CITY_INPUT)).sendKeys(custCity);
		driver.findElement(By.id(CustomerPageObjects.POSTAL_CODE_INPUT)).clear();
		driver.findElement(By.id(CustomerPageObjects.POSTAL_CODE_INPUT)).sendKeys(custPostalCode);
		driver.findElement(By.id(CustomerPageObjects.SAVE_BUTTON)).click();

	}

	/*
	 * Author:Harish Search and export a customer info from customer page
	 */
	public void CustomerExport(WebDriver driver) throws Exception {

		Thread.sleep(2000);
		driver.findElement(By.id(CustomerPageObjects.SEARCH_INPUT)).sendKeys(custEmail);
		driver.findElement(By.id(CustomerPageObjects.SEARCH_INPUT)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(CustomerPageObjects.CUST_SELECT_CHECKBOX)).click();
		driver.findElement(By.id(CustomerPageObjects.CUST_EXPORT_BUTTON)).click();

	}

	/*
	 * Author:Harish Export customer, a complete page from customer page
	 */
	public void CustomerSelectAllInPageAndExport(WebDriver driver) throws Exception {

		driver.navigate().refresh();
		driver.findElement(By.id(CustomerPageObjects.CUST_SELECTALL_INPAGE_CHECKBOX)).click();
		driver.findElement(By.id(CustomerPageObjects.CUST_EXPORT_BUTTON)).click();

	}

	/*
	 * Author:Harish Export all customers from customer page
	 */
	
	public void CustomerAllExport(WebDriver driver) throws Exception {

		driver.navigate().refresh();
		driver.findElement(By.id(CustomerPageObjects.CUST_SELECTALL_INPAGE_CHECKBOX)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(CustomerPageObjects.CUST_SELECTALL_LINK)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(CustomerPageObjects.CUST_EXPORT_BUTTON)).click();

	}

	/*
	 * Author:Abin Customer operations from customer page
	 */
	public void viewInfo(WebDriver driver) throws Exception {
		driver.findElement(By.xpath(CustomerPageObjects.ADMIN_TAB_XPATH)).click();
		driver.findElement(By.xpath(CustomerPageObjects.CUSTOMER_TAB_XPATH)).click();
		driver.findElement(By.xpath(CustomerPageObjects.CUSTOMER_VIEW_XPATH)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(CustomerPageObjects.SEARCH_ID)).sendKeys("abinwwff@gmail.com");
		driver.findElement(By.id(CustomerPageObjects.SEARCH_ID)).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(CustomerPageObjects.INFO_XPATH)).click();
		driver.findElement(By.id(CustomerPageObjects.USER_TAB_ID)).click();
	}

	/*
	 * Author:Abin Customer operations from customer page
	 */
	public void viewUserInfo(WebDriver driver) {

		userId = driver.findElement(By.xpath(CustomerPageObjects.USER_ID_XPATH)).getText();
		emailID = driver.findElement(By.xpath(CustomerPageObjects.EMAIL_ID_XPATH)).getText();
		fName = driver.findElement(By.xpath(CustomerPageObjects.FNAME_XPATH)).getText();
		lName = driver.findElement(By.xpath(CustomerPageObjects.LNAME_XPATH)).getText();
		sex = driver.findElement(By.xpath(CustomerPageObjects.SEX_XPATH)).getText();
		dob = driver.findElement(By.xpath(CustomerPageObjects.DOB_XPATH)).getText();
		phone = driver.findElement(By.xpath(CustomerPageObjects.PHONE_XPATH)).getText();
		address = driver.findElement(By.xpath(CustomerPageObjects.ADDRESS_XPATH)).getText();
		city = driver.findElement(By.xpath(CustomerPageObjects.CITY_XPATH)).getText();
		state = driver.findElement(By.xpath(CustomerPageObjects.STATE_XPATH)).getText();
		postal = driver.findElement(By.xpath(CustomerPageObjects.POSTAL_XPATH)).getText();

		country = driver.findElement(By.xpath(CustomerPageObjects.COUNTRY_XPATH)).getText();
		countryOfPurchase = driver.findElement(By.xpath(CustomerPageObjects.COUNTRY_PURCHASE_XPATH)).getText();
		addedOn = driver.findElement(By.xpath(CustomerPageObjects.ADDED_ON_XPATH)).getText();
		ppTos = driver.findElement(By.xpath(CustomerPageObjects.PP_TOS_XPATH)).getText();
		// userAccepted=
		// driver.findElement(By.xpath(CustomerPageObjects.USER_ACCEPTED_SAMPLE_XPATH)).getText();
		isVerified = driver.findElement(By.xpath(CustomerPageObjects.IS_VERIFIED_XPATH)).getText();
		ownedProducts = driver.findElement(By.xpath(CustomerPageObjects.OWNED_PRODUCT_XPATH)).getText();


		System.out.println(userId);
		System.out.println(emailID);
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(sex);
		System.out.println(dob);
		System.out.println(phone);
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
		System.out.println(postal);
	}

	/*
	 * Author:Abin Customer operations from customer page
	 */
	public void verifyUserInfo(WebDriver driver) {
		String cellUserId = userInfo.getCellData(filePath, "User Info", 2, 1);
		String cellEmailid = userInfo.getCellData(filePath, "User Info", 2, 2);
		String cellFname = userInfo.getCellData(filePath, "User Info", 2, 3);
		String cellLname = userInfo.getCellData(filePath, "User Info", 2, 4);
		String cellSex = userInfo.getCellData(filePath, "User Info", 2, 5);
		String cellDob = userInfo.getCellData(filePath, "User Info", 2, 6);
		String cellPhone = userInfo.getCellData(filePath, "User Info", 2, 7);
		String cellAddress = userInfo.getCellData(filePath, "User Info", 2, 8);
		String cellCity = userInfo.getCellData(filePath, "User Info", 2, 9);
		String cellState = userInfo.getCellData(filePath, "User Info", 2, 10);
		String cellPostal = userInfo.getCellData(filePath, "User Info", 2, 11);
		String cellCountry = userInfo.getCellData(filePath, "User Info", 2, 12);
		String cellCountryOfPurchase = userInfo.getCellData(filePath, "User Info", 2, 13);
		String cellAddedOn = userInfo.getCellData(filePath, "User Info", 2, 14);
		String cellppTos = userInfo.getCellData(filePath, "User Info", 2, 15);
		String celluserAccepted = userInfo.getCellData(filePath, "User Info", 2, 16);
		String cellisVerified = userInfo.getCellData(filePath, "User Info", 2, 17);
		String cellownedProducts = userInfo.getCellData(filePath, "User Info", 2, 18);

		assertEquals(userId, cellUserId);
		assertEquals(emailID, cellEmailid);
		assertEquals(fName, cellFname);
		assertEquals(lName, cellLname);
		assertEquals(sex, cellSex);
		assertEquals(dob, cellDob);
		assertEquals(phone, cellPhone);
		assertEquals(address, cellAddress);
		assertEquals(city, cellCity);
		assertEquals(state, cellState);
		assertEquals(postal, cellPostal);

		assertEquals(country, cellCountry);
		assertEquals(countryOfPurchase, cellCountryOfPurchase);
		assertEquals(addedOn, cellAddedOn);
		assertEquals(ppTos, cellppTos);
		// assertEquals(userAccepted,celluserAccepted);
		assertEquals(isVerified, cellisVerified);
		assertEquals(ownedProducts, cellownedProducts);

	}

	public void viewBuccalInfo(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	/*
	 * Author:Abin Customer operations from customer page
	 */

	public void verifyBuccalInfo(WebDriver driver) {
		// TODO Auto-generated method stub
		barcode = userInfo.getCellData(filePath, "User Info", 2, 1);
		products = userInfo.getCellData(filePath, "User Info", 2, 1);
		registeredFrom = userInfo.getCellData(filePath, "User Info", 2, 1);
		comments = userInfo.getCellData(filePath, "User Info", 2, 1);
		registeredDate = userInfo.getCellData(filePath, "User Info", 2, 1);
	}

}
