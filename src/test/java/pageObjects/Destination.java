package pageObjects;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Destination extends BasePage{
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    
	//Constructor
	public Destination(WebDriver driver)
	{
		super(driver);
	} 
	
	@FindBy(xpath="//div[@class='container prd-container homeIcons home_version11']//div[7]")WebElement travelbutton;
	@FindBy(xpath = "//*[@id=\"country\"]")WebElement destination;
	@FindBy(xpath = "//*[@id=\"search-country\"]/ul/li")List<WebElement> listofDestination;
	@FindBy(xpath = "//*[@id=\"prequote-wrapper\"]/div[2]/div/div[2]/button")WebElement next; 

	public void travelInsurancepage() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(travelbutton));
		travelbutton.click();

	}
		
	public void destination(String country) {
			
	    destination.click();
		destination.sendKeys(country);
		List<WebElement> list=listofDestination;
		for(int i=0;i<listofDestination.size();i++) {
		    String country1=listofDestination.get(i).getText();
			if(country1.equals(country)) {
			    listofDestination.get(i).click();
				break;
			}
		}
	}
		
	public void next() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		next.click();
	}
}
