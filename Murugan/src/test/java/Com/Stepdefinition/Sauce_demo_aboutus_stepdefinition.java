package Com.Stepdefinition;

import java.io.IOException;

import org.junit.Assert;

import Com.Pages.Sauce_Demo_companyaboutus_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Sauce_demo_aboutus_stepdefinition {
	
	Sauce_Demo_companyaboutus_page s=new Sauce_Demo_companyaboutus_page();
	
	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application()  {
	    s.url();
	    
	}

	@When("^the user open the Sauce_demo Home page$")
	public void the_user_open_the_Sauce_demo_Home_page()   {
		s.homepage();
	
	}

	
	@Then("^close the browser$")
	public void close_the_browser() throws InterruptedException  {
	    s.closebrowser();
		}

	
   @Then("^The user login the home page using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_login_the_home_page_using_and(String username, String password) throws IOException, InterruptedException {
		s.login(username,password);

	}

	
		@Then("^check about us in company field$")
	public void check_about_us_in_company_field() throws InterruptedException, IOException  {
	    s.company_about_us();
	    s.screenshot("src\\test\\resources\\Screenshot\\company_aboutus.png");
	}

		}
	
