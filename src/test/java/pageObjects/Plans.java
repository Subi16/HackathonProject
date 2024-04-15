package pageObjects;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class Plans extends BasePage{
 
	public Plans(WebDriver driver) {

		super(driver);

	}
	@FindBy(xpath = ("//*[@id=\"studentTrip\"]"))
	WebElement Studenttrip;

	public void plans() {
		Studenttrip.click();
	}
}
