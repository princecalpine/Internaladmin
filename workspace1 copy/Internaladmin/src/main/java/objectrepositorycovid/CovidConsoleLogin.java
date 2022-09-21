package objectrepositorycovid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CovidConsoleLogin {
	
	WebDriver driver;

	public CovidConsoleLogin(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'LOGIN')]")
	WebElement Loginlink;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-login[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]")
	WebElement Loginemail;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-orig3n-login[1]/div[1]/div[1]/p-card[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/span[1]/input[1]")
	WebElement Password;
	
	@FindBy(xpath="//span[contains(text(),'Login')]")
	WebElement Submit;
	
	
	public WebElement LoginLink()
	{
		return Loginlink;
	}
	public WebElement Email()
	{
		return Loginemail;
	}
	public WebElement Password()
	{
		return Password;
	}
	public WebElement Login()
	{
		return Submit;
	}





}
