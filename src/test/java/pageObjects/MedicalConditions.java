package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MedicalConditions extends BasePage{
	
	 public MedicalConditions(WebDriver driver) {
		super(driver);
	}
 
	@FindBy(xpath="//*[@id=\"ped_no\"]")
	WebElement noButton;
	@FindBy(xpath="//*[@id=\"ped_yes\"]")
	WebElement yesButton;
    
	public void medicalConditions()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(noButton));
		noButton.click();
	}
	
}
