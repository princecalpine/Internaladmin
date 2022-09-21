package com.internal.helper;

import org.testng.log4testng.Logger;

public class Orig3nException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(Orig3nException.class);

	public Orig3nException() {
	}
/**
 * @author jithink
 * @param message
 * @throws Orig3nException
 */
	public Orig3nException(String message) throws Orig3nException {
		super(message);
		log.warn(message);
	}
}
