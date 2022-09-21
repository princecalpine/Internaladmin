package objectrepositoryinternal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CovidReportUpload {
	
	WebDriver driver;

	public CovidReportUpload(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'REPORTS')]")
	WebElement Reportsheader;
	
	@FindBy(xpath="//body[1]/div[2]/div[6]/div[1]/div[1]/a[1]/div[1]/span[1]")
	WebElement Reportstile;
	
	@FindBy(xpath="//a[contains(text(),'Covid-19 Report Upload')]")
	WebElement CovidReportlink;
	
	@FindBy(xpath="//select[@id='id_sel_upload_type']")
	WebElement Uploadtype;
	
	@FindBy(xpath="//input[@id='redwood']")
	WebElement Redwoodradiobutton;
	
	@FindBy(xpath="//input[@id='boston']")
	WebElement Bostonradiobutton;
	
	@FindBy(xpath="//input[@id='uploaded_report']")
	WebElement Uploadreport;
	
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
	public WebElement Coviduploadlink()
	{
		return CovidReportlink;
	}
	public WebElement Reporttype()
	{
		return Uploadtype;
	}
	public WebElement Redwoodradiobtn()
	{
		return Redwoodradiobutton;
	}
	public WebElement Bostonradiobtn()
	{
		return Bostonradiobutton;
	}
	public WebElement Selectreport()
	{
		return Uploadreport;
	}
	public WebElement Uploadbutton()
	{
		return Uploadbutton;
	}

}
