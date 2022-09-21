package com.qa.testcases;

import org.testng.annotations.Test;

import com.internal.base.TestBase;
import com.internal.pages.LoginPage;
import com.internal.pages.PGVPage;

public class PGVPageTest extends TestBase {
	PGVPage pgvPage = new PGVPage();
	LoginPage loginPage = new LoginPage();
	
	
	public PGVPageTest() {
		super();
	}
	@Test(priority = 10)        
	public void createGene() throws Exception {
		loginPage.login(driver);
		//pgvPage.createGene(driver);
		//pgvPage.createCategory(driver);
		//pgvPage.createProduct(driver);
		pgvPage.createInapp(driver);
	}

}
