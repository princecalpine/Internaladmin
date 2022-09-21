package objectrepositoryinternal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExtractSwab {
	
	WebDriver driver;

	public ExtractSwab(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Sample Pairing')]")
	WebElement samplepairing;
	
	@FindBy(xpath="//span[contains(text(),'EXTRACT SWAB')]")
	WebElement extractswabtile;

	@FindBy(id="plate_barcode")
	WebElement platebarcode;
	
	@FindBy(id="swab_barcode")
	WebElement swabbarcode;
	
	
	
	public WebElement SamplePairinglink()
	{
		return samplepairing;
	}
	public WebElement Extractswabimage()
	{
		return extractswabtile;
	}
	public WebElement Platebarcode()
	{
		return platebarcode;
	}
	public WebElement Swabbarcode()
	{
		return swabbarcode;
	}

}

	
	
