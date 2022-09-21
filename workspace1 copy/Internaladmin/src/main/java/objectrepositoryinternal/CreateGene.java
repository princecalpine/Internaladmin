package objectrepositoryinternal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateGene {
	
	WebDriver driver;

	public CreateGene(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[contains(text(),'P/G/V')]")
	WebElement PGVheader;
	
	@FindBy(xpath="//body/div[2]/div[6]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
	WebElement PGVtile;
	
	@FindBy(name="geneName")
	WebElement GeneName;
	
	@FindBy(name="is_visible")
	WebElement GeneVisibility;
	
	@FindBy(id="btnSaveGene")
	WebElement SaveButton;
	
	@FindBy(xpath="//body/div[@id='siteModal']/div[1]/div[1]/div[1]/div[1]/button[1]/img[1]")
	WebElement GenePopUpClose;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
	WebElement SnpName;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/textarea[1]")
	WebElement SnpComment;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/textarea[2]")
	WebElement SnpDescription;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement SnpVisibility;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/input[2]")
	WebElement Varient1;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/select[1]")
	WebElement Qualifier1;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/textarea[3]")
	WebElement Vdescription1;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/textarea[4]")
	WebElement ShortComment1;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/input[3]")
	WebElement Varient2;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/select[2]")
	WebElement Qualifier2;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/textarea[5]")
	WebElement Vdescription2;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/textarea[6]")
	WebElement ShortComment2;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/input[4]")
	WebElement Varient3;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/select[3]")
	WebElement Qualifier3;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/textarea[7]")
	WebElement Vdescription3;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/textarea[8]")
	WebElement ShortComment3;
	
	@FindBy(xpath="//input[@id='btnSaveSnpAndVariants']")
	WebElement SaveSnp;
	
	@FindBy(xpath="//body/div[@id='siteModal']/div[1]/div[1]/div[1]/div[1]/button[1]/img[1]")
	WebElement SnpPopUp;
	
	@FindBy(xpath="//textarea[@id='reference']")
	WebElement Reference;
	
	@FindBy(xpath="//input[@id='weblink']")
	WebElement WebLink;
	
	@FindBy(xpath="//input[@id='btnSaveReference']")
	WebElement SaveReference;
	
	

	
	public WebElement PGVmodule()
	{
		return PGVheader;
	}
	public WebElement PGVimage()
	{
		return PGVtile;
	}
	public WebElement Gene()
	{
		return GeneName;
	}
	public WebElement GVisibility()
	{
		return GeneVisibility;
	}
	public WebElement Save()
	{
		return SaveButton;
	}
	public WebElement GenePopUp()
	{
		return GenePopUpClose;
	}
	public WebElement SnpName()
	{
		return SnpName;
	}
	public WebElement SnpComment()
	{
		return SnpComment;
	}
	public WebElement SnpDesc()
	{
		return SnpDescription;
	}
	public WebElement SnpVisibility()
	{
		return SnpVisibility;
	}
	public WebElement Varient1()
	{
		return Varient1;
	}
	public WebElement VQualifier1()
	{
		return Qualifier1;
	}
	public WebElement VDesc1()
	{
		return Vdescription1;
	}
	public WebElement VShortComment1()
	{
		return ShortComment1;
	}
	public WebElement Varient2()
	{
		return Varient2;
	}
	public WebElement VQualifier2()
	{
		return Qualifier2;
	}
	public WebElement VDesc2()
	{
		return Vdescription2;
	}
	public WebElement VShortComment2()
	{
		return ShortComment2;
	}
	public WebElement Varient3()
	{
		return Varient3;
	}
	public WebElement VQualifier3()
	{
		return Qualifier3;
	}
	public WebElement VDesc3()
	{
		return Vdescription3;
	}
	public WebElement VShortComment3()
	{
		return ShortComment3;
	}
	public WebElement SaveSNP()
	{
		return SaveSnp;
	}
	public WebElement SNPPopUp()
	{
		return SnpPopUp;
	}
	public WebElement Reference()
	{
		return Reference;
	}
	public WebElement Weblink()
	{
		return WebLink;
	}
	public WebElement SaveReference()
	{
		return SaveReference;
	}
	
	}
