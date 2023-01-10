package step.defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Teststeps_InvalidLOgin {

	WebDriver driver;
	
	@Given("Outlook Url at chrome")
	public void outlook_url_at_chrome()
	{
		driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
	   	driver.manage().window().maximize();
	}
	@Given("click on SignIn button")
	public void click_on_sign_in_button() 
	{
		
	   driver.findElement(By.linkText("Sign in")).click();
	}
	@When("User enter valid username")
	public void user_enter_valid_username() 
	{
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("revathigoute0407@gmail.com");
	    driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	}
	@When("enter invalid password")
	public void enter_invalid_password()
	{
		
	   
	}
	@Then("verify error message displayed")
	public void verify_error_message_displayed()
	{
	    
		
	}
}
