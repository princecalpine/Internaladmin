package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internal.base.TestBase;
import com.internal.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage = new LoginPage();

	public LoginPageTest() {
		super();
	}


	@Test(priority = 1)        
	public void searchTest() throws Exception {
		loginPage.login(driver);
	}
}
