package objectrepositoryinternal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	
	WebDriver driver;

	public InventoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[contains(text(),'INVENTORY')]")
	WebElement inventorymodule;
	
	@FindBy(id="product")
	WebElement productselection;
	
	@FindBy(xpath="//input[@id='swab-barcode']")
	WebElement sample;
	
	@FindBy(xpath="//a[contains(text(),'Upload Barcode')]")
	WebElement uploadbarcode;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[2]/div[1]/div[1]/a[1]")
	WebElement multipleproducts;
	
	
	public WebElement Inventorymodule()
	{
		return inventorymodule;
	}
	public WebElement Productselection()
	{
		return productselection;
	}
	public WebElement Sample()
	{
		return sample;
	}
	public WebElement Uploadbarcode()
	{
		return uploadbarcode;
	}
	public WebElement Multipleproducts()
	{
		return multipleproducts;
	}

}
