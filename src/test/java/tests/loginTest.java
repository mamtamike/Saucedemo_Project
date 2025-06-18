package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.loginPage;

public class loginTest extends baseTest{
	@Test
	void loginTest() {
	loginPage lp= new loginPage(driver);
	lp.setUserName("standard_user");
	lp.setPassword("secret_sauce");
	lp.clickLogin();
	Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
}