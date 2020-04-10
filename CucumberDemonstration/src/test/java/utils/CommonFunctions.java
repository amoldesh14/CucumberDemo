package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.ConfigFileReader;

public class CommonFunctions extends Constants {

	public void openBrowser() throws Exception {
		configFileReader = new ConfigFileReader();
		String browserValue = configFileReader.getBrowser();
		System.out.println("Browser being used is " + browserValue);

		if (browserValue.equalsIgnoreCase("chrome")) {
			{
				{
					System.setProperty(chrome, chromePath);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get(configFileReader.getApplicationUrl());
					driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
					System.out.println("Page displayed is " + configFileReader.getApplicationUrl());
				}
			}
		}

		else if (browserValue.equalsIgnoreCase("firefox")) {
		}
		System.setProperty(gecko, fireFoxPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(configFileReader.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		System.out.println("Page displayed is " + configFileReader.getApplicationUrl());

	}

	public void enterCredentials() throws Exception {

		try {
			driver.findElement(By.name("email")).sendKeys(configFileReader.getUserName());
			System.out.println("Page has email field");

			driver.findElement(By.name("pass"))
					.sendKeys(configFileReader.DecryptPassword(configFileReader.getPassword()));
			System.out.println("Page has password field");
		} catch (Exception e) {
			System.out.println("Intended wait is not executed correctly");
		}
	}

	public void facebookLoginClick() throws Exception {
		try {
			driver.findElement(By.id("loginbutton")).click();
		} catch (Exception e) {
			System.out.println("User is unable to click on Login button");
		}
	}

	public void facebookCreatePage() {
		try {
			driver.findElement(By.linkText("Create a Page")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void facebookTermsPage() {
		try {
			driver.findElement(By.linkText("Terms")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void facebookDataPolicyPage() {
		try {
			driver.findElement(By.linkText("Data Policy")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void facebookCookiesPage() {
		try {
			driver.findElement(By.linkText("Cookie Policy")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
