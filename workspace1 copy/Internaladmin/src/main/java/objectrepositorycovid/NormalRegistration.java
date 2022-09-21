package objectrepositorycovid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NormalRegistration {
	
	WebDriver driver;

	public NormalRegistration(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'REGISTRATION')]")
	WebElement Registrationlink;
	
	@FindBy(xpath="//span[contains(text(),'Register Test')]")
	WebElement Registertest;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/form[1]/div[1]/div[1]/span[1]/p-autocomplete[1]/span[1]/input[1]")
	WebElement Institution;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/form[1]/div[1]/div[2]/span[1]/p-dropdown[1]/div[1]/div[3]/label[1]")
	WebElement Testtype;
	
	@FindBy(xpath="//body[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/form[1]/div[2]/div[1]/span[1]/input[1]")
	WebElement MRNumber;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/form[1]/div[2]/div[2]/span[1]/input[1]")
	WebElement PatientID;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/form[1]/div[3]/div[2]/span[1]/p-dropdown[1]/div[1]/div[3]/label[1]")
	WebElement Sampletype;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/form[1]/div[4]/div[1]/span[1]/p-chips[1]/div[1]/ul[1]/li[1]/input[1]")
	WebElement Sample;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[1]/div[1]/span[1]/input[1]")
	WebElement Firstname;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[1]/div[2]/span[1]/input[1]")
	WebElement Lastname;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[1]/div[3]/span[1]/p-inputmask[1]/input[1]")
	WebElement DOB;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[1]/div[4]/span[1]/input[1]")
	WebElement Phonenumber;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[2]/span[3]/p-checkbox[1]/div[1]/div[2]")
	WebElement Racewhite;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[4]/span[2]/p-checkbox[1]/div[1]/div[2]")
	WebElement Ethnicity;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[5]/div[1]/span[1]/input[1]")
	WebElement Email;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[5]/div[2]/span[1]/p-dropdown[1]/div[1]/div[3]/label[1]")
	WebElement Gender;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[6]/div[1]/span[1]/input[1]")
	WebElement Street;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[6]/div[2]/span[1]/input[1]")
	WebElement City;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[6]/div[3]/span[1]/p-autocomplete[1]/span[1]/input[1]")
	WebElement State;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[6]/div[4]/span[1]/input[1]")
	WebElement zipcode;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/div[1]/div[1]/p-fileupload[1]/span[1]/input[1]")
	WebElement UserIDimage;
	
	@FindBy(xpath="//body[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[3]/div[2]/div[1]/form[1]/div[1]/div[1]/span[1]/input[1]")
	WebElement Secondarystreet;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[3]/div[2]/div[1]/form[1]/div[1]/div[2]/span[1]/input[1]")
	WebElement Secondarycity;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[3]/div[2]/div[1]/form[1]/div[1]/div[3]/span[1]/p-autocomplete[1]/span[1]/input[1]")
	WebElement Secondarystate;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[3]/div[2]/div[1]/form[1]/div[1]/div[4]/span[1]/input[1]")
	WebElement Secondaryzipcode;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[4]/div[2]/div[1]/form[1]/div[1]/span[3]/p-checkbox[1]/div[1]/div[2]")
	WebElement Insurancetype;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[4]/div[2]/div[1]/form[1]/div[2]/div[1]/span[1]/input[1]")
	WebElement Insurancename;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[4]/div[2]/div[1]/form[1]/div[2]/div[2]/span[1]/input[1]")
	WebElement Policyno;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[4]/div[2]/div[1]/form[1]/div[2]/div[3]/span[1]/input[1]")
	WebElement Groupnumber;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[4]/div[2]/div[1]/form[1]/div[2]/div[4]/span[1]/p-dropdown[1]/div[1]/div[3]/label[1]")
	WebElement Relationship;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[4]/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]")
	WebElement Policyholdername;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[4]/div[2]/div[1]/form[1]/div[3]/div[2]/span[1]/p-inputmask[1]/input[1]")
	WebElement PolicyDOB;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[4]/div[2]/div[1]/div[1]/div[1]/p-fileupload[1]/span[1]/input[1]")
	WebElement InsuranceImage;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[5]/div[2]/div[1]/form[1]/div[1]/div[1]/span[1]/input[1]")
	WebElement Servicefacility;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[5]/div[2]/div[1]/form[1]/div[1]/div[2]/span[1]/input[1]")
	WebElement Servicenpi;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[5]/div[2]/div[1]/form[1]/div[2]/div[1]/span[1]/input[1]")
	WebElement Npiaddress;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[5]/div[2]/div[1]/form[1]/div[2]/div[2]/span[1]/input[1]")
	WebElement Npicity;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[5]/div[2]/div[1]/form[1]/div[2]/div[3]/span[1]/p-autocomplete[1]/span[1]/input[1]")
	WebElement NpiState;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[5]/div[2]/div[1]/form[1]/div[2]/div[4]/span[1]/input[1]")
	WebElement npizip;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[6]/div[2]/div[1]/form[1]/div[1]/div[1]/span[1]/input[1]")
	WebElement Phyfirstname;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[6]/div[2]/div[1]/form[1]/div[1]/div[2]/span[1]/input[1]")
	WebElement Phylastname;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[6]/div[2]/div[1]/form[1]/div[1]/div[3]/span[1]/input[1]")
	WebElement Phyphonenumber;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[6]/div[2]/div[1]/form[1]/div[2]/div[1]/span[1]/input[1]")
	WebElement Phyemail;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[6]/div[2]/div[1]/form[1]/div[2]/div[2]/span[1]/input[1]")
	WebElement Phynpi;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[6]/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]")
	WebElement Phyaddress;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[6]/div[2]/div[1]/form[1]/div[4]/div[1]/span[1]/input[1]")
	WebElement Phycity;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[6]/div[2]/div[1]/form[1]/div[4]/div[2]/span[1]/p-autocomplete[1]/span[1]/input[1]")
	WebElement Phystate;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[6]/div[2]/div[1]/form[1]/div[4]/div[3]/span[1]/input[1]")
	WebElement Phyzipcode;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[6]/div[2]/div[1]/form[1]/div[5]/div[1]/span[1]/textarea[1]")
	WebElement Phynotes;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-register[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/button[1]/span[1]")
	WebElement Register;
	
	public WebElement Registrationlink()
	{
		return Registrationlink;
	}
	public WebElement Registertest()
	{
		return Registertest;
	}
	public WebElement Institution()
	{
		return Institution;
	}
	public WebElement Testtype()
	{
		return Testtype;
	}
	public WebElement MRNumber()
	{
		return MRNumber;
	}
	public WebElement PatientID()
	{
		return PatientID;
	}
	public WebElement Sampletype()
	{
		return Sampletype;
	}
	public WebElement Sample()
	{
		return Sample;
	}
	public WebElement Firstname()
	{
		return Firstname;
	}
	public WebElement Lastname()
	{
		return Lastname;
	}
	public WebElement DOB()
	{
		return DOB;
	}
	public WebElement Phonenumber()
	{
		return Phonenumber;
	}
	public WebElement Racewhite()
	{
		return Racewhite;
	}
	public WebElement Ethnicity()
	{
		return Ethnicity;
	}
	public WebElement email()
	{
		return Email;
	}
	public WebElement Gender()
	{
		return Gender;
	}
	public WebElement street()
	{
		return Street;
	}
	public WebElement city()
	{
		return City;
	}
	public WebElement State()
	{
		return State;
	}
	public WebElement zipcode()
	{
		return zipcode;
	}
	public WebElement Userimage()
	{
		return UserIDimage;
	}
	public WebElement Secondarystreet()
	{
		return Secondarystreet;
	}
	public WebElement Secondarycity()
	{
		return Secondarycity;
	}
	public WebElement Secondarystate()
	{
		return Secondarystate;
	}
	public WebElement Secondaryzipcode()
	{
		return Secondaryzipcode;
	}
	public WebElement Insutype()
	{
		return Insurancetype;
	}
	public WebElement Insuname()
	{
		return Insurancename;
	}
	public WebElement Policyno()
	{
		return Policyno;
	}
	public WebElement Groupnumber()
	{
		return Groupnumber;
	}
	public WebElement Relationship()
	{
		return Relationship;
	}
	public WebElement Policyholder()
	{
		return Policyholdername;
	}
	public WebElement PolicyDOB()
	{
		return PolicyDOB;
	}
	public WebElement Insuimage()
	{
		return InsuranceImage;
	}
	public WebElement Servicefacility()
	{
		return Servicefacility;
	}
	public WebElement Servicenpi()
	{
		return Servicenpi;
	}
	public WebElement Npiaddress()
	{
		return Npiaddress;
	}
	public WebElement Npicity()
	{
		return Npicity;
	}
	public WebElement Npistate()
	{
		return NpiState;
	}
	public WebElement Npizip()
	{
		return npizip;
	}
	public WebElement Phyfirstname()
	{
		return Phyfirstname;
	}
	public WebElement Phylastname()
	{
		return Phylastname;
	}
	public WebElement Phyphonenumber()
	{
		return Phyphonenumber;
	}
	public WebElement Phyemail()
	{
		return Phyemail;
	}
	public WebElement Phynpi()
	{
		return Phynpi;
	}
	public WebElement Phyaddress()
	{
		return Phyaddress;
	}
	public WebElement Phycity()
	{
		return Phycity;
	}
	public WebElement Phystate()
	{
		return Phystate;
	}
	public WebElement Phyzipcode()
	{
		return Phyzipcode;
	}
	public WebElement Phynotes()
	{
		return Phynotes;
	}
	public WebElement Register()
	{
		return Register;
	}
	
	
}

	