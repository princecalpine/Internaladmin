package objectrepositoryinternal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCategory {
	
	WebDriver driver;

	public CreateCategory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[contains(text(),'P/G/V')]")
	WebElement PGVheader;
	
	@FindBy(xpath="//body/div[2]/div[6]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
	WebElement PGVtile;
	
	@FindBy(xpath="//div[contains(text(),'Create Category')]")
	WebElement Categorymodule;
	
	@FindBy(id="categoryName")
	WebElement CateName;
	
	@FindBy(id="categoryImage")
	WebElement CateImage;
	
	@FindBy(id="categoryIcon")
	WebElement Cateicon;
	
	@FindBy(id="categoryDescription")
	WebElement Catedesc;
	
	@FindBy(xpath="//select[@id='categoryGenes']")
	WebElement SelectGene;
	
	@FindBy(xpath="//select[@id='snp']")
	WebElement Selectsnp;
	
	@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/input[1]")
	WebElement CVisibility;
	
	@FindBy(xpath="//input[@id='btnSaveCategory']")
	WebElement SaveCate;
	
	@FindBy(xpath="//body/div[@id='siteModal']/div[1]/div[1]/div[1]/div[1]/button[1]/img[1]")
	WebElement CategoryPopup;
	
	
	public WebElement PGVmodule()
	{
		return PGVheader;
	}
	public WebElement PGVimage()
	{
		return PGVtile;
	}
	public WebElement Createpage()
	{
		return Categorymodule;
	}
	public WebElement Categoryname()
	{
		return CateName;
	}
	public WebElement CategoryImage()
	{
		return CateImage;
	}
	public WebElement CategoryIcon()
	{
		return Cateicon;
	}
	public WebElement CategoryDescripition()
	{
		return Catedesc;
	}
	public WebElement SelectGene()
	{
		return SelectGene;
	}
	public WebElement Selectsnp()
	{
		return Selectsnp;
	}
	public WebElement CategoryVisibility()
	{
		return CVisibility;
	}
	public WebElement CategorySave()
	{
		return SaveCate;
	}
	public WebElement Categorypopupclose()
	{
		return CategoryPopup;
	}
	
}
