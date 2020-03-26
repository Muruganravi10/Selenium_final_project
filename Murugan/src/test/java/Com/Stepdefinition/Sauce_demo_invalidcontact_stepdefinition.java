package Com.Stepdefinition;

import java.io.IOException;

import org.junit.Assert;

import Com.Pages.Sauce_Demo_Invalid_contactdetail_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sauce_demo_invalidcontact_stepdefinition
{
	Sauce_Demo_Invalid_contactdetail_page s=new Sauce_Demo_Invalid_contactdetail_page();
	
	@Given("^user launching the chrome application$")
	public void user_launching_the_chrome_application() {
       s.url();	
	}

	@When("^user opens the Sauce_demo Home page$")
	public void user_opens_the_Sauce_demo_Home_page() {
		s.homepage();
	}
	@Then("^user logins the home page$")
	public void user_logins_the_home_page() throws IOException, InterruptedException {
		s.login();
	}
	@Then("^check Invalid partnership details in the company field$")
	public void check_Invalid_partnership_details_in_the_company_field() throws InterruptedException, IOException {
		s.Invalid_partners_details();

		s.screenshot("src\\test\\resources\\Screenshot\\invalidcontact.png");

	}

	@Then("^Closing the browser$")
	public void closing_the_browser() throws InterruptedException {
		s.closebrowser();
	}

}
