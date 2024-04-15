package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarBrandModel extends BasePage {

	public CarBrandModel(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css=".volkswagen")
	WebElement carName;
	@FindBy(xpath="//li[normalize-space()='POLO']")
	WebElement carModelName;
	
	public void carBrand()
	{
		carName.click();
	} 
	public void carModel()
	{
		carModelName.click();
	}

}
