package com.uem_automation.qa.pages;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.uem_automation.qa.utils.Utilities;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Utilities.EXPLICIT_WAIT_TIME));

	// Objects
	@FindBy(xpath = "//div[@class='AjaxLoaderOuter loaderDivInitial']//button[@type='button'][normalize-space()='Please wait...']")
	private WebElement ajaxLoaderOuter;

	@FindBy(xpath = "//input[contains(@placeholder, 'Please Enter Username')]")
	private WebElement usernameTextbox;

	@FindBy(xpath = "//input[contains(@placeholder, 'Please Enter Password')]")
	private WebElement passwordTextbox;

	@FindBy(xpath = "//select[@id='ddlRedirectToView']")
	private WebElement selectViewDropdown;

	@FindBy(xpath = "//input[@id='btnLogin']")
	private WebElement loginButton;

	@FindBy(xpath = "//label[@id='lblFailureText']")
	private WebElement actualFailureTextMessageElement;

	@FindBy(xpath = "//div[@id='spnForgotPass']")
	private WebElement forgotPasswordLinkElement;

	@FindBy(xpath = "//label[@id='lblRecoveryPassword']") //label[@id='lblRecoveryPassword']")
	private WebElement recoveryPasswordLabelElement;

	@FindBy(xpath = "//label[@id='lblFailureText']") //(//label[@id='lblRecoveryPassword' or @id='lblFailureText'])[1]") //label[@id='lblRecoveryPassword']")
	private WebElement recoveryPasswordSMTPServerNotConfiguredLabelElement;

	@FindBy(xpath = "//input[contains(@placeholder, 'Please Enter Username')]")
	private WebElement usernamePlaceholder;

	@FindBy(xpath = "//input[contains(@placeholder, 'Please Enter Password')]")
	private WebElement passwordPlaceholder;

	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void enterUsername(String username) {
		usernameTextbox.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordTextbox.sendKeys(password);
	}

	public void selectView(String view) {
		Select select = new Select(selectViewDropdown);
		select.selectByVisibleText(view);
	}

	public void clickOnLoginButton() {
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
//		wait.until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.click();
	}

	public String retrieveFailureTextMessage() {
		wait.until(ExpectedConditions.visibilityOf(actualFailureTextMessageElement));
		return actualFailureTextMessageElement.getText();
	}

	public boolean isPlaceholderTextDisplayedForUsernameAndPassword() {
//		if (usernameTextbox.isDisplayed() && passwordTextbox.isDisplayed()) {
//			return true;
//		}
//		return false;
		return usernameTextbox.isDisplayed() && passwordTextbox.isDisplayed();
	}

	public void clickOnForgotPasswordLink() {
		wait.until(ExpectedConditions.elementToBeClickable(forgotPasswordLinkElement));
		forgotPasswordLinkElement.click();
	}

	public String retrieveLabelText() {
//		wait.until(ExpectedConditions.visibilityOf(recoveryPasswordLabelElement));
//		return recoveryPasswordLabelElement.getText();

		try {
			if(recoveryPasswordSMTPServerNotConfiguredLabelElement.isDisplayed()){
				return recoveryPasswordSMTPServerNotConfiguredLabelElement.getText();
			}
//			wait.until(ExpectedConditions.visibilityOf(recoveryPasswordLabelElement));
			return recoveryPasswordLabelElement.getText();
		} catch (NoSuchElementException e){
			return null;
		}
		
	}

}
