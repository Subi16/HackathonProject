package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgeSelection extends BasePage {
    
	public AgeSelection(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//label[@for=\"traveller_2\"]")
	WebElement no_of_people;  
	@FindBy(xpath="//*[contains(text(),'traveller 1')]")
	WebElement age1;
	@FindBy(xpath="//*[@id=\"optionBox_0_wrapper\"]/div[24]")
	WebElement age1select;
	@FindBy(xpath="//*[contains(text(),'traveller 2')]")
	WebElement age2;
	@FindBy(xpath="//*[@id=\"optionBox_1_wrapper\"]/div[23]")
	WebElement age2select;
	   
	public void noofpeoples()
    {
		no_of_people.click();
		age1.click();
		age1select.click();
		age2.click();
		age2select.click();
	}
}
