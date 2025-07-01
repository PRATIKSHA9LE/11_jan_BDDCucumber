package StepDef_OrangeHRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardWedgetStepDef 
{

   @Given("user is login OrangeHRM using valid credential")
   public void user_is_login_orange_hrm_using_valid_credential() 
   {
	 System.out.println("Open browser...enter URL...Entering UN/PASS....clicks on login Button");
   }

   @When("user is at Dashboard page")
   public void user_is_at_dashboard_page()
   {
      System.out.println("Redirected to the dashboard");
   }

   @Then("user should see {string} , {string} , {string}")
   public void user_should_see(String wedget, String wedget2, String wedget3) 
   {
      System.out.println("widget is displaying:"+""+ wedget );
      System.out.println("Widget is displaying:"+""+ wedget2);
      System.out.println("wedget is displaying:"+""+ wedget3);   
   }

   @When("user clicks on {string} from Quick Launch wedget")
   public void user_clicks_on_from_quick_launch_wedget(String Al) 
   {
      System.out.println("clickin on Apply leave"+ Al);
   }
 
   @Then("user should be redirected to the {string} webpage")
   public void user_should_be_redirected_to_the_webpage(String ALP) 
   {
     System.out.println("Redirected to webPage"+ ALP);
   }
   }
