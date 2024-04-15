package stepDefinitions;
 
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AgeSelection;
import pageObjects.Dateselection;
import pageObjects.Destination;
import pageObjects.MedicalConditions;
import pageObjects.MobileNumber;
import pageObjects.PlanPage;
import pageObjects.Plans;
 
 
public class Travel {
	
	 WebDriver driver;
     Destination TravelpageObject;
     Dateselection dateselectionObject;
     AgeSelection ageObject;
     MedicalConditions medicalconditionobject;
     MobileNumber mobileNumberobject;
     Plans plansObject;
     PlanPage obj;
     
    @Given("Navigate to travel insurance page")
    public void navigate_to_travel_insurance_page() throws InterruptedException {
	
	    BaseClass.getLogger().info("***Opening Travel Insurance Page***");
	    TravelpageObject=new Destination(BaseClass.getDriver());
	    TravelpageObject.travelInsurancepage(); 
	}
		
    @When("click on any european country as destination \\(country={string})")
    public void click_on_any_european_country_as_destination_country(String country) throws IOException {
	    
    	BaseClass.getLogger().info("***Entering the destination Place***");
	    TravelpageObject.destination(country);
    }

    @When("click on next and navigate to Date page")
    public void click_on_next_and_navigate_to_date_page() {
	    
    	BaseClass.getLogger().info("***Navigates to next page***");
	    TravelpageObject.next();
	
    }
 
    @When("select the Date and click on Next")
    public void select_the_date_and_click_on_next() {
	    
    	BaseClass.getLogger().info("***Selecting the Start and End date***");
	    dateselectionObject=new Dateselection(BaseClass.getDriver());
	    dateselectionObject.dateselection();
	    TravelpageObject.next();
    }
 
    @When("select the number of travellers and enter the age and click on next")
    public void select_the_number_of_travellers_and_enter_the_age_and_click_on_next() {
	    
    	BaseClass.getLogger().info("***Selecting the no of peoples and age***");
	    ageObject=new AgeSelection(BaseClass.getDriver());
	    ageObject.noofpeoples();
	    TravelpageObject.next();
    }
    
    @When("verify your Medical History and click on next\\(condition={string})")
    public void verify_your_medical_history_and_click_on_next_condition(String string) {
	    
    	BaseClass.getLogger().info("***Selecting the medical condition***");
	    medicalconditionobject=new MedicalConditions(BaseClass.getDriver());
	    medicalconditionobject.medicalConditions();
	    TravelpageObject.next();
    }
    
    @When("Enter your Mobile Number")
    public void enter_your_mobile_number() throws InterruptedException {
	    
    	BaseClass.getLogger().info("***Entering the mobile number***");
	    mobileNumberobject=new MobileNumber(BaseClass.getDriver());
	    mobileNumberobject.mobile();
    }
 
    @When("click on View plans and navigate to the plans page")
    public void click_on_view_plans_and_navigate_to_the_plans_page() {
	    
    	mobileNumberobject.viewplan();
    }
  
    @Then("display three lowest international travel insurance plan")
    public void display_three_lowest_international_travel_insurance_plan() throws InterruptedException {
    	
    	BaseClass.getLogger().info("***Clicking on viewplans***");
	    plansObject=new Plans(BaseClass.getDriver());
	    plansObject.plans();
	    BaseClass.getLogger().info("***Printing the three lowest travel insurance plan for students***");
	    System.out.println("Three Lowest international  travel insurance plan");
	    Thread.sleep(5000);
	    obj=new PlanPage(BaseClass.getDriver());
	    obj.details();
    }
}