package com.uem_automation.qa.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import com.uem_automation.qa.utils.Utilities;

public class DeviceManagerPage {

    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Utilities.EXPLICIT_WAIT_TIME));

    // Objects
    @FindBy(xpath = "//div[@class='AjaxLoaderOuter loaderDivInitial']//button[@type='button'][normalize-space()='Please wait...']")
    private WebElement ajaxLoaderOuter;

    @FindBy(xpath = "//a[@class='topbrand-logo d-none d-block']//img[@alt='Logo']")
//a[@class='topbrand-logo d-none d-block']//img[@alt='Logo']")
    private WebElement logoTopMenu;

    @FindBy(xpath = "//img[@src='theme/dist/assets/media/logos/leftMenu-Logo.png']")
    //img[@src='theme/dist/assets/media/logos/leftMenu-Logo.png']")
    private WebElement logoLeftMenu;

    @FindBy(xpath = "//label[@id='ContentPlaceHolder1_MUIMainMenulblGrpInfrmtn']")
    private WebElement groupInformationTabElement;

    @FindBy(xpath = "//label[@id='ContentPlaceHolder1_MUIMainMenulblWndwsOSPrfl']")
    private WebElement WindowsOsProfileTabElement;

    @FindBy(xpath = "//label[@id='ContentPlaceHolder1_MUIMainMenulblLiOSPrfl']")
    private WebElement linuxOsProfileTabElement;

    @FindBy(xpath = "//*[@id='tblGroupListCard1']/tbody/tr/td[1]")
    private WebElement groupInformationElement;

    @FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblGrpSysSettng']")
    private WebElement windowsOsProfileInformationElement;

    @FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblSystemSettLinuxGroup']")
    private WebElement linuxOsProfileInformationElement;

    @FindBy(xpath = "//label[@id='ContentPlaceHolder1_MUIMainMenulblGrpTMDM']")
    private WebElement TaskManagerTab;

    @FindBy(xpath = "//td[contains(@class,'linklbl')][normalize-space()='1']")
    private WebElement taskEntry;

    @FindBy(xpath = "//a[@id='kt_aside_toggle']")
    private WebElement rhsMenuToogle;

    @FindBy(xpath = "//h1[normalize-space()='Windows']")
    private WebElement windowsRHStoogle;

    @FindBy(xpath = "(//label[@title='System Settings'][normalize-space()='System Settings'])[4]")
    private WebElement windowsSystemSettingsDropdown;

    @FindBy(xpath = "(//label[@title='Time and Language'][normalize-space()='Time and Language'])[2]")
    private WebElement windowsSystemSettingsTimeAndLanguageDropdown;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1']//li[@id='lblMenu_SysSettings_Window']//label[@title='Date & Time'][normalize-space()='Date & Time']")
    private WebElement windowsSystemSettingsTimeAndLanguageDateAndTimeDropdown;

    @FindBy(xpath = "//input[@id='XPDatetimeSett_rbtnDateInstant']/following-sibling::span") //
    private WebElement executeNowRadioButton;

    @FindBy(xpath = "//input[@id='XPDatetimeSett_rbtnDateSchedule']/following-sibling::span")
    private WebElement executeLaterRadioButton;

    @FindBy(xpath = "//input[@id='XPDatetimeSett_btnApplyDateTimeSetup' and @value='Save']")
    private WebElement btnSaveDateTimeSetup;

    @FindBy(xpath = "//div[@id='divIAgree']//label[@class='checkbox']//span")
    private WebElement iAgreeCheckbox;

    @FindBy(xpath = "//input[@id='btnOKConfirmationPopup']")
    private WebElement okConfirmationButtonPopup;

    @FindBy(xpath = "//label[@id='XPDatetimeSett_lblMSg_Success']")
    private WebElement dateTimeSettLblMsgSuccess;

    @FindBy(xpath = "//a[@href='https://www.sundynetech.com/']")
    private WebElement companyWebsiteUrlFooter;

    @FindBy(xpath = "//a[@class='icon-lg text-dark ki ki-close mr-1 ml-1 fa-1x closeGroupInfo CloseNew']")
    private WebElement closeGroupInfo;

    @FindBy(xpath = "//div[contains(@class,'rtSelected')]//span[contains(@class,'rtPlus')]")
    private WebElement expandSelectedGroupIconElement;

    @FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblsysteminformation']")
    private WebElement systemInformationTabElement;

    @FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblsystemprofile']")
    private WebElement systemProfileTabElement;

    @FindBy(xpath = "//span[@id='ContentPlaceHolder1_lblOSNameSysDetailsCE']")
    private WebElement systemDetailsElement;

    @FindBy(xpath = "//label[@id='ContentPlaceHolder1_lblSystemSettWinNode']")
    private WebElement systemSettingsWindowsNodeElement;

    @FindBy(xpath = "//span[@id='spUserInitials']")
    private WebElement userNameElementTop;

    @FindBy(xpath = "//span[@id='spUserInitials2']")
    private WebElement userNameElementLeft;

    @FindBy(xpath = "//a[@id='HeadLoginStatus']")
    private WebElement logoutButtonElement;

    @FindBy(xpath = "//input[@id='btnAlertLogOut']")
    private WebElement buttonAlertLogoOutElement;

    @FindBy(xpath = "//div[@class='dropdown viewDataMenu viewDataMenuTop']//div[@id='divTask']")
    private WebElement taskManagementTopMenuElement;

    @FindBy(xpath = "//a[contains(.,'Left Menu Position')]//span[contains(@data-position, 'top')]")
    private WebElement leftMenuPositionToTopDirection;

    @FindBy(xpath = "//a[@id='kt_quick_user_close']//i[@class='ki ki-close icon-sm text-dark']")
    private WebElement userExitIcon;

    @FindBy(xpath = "//a[contains(.,'Right Menu Position')]//span[@datamenu-position='right']")
    private WebElement rightMenuPositionToRightDirection;

    @FindBy(xpath = "//table[@id='tblGroupListCard1']")
    private WebElement tableGroupListCard;

    @FindBy(xpath = "//a[@id='btToggleDisplay']")
    private WebElement toogleDisplayButton;

    @FindBy(xpath = "//div[@data-original-title='Help Manual']")
    private WebElement helpManualButton;

    @FindBy(xpath = "//a[@id='achForGrp']")
    private WebElement buttonReload;

    @FindBy(xpath = "//a[@onclick='return fullscreenMap(this);']")
    private WebElement buttonFullscreen;

    @FindBy(xpath = "//select[@id='ddlTaskManagerdetailsOSType']")
    private WebElement taskManagerSelectOsDropdown;

    @FindBy(xpath = "//label[@for='chkshowcolumnfiltertblTaskManagerdetails']")
    private WebElement toogleColumnFilter;

    @FindBy(xpath = "//input[@placeholder='Search Function Name']")
    private WebElement searchFunctionTextbox;

    @FindBy(xpath = "//button[@title='Column Visibility']")
    private WebElement buttonColumnVisiblility;

    @FindBy(xpath = "//div[@class='datatableOptionsMain']//span[contains(text(),'Copy')]/parent::button | //button[@title='Copy']")
    private WebElement buttonCopyAllTaskRows;

    @FindBy(xpath = "//button[@title='Export to CSV']")
    private WebElement buttonExportToCsv;

    @FindBy(xpath = "//button[@title='Export to Excel']")
    private WebElement buttonExportToExcel;

    @FindBy(xpath = "//button[@title='Export to PDF']")
    private WebElement buttonExportPdf;

    @FindBy(xpath = "//select[@id='ddlScheduleDaysTaskDetailReport']")
    private WebElement dropdownRecord;

    @FindBy(xpath = "//select[@id='ddlOsTypeTaskDetailReport']")
    private WebElement dropdownOsName;

    @FindBy(xpath = "//button[@id='ContentPlaceHolder1_btnSearchTaskReport']")
    private WebElement buttonSearchTaskActivity;

    @FindBy(xpath = "//select[@id='ddlFunctionNameTaskDetailReport']")
    private WebElement dropdownFunctionName;

    @FindBy(xpath = "//div[@data-placement='bottom']//a[@id='ibtntHome']")
    private WebElement menuDeviceManager;

    @FindBy(xpath = "//input[@aria-controls='tblTaskDetailReport']")
    private WebElement taskActivitySearchTextbox;

    @FindBy(xpath = "//input[@id='chkTaskInfoCancelAllTaskGrp']")
    private WebElement selectAllTasksCheckbox;

    @FindBy(xpath = "//a[@id='btnDMTaskInfoPauseTaskGRP']")
    private WebElement buttonPause;

    @FindBy(xpath = "//input[@id='btnOkConformation']")
    private WebElement buttonOkConfirmation;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCancelConfirmation']")
    private WebElement buttonCloseConfirmation;

    @FindBy(xpath = "//a[@id='btnDMTaskInfoResumeTaskGRP']")
    private WebElement buttonResume;

    @FindBy(xpath = "//a[@id='btnDMTaskInfoCancelTaskGRP']")
    private WebElement buttonCancel;

    // apply mouse setting
    @FindBy(xpath = "//a[@id='kt_aside_toggle']")
    private WebElement rhsMenuToogleElement;

    @FindBy(xpath = "//li[@id='lblMenu_Windows']")
    private WebElement windowsLabelMenu;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1']//li[@id='lblMenu_SysSettings_Window']")
    private WebElement windowsSystemSettingsDropdownRhsMenu;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1']//li[@id='lblMenu_NetworkSettings_window']")
    private WebElement windowsSystemSettingsNetworkSettingsRhsMenu;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1']//li[@id='lblMenu_PeripheralSettings_window']")
    private WebElement windowsSystemSettingsPeripheralSettingsDropdown;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1']//li[@id='lblMenu_SysSettings_Window']//label[@title='Mouse Settings'][normalize-space()='Mouse Settings']")
    private WebElement windowsSystemSettingsPeripheralSettings_MouseSettings_Menu;

    @FindBy(xpath = "//input[@id='WindowsMouseSettings_btnApply']")
    private WebElement mouseSettingsApplyButton;

    @FindBy(xpath = "//label[@id='WindowsMouseSettings_lblMsg']")
    private WebElement mouseSettingsTaskUpdateStatusMessage;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1']//li[@id='lblMenu_SysSettings_Window']//label[@title='Computer Name'][normalize-space()='Computer Name']")
    private WebElement windowsSystemSettingsNetworkSettings_ComputerNameSettings_Menu;

    @FindBy(xpath = "//a[@id='XP_ComputerName_btnAssociation']")
    private WebElement iconAutoGenerate;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_CNtxtPrefix']")
    private WebElement textboxPrefix;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_CNtxtpostfix']")
    private WebElement textboxPostfix;

    @FindBy(xpath = "//select[@id='ddltypeCN']")
    private WebElement dropdownHostType;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_CNtxtNoChar']")
    private WebElement textboxNoOfCharOfMacAddressFromRight;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnSaveCNAssociation']")
    private WebElement buttonSaveHostNameGeneration;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCNClose']")
    private WebElement buttonCloseHostNameGeneration;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtDmianUname']")
    private WebElement textboxUsername_computerName;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtDmianPassword']")
    private WebElement textboxPassword_computerName;

    @FindBy(xpath = "//input[@id='XP_ComputerName_btnComputerNameApplyJQ']")
    private WebElement buttonApplyComputerNameSettings;

    @FindBy(xpath = "//label[@id='XP_ComputerName_lblMessage']")
    private WebElement computerNameStatusMessage;

    @FindBy(xpath = "//input[@id='XP_ComputerName_chkAutomatically']")
    private WebElement checkboxAutoGenerate;

    // add to profile
    @FindBy(xpath = "//a[@id='batchwiseCommonSettings_anchor']")
    private WebElement commonSettingAnchor;

    @FindBy(xpath = "//label[@id='lblEnable_GI']/preceding-sibling::span")
    private WebElement enableCheck;

    @FindBy(xpath = "//label[@id='lblDisable_GI']/preceding-sibling::span")
    private WebElement disableCheck;

    @FindBy(xpath = "//input[@id='btnModuleGlobalSettingSave']")
    private WebElement userSettingsSave;

    @FindBy(xpath = "//input[@id='lblCancel_GI']")
    private WebElement userSettingsCancel;

    @FindBy(xpath = "//label[@id='lblWindowsExecuteNow']/preceding-sibling::span")
    private WebElement radioExecuteNow;

    @FindBy(xpath = "//input[@id='WindowsMouseSettings_btnApply']")
    private WebElement applyMouseSettings;

    @FindBy(xpath = "//input[@id='btnRemoveAllPolicies']")
    private WebElement buttonRemoveAllPolicies;

    @FindBy(xpath = "//input[@id='btnRemoveAllPoliciesSave_GI']")
    private WebElement buttonSaveRemoveAllPolicies;

    @FindBy(xpath = "//input[@id='btnDeleteAllPermanentPoliciesApply']")
    private WebElement buttonApplyRemoveAllPolicies;

    @FindBy(xpath = "//span[@id='ContentPlaceHolder1_lblSummarybuttonClose']")
    private WebElement buttonCloseRemoveAllPolicies;

    @FindBy(xpath = "//input[@id='chkEnableBatchSettings']")
    private WebElement enableBatchSettingCheckboxStatus;

    @FindBy(xpath = "//input[@id='chkEnableBatchSettings']/following-sibling::span")
    private WebElement enableBatchSettingCheckbox;

    @FindBy(xpath = "//input[@id='txtModuleSettingBatchCount']")
    private WebElement batchCountTextbox;

    @FindBy(xpath = "//input[@id='txtModuleSettingBatchInterval']")
    private WebElement batchIntervalTextbox;

