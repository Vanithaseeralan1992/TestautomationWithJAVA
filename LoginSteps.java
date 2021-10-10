package Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user is login page")
	public void user_is_login_page() {
	    System.out.println("user is logged in");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user entered username and passwornd");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("user clicks login button");
	}

	@Then("user is navigate to the home page")
	public void user_is_navigate_to_the_home_page() {
		System.out.println("user navigate to home page");
	}

}
