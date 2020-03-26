package Com.Stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_Demo_validcontactdetail_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sauce_demo_validcontact_stepdefinition
{
	Sauce_Demo_validcontactdetail_page s=new Sauce_Demo_validcontactdetail_page();
	
	@Given("^user launch the chrome application$")
	public void user_launch_the_chrome_application() {
	s.url();
	}

	@When("^user open the Sauce_demo Home page$")
	public void user_open_the_Sauce_demo_Home_page() {
		s.homepage();
	}

	@Then("^user login the home page$")
	public void user_login_the_home_page() throws IOException, InterruptedException {
		s.login();
	}

	@Then("^check valid partnership details in the company field$")
	public void check_valid_partnership_details_in_the_company_field() throws IOException, InterruptedException {
		s.valid_partner_details();
		s.screenshot("src\\test\\resources\\Screenshot\\validcontact.png");

	}

	@Then("^closing the browser$")
	public void closing_the_browser() throws InterruptedException {
		s.closebrowser();
	}


}