//    @FindBy(xpath = "xxxx")
//    private WebElement xxxx;
//
//    @FindBy(xpath = "xxxx")
//    private WebElement xxxx;

//    @FindBy(xpath = "xxxx")
//    private WebElement xxxx;

//    @FindBy(xpath = "xxxx")
//    private WebElement xxxx;

//    @FindBy(xpath = "xxxx")
//    private WebElement xxxx;

//    @FindBy(xpath = "xxxx")
//    private WebElement xxxx;

    // constructor
    public DeviceManagerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Select select;

    // Actions
    public boolean isLogoDisplayed(String companyWebsiteUrlproperty) {

//		waitTillFooterCompanyWebsiteURLIsDisplayed(companyWebsiteUrlproperty);
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (logoTopMenu.isDisplayed()) {
//			wait.until(ExpectedConditions.visibilityOf(logoTopMenu));
            return true;
        } else if (logoLeftMenu.isDisplayed()) {
//			wait.until(ExpectedConditions.visibilityOf(logoLeftMenu));
            return true;
        } else {
            return false;
        }

    }

    public void clickOnTheGroup(String groupNameProperty) {
        // Wait for the AJAX loader to disappear
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        // Wait until the group element is clickable, then click on it
        WebElement group = driver.findElement(By.xpath("//span[contains(text(), '" + groupNameProperty + " (')]"));
        wait.until(ExpectedConditions.elementToBeClickable(group));
        group.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
    }

    public void clickOnTheGroupInformationTab() {
        wait.until(ExpectedConditions.elementToBeClickable(groupInformationTabElement));
        groupInformationTabElement.click();
    }

    public void clickOnRHSMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogle));
        rhsMenuToogle.click();
    }

    public void clickOnWindowsRHS() {
        windowsRHStoogle.click();
    }

    public void clickOnWindowsSystemSettingRHS() {
        windowsSystemSettingsDropdown.click();
    }

    public void clickOnWindowsSystemSettingTimeAndLanguageRHS() {
        windowsSystemSettingsTimeAndLanguageDropdown.click();
    }

    public void clickOnWindowsSystemSettingTimeAndLanguageDateAndTimeRHS() {
        windowsSystemSettingsTimeAndLanguageDateAndTimeDropdown.click();
    }

