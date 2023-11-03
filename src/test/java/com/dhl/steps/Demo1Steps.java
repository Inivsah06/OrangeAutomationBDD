package com.dhl.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1Steps {
	
	@Given("I have browser with OrangeHRM application")
	    public void i_have_browser_with_orange_hrm_application()
	    {
		   System.out.println("browser launch!!");
	    }
	    
	@When("I enter username as {string}")
        public void i_enter_username_as(String username)
        {
	      System.out.println(username);
        }
 
	@When("I enter password as {string}")
    public void i_enter_password_as(String password)
    {
	   System.out.println(password);
    }

	@When("I click on login")
    public void i_click_on_login()
    {
	   System.out.println("login");
    }

	@Then("I should get access to dashboard with header {string}")
    public void i_should_get_access_to_dashboard_with_header(String expectedHeader)
    {
	   System.out.println(expectedHeader);
    }
	@Then("I should get access to dashboard with error {string}")
    public void i_should_get_access_to_the_portal_with_error(String expectedError)
    {
	   System.out.println(expectedError);

}
}
