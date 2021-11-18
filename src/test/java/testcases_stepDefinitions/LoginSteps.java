package testcases_stepDefinitions;

import com.gmail.pages.LoginPage;
import com.gmail.testUtility.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends TestBase{

	LoginPage loginpage = new LoginPage(driver);
	
	@Given("^User is on Udemy WebSite$")
	public void user_is_on_Udemy_WebSite() throws Throwable {
	  TestBase.initialization(); 
	}

	@When("^User click on Login$")
	public void user_click_on_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   loginpage.clickOnLogIn();
	}

	@When("^Enters User Name$")
	public void enters_User_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   loginpage.enterUserName();;
	}

	@When("^Enters Password$")
	public void enters_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   loginpage.enterPassword();
	}

	@When("^Clicks on Login$")
	public void clicks_on_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   loginpage.clickOnLogin();
	}
	
	@Then("^User logins to the Home Page$")
	public void user_logins_to_the_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
