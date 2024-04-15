package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Dateselection extends BasePage{
	
	public Dateselection(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"prequote-wrapper\"]/div[2]/div/div[1]/div/div[1]/div/div/input")
	WebElement dateselect;
	@FindBy(xpath="//button[@aria-label=\"Apr 24, 2024\"]")
	WebElement startDate;
	@FindBy(xpath="//button[@aria-label=\"May 9, 2024\"]")
	WebElement endDate;
	
	public void dateselection()
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(dateselect));
		dateselect.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(startDate));
		startDate.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(endDate));
		endDate.click();
	}
}
