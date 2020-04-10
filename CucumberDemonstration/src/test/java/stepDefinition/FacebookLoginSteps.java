/**
**********************************************
Purpose: Step Definition Class for Facebook
Login
File Name: FacebookLoginSteps.java
Suite Name: AllTests.java
Module Name: Login
@author: Amol Deshpande
@version: 1.0
Comments: Testing Login to Facebook
**********************************************
 */

package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.CommonFunctions;

public class FacebookLoginSteps extends CommonFunctions {

	@Given("^Open browser and launch Facebook application$")
	public void open_browser_Launch_Facebook() {
		try {
			openBrowser();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Facebook – log in or sign up");
		System.out.println("Expected and Actual Facebook page loading is matched");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^Enter the Username and Password$")
	public void enter_Username_Password() {
		try {
			enterCredentials();
		String email = driver.findElement(By.name("email")).getText();
		Assert.assertEquals(email, "");
		System.out.println("Username field is displayed and verified correctly");
		String pass = driver.findElement(By.name("email")).getText();
		Assert.assertEquals(pass, "");
		System.out.println("Password field is displayed and verified correctly");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^Login to Facebook$")
	public void login_To_Facebook() throws Exception {
		facebookLoginClick();
	}

	@Then("^Close browser$")
	public void close_Firefox() throws Exception {
		closeBrowser();
	}
}