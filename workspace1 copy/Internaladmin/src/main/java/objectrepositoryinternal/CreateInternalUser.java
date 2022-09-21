package objectrepositoryinternal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateInternalUser {
	
	WebDriver driver;

	public CreateInternalUser(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/div[2]/div[6]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
	WebElement Createuser;
	
	@FindBy(id="email")
	WebElement Useremail;
	
	@FindBy(id="first_name")
	WebElement Firstname;
	
	@FindBy(id="last_name")
	WebElement Lastname;
	
	@FindBy(id="lab_location")
	WebElement Location;
	
	@FindBy(id="internal_admin_full_access")
	WebElement Fullaccess;
	
	@FindBy(id="other_available_roles")
	WebElement Diagonisticroles;
	
	@FindBy(xpath="//span[@id='other_rgt_arrow']")
	WebElement Diagonisticselection;
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement Internalusersave;
	
	
	public WebElement Internaluserpage()
	{
		return Createuser;
	}
	public WebElement UserEmail()
	{
		return Useremail;
	}
	public WebElement Firstname()
	{
		return Firstname;
	}
	public WebElement Lastname()
	{
		return Lastname;
	}
	public WebElement LabLocation()
	{
		return Location;
	}
	public WebElement Checkboxfullaccess()
	{
		return Fullaccess;
	}
	public WebElement Diagonisticroles()
	{
		return Diagonisticroles;
	}
	public WebElement DiaSelectionarrow()
	{
		return Diagonisticselection;
	}
	public WebElement UserSave()
	{
		return Internalusersave;
	}
}
