package Com.Stepdefinition;

import java.io.IOException;

import Com.Pages.Sauce_Demo_companynews_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sauce_demo_companynews_stepdefinition {
	Sauce_Demo_companynews_page s=new Sauce_Demo_companynews_page();
	
	@Given("^the user launching the chrome application$")
	public void the_user_launching_the_chrome_application() {
	s.url();
	}

	@When("^the users open the Sauce_demo Home page$")
	public void the_users_open_the_Sauce_demo_Home_page() {
		s.homepage();
	}

	
	@Then("^The user logins the home page$")
	public void the_user_logins_the_home_page() throws IOException, InterruptedException  {
	    s.login();
	
	}
	

	@Then("^check company news in company field$")
	public void check_company_news_in_company_field() throws InterruptedException, IOException {
		s.company_news();
		s.screenshot("src\\test\\resources\\Screenshot\\news.png");
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws InterruptedException {
		s.closebrowser();
	}

}
