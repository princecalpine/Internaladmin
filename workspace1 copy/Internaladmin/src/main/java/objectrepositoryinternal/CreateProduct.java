package objectrepositoryinternal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProduct {
	
	WebDriver driver;

	public CreateProduct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'P/G/V')]")
	WebElement PGVheader;
	
	@FindBy(xpath="//body/div[2]/div[6]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
	WebElement PGVtile;
	
	@FindBy(xpath="//div[contains(text(),'Create Product')]")
	WebElement PGVpage;
	
	@FindBy(xpath="//input[@id='productPrefix']")
	WebElement Productprefix;
	
	@FindBy(xpath="//input[@id='productName']")
	WebElement Productname;
	
	@FindBy(xpath="//input[@id='productSynonym']")
	WebElement Productsynonym;
	
	@FindBy(xpath="//input[@id='storeProductId']")
	WebElement Productstoreid;
	
	@FindBy(xpath="//input[@id='productHeroTitle']")
	WebElement Productherotitle;
	
	@FindBy(xpath="//textarea[@id='productHeroDescriptor']")
	WebElement Productherodesc;
	
	@FindBy(xpath="//input[@id='productImage']")
	WebElement Productimage;
	
	@FindBy(xpath="//input[@id='btnAddinfo']")
	WebElement Productinfo;
	
	@FindBy(xpath="//input[@id='btnAddSummary']")
	WebElement Productsummary;
	
	@FindBy(xpath="//textarea[@id='productDescription']")
	WebElement Productdesc;
	
	@FindBy(xpath="//select[@id='productCategories']")
	WebElement Productcategories;
	
	@FindBy(xpath="//input[@id='id_chk_visible']")
	WebElement Productvisibility;
	
	@FindBy(xpath="//input[@id='btnSaveProduct']")
	WebElement Productsave;
	
	
	public WebElement PGVmodule()
	{
		return PGVheader;
	}
	public WebElement PGVimage()
	{
		return PGVtile;
	}
	public WebElement PGVpage()
	{
		return PGVpage ;
	}
	public WebElement ProductPrefix()
	{
		return Productprefix;
	}
	public WebElement Productname()
	{
		return Productname;
	}
	public WebElement Productsynonym()
	{
		return Productsynonym;
	}
	public WebElement ProductStoreID()
	{
		return Productstoreid;
	}
	public WebElement Productherotitle()
	{
		return Productherotitle;
	}
	public WebElement Productherodesc()
	{
		return Productherodesc;
	}
	public WebElement Productimage()
	{
		return Productimage;
	}
	public WebElement Productinfo()
	{
		return Productinfo;
	}
	public WebElement Productsummary()
	{
		return Productsummary;
	}
	public WebElement Productdesc()
	{
		return Productdesc;
	}
	public WebElement ProductCategory()
	{
		return Productcategories;
	}
	public WebElement ProductVisibility()
	{
		return Productvisibility;
	}
	public WebElement Productsave()
	{
		return Productsave;
	}

}


