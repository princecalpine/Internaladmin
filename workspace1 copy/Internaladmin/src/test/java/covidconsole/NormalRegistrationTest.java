package covidconsole;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import excelhandling.ExcelData;

import java.io.File;
import java.io.IOException;
import java.util.List;

import sapphiros.Base;

public class NormalRegistrationTest extends Base {
	
	
	static ExcelData reader=new ExcelData("/Users/prince/Documents/workspace/Internaladmin/src/main/java/exceldata/CovidConsole.xlsx");
	
	static String MRNumber=reader.getCellData("PatientRegistration", "MRNumber", 2);
	static String PatientID=reader.getCellData("PatientRegistration", "PatientID", 2);
	static String SampleID=reader.getCellData("PatientRegistration", "SampleID", 2);
	static String FirstName=reader.getCellData("PatientRegistration", "FirstName", 2);
	static String LastName=reader.getCellData("PatientRegistration", "LastName", 2);
	static String DOB=reader.getCellData("PatientRegistration", "DOB", 2);
	static String Phonenumber=reader.getCellData("PatientRegistration", "Phonenumber", 2);
	static String Email=reader.getCellData("PatientRegistration", "Email", 2);
	static String Street=reader.getCellData("PatientRegistration", "Street", 2);
	static String City=reader.getCellData("PatientRegistration", "City", 2);
	static String Zipcode=reader.getCellData("PatientRegistration", "Zipcode", 2);
	static String Secondarystreet=reader.getCellData("PatientRegistration", "Secondary street", 2);
	static String Secondarycity=reader.getCellData("PatientRegistration", "Secondary city", 2);
	static String Secondaryzipcode=reader.getCellData("PatientRegistration", "Secondary zipcode", 2);
	static String Insurancecompany=reader.getCellData("PatientRegistration", "Insurance company", 2);
	static String Policynumber=reader.getCellData("PatientRegistration", "Policy number", 2);
	static String Groupnumber=reader.getCellData("PatientRegistration", "Group number", 2);
	static String Policyholder=reader.getCellData("PatientRegistration", "Policy holder", 2);
	static String InsuredDOB=reader.getCellData("PatientRegistration", "Insured DOB", 2);
	static String Servicefacility=reader.getCellData("PatientRegistration", "Service facility", 2);
	static String Servicenpi=reader.getCellData("PatientRegistration", "Service npi", 2);
	static String ServiceAddress=reader.getCellData("PatientRegistration", "Service Address", 2);
	static String ServiceCity=reader.getCellData("PatientRegistration", "Service City", 2);
	static String Servicezipcode=reader.getCellData("PatientRegistration", "Service zipcode", 2);
	static String Phyfirstname=reader.getCellData("PatientRegistration", "Phy firstname", 2);
	static String Phylastname=reader.getCellData("PatientRegistration", "Phy lastname", 2);
	static String Phyphone=reader.getCellData("PatientRegistration", "Phy phone", 2);
	static String Phyemail=reader.getCellData("PatientRegistration", "Phy email", 2);
	static String Phynpi=reader.getCellData("PatientRegistration", "Phy npi", 2);
	static String Phyaddress=reader.getCellData("PatientRegistration", "Phy address", 2);
	static String Phycity=reader.getCellData("PatientRegistration", "Phy city", 2);
	static String Phyzipcode=reader.getCellData("PatientRegistration", "Phyzipcode", 2);
	static String Phynotes=reader.getCellData("PatientRegistration", "Phynotes", 2);
	
	
	
