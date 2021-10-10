package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaprojectswithMAVEN\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		
		
		driver.navigate().to("https://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,-350)", "");
		driver.findElement(By.id("L2AGLb")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}

	@When("users enters a text in seach box")
	public void users_enters_a_text_in_seach_box() {
		driver.findElement(By.name("q")).sendKeys("Nature of the norway");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		driver.getPageSource().contains("Norway");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.close();
	}

}
