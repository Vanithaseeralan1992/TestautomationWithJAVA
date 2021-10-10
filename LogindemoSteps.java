package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFiles.LogindemoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogindemoSteps {
	
	WebDriver webdriver=null;
	LogindemoPage login;

	@Given("Open google chrome")
	public void open_google_chrome() {
		System.out.println("=======================");
		System.setProperty("webdriver.chrome.driver", "D:\\JavaprojectswithMAVEN\\Driver\\chromedriver.exe");
		webdriver=new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		webdriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
	    
	}
	@And("user is on login page")
	public void user_is_on_login_page()
	{
		webdriver.navigate().to("https://example.testproject.io/web/");
	    
	}

	@When("user enters(.*) and (.*)$")
	public void user_enters_username_and_password(String username, String Password) throws InterruptedException {
		login=new LogindemoPage(webdriver);
		login.enterPassword(username);
		
		
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		login.clickLogin();
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		login.checkLogoutIsDisplayed();
		webdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	    
	}

}
