package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class loginPage extends basePage {
	//driver constructor
	public loginPage(WebDriver driver) {
		super(driver);
		}

	//Locators
	By username_loc=By.xpath("//input[@id='user-name']");
	By password_loc =By.xpath("//input[@id='password']");
	By login_loc =By.xpath("//input[@id='login-button']");
	
	//Action Methods
	public void setUserName(String user) {
		driver.findElement(username_loc).sendKeys(user);
		}
	public void setPassword(String password) {
		driver.findElement(password_loc).sendKeys(password);
		}
	public void clickLogin() {
		driver.findElement(login_loc).click();
		}
	}
