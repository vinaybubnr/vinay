package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	// Constructor 
	LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	// Locators 
	
	By Logo = By.xpath("//img[@alt='company-branding']");
	By name = By.xpath("//input[@placeholder='Username']");
	By password = By.xpath("//input[@placeholder='Password']");
	By submit = By.xpath("//button[normalize-space()='Login']");
	
	
	
	// Action Methods
	
	public void setUserName() {
		
	}
	
	

}
