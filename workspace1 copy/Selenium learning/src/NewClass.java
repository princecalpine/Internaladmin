import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/Users/prince/Downloads/Seaport content/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://stage4.seaportdx.com/internal/user/login/");
	driver.findElement(By.xpath("//input[@placeholder='EMAIL']")).sendKeys("prince.cl@calpinetech.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("calpine123");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
