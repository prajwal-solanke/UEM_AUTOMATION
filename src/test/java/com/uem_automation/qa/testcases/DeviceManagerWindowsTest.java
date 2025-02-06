package com.uem_automation.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

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

//	@BeforeMethod
	@BeforeClass
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

	@BeforeMethod
	public void selectDeviceManagerMenu() {
		deviceManagerPage.selectDeviceManagerMenu();
	}

//	@AfterMethod
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1) // UX-UEM-WD-005 // Validate users are able to view the settings applied on the Group
	public void TC_DMW_001_Validate_users_able_to_view_the_settings_applied_on_the_group() {
		deviceManagerPage.clickOnTheGroup(testdataProp.getProperty("groupName"));
		deviceManagerPage.clickOnTheGroupInformationTab();
		String expectedGroupInfo = testdataProp.getProperty("expectedGroupInfo");
		String actualGroupInfo = deviceManagerPage.retrieveGroupInformation();
		Assert.assertTrue(actualGroupInfo.contains(expectedGroupInfo),
				"[Error: actualGroupInfo does not match with expectedGroupInfo]");
	}

	@Test(priority = 2) // UX-UEM-WD-008 // Validate users are able to apply Execute later task or saved task on group.
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

	@Test(priority = 3) // UX-UEM-WD-006 // Validate users are able to view the information on the Windows Os Profile settings defined on the Group
	public void TC_DMW_003_Validate_users_are_able_to_view_the_information_on_the_windows_os_profile_settings_defined_on_the_group() {
		deviceManagerPage.clickOnTheGroup(testdataProp.getProperty("groupName"));
		deviceManagerPage.clickOnTheWindowsOsProfileTab();
		String expectedWindowsOsProfileInfo = testdataProp.getProperty("expectedWindowsOsProfileInfo");
		String actualWindowsOsProfileInfo = deviceManagerPage.retrieveWindowsOsProfileInformation();
		Assert.assertTrue(actualWindowsOsProfileInfo.equalsIgnoreCase(expectedWindowsOsProfileInfo),
				"[Error: actualWindowsOsProfileInfo does not match with expectedWindowsOsProfileInfo]");
	}

	@Test(priority = 4) // UX-UEM-WD-007 // Validate users are able to view the information on the Linux Os Profile settings defined on the Group
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

	@Test(priority = 7) // UX-UEM-WD-001
	public void TC_DM_007_UserIsAbleToSwitchGroupInformationBetweenCardAndGridOnTheGroup() {
		deviceManagerPage.clickOnTheGroup(testdataProp.getProperty("groupName"));
		deviceManagerPage.clickOnTheGroupInformationTab();
		deviceManagerPage.checkToogleDisplayView();
		deviceManagerPage.changeToogleDisplayView("card"); //card //grid
		deviceManagerPage.checkToogleDisplayView();
		deviceManagerPage.changeToogleDisplayView("grid"); //card //grid
		deviceManagerPage.checkToogleDisplayView();
	}

	@Test(priority = 8) // UX-UEM-WD-002
	public void TC_DM_008_UserIsAbleToViewHelpForEveryModule() {
		// Click on the group from the test data and verify it
		deviceManagerPage.clickOnTheGroup(testdataProp.getProperty("groupName"));

		// Assert that the Help Manual title is correct
		String helpManualTitle = deviceManagerPage.viewHelpManaualAndGetTitle();
		Assert.assertEquals(helpManualTitle, "Web IAS User Guide");
	}

	@Test(priority = 9) // UX-UEM-WD-003
	public void TC_DM_009_UserIsAbleToViewUpdatedDataOnTheGroup() {
		deviceManagerPage.selectTheGroup("UEM_AUTOMATION");
		deviceManagerPage.selectTheInfoTab("Group Information");
//		deviceManagerPage.getDataOnGroupInformation("Group Name");
		deviceManagerPage.verifyDataOnGroupInformation("Group Name", "UEM_AUTOMATION");
		deviceManagerPage.verifyDataOnGroupInformation("Group Hierarchy", "UEM_AUTOMATION");
		deviceManagerPage.verifyDataOnGroupInformation("Group Type", "Custom");
		deviceManagerPage.verifyDataOnGroupInformation("No of Subgroup", "0");
		deviceManagerPage.verifyDataOnGroupInformation("Total Device", "1");
		deviceManagerPage.verifyDataOnGroupInformation("Default Template", "0");
		deviceManagerPage.verifyDataOnGroupInformation("Policy Count", "0");
		deviceManagerPage.verifyDataOnGroupInformation("Pending Task", "0");
		deviceManagerPage.verifyDataOnGroupInformation("In-process Task", "0");
		deviceManagerPage.verifyDataOnGroupInformation("Closed Task", "0");
		deviceManagerPage.verifyDataOnGroupInformation("Repository Connection", "WebIAS_HTTP");
	}

	@Test(priority = 10) // UX-UEM-WD-004
	public void TC_DM_010_UserIsAbleToViewFullScreenForEveryModule() {
		deviceManagerPage
				.selectTheGroup("UEM_AUTOMATION")
				.selectTheInfoTab("Group Information")
				.viewFullScreen();
	}

	@Test(priority = 11) // UX-UEM-WD-009
	public void TC_DM_011_Users_are_able_to_search_os_specific_tasks() {
		deviceManagerPage
				.selectTheGroup("UEM_AUTOMATION")
				.selectTheInfoTab("Task Manager")
				.selectTaskManagerOs("Windows")
				.displayRecentTask();
	}

	@Test(priority = 12) // UX-UEM-WD-010
	public void TC_DM_012_Users_are_able_to_search_in_column() {
		Assert.fail("Note: Search in column is not availbale, column filter toogle enable/disable is removed");
//		deviceManagerPage
//				.selectTheGroup("UEM_AUTOMATION")
//				.selectTheInfoTab("Task Manager")
//				.selectTaskManagerOs("Windows")
//				.displayRecentTask()
//				.columnFilterToogle("Enable") // column filter toogle is removed in 3.10 WebIAS
//				.searchTheFunctionNameAndVerifySettingIsDisplayed("Keyboard Settings"); //Keyboard Settings
	}

	@Test(priority = 13) // UX-UEM-WD-011
	public void TC_DM_013_Users_are_able_to_use_taskManager_tooltip_columnVisibility_copy_exportToCsv_exportToExcel_pdf_print_cancel_pause_resume() throws InterruptedException {
		deviceManagerPage
				.selectTheGroup("UEM_AUTOMATION")
				.selectTheInfoTab("Task Manager")
				.selectTaskManagerOs("Windows")
				.selectColumnVisiblity("Function Name")
				.copySettingsToTheClipboard()
				.exportToCsv()
				.exportToExcel()
				.exportToPdf();
//				.print(); // it's not implemented yet
	}

	@Test(priority = 14) // UX-UEM-WD-012
	public void TC_DM_014_Users_are_able_to_view_applied_task_on_the_group() {
		deviceManagerPage
				.selectTheGroup("UEM_AUTOMATION")
				.selectTheInfoTab("Task Activity")
				.selectTheRecord_OsName_functionName_AndPrintAllTasks("1 Week", "All", "All");
	}

	@Test(priority = 15) // UX-UEM-WD-013
	public void TC_DM_015_Users_are_able_to_use_filter_selectRecords_osName_functionName() {
		deviceManagerPage
				.selectTheGroup("UEM_AUTOMATION")
				.selectTheInfoTab("Task Activity")
				.selectTheRecord_OsName_functionName_AndPrintAllTasks("1 Month", "Windows", "Mouse Settings");
	}

	@Test(priority = 16) // UX-UEM-WD-014  // try to execute this test on offline group to see the status
	public void TC_DM_016_Users_are_able_to_use_taskActivity_tooltip_columnVisibility_copy_exportToCsv_exportToExcel_pdf_print_cancel_pause_resume() throws InterruptedException {
		deviceManagerPage
				.selectTheGroup("UEM_AUTOMATION")
				.selectTheInfoTab("Task Activity")
				.selectColumnVisiblity("Host Name")
				.copySettingsToTheClipboard()
				.exportToCsv()
				.exportToExcel()
				.exportToPdf()
//				.print(); // it's not implemented yet
				.applyMouseSettings()
				.selectTheGroup("UEM_AUTOMATION")
				.selectTheInfoTab("Task Activity")
				.searchTaskDetailsInSearchBoxAndCheckIt("Mouse Settings")
				.applyPause()
				.searchTaskDetailsInSearchBoxAndCheckIt("Mouse Settings")
				.applyResume()
				.searchTaskDetailsInSearchBoxAndCheckIt("Mouse Settings")
				.applyCancel();
	}

	@Test(priority = 17) // UX-UEM-WD-015  // try to execute this test on offline group to see the status
	public void TC_DM_017_Users_are_able_to_cancel_recently_applied_() throws InterruptedException {
		deviceManagerPage
				.selectTheGroup("UEM_AUTOMATION")
				.applyMouseSettings()
				.selectTheGroup("UEM_AUTOMATION")
				.selectTheInfoTab("Task Activity")
				.searchTaskDetailsInSearchBoxAndCheckIt("Mouse Settings")
				.applyCancel();
	}

	@Test(priority = 18) // UX-UEM-WD-016  // try to execute this test on offline group to see the status
	public void TC_DM_018_Users_are_able_to_pause_recently_applied_() throws InterruptedException {
		deviceManagerPage
				.selectTheGroup("UEM_AUTOMATION")
				.applyMouseSettings()
				.selectTheGroup("UEM_AUTOMATION")
				.selectTheInfoTab("Task Activity")
				.searchTaskDetailsInSearchBoxAndCheckIt("Mouse Settings")
				.applyPause();
	}

	@Test(priority = 19) // UX-UEM-WD-017  // try to execute this test on offline group to see the status
	public void TC_DM_019_Users_are_able_to_resume_paused_task() throws InterruptedException {
		deviceManagerPage
				.selectTheGroup("UEM_AUTOMATION")
				.applyMouseSettings()
				.selectTheGroup("UEM_AUTOMATION")
				.selectTheInfoTab("Task Activity")
				.searchTaskDetailsInSearchBoxAndCheckIt("Mouse Settings")
				.applyPause()
				.searchTaskDetailsInSearchBoxAndCheckIt("Mouse Settings")
				.applyResume();
	}

	@Test(priority = 20) // UX-UEM-WD-018  // try to execute this test on offline group to see the status
	public void TC_DM_019_Users_are_able_to_set_autoGenerated_hostName() throws InterruptedException {
		deviceManagerPage
				.selectTheGroup("UEM_AUTOMATION")
				.applyComputerNameSettingsWithAutoGeneratedHostName("test", "", "Mac Address", "12", "prajwal", "123");
	}



}
