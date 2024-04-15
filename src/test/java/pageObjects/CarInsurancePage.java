package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarInsurancePage extends BasePage {

	public CarInsurancePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a//div//i[@class='icon-bg homeIconsBg car-insurance']")
	WebElement carInsuranceicon;
	@FindBy(xpath="//div[@class='dont-know-number']/a |  //div[@class='headingV3 fontNormal']/span")
	WebElement newCarBtn;
	
	public void carInsurance() 
	{
		carInsuranceicon.click(); 
	}
	public void newCar() 
	{
		newCarBtn.click();	
	}

}
