package com.internal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.internal.base.TestBase;
import com.internal.datahandler.ExcelDataHandler;
import com.internal.objectrepository.InventoryPageObjects;
import com.internal.objectrepository.ReportPageObjects;;

public class ReportPage extends TestBase {

	public void uploadReport(WebDriver driver) throws Exception {
		driver.findElement(By.xpath(ReportPageObjects.REPORT_TAB_XPATH)).click();
		driver.findElement(By.xpath(ReportPageObjects.UPLOAD_REPORT_XPATH)).click();
		driver.findElement(By.id(ReportPageObjects.UPLOAD_REPORT_INPUT))
				.sendKeys("/Users/jithinkannoth/Desktop/Aura Results.txt");
		driver.findElement(By.id(ReportPageObjects.UPLOAD_REPORT_BUTTON)).click();

	}
}
