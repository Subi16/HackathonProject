package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarCityRto extends BasePage{

	public CarCityRto(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[@id='spn6']  | //li //span[contains(text(),'Chennai')]")
	WebElement city;
	@FindBy(xpath="//ul//ul//li[7]")
	WebElement rto; 
	
	public void citySelection()
	{
		city.click();
	} 
	public void carRto()
	{
		rto.click();
	}
}