//	public void waitTillFooterCompanyWebsiteURLIsDisplayed(String companyWebsiteUrlProperty) {
//		wait.until(ExpectedConditions.visibilityOf(companyWebsiteUrlFooter));
//		wait.until(ExpectedConditions.elementToBeClickable(companyWebsiteUrlFooter));
//		Assert.assertEquals(companyWebsiteUrlFooter.getText(), companyWebsiteUrlProperty,
//				"[Error: Footer element Company website url is not displyed or clickable]");
//	}

    public String retrieveGroupInformation() {
        return groupInformationElement.getText();
    }

    public void clickOnExecuteNowRadioButton() {
        executeNowRadioButton.click();
    }

    public void selectExecuteLaterRadioButton() {
        executeLaterRadioButton.click();
    }

    public void clickOnSave() {
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        // Fluent wait here
        Wait<WebDriver> waitFluent = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(Utilities.FLUENT_WAIT_TIME)) // maximum wait
                .pollingEvery(Duration.ofSeconds(2)) // polling interval
                .ignoring(NoSuchElementException.class); // Ignore specific exception

        waitFluent.until(driver -> btnSaveDateTimeSetup);

//		wait.until(ExpectedConditions.visibilityOf(btnSaveDateTimeSetup));
//        wait.until(ExpectedConditions.elementToBeClickable(btnSaveDateTimeSetup));
        btnSaveDateTimeSetup.click();
    }

    public void checkIagreeCheckboxAndClickOnOkButton() {
        wait.until(ExpectedConditions.elementToBeClickable(iAgreeCheckbox));
        iAgreeCheckbox.click();
        okConfirmationButtonPopup.click();
    }

    public String retrieveTheResponceMessageLabel() {
        wait.until(ExpectedConditions.visibilityOf(dateTimeSettLblMsgSuccess));
        return dateTimeSettLblMsgSuccess.getText();
    }

    public void clickOnTheTaskManagerTab() {
        TaskManagerTab.click();
    }

    public boolean isTaskEntryDisplayed() {
        return taskEntry.isDisplayed();
    }

    public void clickOnTheWindowsOsProfileTab() {
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.elementToBeClickable(WindowsOsProfileTabElement));
        WindowsOsProfileTabElement.click();
    }

    public void clickOnTheLinuxOsProfileTab() {
        wait.until(ExpectedConditions.elementToBeClickable(linuxOsProfileTabElement));
        linuxOsProfileTabElement.click();
    }

    public String retrieveWindowsOsProfileInformation() {
        return windowsOsProfileInformationElement.getText(); // SYSTEM SETTINGS
    }

    public String retrieveLinuxOsProfileInformation() {
        return linuxOsProfileInformationElement.getText(); // SYSTEM SETTINGS
    }

    public void selectTheDevice(String deviceIpProperty) {
        WebElement deviceIpChkboxElement = driver.findElement(
                By.xpath("//td[normalize-space()='" + deviceIpProperty + "']/parent::tr/td/div[@class='checkbox']"));
        deviceIpChkboxElement.click();
    }

    public void expandTheGroupSelected() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(expandSelectedGroupIconElement));
            expandSelectedGroupIconElement.click();
