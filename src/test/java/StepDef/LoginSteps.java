package StepDef;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.LoginClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{
	private static LoginClass lc;
	
	@Given("User is on SauceDemo appl")
	public void user_is_on_sauce_demo_appl() {
	    BaseClass.initialization();
	}

	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String string, String string2) {
		 lc = new LoginClass();
		lc.CreateLogin(string, string2);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	   lc.click();
	}
	
	@Then("user verify homepageTitle")
	public void user_verify_homepage_title() {
	   String title = driver.getTitle();
	   Assert.assertEquals(title,"Swag Labs");
	}

}
