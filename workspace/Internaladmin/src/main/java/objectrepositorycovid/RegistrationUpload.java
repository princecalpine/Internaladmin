package objectrepositorycovid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationUpload {
	
	WebDriver driver;

	public RegistrationUpload(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'REGISTRATION')]")
	WebElement Registrationlink;
	
	@FindBy(xpath="//span[contains(text(),'Upload Patients Data')]")
	WebElement UploadPatients;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-batch-registration[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/p-autocomplete[1]/span[1]/input[1]")
	WebElement SelectInstitution;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-batch-registration[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-fileupload[1]/div[1]/div[1]/span[1]/input[1]")
	WebElement Choosefile;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-batch-registration[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[3]/p-fileupload[1]/div[1]/div[1]/p-button[1]/button[1]/span[2]")
	WebElement Uploadbutton;
	
	public WebElement Registrationlink()
	{
		return Registrationlink;
	}
	public WebElement UploadPatients()
	{
		return UploadPatients;
	}
	public WebElement SelectInstitution()
	{
		return SelectInstitution;
	}
	public WebElement Choosefile()
	{
		return Choosefile;
	}
	public WebElement Uploadbutton()
	{
		return Uploadbutton;
	}
	
}