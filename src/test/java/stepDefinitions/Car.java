package stepDefinitions;
 
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
 
import org.openqa.selenium.WebDriver;
 
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;
import utilities.DataReader;
 
public class Car {
	
	WebDriver driver;
	CarInsurancePage carInsurancePageobj; 
	CarCityRto carCityRtoobj;
	CarBrandModel CarBrandModelobj;
	CarFuelVariant CarFuelVariantobj;
	PersonalDetails PersonalDetailsobj;
	
	@Given("Navigate to Car insurance page")
	public void navigate_to_car_insurance_page() {
		
		BaseClass.getLogger().info("***Navigates to CarInsurance Page***");
		carInsurancePageobj=new CarInsurancePage(BaseClass.getDriver());
		carInsurancePageobj.carInsurance();
	}
 
	@When("Proceed without providing car number")
	public void proceed_without_providing_car_number() {
		
		BaseClass.getLogger().info("***Proceeding without entering the car number***");
		carInsurancePageobj=new CarInsurancePage(BaseClass.getDriver());
		carInsurancePageobj.newCar();
	}
 
	@When("Select city and RTO")
	public void select_city_and_rto() {
		
		BaseClass.getLogger().info("***Selecting city and rto***");
		carCityRtoobj=new CarCityRto(BaseClass.getDriver());
		carCityRtoobj.citySelection();
		carCityRtoobj.carRto();
	}
 
	@When("Select Car Brand")
	public void select_car_brand() {
		
		BaseClass.getLogger().info("***Selecting car brand***");
		CarBrandModelobj=new CarBrandModel(BaseClass.getDriver());
		CarBrandModelobj.carBrand();
	}
 
	@When("Select Car Model")
	public void select_car_model() throws InterruptedException {
		
		BaseClass.getLogger().info("***Selecting the car model and fuel type***");
		CarBrandModelobj.carModel();
		CarFuelVariantobj=new CarFuelVariant(BaseClass.getDriver());
		CarFuelVariantobj.carFuel();
	}
 
	@When("Select Car Variant")
	public void select_car_variant() {
		
		BaseClass.getLogger().info("***Selecting the car variant***");
		CarFuelVariantobj.carVariant();
	}
 
	List<HashMap<String, String>> datamap; //Data driven
	@When("Fill Details with Invalid Phone number and E-mail {string}")
	public void fill_details_with_invalid_phone_number_and_e_mail(String string) throws IOException {
		    
		    BaseClass.getLogger().info("***Filling out the details with invalid email_id***");
		    datamap=DataReader.data(System.getProperty("user.dir")+"\\testData\\CarInsurance.xlsx", "Sheet1");
	        int index=Integer.parseInt(string)-1;
	        String name= datamap.get(index).get("Name");
	        String email= datamap.get(index).get("email");
	        PersonalDetailsobj=new PersonalDetails(BaseClass.getDriver());
			PersonalDetailsobj.name(name);
			PersonalDetailsobj.email(email);
			PersonalDetailsobj.mobileNum();
 
	}
 
	@Then("Print the error message displayed")
	public void print_the_error_message_displayed() {
		
		BaseClass.getLogger().info("***Capturing the error message***");
		PersonalDetailsobj.errorMsg();
 
	}
}