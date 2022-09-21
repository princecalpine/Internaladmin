package com.qa.testcases;

import org.testng.annotations.Test;

import com.internal.base.TestBase;
import com.internal.pages.LoginPage;
import com.internal.pages.ReceiveswabPage;
import com.internal.pages.ReceiveswabMultipleUser;

public class ReceiveSwabTest extends TestBase {
	ReceiveswabMultipleUser receiveswabUser = new ReceiveswabMultipleUser();
	ReceiveswabPage receiveswab = new ReceiveswabPage();
	LoginPage loginPage = new LoginPage();

	public ReceiveSwabTest() {
		super();
	}

	@Test(priority = 5)
	public void ReceiveswabTest() throws Exception {
		loginPage.login(driver);
		//receiveswabUser.receiveaSwab(driver);
		receiveswab.receiveaSwab(driver);
		receiveswab.extractSwab(driver);
	}

}
