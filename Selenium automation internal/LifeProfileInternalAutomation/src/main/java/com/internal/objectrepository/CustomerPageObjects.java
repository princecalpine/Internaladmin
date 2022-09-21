package com.internal.objectrepository;

public class CustomerPageObjects {
	
	public static final String CUSTOMER_TAB_XPATH = "//span[contains(text(),'CUSTOMER')]"; 
	public static final String ADMIN_TAB_XPATH ="//span[contains(text(),'ADMIN')]";
	public static final String VIEW_ALL_CUSTOMER_XPATH = "//span[contains(text(),'View Existing Users')]";
	public static final String SEARCH_INPUT_ID = "searchCustomer";
	public static final String VIEW_EXISTING_USERS = "//span[contains(text(),'View Existing Users')]";
	public static final String SEARCH_INPUT = "searchCustomer";
	
	// Edit Customer
	public static final String EDIT_USER_IMG = "//a[@class='edit-user']//img";
	public static final String FIRST_NAME_INPUT = "firstName";
	public static final String LAST_NAME_INPUT = "lastName";
	public static final String SEX_INPUT = "sex";
	public static final String DATE_OF_BIRTH_INPUT = "dateOfBirth";
	public static final String PHONE_NUMBER_INPUT = "phoneNumber";
	public static final String COUNTRY_DROPDOWN = "country";
	public static final String STATE_INPUT = "state";
	public static final String ADDRESSLINE1_INPUT = "addressLine1";
	public static final String ADDRESSLINE2_INPUT = "addressLine2";
	public static final String CITY_INPUT = "city";
	public static final String POSTAL_CODE_INPUT = "postalCode";
	public static final String SAVE_BUTTON = "editCustomer";
	public static final String CUST_EDIT_SUCCESS_MSG = "User Successfully Edited";
	public static final String CUST_EDIT_SUCCESS_XPATH = "//h2[@class='success-message']";
	
	
	//Export Customer
	public static final String CUST_SELECT_CHECKBOX = "//input[@name='check[]']";
	public static final String CUST_SELECTALL_INPAGE_CHECKBOX = "select_all";
	public static final String CUST_SELECTALL_LINK = "//a[contains(text(),'Select all')]";
	public static final String CUST_EXPORT_BUTTON = "export";
	
	
	//New Vials
	public static final String CUST_VIALS_IMAGE = "//tr[1]//td[7]//a[1]//img[1]";
	public static final String CUST_EMPTY_CHECKBOX = "//tr[1]//td[4]//input[1]";
	
	
	/*
	 * Author Abin
	 */
	//public static final String CUSTOMER_TAB_XPATH = "//span[contains(text(),'CUSTOMER')]";
	public static final String CUSTOMER_VIEW_XPATH ="//span[contains(text(),'View Existing Users')]";
	public static final String SEARCH_ID ="searchCustomer";
	public static final String EXPORT_CSV_ID ="export";
	public static final String NAME_XPATH ="//a[contains(text(),'Test Five')]";
	public static final String EMAIL_XPATH ="";
	public static final String PRODUCT_XPATH ="";
	public static final String ADD_PRODUCT_XPATH ="";
	public static final String VIAL_XPATH ="//tr[1]//td[7]//a[1]//img[1]";
	public static final String INFO_XPATH ="//tr[1]//td[8]//a[1]//img[1]";
	public static final String EDIT_XPATH ="//tr[1]//td[8]//a[2]//img[1]";
	public static final String DELETE_XPATH ="//tr[1]//td[8]//a[3]//img[1]";
	
	//Customer Info Objects
	public static final String USER_TAB_ID ="regbuttonicon";
	public static final String USER_ID_XPATH= "//p[contains(text(),'d39fd097-053c-4e14-9bdf-f3f2514c6e6c')]";
	public static final String EMAIL_ID_XPATH="//p[contains(text(),'abinwwff@gmail.com')]";
	public static final String FNAME_XPATH="//p[contains(text(),'Abin T')]";
	public static final String LNAME_XPATH="//p[contains(text(),'Mathew')]";
	public static final String SEX_XPATH="//p[contains(text(),'Male')]";
	public static final String DOB_XPATH="//p[contains(text(),'1986-07-17')]";
	public static final String PHONE_XPATH="//p[contains(text(),'9447703079')]";
	public static final String ADDRESS_XPATH="//p[contains(text(),'Kottayam')]";
	public static final String CITY_XPATH="//p[contains(text(),'Chemalamatom P.O')]";
	public static final String STATE_XPATH="//p[contains(text(),'Kerala')]";
	public static final String POSTAL_XPATH="//p[contains(text(),'686506')]";
	public static final String COUNTRY_XPATH="//p[contains(text(),'India')]";
	public static final String COUNTRY_PURCHASE_XPATH="//p[contains(text(),'United States')]";
	public static final String ADDED_ON_XPATH="//p[contains(text(),'2017-06-06')]";
	public static final String PP_TOS_XPATH="//p[contains(text(),'2017-12-22')]";
	public static final String USER_ACCEPTED_SAMPLE_XPATH="";
	public static final String IS_VERIFIED_XPATH="//p[contains(text(),'True')]";
	public static final String OWNED_PRODUCT_XPATH="//p[contains(text(),'NUTRITION,')]";
	
	//Customer Info Buccal Swab Registaration Objects


	public static final String BUCCALSWAB_TAB_ID ="sampleregbuttonicon";
	public static final String DNA_TAB_ID ="vialbuttonicon";
	public static final String GENOTYPING_TAB_ID ="genobuttonicon";
	public static final String REPORTS_TAB_ID ="reportbuttonicon";
}
