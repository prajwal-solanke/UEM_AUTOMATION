package com.uem_automation.qa.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.uem_automation.qa.base.Base;
import com.uem_automation.qa.pages.DeviceManagerPage;
import com.uem_automation.qa.pages.LoginPage;
import com.uem_automation.qa.utils.Utilities;

import javax.swing.*;

public class LoginTest extends Base {

	public WebDriver driver;
	LoginPage loginPage;
	DeviceManagerPage deviceManagerPage;

	// Constructor
	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		driver = initializeBrowserAndOpenApplicationURL(configProp.getProperty("browserName"));
		loginPage = new LoginPage(driver);
		deviceManagerPage = new DeviceManagerPage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@DataProvider
	public Object[][] supplyTestData() {
		Object[][] data = { {"admin" , "admin" , "Default View - Device Manager"} };
//		Object[][] data = Utilities.getTestDataFromExcel("Login");
		return data;
	}

	@Test(priority = 1, dataProvider = "supplyTestData") // Validate logging into the Application using valid
															// credentials
	public void TC_LP_001_Validate_login_with_valid_credentials(String email, String password, String view) {

//		WebElement usernameElement = driver.findElement(By.xpath("//input[@id='UserName']"));
//		usernameElement.sendKeys(configProp.getProperty("validEmail"));
//		usernameElement.sendKeys(email);
//		WebElement passwordElement = driver.findElement(By.xpath("//input[@id='Password']"));
//		passwordElement.sendKeys(configProp.getProperty("validPass"));
//		passwordElement.sendKeys(password);
//		WebElement login_button = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//		login_button.click();
//		WebElement logo_element = driver
//				.findElement(By.xpath("//img[(@src='theme/dist/assets/media/logos/topMenu-Logo-X.png')]"));
//		Assert.assertTrue(logo_element.isDisplayed()); // assertion for logo present

		loginPage.enterUsername(email);
		loginPage.enterPassword(password);
		loginPage.selectView(view);
		loginPage.clickOnLoginButton();
		deviceManagerPage.changeRightMenuPosition();
		deviceManagerPage.changeLeftMenuPosition();
		Assert.assertTrue(deviceManagerPage.isLogoDisplayed(testdataProp.getProperty("companyWebsiteUrl")),
				"[Error: Logo is not displayed]");
	}

