package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internal.base.TestBase;
import com.internal.pages.LoginPage;
import com.internal.pages.ReportPage;

public class ReportPageTest extends TestBase {
	LoginPage loginPage = new LoginPage();
	ReportPage reportPage = new ReportPage();

	public ReportPageTest() {
		super();
	}


	@Test(priority = 1)        
	public void searchTest() throws Exception {
		loginPage.login(driver);
		reportPage.uploadReport(driver);
		
	}
}
