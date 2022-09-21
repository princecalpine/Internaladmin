package com.internal.helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectLibrary {

	private final Properties properties;

	/**
	 * @author jithink
	 * @throws IOException
	 * @throws Exception
	 */
	public ObjectLibrary() throws Orig3nException {
		properties = new Properties();
		InputStream inputStream = null;
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @author jithink
	 * @param elementName
	 * @return
	 * @throws Orig3nException
	 */

	public By findLocator(String elementName) throws Orig3nException {
		By byV = null;
		int index;
		final String locatorname = properties.getProperty(elementName).trim();
		String locatorType = "";
		String locatorValue = "";
		index = locatorname.indexOf(">>>");
		if (index != -1) {
			locatorType = locatorname.split(">>>")[0];
			locatorValue = locatorname.split(">>>")[1];
			if ("id".equals(locatorType)) {
				byV = By.id(locatorValue);
			} else if ("xpath".equals(locatorType))
				byV = By.xpath(locatorValue);

		}
		return byV;
	}
}