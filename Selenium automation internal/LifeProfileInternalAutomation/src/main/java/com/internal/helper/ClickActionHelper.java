package com.internal.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.internal.base.TestBase;

public class ClickActionHelper extends TestBase {
	UtilityActionHelper utilityActionHelper = new UtilityActionHelper();
	ObjectLibrary objectLibrary = new ObjectLibrary();

	public ClickActionHelper() throws Exception {
	}

	/**
	 * @author jithink
	 * @param driver
	 * @param elementName
	 * @throws Exception
	 */
	public void click(WebDriver driver, String elementName) throws Exception {
		try {
			if (driver != null && elementName != null) {
				WebElement element = utilityActionHelper.waitForElement(driver, elementName);
				// WebElement element = objectLibrary.waitForElement(driver, elementName);
				element.click();
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
}