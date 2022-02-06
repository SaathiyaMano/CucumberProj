package stepDefination.login;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import saucedemopageobject.Sorting;

public class Sortingstepdef extends Sorting {

	public Sortingstepdef(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	WebDriver driver=null;
	Sortingstepdef Sorting_step;
	
	public void setdriver()
	{
		
		setup();
	}

	@Given("user is successfully logged into Daucedemo page")
	public void user_is_successfully_logged_into_daucedemo_page() {
	    // Write code here that turns the phrase above into concrete actions
		openapplication();
	}

	@When("user is on Homepage")
	public void user_is_on_homepage(String username, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		enterusername(username);
		enterusername(Password);
	}

	@Then("user sorts the price from low to high")
	public void user_sorts_the_price_from_low_to_high() {
	    // Write code here that turns the phrase above into concrete actions
		Sorting_step.Sortingoperation();
	}

	@Then("user validates the price from low to high")
	public void user_validates_the_price_from_low_to_high() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
