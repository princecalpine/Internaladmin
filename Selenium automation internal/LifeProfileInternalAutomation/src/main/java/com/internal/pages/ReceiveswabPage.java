package com.internal.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.internal.base.TestBase;
import com.internal.datahandler.ExcelDataHandler;
import com.internal.objectrepository.InventoryPageObjects;
import com.internal.objectrepository.ReceiveswabObjects;
import org.openqa.selenium.JavascriptExecutor;

public class ReceiveswabPage extends TestBase {

	ExcelDataHandler receiveSwabData = new ExcelDataHandler();
	static String filePath = "/Users/jithinkannoth/Desktop/InternalTestData.xlsx";

	public void receiveaSwab(WebDriver driver) throws Exception {

		String barcode = receiveSwabData.getCellData(filePath, "Registration", 2, 1);
		System.out.println(barcode);
		String userEmail = receiveSwabData.getCellData(filePath, "Registration", 2, 1);
		String deviceCountry = receiveSwabData.getCellData(filePath, "Registration", 2, 1);
		String firstName = receiveSwabData.getCellData(filePath, "Registration", 2, 1);
		String lastName = receiveSwabData.getCellData(filePath, "Registration", 2, 1);
		String sex = receiveSwabData.getCellData(filePath, "Registration", 2, 1);
		String dob = receiveSwabData.getCellData(filePath, "Registration", 2, 1);
		String phoneNumber = receiveSwabData.getCellData(filePath, "Registration", 2, 1);
		String addressCountry = receiveSwabData.getCellData(filePath, "Registration", 2, 1);
		String state = receiveSwabData.getCellData(filePath, "Registration", 2, 1);
		String city = receiveSwabData.getCellData(filePath, "Registration", 2, 1);
		String street = receiveSwabData.getCellData(filePath, "Registration", 2, 1);
		String zip = receiveSwabData.getCellData(filePath, "Registration", 2, 1);

		Thread.sleep(2000);
		driver.findElement(By.xpath(ReceiveswabObjects.SAMPLESTABBUTTON_XPATH)).click();
		driver.findElement(By.xpath(ReceiveswabObjects.RECEIVESWABBUTTON_XPATH)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(ReceiveswabObjects.SWABCODEINPUT_ID)).sendKeys("TESTBJ34");
		driver.findElement(By.id(ReceiveswabObjects.SWABCODEINPUT_ID)).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id(ReceiveswabObjects.USER_EMAIL_ID)).sendKeys("orig3ntesting@gmail.com");
		driver.findElement(By.id(ReceiveswabObjects.USER_EMAIL_ID)).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
//		new Select(driver.findElement(By.id(ReceiveswabObjects.DEVICE_COUNTRY_ID)))
//		.selectByVisibleText("United States");
//		driver.findElement(By.id(ReceiveswabObjects.FIRSTNAME_ID)).sendKeys("Fname");
//		driver.findElement(By.id(ReceiveswabObjects.LASTNAME_ID)).sendKeys("Lname");
//		new Select(driver.findElement(By.id(ReceiveswabObjects.SEX_ID)))
//		.selectByVisibleText("Male");
//		WebElement elementName = driver.findElement(By.id(ReceiveswabObjects.DOB_ID));
//		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", elementName);
//		driver.findElement(By.id(ReceiveswabObjects.DOB_ID)).sendKeys("2019-05-01");
//		driver.findElement(By.id(ReceiveswabObjects.PHONE_NUMBER_ID)).sendKeys("232434523");
//		new Select(driver.findElement(By.id(ReceiveswabObjects.ADDRESS_COUNTRY_ID)))
//		.selectByVisibleText("United States");
//		new Select(driver.findElement(By.id(ReceiveswabObjects.STATE_ID)))
//		.selectByVisibleText("Alaska");
//		driver.findElement(By.id(ReceiveswabObjects.CITY_ID)).sendKeys("City");
//		driver.findElement(By.id(ReceiveswabObjects.STREET_ID)).sendKeys("Street");
//		driver.findElement(By.id(ReceiveswabObjects.ZIP_ID)).sendKeys("12324");
//		Thread.sleep(2000);
//		driver.findElement(By.id(ReceiveswabObjects.USER_EMAIL_ID)).sendKeys(Keys.ENTER);
		driver.findElement(By.id(ReceiveswabObjects.SUBMIT_BUTTON_ID)).click();
		Thread.sleep(3000);

	}

	public void extractSwab(WebDriver driver) throws Exception {

		driver.navigate().back();
		driver.findElement(By.xpath(ReceiveswabObjects.EXTRACT_SWAB_XPATH)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(ReceiveswabObjects.PLATE_BARCODE_ID)).sendKeys("TESTJ");
		driver.findElement(By.id(ReceiveswabObjects.PLATE_BARCODE_ID)).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id(ReceiveswabObjects.SWAB_BARCODE_ID)).sendKeys("TESTBJ34");
		driver.findElement(By.id(ReceiveswabObjects.SWAB_BARCODE_ID)).sendKeys(Keys.ENTER);

	}

}
