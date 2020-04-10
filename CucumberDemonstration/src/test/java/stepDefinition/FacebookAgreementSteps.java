/**
**********************************************
Purpose: Step Definition Class for Facebook
Agreement pages
File Name: FacebookAgreementSteps.java
Suite Name: AllTests.java
Module Name: Home Page
@author: Amol Deshpande
@version: 1.0
Comments: Testing Terms, Data Policy and 
Cookies Policy Pages
**********************************************
 */

package stepDefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.CommonFunctions;

public class FacebookAgreementSteps extends CommonFunctions {

	@Given("^Open browser and launch Facebook for verifying Terms$")
	public void open_browser_Launch_Facebook_For_Terms() {
		try {
			openBrowser();
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, "Facebook – log in or sign up");
			System.out.println("Expected and Actual Facebook page loading is matched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^User clicks on Terms Link$")
	public void click_On_Term_Link() throws Exception {
		facebookTermsPage();
	}

	@Then("^Verify the Terms page is loaded correctly$")
	public void verify_Term_Page_Load() {
		try {
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, "Facebook – log in or sign up");
			System.out.println("Terms Page has been successfully opened");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^Close Terms page and quit$")
	public void close_Terms_Page() throws Exception {
		closeBrowser();
	}

	@Given("^Open browser and launch Facebook  for verifying Data Policy$")
	public void open_browser_Launch_Facebook_For_Data_Policy() {
		try {
			openBrowser();
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, "Facebook – log in or sign up");
			System.out.println("Expected and Actual Facebook page loading is matched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^User clicks on Data Policy Link$")
	public void click_On_Data_Policy_Link() throws Exception {
		facebookDataPolicyPage();
	}

	@Then("^Verify the Data Policy page is loaded correctly$")
	public void verify_Data_Policy_Page_Load() {
		try {
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, "Facebook – log in or sign up");
			System.out.println("Data Policy Page has been successfully opened");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^Close Data Policy page and quit$")
	public void close_Data_Policy_Page() throws Exception {
		closeBrowser();
	}

	@Given("^Open browser and launch Facebook for verifying Cookies$")
	public void open_browser_Launch_Facebook_For_Verifying_Cookies() {
		try {
			openBrowser();
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, "Facebook – log in or sign up");
			System.out.println("Expected and Actual Facebook page loading is matched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^User clicks on Cookies Link$")
	public void click_On_Cookies_Link() throws Exception {
		facebookCookiesPage();
	}

	@Then("^Verify the Cookies page is loaded correctly$")
	public void verify_Cookies_Page_Load() {
		try {
			facebookCookiesPage();
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, "Facebook – log in or sign up");
			System.out.println("Cookies Page has been successfully opened");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^Close Cookies page and quit$")
	public void close_Cookies_Page() throws Exception {
		closeBrowser();
	}
}