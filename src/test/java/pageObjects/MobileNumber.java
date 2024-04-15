package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import factory.BaseClass;

public class MobileNumber extends BasePage{

	public MobileNumber(WebDriver driver) {
		super(driver);
	}
	
    @FindBy(xpath="//*[@id=\"mobileNumber\"]")
    WebElement Mobilenum;
    @FindBy(xpath="//div[@ class=\"pqCtaWrapper\"]/button")
    WebElement viewplan;

    public void mobile()
    {
        String num=BaseClass.randomNumber();
        Mobilenum.sendKeys(num);
    }
    
    public void viewplan() {
    	viewplan.click();
    }
}