//            js.executeScript("arguments[0].click();", expandSelectedGroupIconElement);
        } catch (NoSuchElementException e) {
            Assert.fail("Selected Group is Empty.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void clickOnTheDevice(String deviceIpProperty) {
        WebElement deviceIpElement = driver
                .findElement(By.xpath("//span[normalize-space()='" + deviceIpProperty + "']"));
        deviceIpElement.click();
    }

    public void clickOnSystemInformationTab() {
        systemInformationTabElement.click();
    }

    public String retrieveSystemInformation() {
        return systemDetailsElement.getText();
    }

    public void clickOnSystemProfileTab() {
        systemProfileTabElement.click();

    }

    public boolean isSystemSettingsWindowsNodeDisplayed() {
        return systemSettingsWindowsNodeElement.isDisplayed();
    }

    public void logOutFromApplication() {
        if (userNameElementLeft.isDisplayed()) {
            userNameElementLeft.click();
        } else if (userNameElementTop.isDisplayed()) {
            userNameElementTop.click();
        }
//        userNameElementTop.click();
        logoutButtonElement.click();
        buttonAlertLogoOutElement.click();
    }

    public boolean isFooterWithCompanyWebsiteUrlDisplayed() {
        try {
            return companyWebsiteUrlFooter.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public void clickOnTaskManagementTopMenu() {
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        taskManagementTopMenuElement.click();
    }

    public void changeLeftMenuPosition() {
        if (userNameElementLeft.isDisplayed()) {
            userNameElementLeft.click();
            wait.until(ExpectedConditions.elementToBeClickable(leftMenuPositionToTopDirection));
            leftMenuPositionToTopDirection.click();
            userExitIcon.click();
        }
    }

    public void changeRightMenuPosition() {
        if (!rhsMenuToogle.isDisplayed()) {
            if (userNameElementLeft.isDisplayed()) {
                userNameElementLeft.click();
            } else {
                userNameElementTop.click();
            }
            wait.until(ExpectedConditions.elementToBeClickable(rightMenuPositionToRightDirection));
            rightMenuPositionToRightDirection.click();
            userExitIcon.click();
        }
    }

    public void changeToogleDisplayView(String view) {
        if (view == "cards") {
            if (!tableGroupListCard.getAttribute("class").contains("cards")) {
                toogleDisplayButton.click();
            }
        } else if (view == "grid") {
            if (tableGroupListCard.getAttribute("class").contains("cards")) {
                toogleDisplayButton.click();
            }
        }
    }

    public void checkToogleDisplayView() {
        if (tableGroupListCard.getAttribute("class").contains("cards")) {
            System.out.println("Toogle View: Cards");
        } else if (!tableGroupListCard.getAttribute("class").contains("cards")) {
            System.out.println("Toogle View: Grid");
        }
    }

    public String viewHelpManaualAndGetTitle() {
        // Click on the help manual button
        helpManualButton.click();

        // Store the current window handle (first tab/window)
        String firstWindowHandle = driver.getWindowHandle();
        String newWindowTitle = "";

        // Wait for a new window/tab to open
//        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // Switch to the new window/tab
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(firstWindowHandle)) {
                driver.switchTo().window(handle);
                newWindowTitle = driver.getTitle();
                break;
            }
        }
        driver.close();

        // Return the title of the new window/tab
//        return driver.getTitle();
        driver.switchTo().window(firstWindowHandle);
        return newWindowTitle;
        
    }

//    public void selectTheGroup(String groupName) {
//        // Wait for the AJAX loader to disappear
//        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//
//        // Wait until the group element is clickable, then click on it
//        WebElement group = driver.findElement(By.xpath("//span[contains(text(), '" + groupName + " (')]"));
//        wait.until(ExpectedConditions.elementToBeClickable(group));
//        group.click();
//        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//    }

    public DeviceManagerPage selectTheGroup(String groupName) {
        // Wait for the AJAX loader to disappear
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        // Wait until the group element is clickable, then click on it
        WebElement group = driver.findElement(By.xpath("//span[contains(text(), '" + groupName + " (')]"));
        wait.until(ExpectedConditions.elementToBeClickable(group));
        group.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        return this;
    }

//    public void selectTheInfoTab(String tab) {
//        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//        driver.findElement(By.xpath("//label[contains(@id, 'MainMenulbl')][normalize-space()='"+ tab +"']")).click();
//        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//    }

    public DeviceManagerPage selectTheInfoTab(String tab) {
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        driver.findElement(By.xpath("//label[contains(@id, 'MainMenulbl')][normalize-space()='" + tab + "']")).click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        return this;
    }

    public DeviceManagerPage verifyDataOnGroupInformation(String dataLabel, String dataValue) {
        wait.until(ExpectedConditions.elementToBeClickable(buttonReload)).click();
//        System.out.println(driver.findElement(By.xpath("//tbody//label[contains(normalize-space(),'Group Name')]/parent::td")).getText());
        String currentValue = driver.findElement(By.xpath("//tbody//label[contains(normalize-space(),'" + dataLabel + "')]/parent::td")).getText();// | //tbody//label[contains(.,'"+dataLabel+"')]/ancestor::td//spaan | //tbody//label[contains(.,'"+dataLabel+"')]/ancestor::td//a)")).getText();

        if (!currentValue.contains(dataValue)) {
            Assert.assertEquals(currentValue, dataValue, dataLabel + " value is not matching with " + dataValue);
        }
        return this;
    }

    public String getDataOnGroupInformation(String dataLabel) {
        String currentValue = driver.findElement(By.xpath("" +
                "//tbody//label[contains(.,'" + dataLabel + "')]/following-sibling::text() | " +
                "//tbody//label[contains(.,'" + dataLabel + "')]/ancestor::td//spaan | " +
                "//tbody//label[contains(.,'" + dataLabel + "')]/ancestor::td//a")).getText();

        return currentValue;
    }

    public void viewFullScreen() {
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        if (!buttonFullscreen.getDomAttribute("class").contains(" on")) {
            buttonFullscreen.click();
            buttonFullscreen.click();
        }
    }

    public DeviceManagerPage selectTaskManagerOs(String os) {
        Select select = new Select(taskManagerSelectOsDropdown);
        select.selectByVisibleText(os);
        return this;
    }

    public DeviceManagerPage displayRecentTask() {
        System.out.println(
                "Recent Task: " +
                        driver.findElement(By.xpath("//table[@id='tblTaskManagerdetails']//tbody//tr[last()]")).getText());
        return this;
    }

    public DeviceManagerPage columnFilterToogle(String status) {

//        boolean currentStatus = driver.findElement(By.xpath("//table[@id='tblTaskManagerdetails']//tr[@class='HeaderStyleSearch hidden']")).getDomAttribute("class").contains("hidden");

        if (status.equalsIgnoreCase("enable")) {
            toogleColumnFilter.click();
        }

        return this;
    }

    public void searchTheFunctionNameAndVerifySettingIsDisplayed(String settingName) {
        searchFunctionTextbox.clear();
        searchFunctionTextbox.sendKeys(settingName);

        String settingListEntry = "";
        try {
            settingListEntry = driver.findElement(By.xpath("(//a[@title='" + settingName + "'])[1]")).getText();
        } catch (NoSuchElementException e) {
            Assert.assertEquals(settingListEntry, settingName, "Error: " + settingName + "Setting is not displayed " + e.getMessage());
        }
    }

    public DeviceManagerPage selectColumnVisiblity(String columnName) {
        buttonColumnVisiblility.click();
        driver.findElement(By.xpath("//button[contains(@class, 'columnVisibility')]//span[contains(.,'" + columnName + "')]")).click();
        driver.findElement(By.xpath("//div[@class='dt-button-background']")).click();
        return this;
    }

    public DeviceManagerPage copySettingsToTheClipboard() {
        wait.until(ExpectedConditions.visibilityOf(buttonCopyAllTaskRows));
        wait.until(ExpectedConditions.elementToBeClickable(buttonCopyAllTaskRows)).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Copy to clipboard']")).isDisplayed());
        return this;
    }

    public DeviceManagerPage exportToCsv() {
        buttonExportToCsv.click();
        return this;
    }

    public DeviceManagerPage exportToExcel() {
        buttonExportToExcel.click();
        return this;
    }

    public DeviceManagerPage exportToPdf() throws InterruptedException {
        buttonExportPdf.click();
        Thread.sleep(2000);
        return this;
    }

    public void selectTheRecord_OsName_functionName_AndPrintAllTasks(String recordProperty, String osName, String functionName) {

        select = new Select(dropdownRecord);
        select.selectByVisibleText(recordProperty);

        select = new Select(dropdownOsName);
        select.selectByVisibleText(osName);

        select = new Select(dropdownFunctionName);
        select.selectByVisibleText(functionName);

        buttonSearchTaskActivity.click();

        // printing the task below on console

        List<WebElement> elements = driver.findElements(By.xpath("//table[@id='tblTaskDetailReport']//td[6]")); // task names column
        for(WebElement element: elements) {
            System.out.println("Task Name: " + wait.until(ExpectedConditions.elementToBeClickable(element)).getText());
        }

    }

    public void selectDeviceManagerMenu() {
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.elementToBeClickable(menuDeviceManager));
        menuDeviceManager.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
    }

    public DeviceManagerPage searchTaskDetailsInSearchBoxAndCheckIt(String taskDetail) {
        taskActivitySearchTextbox.sendKeys(taskDetail);
        selectAllTasksCheckbox.click();
//        selectAllTasksCheckbox.click();
        return this;
    }

    public DeviceManagerPage applyPause() {
        buttonPause.click();
        areYouSureWantToChangeTaskStatus("ok");
        return this;
    }

    private void areYouSureWantToChangeTaskStatus(String action) {
        if(action.equalsIgnoreCase("ok")) {
            buttonOkConfirmation.click(); //input[@id='btnOkConformation']
        } else {
            buttonCloseConfirmation.click(); //input[@id='ContentPlaceHolder1_btnCancelConfirmation']
        }
    }

    public DeviceManagerPage applyResume() {
        buttonResume.click();
        areYouSureWantToChangeTaskStatus("ok");
        return this;
    }

    public DeviceManagerPage applyCancel() {
        buttonCancel.click();
        areYouSureWantToChangeTaskStatus("ok");
        return this;
    }

    public DeviceManagerPage applyMouseSettings() {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        windowsLabelMenu.click();

        if (!(windowsSystemSettingsDropdownRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsDropdownRhsMenu));
            windowsSystemSettingsDropdownRhsMenu.click();
        }

        if (!(windowsSystemSettingsPeripheralSettingsDropdown.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsPeripheralSettingsDropdown));
            windowsSystemSettingsPeripheralSettingsDropdown.click();
        }

