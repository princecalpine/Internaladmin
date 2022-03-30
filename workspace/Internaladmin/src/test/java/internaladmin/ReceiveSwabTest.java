package internaladmin;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import excelhandling.ExcelData;
import sapphiros.Base;

public class ReceiveSwabTest extends Base {
	
	static ExcelData reader=new ExcelData("/Users/prince/Documents/workspace/Internaladmin/src/main/java/exceldata/TestData.xlsx");
    static String SampleBarcode=reader.getCellData("Receiveswab", "Sample Barcode", 2);
    static String Email=reader.getCellData("Receiveswab", "Email", 2);
    static String FirstName=reader.getCellData("Receiveswab", "First Name", 2);
    static String LastName=reader.getCellData("Receiveswab", "Last Name", 2);
    static String DOB=reader.getCellData("Receiveswab", "DOB", 2);
    static String Phonenumber=reader.getCellData("Receiveswab", "Phone number", 2);
    static String City=reader.getCellData("Receiveswab", "City", 2);
    static String Street=reader.getCellData("Receiveswab", "Street", 2);
    static String Zipcode=reader.getCellData("Receiveswab", "Zipcode", 2);
    
    @Test
	public void Receiveswab() throws IOException, InterruptedException
	{  
    objectrepositoryinternal.ReceiveSwab Rs=new objectrepositoryinternal.ReceiveSwab(driver);
    Rs.SampleProcess().click();
    Rs.ReceiveSwab().click();
    Rs.SampleBarcode().sendKeys(SampleBarcode);
    Rs.SampleBarcode().sendKeys(Keys.ENTER);
    Rs.Email().sendKeys(Email);
    Rs.Email().sendKeys(Keys.ENTER);
    Thread.sleep(1000);
    WebElement Countrydropdown=Rs.DeviceCountry();
	Select dropdown=new Select(Countrydropdown);
	dropdown.selectByVisibleText("United States");
	Rs.DeviceCountry().sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	Rs.FirstName().sendKeys(FirstName);
	Rs.LastName().sendKeys(LastName);
	WebElement Sexdropdown=Rs.Sex();
	Select sdropdown=new Select(Sexdropdown);
	sdropdown.selectByVisibleText("Male");
	Rs.PhoneNumber().sendKeys(Phonenumber);
	WebElement AddressCountrydropdown=Rs.AddressCountry();
	Select cdropdown=new Select(AddressCountrydropdown);
	cdropdown.selectByVisibleText("United States");
	Thread.sleep(1000);
	WebElement Statesdropdown=Rs.State();
	Select stdropdown=new Select(Statesdropdown);
	stdropdown.selectByVisibleText("Massachusetts");
	Rs.City().sendKeys(City);
	Rs.Street().sendKeys(Street);
	Rs.Zipcode().sendKeys(Zipcode);
	Rs.Save().click();
	Thread.sleep(3000);
	
	
	
    
    
	
	

}
}
