package com.internal.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.internal.base.TestBase;

public class UtilityActionHelper extends TestBase {
	public ObjectLibrary objlib = new ObjectLibrary();

	public UtilityActionHelper() throws Orig3nException {
		super();
	}
/**
 * @author jithink
 * @param driver
 * @param elementLocator
 * @return
 * @throws AutobotsException
 */
	public WebElement waitForElement(WebDriver driver, String elementLocator) throws Orig3nException {

		WebElement element = null;
		try {
			if (driver != null) {
				WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
				By actualElement = objlib.findLocator(elementLocator);
				element = wait.until(ExpectedConditions.presenceOfElementLocated(actualElement));
			} else
				throw new Orig3nException("Driver not found");
		} catch (Exception lException) {
			throw new Orig3nException();
		}
		return element;
	}
	/**
	 * 
	 * @param driver
	 * @param elementLocator
	 * @return element
	 * @throws AutobotsException
	 */
	public WebElement waitForElement(WebDriver driver, By elementLocator)
			throws Orig3nException {
		WebElement element = null;
		try {
			if (driver != null) {
				WebDriverWait wait = new WebDriverWait(driver,
						timeOutInSeconds);
				element = wait.until(ExpectedConditions
						.presenceOfElementLocated(elementLocator));
			} else
				throw new Orig3nException("Driver not found");
		} catch (Exception lException) {
			throw new Orig3nException();
		}
		return element;
	}
}
