package StepDef_OrangeHRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps_OrangeHRM 
{
      //Step definition class
	
@Given("user is at the login screen")
public void user_is_at_the_login_screen()
{
    System.out.println("Entering URL....launching Browser");
   
}

@When("user enters a valid Username")
public void user_enters_a_valid_username() 
{
    System.out.println("Entering Username");   
}

@When("user enters a valid Password")
public void user_enters_a_valid_password()
{
    System.out.println("Entering Password");
}

@When("user clicks on Login button")
public void user_clicks_on_login_button() 
{
    System.out.println("Clicking on Login Button");
}

@Then("user should be landed on Dashboard page")
public void user_should_be_landed_on_dashboard_page()
{
    System.out.println("landed on Dashboard page");
}


@Given("user is at login Screen of an application")
public void user_is_at_login_screen_of_an_application()
{
   System.out.println("Entering URL Opening browser");
}

@Then("Title of an application should be displayed on the browser tab")
public void title_of_an_application_should_be_displayed_on_the_browser_tab() 
{
	System.out.println("title of an application has been verified");
}


}
