package com.internal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.internal.base.TestBase;
import com.internal.datahandler.ExcelDataHandler;
import com.internal.objectrepository.ReceiveswabObjects;

public class ReceiveswabMultipleUser extends TestBase {

	ExcelDataHandler receiveSwabData = new ExcelDataHandler();
	static String filePath = "/Users/jithinkannoth/Desktop/Receiveswab.xlsx";
	/*
	 * Author: Jithin To do receive swab for a set of User
	 */

	public void receiveaSwab(WebDriver driver) throws Exception {
		driver.findElement(By.xpath(ReceiveswabObjects.SAMPLESTABBUTTON_XPATH)).click();
		driver.findElement(By.xpath(ReceiveswabObjects.RECEIVESWABBUTTON_XPATH)).click();
		for (int i = 2; i < 5; i++) {
			String barcode = receiveSwabData.getCellData(filePath, "Receiveswab", i, 1);
			String userEmail = receiveSwabData.getCellData(filePath, "Receiveswab", i, 2);
			System.out.println(barcode);
			Thread.sleep(2000);
			driver.findElement(By.id(ReceiveswabObjects.SWABCODEINPUT_ID)).sendKeys(barcode);
			driver.findElement(By.id(ReceiveswabObjects.SWABCODEINPUT_ID)).sendKeys(Keys.ENTER);
			System.out.println(userEmail);
			Thread.sleep(2000);
			driver.findElement(By.id(ReceiveswabObjects.USER_EMAIL_ID)).sendKeys(userEmail);
			driver.findElement(By.id(ReceiveswabObjects.USER_EMAIL_ID)).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.id(ReceiveswabObjects.SUBMIT_BUTTON_ID)).click();
		}
	}
}
