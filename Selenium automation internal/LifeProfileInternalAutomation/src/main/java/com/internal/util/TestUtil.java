package com.internal.util;

import java.io.InputStream;
import java.util.Properties;

public class TestUtil {
	// public void takeScreenshotAtEndOfTest() throws IOException {
	// File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	// String currentDir = System.getProperty("user.dir");
	//
	// FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" +
	// System.currentTimeMillis() + ".png"));
	// }

	public String getProperty(String propertyFileName, String property) throws Exception {
		String propertyValue = "";
		try {
			Properties props = new Properties();
			ClassLoader classLoader = TestUtil.class.getClassLoader();
			InputStream input = classLoader.getResourceAsStream(propertyFileName + ".properties");
			props.load(input);
			propertyValue = props.getProperty(property);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return propertyValue;
	}
}