//        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//		wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
//		rhsMenuToogleElement.click();

//        windowsSystemSettingsDropdown.click();
//        windowsSystemSettingsPeripheralSettingsDropdown.click();
        windowsSystemSettingsPeripheralSettings_MouseSettings_Menu.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//        doubleClickSpeedSlowSlider.click();
//        doubleClickSpeedSlowSlider.sendKeys(Keys.ARROW_LEFT);
//        doubleClickSpeedSlowSlider.sendKeys(Keys.ARROW_RIGHT);
//
//        pointerSpeedSlowSlider.click();
//        pointerSpeedSlowSlider.sendKeys(Keys.ARROW_LEFT);
//        pointerSpeedSlowSlider.sendKeys(Keys.ARROW_RIGHT);
//
////        String leftHandConfiguration = "Y"; // Y // N
//        if (leftHandConfiguration.equalsIgnoreCase("Y")) {
//            leftHandConfigurationCheckbox.click();  // Change in keyboard locale(s) settings will require explicit reboot.
//        }

        mouseSettingsApplyButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        iAgreeCheckbox.click();
        okConfirmationButtonPopup.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (!((mouseSettingsTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(mouseSettingsTaskUpdateStatusMessage.getText());
        }

        return this;
    }

    public DeviceManagerPage applyComputerNameSettingsWithAutoGeneratedHostName(
            String prefix, String postfix, String type, String noOfChar, String username, String password
    ) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        windowsLabelMenu.click();

        if (!(windowsSystemSettingsDropdownRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsDropdownRhsMenu));
            windowsSystemSettingsDropdownRhsMenu.click();
        }

        if (!(windowsSystemSettingsNetworkSettingsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsNetworkSettingsRhsMenu));
            windowsSystemSettingsNetworkSettingsRhsMenu.click();
        }

        windowsSystemSettingsNetworkSettings_ComputerNameSettings_Menu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if(!checkboxAutoGenerate.isDisplayed()) {
            iconAutoGenerate.click();

            textboxPrefix.clear();
            textboxPrefix.sendKeys(prefix);

            textboxPostfix.clear();
            textboxPostfix.sendKeys(postfix);

            select = new Select(dropdownHostType);
            select.selectByVisibleText(type);

            if(type.equalsIgnoreCase("Mac Address")) {
                textboxNoOfCharOfMacAddressFromRight.clear();
                textboxNoOfCharOfMacAddressFromRight.sendKeys(noOfChar); //  no of char <= 12
            }
            buttonSaveHostNameGeneration.click();
            buttonCloseHostNameGeneration.click();

        }

        textboxUsername_computerName.sendKeys(username);
        textboxPassword_computerName.sendKeys(password);

        buttonApplyComputerNameSettings.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        iAgreeCheckbox.click();
        okConfirmationButtonPopup.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        if (!((computerNameStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(computerNameStatusMessage.getText());
        }
        return this;
    }

    public DeviceManagerPage applyMouseSettings1(String addToGroupProfile, String enableBatchSetting, String batchCount, String batchInterval) {

        // opening the task module
        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        windowsLabelMenu.click();

        if (!(windowsSystemSettingsDropdownRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsDropdownRhsMenu));
            windowsSystemSettingsDropdownRhsMenu.click();
        }

        if (!(windowsSystemSettingsPeripheralSettingsDropdown.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsPeripheralSettingsDropdown));
            windowsSystemSettingsPeripheralSettingsDropdown.click();
        }

        windowsSystemSettingsPeripheralSettings_MouseSettings_Menu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));


        // add to group profile
