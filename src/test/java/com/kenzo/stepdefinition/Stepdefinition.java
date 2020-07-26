package com.kenzo.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.kenzo.baseclass.BaseClass;
import com.kenzo.pom.Dresses;
import com.kenzo.pom.Login;
import com.kenzo.pom.Women;
import com.kenzo.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	public static Login lg = new Login(driver);
	Women wm = new Women(driver);
	Dresses drs = new Dresses(driver);

	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
		getUrl("https://www.kenzo.com/eu/en/home");
	}

	@When("^User click the my account in the application$")
	public void user_click_the_my_account_in_the_application() throws Throwable {
		clickOnElement(lg.getAccount());
	}

	@When("^User enter the valid email id$")
	public void user_enter_the_valid_email_id() throws Throwable {
		inputValueElement(lg.getEmail(), "vino.vicky1993@gmail.com");
	}

	@When("^User enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
		inputValueElement(lg.getPassword(), "Jan@2020");
	}

	@Then("^User click the login button$")
	public void user_click_the_login_button() throws Throwable {
		clickOnElement(lg.getLoginbtn());
		Thread.sleep(3000);
	}

	@Then("^User select the women product$")
	public void user_select_the_women_product() throws Throwable {
		clickOnElement(wm.getSelect());

	}

	@Then("^User select the women t-shirts$")
	public void user_select_the_women_t_shirts() throws Throwable {
		clickOnElement(drs.getClick());
	}
}