	@Test(priority = 2) // Validate logging into the Application using invalid credentials (i.e. Invalid
						// username and invalid password)
	public void TC_LP_002_Validate_login_with_invalid_credentials() {
		String username_string = Utilities.generateEmailWithTimeStamp();
		loginPage.enterUsername(username_string);
		loginPage.enterPassword(testdataProp.getProperty("invalidPassword"));
		loginPage.selectView(configProp.getProperty("selectView"));
		loginPage.clickOnLoginButton();
		String actualWarningMessage = loginPage.retrieveFailureTextMessage();
		String expectedWarningMessage = testdataProp.getProperty("expectedLoginFailureTextMessage");
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage,
				"[Error: actualWarningMessage does not match with expectedWarningMessage]");
	}

	@Test(priority = 3) // Validate logging into the Application using Invalid email/username address
						// and valid password
	public void TC_LP_003_Validate_login_with_invalid_email_and_valid_password() {
		String username_string = Utilities.generateEmailWithTimeStamp();
		loginPage.enterUsername(username_string);
		loginPage.enterPassword(configProp.getProperty("validPass"));
		loginPage.selectView(configProp.getProperty("selectView"));
		loginPage.clickOnLoginButton();
		String actualWarningMessage = loginPage.retrieveFailureTextMessage();
		String expectedWarningMessage = testdataProp.getProperty("expectedLoginFailureTextMessage");
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage,
				"[Error: actualWarningMessage does not match with expectedWarningMessage]");
	}

	@Test(priority = 4) // Validate logging into the application using valid email/username address and
						// invalid password
	public void TC_LP_004_Validate_login_with_valid_email_and_invalid_password() {
		loginPage.enterUsername(configProp.getProperty("validEmail"));
		loginPage.enterPassword(testdataProp.getProperty("invalidPassword"));
		loginPage.selectView(configProp.getProperty("selectView"));
		loginPage.clickOnLoginButton();
		String actualWarningMessage = loginPage.retrieveFailureTextMessage();
		String expectedWarningMessage = testdataProp.getProperty("expectedLoginFailureTextMessage");
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage,
				"[Error: actualWarningMessage does not match with expectedWarningMessage]");
	}

	@Test(priority = 5) // Validate logging into the Application without providing any credentials
	public void TC_LP_005_Validate_login_without_providing_any_credentials() {
		loginPage.enterUsername("");
		loginPage.enterPassword("");
		loginPage.selectView(configProp.getProperty("selectView"));
		loginPage.clickOnLoginButton();
		String expectedWarningMessage = testdataProp
				.getProperty("expectedLoginFailureTextMessageWithoutProvidingUsernamePassword");
		String actualWarningMessage = loginPage.retrieveFailureTextMessage();
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage,
				"[Error: actualWarningMessage does not match with expectedWarningMessage]");
	}

	@Test(priority = 6) // Validate 'Forgot Password' link is available in the Login page and is working
	public void TC_LP_006_Validate_forgot_password_link_functionality() {
		loginPage.clickOnForgotPasswordLink();
		String actualLabelText = loginPage.retrieveLabelText();
		String expectedLabelText = testdataProp.getProperty("recoveryPasswordLabel");
		Assert.assertEquals(actualLabelText, expectedLabelText,
				"[Error: actualLabelText does not match with expectedLabelText]");
	}

	@Test(priority = 7) //, dependsOnMethods = { "TC_LP_001_Validate_login_with_valid_credentials" }) // Validate logging into the Application using Keyboard keys (Tab and Enter)
	public void TC_LP_007_Validate_logging_into_the_application_using_keyboard_keys() {
		Actions action = new Actions(driver);
		action.sendKeys(configProp.getProperty("validEmail")).perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(configProp.getProperty("validPass")).perform();
		action.sendKeys(Keys.ENTER).build().perform();
		loginPage.selectView(configProp.getProperty("selectView"));
		deviceManagerPage.changeLeftMenuPosition();
		deviceManagerPage.changeRightMenuPosition();
		Assert.assertTrue(deviceManagerPage.isLogoDisplayed(testdataProp.getProperty("companyWebsiteUrl")),
				"[Error: Logo is not displayed]");
	}

	@Test(priority = 8) // Validate email address and password text fields in the Login page have the placeholder text
	public void TC_LP_008_Validate_email_and_pass_text_fields_in_login_page_have_placeholder_text() {
		Assert.assertTrue(loginPage.isPlaceholderTextDisplayedForUsernameAndPassword(),
				"[Error: Username and Password placeholder not displayed]");
	}

	@Test(priority = 9) // Validate logging into the application and browsing back using browser back button (User should not log out)
	public void TC_LP_009_Validate_logging_into_the_application_and_browsing_back_using_browser_back_button() throws InterruptedException {
		loginPage.enterUsername(configProp.getProperty("validEmail"));
		loginPage.enterPassword(configProp.getProperty("validPass"));
		loginPage.selectView(configProp.getProperty("selectView"));
		loginPage.clickOnLoginButton();
		deviceManagerPage.changeLeftMenuPosition();
		deviceManagerPage.changeRightMenuPosition();
		deviceManagerPage.isLogoDisplayed(testdataProp.getProperty("companyWebsiteUrl"));
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(2000);
		Assert.assertTrue(deviceManagerPage.isLogoDisplayed(testdataProp.getProperty("companyWebsiteUrl")),
				"[Error: Logo is not displayed it should be displayed]");
	}

	@Test(priority = 10) // Validate logging out the application and browsing back using browser back button (User should not log in)
	public void TC_LP_010_Validate_logging_out_the_application_and_browsing_back_using_browser_back_button() {
		loginPage.enterUsername(configProp.getProperty("validEmail"));
		loginPage.enterPassword(configProp.getProperty("validPass"));
		loginPage.selectView(configProp.getProperty("selectView"));
		loginPage.clickOnLoginButton();
		deviceManagerPage.changeLeftMenuPosition();
		deviceManagerPage.changeRightMenuPosition();
		Assert.assertTrue(deviceManagerPage.isLogoDisplayed(testdataProp.getProperty("companyWebsiteUrl")),
				"[Error: Logo is not displayed]");
		// logout
		deviceManagerPage.logOutFromApplication();
		driver.navigate().forward();
		driver.navigate().refresh();
		Assert.assertFalse(deviceManagerPage.isFooterWithCompanyWebsiteUrlDisplayed(),
				"Footer company url displayed it shouldn't displayed");

	}
}
