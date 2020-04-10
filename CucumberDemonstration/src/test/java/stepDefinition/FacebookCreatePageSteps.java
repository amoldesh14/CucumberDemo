/**
**********************************************
Purpose: Step Definition Class for Facebook
Creating New Page
File Name: FacebookCreatePageSteps.java
Suite Name: AllTests.java
Module Name: Create a Page
@author: Amol Deshpande
@version: 1.0
Comments: Testing of loading of new page for
building new business etc.
**********************************************
 */

package stepDefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.CommonFunctions;

public class FacebookCreatePageSteps extends CommonFunctions {

	@Given("^Open browser and launch Facebook$")
	public void open_browser_Launch_Facebook_App() {
		try {
			openBrowser();

			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, "Facebook – log in or sign up");
			System.out.println("Expected and Actual Facebook page loading is matched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^User clicks on Create a Page Link$")
	public void click_On_Create_Page() throws Exception {
		facebookCreatePage();
	}

	@Then("^Verify the page is loaded correctly$")
	public void verify_Page_Load() {
		try {
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, "Facebook");
			System.out.println("Create a New Page has been successfully opened");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^Close browser and quit$")
	public void close_Firefox_Browser() throws Exception {
		closeBrowser();
	}
}