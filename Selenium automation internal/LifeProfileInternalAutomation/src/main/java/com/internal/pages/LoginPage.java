package com.internal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.internal.base.TestBase;
import com.internal.objectrepository.LoginPageObjects;
import com.internal.datahandler.ExcelDataHandler;

public class LoginPage extends TestBase {
	
	ExcelDataHandler loginData = new ExcelDataHandler();

	static String filePath = "/Users/jithinkannoth/Desktop/InternalTestData.xlsx";

	public void login(WebDriver driver) throws Exception {
		
		String userName = loginData.getCellData(filePath, "Login", 2, 1);
		String password = loginData.getCellData(filePath, "Login", 2, 2);
		
		driver.findElement(By.name(LoginPageObjects.LOGIN_EMAILFIELD_NAME)).sendKeys("prince.cl@calpinetech.com");
		driver.findElement(By.name(LoginPageObjects.LOGIN_PASSWORDFIELD_NAME)).sendKeys("calpine123");
		driver.findElement(By.xpath(LoginPageObjects.LOGIN_SUBMITBUTTON_XPATH)).click();
	}

}
