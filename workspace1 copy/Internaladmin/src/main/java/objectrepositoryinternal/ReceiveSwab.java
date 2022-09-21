package objectrepositoryinternal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReceiveSwab {
	
	WebDriver driver;

	public ReceiveSwab(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[contains(text(),'SAMPLES')]")
	WebElement sampleprocess;
	
	@FindBy(xpath="//body/div[2]/div[4]/div[1]/div[1]/a[1]/div[1]/div[1]")
	WebElement receiveswab;
	
	@FindBy(id="swab-barcode")
	WebElement samplebarcode;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="device_country")
	WebElement devicecountry;
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	@FindBy(id="sex")
	WebElement sex;
	
	@FindBy(id="dateOfBirth")
	WebElement DOB;
	
	@FindBy(id="phoneNumber")
	WebElement phonenumber;
	
	@FindBy(id="country")
	WebElement addresscountry;
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="addressLine1")
	WebElement street;
	
	@FindBy(id="postalCode")
	WebElement zipcode;
	
	@FindBy(id="product_18")
	WebElement superherotickbox;
	
	@FindBy(id="save-customer1")
	WebElement Save;
	
	public WebElement SampleProcess()
	{
		return sampleprocess;
	}
	public WebElement ReceiveSwab()
	{
		return receiveswab;
	}
	public WebElement SampleBarcode()
	{
		return samplebarcode;
	}
	public WebElement Email()
	{
		return email;
	}
	public WebElement DeviceCountry()
	{
		return devicecountry;
	}
	public WebElement FirstName()
	{
		return firstname;
	}
	public WebElement LastName()
	{
		return lastname;
	}
	public WebElement Sex()
	{
		return sex;
	}
	public WebElement DOB()
	{
		return DOB;
	}
	public WebElement PhoneNumber()
	{
		return phonenumber;
	}
	public WebElement AddressCountry()
	{
		return addresscountry;
	}
	public WebElement State()
	{
		return state;
	}
	public WebElement City()
	{
		return city;
	}
	public WebElement Street()
	{
		return street;
	}
	public WebElement Zipcode()
	{
		return zipcode;
	}
	public WebElement ProductTickbox()
	{
		return superherotickbox;
	}
    public WebElement Save()
	{
		return Save;
	}



}