	@Test
	  public static void NormalRegistration() throws IOException, InterruptedException
	{
		objectrepositorycovid.NormalRegistration Nr=new objectrepositorycovid.NormalRegistration(driver);
		Nr.Registrationlink().click();
		Nr.Registertest().click();
		Nr.Institution().sendKeys("Calpine m");
		Thread.sleep(1000);
		List<WebElement> options= driver.findElements(By.cssSelector("li[role=option] span"));
		for(WebElement option :options)
       {
     if(option.getText().equalsIgnoreCase("Calpine ms"))
       {
    option.click();
    	break;
    	}
	}
		Nr.Testtype().click();
		Thread.sleep(1000);
		List<WebElement> testtype= driver.findElements(By.cssSelector("li[role=option] span"));
		for(WebElement option :testtype)
       {
     if(option.getText().equalsIgnoreCase("Covid Test"))
       {
    option.click();
    	break;
    	}
	}
		Nr.MRNumber().sendKeys(MRNumber);
		Nr.PatientID().sendKeys(PatientID);
		Nr.Sampletype().click();
		Thread.sleep(1000);
		List<WebElement> swabtype= driver.findElements(By.cssSelector("li[role=option] span"));
		for(WebElement option :swabtype)
       {
     if(option.getText().equalsIgnoreCase("Nasopharyngeal Swab"))
       {
    option.click();
    	break;
    	}
	}
		Nr.Sample().sendKeys(SampleID);
		Nr.Firstname().sendKeys(FirstName);
		Nr.Lastname().sendKeys(LastName);
		Nr.DOB().sendKeys(DOB);
		Nr.Phonenumber().sendKeys(Phonenumber);
		Nr.Racewhite().click();
		Nr.Ethnicity().click();
		Nr.email().sendKeys(Email);
		Nr.Gender().click();
		Thread.sleep(1000);
		List<WebElement> gender= driver.findElements(By.cssSelector("li[role=option] span"));
		for(WebElement option :gender)
       {
     if(option.getText().equalsIgnoreCase("Male"))
       {
    option.click();
    	break;
    	}
	}
		Nr.street().sendKeys(Street);
		Nr.city().sendKeys(City);
		Nr.State().sendKeys("Massa");
		Thread.sleep(1000);
		List<WebElement> patientstate= driver.findElements(By.cssSelector("li[role=option] span"));
		for(WebElement option :patientstate)
       {
     if(option.getText().equalsIgnoreCase("Massachusetts"))
       {
    option.click();
    	break;
    	}
	}
		Nr.zipcode().sendKeys(Zipcode);
		File photoid = new File("/Users/prince/Documents/workspace/Internaladmin/src/main/java/projectfiles/2mb.jpg");
		Nr.Userimage().sendKeys(photoid.getAbsolutePath());
		Thread.sleep(1000);
		Nr.Secondarystreet().sendKeys(Secondarystreet);
		Nr.Secondarycity().sendKeys(Secondarycity);
		Nr.Secondarystate().sendKeys("Massa");
		Thread.sleep(1000);
		List<WebElement> secondarystate= driver.findElements(By.cssSelector("li[role=option] span"));
		for(WebElement option :secondarystate)
       {
     if(option.getText().equalsIgnoreCase("Massachusetts"))
       {
    option.click();
    	break;
    	}
	}
		Nr.Secondaryzipcode().sendKeys(Secondaryzipcode);
		Nr.Insutype().click();
		Nr.Insuname().sendKeys(Insurancecompany);
		Nr.Policyno().sendKeys(Policynumber);
		Nr.Groupnumber().sendKeys(Groupnumber);
		Nr.Relationship().click();
		Thread.sleep(1000);
		List<WebElement> relationship= driver.findElements(By.cssSelector("li[role=option] span"));
		for(WebElement option :relationship)
       {
     if(option.getText().equalsIgnoreCase("Self"))
       {
    option.click();
    	break;
    	}
	}
	   Nr.Policyholder().sendKeys(Policyholder);
	   Nr.PolicyDOB().sendKeys(InsuredDOB);
	   File insuranceid = new File("/Users/prince/Documents/workspace/Internaladmin/src/main/java/projectfiles/7Mb.jpg");
		Nr.Insuimage().sendKeys(insuranceid.getAbsolutePath());
		Thread.sleep(1000);
		Nr.Servicefacility().sendKeys(Servicefacility);
		Nr.Servicenpi().sendKeys(Servicenpi);
		Nr.Npiaddress().sendKeys(ServiceAddress);
		Nr.Npicity().sendKeys(ServiceCity);
		Nr.Npistate().sendKeys("Massa");
		Thread.sleep(1000);
		List<WebElement> npistate= driver.findElements(By.cssSelector("li[role=option] span"));
		for(WebElement option :npistate)
       {
     if(option.getText().equalsIgnoreCase("Massachusetts"))
       {
    option.click();
    	break;
    	}
	}
		Nr.Npizip().sendKeys(Servicezipcode);
		Nr.Phyfirstname().sendKeys(Phyfirstname);
		Nr.Phylastname().sendKeys(Phylastname);
		Nr.Phyphonenumber().sendKeys(Phyphone);
		Nr.Phyemail().sendKeys(Phyemail);
		Nr.Phynpi().sendKeys(Phynpi);
		Nr.Phyaddress().sendKeys(Phyaddress);
		Nr.Phycity().sendKeys(Phycity);
		Nr.Phystate().sendKeys("Massa");
		Thread.sleep(1000);
		List<WebElement> phystate= driver.findElements(By.cssSelector("li[role=option] span"));
		for(WebElement option :phystate)
       {
     if(option.getText().equalsIgnoreCase("Massachusetts"))
       {
    option.click();
    	break;
    	}
       }
        Nr.Phyzipcode().sendKeys(Phyzipcode);
        Nr.Phynotes().sendKeys(Phynotes);
        Thread.sleep(2000);
        Nr.Register().click();
		
		
	}
	}
