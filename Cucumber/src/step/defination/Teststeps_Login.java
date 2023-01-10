package step.defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Teststeps_Login {
	
	@Given("Enter Facebook Site url")
	public void enter_facebook_site_url() {
	   
		System.out.println("Page is opened");
	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	     
		System.out.println("User entered valid username and password");
	}
	@When("click on Login Button")
	public void click_on_login_button() {
	  
		System.out.println("Login page is opened");
	}
	@Then("verify Login successful message")
	public void verify_login_successful_message() {
	   
		System.out.println("Login message is displayed");
	}


}
