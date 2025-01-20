package com.uem_automation.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.uem_automation.qa.base.Base;
import com.uem_automation.qa.pages.DeviceManagerPage;
import com.uem_automation.qa.pages.LoginPage;

public class DeviceManagerWindowsTest extends Base {

	public WebDriver driver;
	LoginPage loginPage;
	DeviceManagerPage deviceManagerPage;

	// Constructor
	public DeviceManagerWindowsTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		driver = initializeBrowserAndOpenApplicationURL(configProp.getProperty("browserName"));

		loginPage = new LoginPage(driver);
		deviceManagerPage = new DeviceManagerPage(driver);

		loginPage.enterUsername(configProp.getProperty("validEmail"));
		loginPage.enterPassword(configProp.getProperty("validPass"));
		loginPage.selectView(configProp.getProperty("selectView"));
		loginPage.clickOnLoginButton();
		deviceManagerPage.changeLeftMenuPosition();
		deviceManagerPage.changeRightMenuPosition();

//		deviceManagerPage.waitTillFooterCompanyWebsiteURLIsDisplayed(testdataProp.getProperty("companyWebsiteUrl"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1) // Validate users are able to view the settings applied on the Group
	public void TC_DMW_001_Validate_users_able_to_view_the_settings_applied_on_the_group() {
		deviceManagerPage.clickOnTheGroup(testdataProp.getProperty("groupName"));
		deviceManagerPage.clickOnTheGroupInformationTab();
		String expectedGroupInfo = testdataProp.getProperty("expectedGroupInfo");
		String actualGroupInfo = deviceManagerPage.retrieveGroupInformation();
		Assert.assertTrue(actualGroupInfo.contains(expectedGroupInfo),
				"[Error: actualGroupInfo does not match with expectedGroupInfo]");
	}

	@Test(priority = 2) // Validate users are able to apply Execute later task or saved task on group.
	public void TC_DMW_002_Validate_users_able_to_apply_execute_later_or_saved_task_on_the_group() {
		deviceManagerPage.clickOnTheGroup(testdataProp.getProperty("groupName"));
		deviceManagerPage.clickOnRHSMenu();
		deviceManagerPage.clickOnWindowsRHS();
		deviceManagerPage.clickOnWindowsSystemSettingRHS();
		deviceManagerPage.clickOnWindowsSystemSettingTimeAndLanguageRHS();
		deviceManagerPage.clickOnWindowsSystemSettingTimeAndLanguageDateAndTimeRHS();
//		deviceManagerPage.clickOnExecuteNowRadioButton();
		deviceManagerPage.selectExecuteLaterRadioButton();

		deviceManagerPage.clickOnSave();
		deviceManagerPage.checkIagreeCheckboxAndClickOnOkButton(); // it's off on the application configuration settings
		String expectedResponse = testdataProp.getProperty("expectedResponse");
		String actualResponse = deviceManagerPage.retrieveTheResponceMessageLabel();
		Assert.assertEquals(expectedResponse, actualResponse,
				"[Error: actualResponse does not match with expectedResponse]");

		deviceManagerPage.clickOnTheGroup(testdataProp.getProperty("groupName"));
		deviceManagerPage.clickOnTheTaskManagerTab();
		Assert.assertTrue(deviceManagerPage.isTaskEntryDisplayed(), "[Error: Task entry is not displayed]");
	}

	@Test(priority = 3) // Validate users are able to view the information on the Windows Os Profile settings defined on the Group
	public void TC_DMW_003_Validate_users_are_able_to_view_the_information_on_the_windows_os_profile_settings_defined_on_the_group() {
		deviceManagerPage.clickOnTheGroup(testdataProp.getProperty("groupName"));
		deviceManagerPage.clickOnTheWindowsOsProfileTab();
		String expectedWindowsOsProfileInfo = testdataProp.getProperty("expectedWindowsOsProfileInfo");
		String actualWindowsOsProfileInfo = deviceManagerPage.retrieveWindowsOsProfileInformation();
		Assert.assertTrue(actualWindowsOsProfileInfo.equalsIgnoreCase(expectedWindowsOsProfileInfo),
				"[Error: actualWindowsOsProfileInfo does not match with expectedWindowsOsProfileInfo]");
	}

	@Test(priority = 4) // Validate users are able to view the information on the Linux Os Profile settings defined on the Group
	public void TC_DMW_004_Validate_users_are_able_to_view_the_information_on_the_linux_os_profile_settings_defined_on_the_group() {
		deviceManagerPage.clickOnTheGroup(testdataProp.getProperty("groupName"));
		deviceManagerPage.clickOnTheLinuxOsProfileTab();
		String expectedLinuxOsProfileInfo = testdataProp.getProperty("expectedLinuxOsProfileInfo");
		String actualLinuxOsProfileInfo = deviceManagerPage.retrieveLinuxOsProfileInformation();
		Assert.assertTrue(actualLinuxOsProfileInfo.equalsIgnoreCase(expectedLinuxOsProfileInfo),
				"[Error: actualWindowsOsProfileInfo does not match with expectedWindowsOsProfileInfo]");
	}

	@Test(priority = 5) // Validate users are able to view System information about device registered
	public void TC_DMW_005_Validate_users_are_able_to_view_System_information_about_device_registered() {
		deviceManagerPage.clickOnTheGroup(testdataProp.getProperty("groupName"));
//		deviceManagerPage.selectTheDevice(testdataProp.getProperty("deviceIp"));
		deviceManagerPage.expandTheGroupSelected();
		deviceManagerPage.clickOnTheDevice(testdataProp.getProperty("deviceIp"));
		deviceManagerPage.clickOnSystemInformationTab();
		String expectedSystemInformation = testdataProp.getProperty("expectedSystemInformation");
		String actualSystemInformation = deviceManagerPage.retrieveSystemInformation();
//		Assert.assertTrue(actualSystemInformation.equalsIgnoreCase(expectedSystemInformation),
//				"[Error: actualSystemInformation does not match with expectedSystemInformation]");

		Assert.assertEquals(actualSystemInformation, expectedSystemInformation, "[Error: actualSystemInformation does not match with expectedSystemInformation]");
	}
	
	@Test(priority = 6) // Verify users are able to view System Profile about the device registered
	public void TC_DMW_006_Validate_users_are_able_to_view_System_profile_about_device_registerd() {
		deviceManagerPage.clickOnTheGroup(testdataProp.getProperty("groupName"));
		deviceManagerPage.expandTheGroupSelected();
		deviceManagerPage.clickOnTheDevice(testdataProp.getProperty("deviceIp"));
		deviceManagerPage.clickOnSystemProfileTab();
		Assert.assertTrue(deviceManagerPage.isSystemSettingsWindowsNodeDisplayed(), "System Settings Windows Node is not displayed");
	}
}
