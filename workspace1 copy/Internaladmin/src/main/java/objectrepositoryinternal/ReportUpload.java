package objectrepositoryinternal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportUpload {
	
	WebDriver driver;

	public ReportUpload(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'REPORTS')]")
	WebElement Reportsheader;
	
	@FindBy(xpath="//body[1]/div[2]/div[6]/div[1]/div[1]/a[1]/div[1]/span[1]")
	WebElement Reportstile;
	
	@FindBy(xpath="//a[contains(text(),'Covid-19 Report Upload')]")
	WebElement Covidreportlink;
	
	@FindBy(xpath="//select[@id='id_sel_upload_type']")
	WebElement Uploadfiletype;
	
	@FindBy(xpath="//input[@id='redwood']")
	WebElement Redwoodbutton;
	
	@FindBy(xpath="//input[@id='boston']")
	WebElement Bostonbutton;
	
	@FindBy(xpath="//input[@id='uploaded_report']")
	WebElement Normalreportupload;
	
	@FindBy(xpath="//input[@id='btnUpload']")
	WebElement Uploadbutton;
	
	public WebElement ReportModule()
	{
		return Reportsheader;
	}
	public WebElement Reportstile()
	{
		return Reportstile;
	}
	public WebElement CovidReportLink()
	{
		return Covidreportlink;
	}
	public WebElement Uploadfiletype()
	{
		return Uploadfiletype;
	}
	public WebElement Redwoodbutton()
	{
		return Redwoodbutton;
	}
	public WebElement Bostonbutton()
	{
		return Bostonbutton;
	}
	public WebElement NormalReport()
	{
		return Normalreportupload;
	}
	public WebElement Uploadbutton()
	{
		return Uploadbutton;
	}
	


}
