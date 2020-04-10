package utils;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;

public class Constants {

	protected WebDriver driver;
	String gecko = "webdriver.gecko.driver";
	String chrome = "webdriver.chrome.driver";
	String userDir = System.getProperty("user.dir");
	String fireFoxPath = userDir + "\\\\resources\\\\geckodriver.exe";
	String chromePath = userDir + "\\\\resources\\\\chromedriver.exe";
	protected ConfigFileReader configFileReader;

}