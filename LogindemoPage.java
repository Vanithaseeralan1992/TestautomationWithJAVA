package PageFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogindemoPage {
	
	WebDriver driver;
	private By txt_username=By.id("name");
	private By txt_password=By.id("password");
	private By loginbtn=By.id("login");
	private By logoutbtn=By.id("logout");
	
	public LogindemoPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);;
		
	}
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
		
	}
	public void clickLogin()
	{
		driver.findElement(loginbtn).click();
	}
	public void loginValidUser(String username, String password)
	{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(loginbtn).click();
	}
	public void checkLogoutIsDisplayed()
	{
		driver.findElement(logoutbtn).isDisplayed();
	}
	
	
	
	

}
