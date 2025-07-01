package StepDef_OrangeHRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDatastepDefOrangeHRM 
{
	@Given("user is at the OrangeHRM login page")
	public void user_is_at_the_orange_hrm_login_page() 
	{
	 System.out.println("launching browser, Entering URL");   
	}

	@When("user is Enter Username as {string}")
	public void user_is_enter_username_as(String UN)
	{
	    System.out.println("Entering Username" + UN);
	}

	@When("user is enter Password as {string}")
	public void user_is_enter_password_as(String Pass) 
	{
	   System.out.println("entering password" + Pass);
	}

	@When("user is click on login button")
	public void user_is_click_on_login_button()
	{
	   System.out.println("Clicking login button");  
	}

	@Then("user should redirected to the dashboard")
	public void user_should_redirected_to_the_dashboard() 
	{
	   System.out.println("redirected to the dashboard page");
	}	
}