//        addToGroupProfile = "Y";
        if(addToGroupProfile.equalsIgnoreCase("Y")) {
            wait.until(ExpectedConditions.elementToBeClickable(commonSettingAnchor)).click();
            if (!enableCheck.isSelected()) {
                enableCheck.click();
            }
        } else if(addToGroupProfile.equalsIgnoreCase("N")) {
            wait.until(ExpectedConditions.elementToBeClickable(commonSettingAnchor)).click();
            if (!disableCheck.isSelected()) {
                disableCheck.click();
            }
        }

        // enable batch setting
        if(enableBatchSetting.equalsIgnoreCase("Y")) {
//            System.out.println(enableBatchSettingCheckbox.isSelected());
            if(!enableBatchSettingCheckboxStatus.isSelected()) {
                enableBatchSettingCheckbox.click();
                wait.until(ExpectedConditions.elementToBeClickable(batchCountTextbox));
                batchCountTextbox.clear();
                batchCountTextbox.sendKeys(batchCount);
                batchIntervalTextbox.clear();
                batchIntervalTextbox.sendKeys(batchInterval); // min
            }

        } else if (enableBatchSetting.equalsIgnoreCase("N")) {
//            System.out.println(enableBatchSettingCheckboxStatus.isSelected());
            if(enableBatchSettingCheckboxStatus.isSelected()) {
                enableBatchSettingCheckbox.click();
//                js.executeScript("arguments[0].click();", enableBatchSettingCheckbox);
            }
        }

        userSettingsSave.click();
        userSettingsCancel.click();

        // apply task - execute now
        radioExecuteNow.click();
        applyMouseSettings.click();

        iAgreeCheckbox.click();
        okConfirmationButtonPopup.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        // validate the success message
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        if (!((mouseSettingsTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(mouseSettingsTaskUpdateStatusMessage.getText());
        }

        return this;
    }

    public DeviceManagerPage removeAllPoliciesIn(String label) {
        if(!driver.findElement(By.xpath("//a[@class='badge bg-primary text-decoration-none cardviewpolicycount1']")).getText().equalsIgnoreCase("0")) {
            driver.findElement(By.xpath("//label[text()='" + label + "']/parent::td//a")).click();
            buttonRemoveAllPolicies.click();
            buttonSaveRemoveAllPolicies.click();
            buttonApplyRemoveAllPolicies.click();
            buttonCloseRemoveAllPolicies.click();
        }
        return this;
    }
}
