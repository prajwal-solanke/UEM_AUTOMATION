package com.uem_automation.qa.pages;

import com.uem_automation.qa.utils.Utilities;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import java.time.Duration;

public class SystemSettingsPage {

    public WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Utilities.EXPLICIT_WAIT_TIME));

    // Objects
    @FindBy(xpath = "//div[@class='AjaxLoaderOuter loaderDivInitial']//button[@type='button'][normalize-space()='Please wait...']")
    private WebElement ajaxLoaderOuter;

    @FindBy(xpath = "//label[text()='Request for settings update has been processed']")
    private WebElement taskUpdateStatusGreenMessage;

    @FindBy(xpath = "(//label[@title='System Settings'][normalize-space()='System Settings'])[4]")
    private WebElement windowsSystemSettingsDropdown;

    @FindBy(xpath = "//div[@class='dropdown viewDataMenu viewDataMenuTop']//div[@id='divTask']")
    private WebElement taskManagementTopMenuElement;

    @FindBy(xpath = "//a[@id='kt_aside_toggle']")
    private WebElement rhsMenuToogleElement;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Template Manager'][normalize-space()='Template Manager']")
    private WebElement templateManagerRhsMenuElement;

    @FindBy(xpath = "//a[@id='templatedivopen']")
    private WebElement allTemplatesDropdownElement;

    @FindBy(xpath = "//a[@id='btnaddtemplates']")
    private WebElement addTemplateIconElement;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_txtTemplateName']")
    private WebElement templateNameElement;

    @FindBy(xpath = "//select[@id='ddlostype']")
    private WebElement osTypeElement;

    @FindBy(xpath = "//select[@id='ddlTemplateType']")
    private WebElement taskScheduleTypeElement;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCreateTemplate']")
    private WebElement saveButtonElement;

    @FindBy(xpath = "//a[@href='https://www.sundynetech.com/']")
    private WebElement companyWebsiteUrlFooter;

    @FindBy(xpath = "//div[@id='divTemplateManSkipWriteFilterProcess']//label[@class='checkbox']")
    private WebElement skipWriteFilterCheckboxElement;

    @FindBy(xpath = "//select[@id='ddlTemplateType']")
    private WebElement taskScheduleTypeDropdownElement;

    @FindBy(xpath = "//select[@id='ddlTMPostponedInterval']")
    private WebElement allowTaskPostponementDropdownElement;

    @FindBy(xpath = "//textarea[@id='ContentPlaceHolder1_txtAddMessage_CreTem']")
    private WebElement templateStartMessageInputElement;

    @FindBy(xpath = "//select[@id='ddlTMPostponedDisplayTime']")
    private WebElement displayTimeDropdownElement;

    @FindBy(xpath = "//input[@id='ContentPlaceHolder1_btnCreateTemplate']")
    private WebElement saveButtonElement1;

    @FindBy(xpath = "//label[@id='lblNewTemplate_msg']")
    private WebElement templateAlreadyExistsElement;

    @FindBy(xpath = "//textarea[@id='textareaTMPostponedMessage']")
    private WebElement postponementMessageTextareaElement;

    @FindBy(xpath = "//select[@id='ddlTMPostponementDisplayTime']")
    private WebElement postponementDisplayTimeDropdownElement;

    @FindBy(xpath = "//input[@id='btnWarningHeaderNoDeviceAgentOK']")
    private WebElement warningAlertOkButtonElement;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_SysSettings_Window']")
    // "(//label[@title='System Settings'][normalize-space()='System Settings'])[4]"
    private WebElement windowsSystemSettingsDropdownRhsMenu;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_NetworkSettings_window']")
    //ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_SysSettings_Window']//label[@title='Network Settings'][normalize-space()='Network Settings']")
    private WebElement windowsSystemSettingsNetworkSettingsDropdown;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_SysSettings_Window']//label[@title='802.1x Security'][normalize-space()='802.1x Security']")
    private WebElement windowsSystemSettingsNetworkSettings_802_1x_securityMenu;

    @FindBy(xpath = "//input[@id='myInput']")
    private WebElement searchTemplateNameTextboxElement;

    // Network Setting

    // 802.1x Security
    @FindBy(xpath = "//div[@id='div8021xWirelessNetworkDropdown']//select") //select[@id='ddl8021NetworkType']")
    private WebElement networkType;

    @FindBy(xpath = "//input[@id='Text8021xSSID']")
    private WebElement ssid;

    @FindBy(xpath = "//select[@id='ddl8021xSecurityType']")
    private WebElement securityType;

    @FindBy(xpath = "//select[@id='ddl8021xEncryptionType']")
    private WebElement encryptionType;

    @FindBy(xpath = "//input[@id='Text8021xDomainName']")
    private WebElement domainName;

    @FindBy(xpath = "//input[@id='Text8021xUserName']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='Text8021xPassword']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='chkbxWinAuthAdvancedSettings']")
    private WebElement advanceSettOr802xSettingsCheckbox;

    @FindBy(xpath = "//input[@id='chkbxWinAuthSpecifyAuthenticationMode']")
    private WebElement specifyAuthenticationStringCheckbox;

    @FindBy(xpath = "//select[@id='ddlSelectWinAuthMode']")
    private WebElement authenticationModeDropdown;

    @FindBy(xpath = "//input[@id='winAuthentication_btnApply']")
    private WebElement security802xButtonSave;

    @FindBy(xpath = "(//label[@id='winAuthentication_lblMessage'])[1]")
    private WebElement windows802taskUpdateStatusMessage;

    // Computer Name
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_SysSettings_Window']//label[@title='Computer Name'][normalize-space()='Computer Name']")
    private WebElement windowsSystemSettingsNetworkSettings_ComputerName_Menu;

    // computerName
    @FindBy(xpath = "//label[@id='XP_ComputerName_lblMenuCmptrName']")
    private WebElement computerNameLabel;

    @FindBy(xpath = "//label[@id='XP_ComputerName_lblMenuDomain']")
    private WebElement domainLabel;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtPrefix']")
    private WebElement prefixTextbox;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtpostfix']")
    private WebElement postfixTextbox;

    @FindBy(xpath = "//select[@id='XP_ComputerName_ddltypeCNWindows']")
    private WebElement typeDropdown;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtNoChar']")
    private WebElement noOfCharOfMacAddressFromRightTextbox;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtSysviewUsername']")
    private WebElement computerNameUsernameTextbox;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtSysviewPassword']")
    private WebElement computerNamePasswordTextbox;

    // Domain
    @FindBy(xpath = "//div[@id='XP_ComputerName_dvDomain']//label[1]//span[1]")
    private WebElement radioButtonDomain;

    @FindBy(xpath = "//label[@class='radio']//input[@id='XP_ComputerName_rbtnWorkGroup']/following-sibling::span") //input[@id='XP_ComputerName_rbtnWorkGroup']")
    private WebElement radioButtonWorkgroup;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtDomain']")
    private WebElement domainNameTextbox;

    @FindBy(xpath = "//input[@id='XP_ComputerName_TxtOrganizationUnit']")
    private WebElement organizationalUnitTextbox;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtUserName']")
    private WebElement domainUsername;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtPassword']")
    private WebElement domainPassword;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtWorkgroup']")
    private WebElement workgroupNameTextbox;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtUserName']")
    private WebElement workgroupUsername;

    @FindBy(xpath = "//input[@id='XP_ComputerName_txtPassword']")
    private WebElement workgroupPassword;

    @FindBy(xpath = "//input[@id='XP_ComputerName_btnComputerNameApplyJQ']")
    private WebElement computerNameButtonSave;

    @FindBy(xpath = "//label[@id='XP_ComputerName_lblMessage']")
    private WebElement computerNameTaskUpdateStatusMessage;

    // Ethernet Setup
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_SysSettings_Window']//label[@title='Ethernet Setup'][normalize-space()='Ethernet Setup']")
    private WebElement windowsSystemSettingsNetworkSettings_EthernetSetup_Menu;

    @FindBy(xpath = "//input[@id='XPEthernetSetup_rbtnManual']")
    private WebElement radioButtonManual;

    @FindBy(xpath = "//input[@id='XPEthernetSetup_txtEthernetSubnetMask']")
    private WebElement subnetMaskTextbox;

    @FindBy(xpath = "//input[@id='XPEthernetSetup_txtEthernetPrimaryDNS']")
    private WebElement primaryDnsTextbox;

    @FindBy(xpath = "//input[@id='XPEthernetSetup_txtEthernetPrimaryWINS']")
    private WebElement primaryWinsTextbox;

    @FindBy(xpath = "//input[@id='XPEthernetSetup_txtEthernetGateWay']")
    private WebElement gatewayTextbox;

    @FindBy(xpath = "//input[@id='XPEthernetSetup_txtEthernetSecondaryDNS']")
    private WebElement secondaryDnsTextbox;

    @FindBy(xpath = "//input[@id='XPEthernetSetup_txtEthernetSecondaryWINS']")
    private WebElement secondaryWinsTextbox;

    @FindBy(xpath = "//input[@id='XPEthernetSetup_rbtnDHCP']")
    private WebElement radioButtonDHCP;

    @FindBy(xpath = "//div[@id='XPEthernetSetup_tblEthernetSetupView']//div[@class='checkbox-inline']//span")
    private WebElement obtainDnsAutomaticallyCheckbox;

    @FindBy(xpath = "//input[@id='XPEthernetSetup_btnEthernetApply']")
    private WebElement ethernetSetupButtonSave;

    @FindBy(xpath = "//label[@id='XPEthernetSetup_lblMsgEthernet']")
    private WebElement ethernetSetupTaskUpdateStatusMessage;

    // Wireless Properties
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_SysSettings_Window']//label[@title='Wireless Properties'][normalize-space()='Wireless Properties']")
    private WebElement windowsSystemSettingsNetworkSettings_WirelessProperties_Menu;

    @FindBy(xpath = "//input[@id='XPWirelessProp_txtW_networkname']")
    private WebElement networkSsidTextbox;

    @FindBy(xpath = "//select[@id='XPWirelessProp_ddlW_lN_Authontication']")
    private WebElement networkTypeDropdown;

    @FindBy(xpath = "//select[@id='XPWirelessProp_ddlWData_Encryption']")
    private WebElement encryptionTypeDropdown;

    @FindBy(xpath = "//input[@id='XPWirelessProp_txtW_networkkey']")
    private WebElement networkKeyTextbox;

    @FindBy(xpath = "//input[@id='XPWirelessProp_CHK_Network_in_Range']")
    private WebElement connectIfNetworkInRangeCheckbox;

    @FindBy(xpath = "//input[@id='XPWirelessProp_chkConnectnetworkboradcasting']")
    private WebElement connectIfNetworkIsNotBrodcastingCheckbox;

    @FindBy(xpath = "//input[@id='XPWirelessProp_btnSaveWifi_XP']")
    private WebElement wirelessPropertiesSaveButton;

    @FindBy(xpath = "(//label[@id='XPWirelessProp_lblMsg'])[1]")
    private WebElement wirelessPropertiesTaskUpdateStatusMessage;

    // Wireless Setup
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Wireless Setup'][normalize-space()='Wireless Setup']")
    private WebElement windowsSystemSettingsNetworkSettings_WirelessSetup_Menu;

    @FindBy(xpath = "//select[@id='XPWirelessSetup_ddlWirelessAction']")
    private WebElement wsAgentActionDropdown;

    @FindBy(xpath = "//input[@id='XPWirelessSetup_rdbManualWiFi']")
    private WebElement wsRadioButtonManual;

    @FindBy(xpath = "//input[@id='XPWirelessSetup_rdbDHCPWiFi']")
    private WebElement wsRadioButtonDhcp;

    @FindBy(xpath = "//input[@id='XPWirelessSetup_txtWifiSubnetMask']")
    private WebElement wsSubnetMaskTextbox;

    @FindBy(xpath = "//input[@id='XPWirelessSetup_txtWifiPrimayrDNS']")
    private WebElement wsPrimaryDnsTextbox;

    @FindBy(xpath = "//input[@id='XPWirelessSetup_txtWifiPriWINS']")
    private WebElement wsPrimaryWinsTextbox;

    @FindBy(xpath = "//input[@id='XPWirelessSetup_txtWifiGateway']")
    private WebElement wsGatewayTextbox;

    @FindBy(xpath = "//input[@id='XPWirelessSetup_txtWifiSecDNS']")
    private WebElement wsSecondaryDnsTextbox;

    @FindBy(xpath = "//input[@id='XPWirelessSetup_txtWifiSecWINS']")
    private WebElement wsSecondaryWinsTextbox;

    @FindBy(xpath = "//input[@id='XPWirelessSetup_btnWirelessSetupApplyJQ']")
    private WebElement wirelessSetupSaveButton;

    @FindBy(xpath = "//label[@id='XPWirelessSetup_lblMsg1']")
    private WebElement wirelessSetupTaskUpdateStatusMessage;

    //Display Settings
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_PeripheralSettings_window']")
    //ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_SysSettings_Window']//label[@title='Peripheral Settings'][normalize-space()='Peripheral Settings']")
    private WebElement windowsSystemSettingsPeripheralSettingsDropdown;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_SysSettings_Window']//label[@title='Display Settings'][normalize-space()='Display Settings']")
    private WebElement windowsSystemSettingsPeripheralSettings_DisplaySettings_Menu;

    @FindBy(xpath = "//select[@id='WindowsDisplaySettings_ddlResolution']")
    private WebElement displaySettingsResolutionDropdown;

    @FindBy(xpath = "//select[@id='WindowsDisplaySettings_ddlColorDepth']")
    private WebElement displaySettingsColorDepthDropdown;

    @FindBy(xpath = "//select[@id='WindowsDisplaySettings_ddlMultiDisplay']")
    private WebElement displaySettingsDualDisplayDropdown;

    @FindBy(xpath = "//select[@id='WindowsDisplaySettings_ddlOrienattion']")
    private WebElement displaySettingsRotaionDropdown;

    @FindBy(xpath = "//input[@id='WindowsDisplaySettings_btnApply']")
    private WebElement displaySettingsSaveButton;

    @FindBy(xpath = "//label[@id='WindowsDisplaySettings_lblMsg']")
    private WebElement displaySettingsTaskUpdateStatusMessage;

    //Keyboard Setup
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_SysSettings_Window']//label[@title='Keyboard Settings'][normalize-space()='Keyboard Settings']")
    private WebElement windowsSystemSettingsPeripheralSettings_KeyboardSettings_Menu;

    @FindBy(xpath = "//div[@id='WindowsKeyboardSettings_divRepeatDelay']//div[@role='slider']")
    private WebElement repeatDelayShortSlider;

    @FindBy(xpath = "//div[@id='WindowsKeyboardSettings_divRepeatRate']//div[@role='slider']")
    private WebElement repeatRateSlowSlider;

    @FindBy(xpath = "//select[@id='WindowsKeyboardSettings_ddlKeyboardLocales']")
    private WebElement keyboardLocalesDropdown;

    @FindBy(xpath = "//label[@id='WindowsKeyboardSettings_lblRemoveExist']/preceding-sibling::span")//div[@id='WindowsKeyboardSettings_pnlkeyboardSetup']//div[@class='col-lg-4 checkbox-inline']//span")
    private WebElement replaceAllExistingKeyboardCheckbox;

    @FindBy(xpath = "//input[@id='WindowsKeyboardSettings_btnApply']")
    private WebElement keyboardSettingsSaveButton;

    @FindBy(xpath = "//label[@id='WindowsKeyboardSettings_lblMsg']")
    private WebElement keyboardSettingsTaskUpdateStatusMessage;

    // Mouse Settings
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_SysSettings_Window']//label[@title='Mouse Settings'][normalize-space()='Mouse Settings']")
    private WebElement windowsSystemSettingsPeripheralSettings_MouseSettings_Menu;

    @FindBy(xpath = "//div[@id='WindowsMouseSettings_divDblClickSpeed']//div[@role='slider']")
    private WebElement doubleClickSpeedSlowSlider;

    @FindBy(xpath = "//div[@id='WindowsMouseSettings_divPointerSpeed']//div[@role='slider']")
    private WebElement pointerSpeedSlowSlider;

    @FindBy(xpath = "//div[@id='WindowsMouseSettings_pnlkeyboardSetup']//div[@class='form-group row']//span")
    private WebElement leftHandConfigurationCheckbox;

    @FindBy(xpath = "//input[@id='WindowsMouseSettings_btnApply']")
    private WebElement mouseSettingsSaveButton;

    @FindBy(xpath = "//label[@id='WindowsMouseSettings_lblMsg']")
    private WebElement mouseSettingsTaskUpdateStatusMessage;

    //Power Management

    //Power Option
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_powermanagement_window']")
    //ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Power Management'][normalize-space()='Power Management']")
    private WebElement windowsSystemSettingsPowerManagementDropdown;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Power Option'][normalize-space()='Power Option']")
    private WebElement windowsSystemSettingsPowerManagement_PowerOption_Menu;

    @FindBy(xpath = "//select[@id='XPPowerOption_ddlPowerplan']")
    private WebElement powerPlanDropdown;

    @FindBy(xpath = "//select[@id='XPPowerOption_ddlDisplay']")
    private WebElement turnOffDisplayDropdown;

    @FindBy(xpath = "//select[@id='XPPowerOption_ddlSleep']")
    private WebElement putCompToSleepTimeDropdown;

    @FindBy(xpath = "//input[@id='XPPowerOption_btnPowerOptionSave']")
    private WebElement powerOptionSaveButton;

    @FindBy(xpath = "//label[@id='XPPowerOption_lblMessage']")
    private WebElement powerOptionTaskUpdateStatusMessage;

    // Printer Settings

    // add printer
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_printerSettings_window']")
    //ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_SysSettings_Window']//label[@title='Printer Settings'][normalize-space()='Printer Settings']")
    private WebElement windowsSystemSettingsPrinterSettingsDropdown;

    @FindBy(xpath = "//ul[contains(@class,'menu-nav mt-n1 page-sidebar-menu')]//label[@title='Add Printer'][normalize-space()='Add Printer']")
    private WebElement windowsSystemSettingsPrinterSettings_addPrinter_Menu;

    @FindBy(xpath = "//ul[contains(@class,'menu-nav mt-n1 page-sidebar-menu')]//label[@title='Add Printer'][normalize-space()='Add Printer']")
    private WebElement portTypeLabel;

    @FindBy(xpath = "//select[@id='XPPrinter_ddlPrinterType']")
    private WebElement portTypeDropdown;

    @FindBy(xpath = "//input[@id='XPPrinter_txtLocalPrinterName']")
    private WebElement printerNameTextarea;

    @FindBy(xpath = "//select[@id='XPPrinter_ddlManufacturer']")
    private WebElement manufacturerDropdown;

    @FindBy(xpath = "//select[@id='XPPrinter_ddlPrinterDriverLists']")
    private WebElement printerDriverListDropdown;

    @FindBy(xpath = "//select[@id='XPPrinter_ddlPortlist']")
    private WebElement portDropdown;

    @FindBy(xpath = "//div[@id='XPPrinter_dvnewPriner']//div[@class='form-group row']//label[1]//span[1]")
    private WebElement sharedCheckbox;

    @FindBy(xpath = "//div[@id='XPPrinter_dvnewPriner']//div[@class='form-group row']//label[2]//span[1]")
    private WebElement notSharedCheckbox;

    @FindBy(xpath = "//input[@id='XPPrinter_btnXPPrinter']")
    private WebElement addPrinterSaveButton;

    @FindBy(xpath = "//input[@id='XPPrinter_txtIPAddress']")
    private WebElement ipAddressTextarea;

    @FindBy(xpath = "//input[@id='XPPrinter_txtPortNumber']")
    private WebElement portTextarea;

    @FindBy(xpath = "//input[@id='XPPrinter_txtNwUserName']")
    private WebElement printerUsernameTextbox;

    @FindBy(xpath = "//input[@id='XPPrinter_txtNwPassword']")
    private WebElement printerPasswordTextbox;

    @FindBy(xpath = "//label[@id='XPPrinter_lblMsgsPrinter']")
    private WebElement addPrinterTaskUpdateStatusMessage;

    // Time and Language

    // Date & Time
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_NetworkSettings_win']")
    private WebElement windowsSystemSettingsTimeAndLanguageDropdown;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Date & Time'][normalize-space()='Date & Time']")
    private WebElement windowsSystemSettingsTimeAndLanguage_dataAndTime_Menu;

    @FindBy(xpath = "//label[@id='XPDatetimeSett_lblDateTime']")
    private WebElement dateTimeTabElement;

    @FindBy(xpath = "//input[@id='XPDatetimeSett_txtDate']")
    private WebElement setDateField;

    @FindBy(xpath = "//input[@id='XPDatetimeSett_txtTimeSet']")
    private WebElement setTimeField;

    @FindBy(xpath = "//select[@aria-label='Select month']")
    private WebElement monthSelect;

    @FindBy(xpath = "//select[@aria-label='Select year']")
    private WebElement yearSelect;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']//a")
    private List<WebElement> days;

    // Time Zone
    @FindBy(xpath = "//label[@id='XPDatetimeSett_lbTimeZonec']")
    private WebElement timeZoneTabElement;

    @FindBy(xpath = "//select[@id='XPDatetimeSett_ddlTimeZone']")
    private WebElement timeZoneDropdownElement;

    // Time Server
    @FindBy(xpath = "//label[@id='XPDatetimeSett_lblTimeServers']")
    private WebElement timeServerTabElement;

    @FindBy(xpath = "//input[@id='XPDatetimeSett_txtCombobox']")
    private WebElement timeServerDropdownElement;

    @FindBy(xpath = "//input[@id='XPDatetimeSett_btnApplyDateTimeSetup']")
    private WebElement dateAndTimeSaveButton;

    @FindBy(xpath = "//label[@id='XPDatetimeSett_lblMSg_Success']")
    private WebElement dateAndTimeTaskUpdateStatusMessage;

    // Region and Location
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Region and Location'][normalize-space()='Region and Location']")
    private WebElement windowsSystemSettingsTimeAndLanguage_regionAndLocation_Menu;

    @FindBy(xpath = "//label[@id='XPDateTimeFormat_lblRegionLocation']")
    private WebElement regionAndLocationTabElement;

    @FindBy(xpath = "//select[@id='XPDateTimeFormat_ddlLocation']")
    private WebElement locationDropdownElement;

    @FindBy(xpath = "//select[@id='XPDateTimeFormat_ddlRegion']")
    private WebElement formatDropdownElement;

    @FindBy(xpath = "//label[@id='XPDateTimeFormat_lblDateTimeFormat']")
    private WebElement dateAndTimeFormatTabElement;

    @FindBy(xpath = "//select[@id='XPDateTimeFormat_ddlShortDateSeparator']")
    private WebElement dateSeparatorDropdown;

    @FindBy(xpath = "//select[@id='XPDateTimeFormat_ddlShortDateFormat']")
    private WebElement shortDateFormatDropdown;

    @FindBy(xpath = "//select[@id='XPDateTimeFormat_ddlLongDateFormat']")
    private WebElement longDateFormatDropdown;

    @FindBy(xpath = "//select[@id='XPDateTimeFormat_ddlTimeSettings']")
    private WebElement timeFormatDropdown;

    @FindBy(xpath = "//input[@id='XPDateTimeFormat_btnApplyDateTimeFormat']")
    private WebElement regionAndLocationSaveButton;

    @FindBy(xpath = "//label[@id='XPDateTimeFormat_lblMSg_Success']")
    private WebElement regionAndLocationTaskUpdateStatusMessage;


    // Constructor
    public SystemSettingsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Initialize the classes
    Select select;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    // Actions

    public void applySystemSettings_networkSettings_802xSecurity(
            String networkTypeString, String ssidInput, String securityTypeString, String encryptionTypeString,
            String domainNameInput, String domainUsernameInput, String domainPasswordInput, String advanceSettOr802xSettingsString,
            String specifyAuthenticationString, String authenticationModeString) {

        // Close the RHS menu if it's active
        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        // Open the System Settings dropdown if it's not open
        if (!windowsSystemSettingsDropdownRhsMenu.getAttribute("class").contains("menu-item-open")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsDropdownRhsMenu));
            windowsSystemSettingsDropdownRhsMenu.click();
        }

        // Open the Network Settings dropdown if it's not open
        if (!windowsSystemSettingsNetworkSettingsDropdown.getAttribute("class").contains("menu-item-open")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsNetworkSettingsDropdown));
            windowsSystemSettingsNetworkSettingsDropdown.click();
        }

        // Click on the 802.1x security settings menu
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsSystemSettingsNetworkSettings_802_1x_securityMenu.click();

        // Wait for the AJAX loader to disappear
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        // Select the network type (Wireless/Ethernet)
        WebElement networkType1 = driver.findElement(By.xpath("//div[@id='div8021xWirelessNetworkDropdown']//select"));
        select = new Select(networkType1);
        select.selectByVisibleText(networkTypeString);

//        Select select1 = new Select(networkType);
//        select1.selectByVisibleText(networkTypeString);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Handle Wireless Network settings
        if (networkTypeString.equalsIgnoreCase("Wireless Network")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            ssid.sendKeys(ssidInput); // Enter SSID

            // Select the security type (WPA2-Enterprise or 802.1X)
            select = new Select(securityType);
            select.selectByValue(securityTypeString);

            // Handle security options based on selected type
            if (securityTypeString.equalsIgnoreCase("WPA2-Enterprise")) {
                select = new Select(encryptionType);
                select.selectByValue(encryptionTypeString); // Select encryption type
            } else if (securityTypeString.equalsIgnoreCase("802.1X")) {
                select = new Select(encryptionType);
                select.selectByValue(encryptionTypeString); // Select encryption type
            }

            // Enter domain credentials
            domainName.sendKeys(domainNameInput);
            username.sendKeys(domainUsernameInput);
            password.sendKeys(domainPasswordInput);
        }

        // Handle Ethernet Network settings (not implemented)
        else if (networkTypeString.equalsIgnoreCase("Ethernet Network")) {
            // Add relevant Ethernet settings if required
        }

        // Handle advanced settings or 802.x settings checkbox
        if (advanceSettOr802xSettingsString.equalsIgnoreCase("Y")) {
            js.executeScript("arguments[0].click();", advanceSettOr802xSettingsCheckbox);
        }

        // Handle specify authentication settings
        if (specifyAuthenticationString.equalsIgnoreCase("Y")) {
            js.executeScript("arguments[0].click();", specifyAuthenticationStringCheckbox);

            // Select the authentication mode (User or Computer Authentication)
            select = new Select(authenticationModeDropdown);
            select.selectByVisibleText(authenticationModeString);
        }

        // Save the 802.x security settings
        security802xButtonSave.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(windows802taskUpdateStatusMessage));

        // Verify if the settings were saved successfully
        String statusMessage = windows802taskUpdateStatusMessage.getText();
        if (!statusMessage.equals("Windows 802.1x Security Settings Saved Successfully")) {
            Assert.fail(statusMessage);
        }
    }


    public void applySystemSettings_networkSettings_computerName(String selectTab, String prefixTestdata, String postfixTestdata,
                                                                 String type, String noOfChar, String compNameUsername,
                                                                 String compNamePassword, String radioType, String testDomainname, String testOrganizationalUnit, String testdomainusername, String testdomainpassword, String testworkgroupname, String testworkgroupusername, String testworkgrouppassword) {


        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSystemSettingsDropdownRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsDropdownRhsMenu));
            windowsSystemSettingsDropdownRhsMenu.click();
        }

        if (!(windowsSystemSettingsNetworkSettingsDropdown.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsNetworkSettingsDropdown));
            windowsSystemSettingsNetworkSettingsDropdown.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsSystemSettingsNetworkSettings_ComputerName_Menu.click();

        // Computer Name
//        String selectTab = "ComputerName"; // ComputerName // Domain

        if (selectTab.equalsIgnoreCase("ComputerName")) {

            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(computerNameLabel));
            computerNameLabel.click();

            prefixTextbox.sendKeys(prefixTestdata); // test data

            postfixTextbox.sendKeys(postfixTestdata); // test data

//            String type = "Mac Address"; // Select // Mac Address // Serial Number

            select = new Select(typeDropdown);
            select.selectByVisibleText(type);

            if (type.equalsIgnoreCase("Mac Address")) {
                noOfCharOfMacAddressFromRightTextbox.sendKeys(noOfChar); // 12 //test data // double digit numbers only
            }

            computerNameUsernameTextbox.sendKeys(compNameUsername); // test data

            computerNamePasswordTextbox.sendKeys(compNamePassword); // test data

        } else if (selectTab.equalsIgnoreCase("Domain")) {

            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            domainLabel.click();

//          String radioType = "Domain"; // Domain // Workgroup

            if (radioType.equalsIgnoreCase("Domain")) {

                radioButtonDomain.click();

                domainNameTextbox.sendKeys(testDomainname); // test data

                organizationalUnitTextbox.sendKeys(testOrganizationalUnit); // test data

//				Select select = new Select(agentActionDropdown);
//				select.deselectByVisibleText("testdata"); // ? dom not showing any options

                domainUsername.sendKeys(testdomainusername); // test data

                domainPassword.sendKeys(testdomainpassword); // test data

            } else if (radioType.equalsIgnoreCase("Workgroup")) {

                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//                wait.until(ExpectedConditions.elementToBeClickable(radioButtonWorkgroup));
//                js.executeScript("arguments[0].click();", radioButtonWorkgroup);
                radioButtonWorkgroup.click();

                workgroupNameTextbox.clear();
                workgroupNameTextbox.sendKeys(testworkgroupname); // test data

//				Select select = new Select(agentActionDropdown);
//				select.deselectByVisibleText("testdata"); // ? dom not showing any options

                workgroupUsername.sendKeys(testworkgroupusername); // test data

                workgroupPassword.sendKeys(testworkgrouppassword); // test data

            }

        }

        computerNameButtonSave.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(computerNameTaskUpdateStatusMessage));
        if (!((computerNameTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(computerNameTaskUpdateStatusMessage.getText());
        }
    }

    public void applySystemSettings_networkSettings_ethernetSetup(String ethernetSetupType, String obtainDnsAutomatically, String primaryDnsInput,
                                                                  String secondaryDnsInput)  {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSystemSettingsDropdownRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsDropdownRhsMenu));
            windowsSystemSettingsDropdownRhsMenu.click();
        }

        if (!(windowsSystemSettingsNetworkSettingsDropdown.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsNetworkSettingsDropdown));
            windowsSystemSettingsNetworkSettingsDropdown.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsSystemSettingsNetworkSettings_EthernetSetup_Menu.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

//        String ethernetSetupType = "DHCP"; // Manual // DHCP // there is no use of Manual for now that's why it's commented as per instructed.

        if (ethernetSetupType.equalsIgnoreCase("Manual")) {

//			radioButtonManual.click(); // getting element click intercepted exception
//            jsExecutor.executeScript("arguments[0].click();", radioButtonManual);
//
//            subnetMaskTextbox.clear();
//            subnetMaskTextbox.sendKeys("192.168.10.1"); // Test data
//
//            primaryDnsTextbox.clear();
//            primaryDnsTextbox.sendKeys("192.168.10.1"); // Test data
//
//            primaryWinsTextbox.clear();
//            primaryWinsTextbox.sendKeys("192.168.10.1"); // Test data
//
//            gatewayTextbox.clear();
//            gatewayTextbox.sendKeys("192.168.10.1"); // Test data
//
//            secondaryDnsTextbox.clear();
//            secondaryDnsTextbox.sendKeys("192.168.10.1"); // Test data
//
//            secondaryWinsTextbox.clear();
//            secondaryWinsTextbox.sendKeys("192.168.10.1"); // Test data

            System.out.println("Ethernet Setup 'Manual' Setup code is commented.....");

        } else if (ethernetSetupType.equalsIgnoreCase("DHCP")) {

//			radioButtonDHCP.click();
            jsExecutor.executeScript("arguments[0].click();", radioButtonDHCP);

//            String obtainDnsAutomatically = "Y"; // Y // N

            if (obtainDnsAutomatically.equalsIgnoreCase("Y")) {

                obtainDnsAutomaticallyCheckbox.click();

            } else if (obtainDnsAutomatically.equalsIgnoreCase("N")) {

                primaryDnsTextbox.clear();
                primaryDnsTextbox.sendKeys(primaryDnsInput); // "192.168.10.1"); // Test data

                secondaryDnsTextbox.clear();
                secondaryDnsTextbox.sendKeys(secondaryDnsInput); // "192.168.10.1"); // Test data

            }

        }

        ethernetSetupButtonSave.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (!((ethernetSetupTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(ethernetSetupTaskUpdateStatusMessage.getText());
        }

    }

    public void applySystemSettings_networkSettings_wirelessProperties(String networkSsid, String networkType, String encryptionType, String networkKeysInput,
                                                                       String connectIfNetworkInRange, String connectIfNetworkIsNotBrodcasting) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSystemSettingsDropdownRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsDropdownRhsMenu));
            windowsSystemSettingsDropdownRhsMenu.click();
        }

        if (!(windowsSystemSettingsNetworkSettingsDropdown.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsNetworkSettingsDropdown));
            windowsSystemSettingsNetworkSettingsDropdown.click();
        }

//		Thread.sleep(1000);
//		wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
//		rhsMenuToogleElement.click();

//        windowsSystemSettingsDropdown.click();
//
//        wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsNetworkSettingsDropdown));
//        windowsSystemSettingsNetworkSettingsDropdown.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsSystemSettingsNetworkSettings_WirelessProperties_Menu.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));


        //
        networkSsidTextbox.sendKeys(networkSsid); // test data

//        String networkType = "No Authentication (Open)"; // No Authentication (Open) // Shared // WPA2-Personal //
        // WPA-Personal // WPA2-Enterprise // WPA-Enterprise

        Select select = new Select(networkTypeDropdown);
        select.selectByVisibleText(networkType);

        if (!(networkType.equalsIgnoreCase("No Authentication (Open)"))) {

//            String encryptionType = "TKIP"; // TKIP // AES

            select = new Select(encryptionTypeDropdown);
            select.selectByValue(encryptionType);

            networkKeyTextbox.sendKeys(networkKeysInput);

        }

//        String connectIfNetworkInRange = "Y"; // Y // N

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        if (connectIfNetworkInRange.equalsIgnoreCase("Y")) {

//			connectIfNetworkInRangeCheckbox.click();
            jsExecutor.executeScript("arguments[0].click();", connectIfNetworkInRangeCheckbox);

        }

//        String connectIfNetworkIsNotBrodcasting = "Y"; // Y // N

        if (connectIfNetworkIsNotBrodcasting.equalsIgnoreCase("Y")) {

//			connectIfNetworkIsNotBrodcastingCheckbox.click();
            jsExecutor.executeScript("arguments[0].click();", connectIfNetworkIsNotBrodcastingCheckbox);

        }

        wirelessPropertiesSaveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(wirelessPropertiesTaskUpdateStatusMessage));
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        if (!((wirelessPropertiesTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(wirelessPropertiesTaskUpdateStatusMessage.getText());
        }
    }

    public void applySystemSettings_networkSettings_wirelessSetup(String wirelessSetupType) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSystemSettingsDropdownRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsDropdownRhsMenu));
            windowsSystemSettingsDropdownRhsMenu.click();
        }

        if (!(windowsSystemSettingsNetworkSettingsDropdown.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsNetworkSettingsDropdown));
            windowsSystemSettingsNetworkSettingsDropdown.click();
        }

//		Thread.sleep(1000);
//		wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
//		rhsMenuToogleElement.click();

//        windowsSystemSettingsDropdown.click();
//
//        wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsNetworkSettingsDropdown));
//        windowsSystemSettingsNetworkSettingsDropdown.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsSystemSettingsNetworkSettings_WirelessSetup_Menu.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

//        String wirelessSetupType = "Manual"; // Manual // DHCP

        if (wirelessSetupType.equalsIgnoreCase("Manual")) {

////			wsRadioButtonManual.click();
//            jsExecutor.executeScript("arguments[0].click();", wsRadioButtonManual);
//
//            wsSubnetMaskTextbox.sendKeys(subnetMask); // test data
//
//            wsPrimaryDnsTextbox.sendKeys(primaryDns); // test data
//
//            wsPrimaryWinsTextbox.sendKeys(primaryWins); // test data
//
////					Select select = new Select(wsAgentActionDropdown);
////					select.selectByVisibleText("testdata"); // ? dom not showing any options
//
//            wsGatewayTextbox.sendKeys(gateway); // test data
//
//            wsSecondaryDnsTextbox.sendKeys(secondaryDns); // test data
//
//            wsSecondaryWinsTextbox.sendKeys(secondaryWins); // test data

            System.out.println("Wireless Setup 'Manual' Setup code is commented.....");

        } else if (wirelessSetupType.equalsIgnoreCase("DHCP")) {

//			wsRadioButtonDhcp.click();
            jsExecutor.executeScript("arguments[0].click();", wsRadioButtonDhcp);

//					Select select = new Select(wsAgentActionDropdown);
//					select.deselectByVisibleText("testdata"); // ? dom not showing any options

        }

        wirelessSetupSaveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(wirelessSetupTaskUpdateStatusMessage));
        if (!((wirelessSetupTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(wirelessSetupTaskUpdateStatusMessage.getText());
        }
    }

    public void applySystemSettings_peripheralSettings_displaySettings(String displayResolution, String displayColorDepth, String dualDisplay, String rotation) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

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

//      wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//		wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
//		rhsMenuToogleElement.click();

//        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//        windowsSystemSettingsDropdown.click();

//        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//        windowsSystemSettingsPeripheralSettingsDropdown.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsPeripheralSettings_DisplaySettings_Menu));
        windowsSystemSettingsPeripheralSettings_DisplaySettings_Menu.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        wait.until(ExpectedConditions.visibilityOf(displaySettingsResolutionDropdown));
        Select select = new Select(displaySettingsResolutionDropdown);
        select.selectByVisibleText(displayResolution); // ---Select--- //800 X 600 @ 60 Hz //800 X 600 @ 75 Hz //1024 X 768 @ 60 Hz //1024 X 768 @ 75 Hz

        select = new Select(displaySettingsColorDepthDropdown);
        select.selectByVisibleText(displayColorDepth); // ---Select--- //Largest (32-bit)

        select = new Select(displaySettingsDualDisplayDropdown);
//        String dualDisplay = "Disabled"; // Disabled //Duplicate //Extended
        select.selectByVisibleText(dualDisplay);

        if (dualDisplay.equalsIgnoreCase("Extended")) {
            select = new Select(displaySettingsRotaionDropdown); // Note :-The rotation property is not available on Windows XP.
            select.selectByVisibleText(rotation);  // ---Select--- //0° //90° //180° //270°
        }

        displaySettingsSaveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (!((displaySettingsTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(displaySettingsTaskUpdateStatusMessage.getText());
        }
    }

    public void applySystemSettings_peripheralSettings_keyboardSettings(String keyboardLocales, String replaceAllExistingKeyboard) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

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

//      wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//		wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
//		rhsMenuToogleElement.click();

//        windowsSystemSettingsDropdown.click();
//        windowsSystemSettingsPeripheralSettingsDropdown.click();
//
//        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//        wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsPeripheralSettings_KeyboardSettings_Menu));
        windowsSystemSettingsPeripheralSettings_KeyboardSettings_Menu.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        repeatDelayShortSlider.click();
        repeatDelayShortSlider.sendKeys(Keys.ARROW_LEFT); // slider
        repeatDelayShortSlider.sendKeys(Keys.ARROW_RIGHT); // slider

        repeatRateSlowSlider.click();
        repeatRateSlowSlider.sendKeys(Keys.ARROW_LEFT); // slider
        repeatRateSlowSlider.sendKeys(Keys.ARROW_RIGHT);

        Select select = new Select(keyboardLocalesDropdown);
        select.selectByVisibleText(keyboardLocales); //English (United States) //French (Switzerland) //German (Germany)

//        String replaceAllExistingKeyboard = "Y"; // Y // N
        if (replaceAllExistingKeyboard.equalsIgnoreCase("Y")) {
            replaceAllExistingKeyboardCheckbox.click();  // Change in keyboard locale(s) settings will require explicit reboot.
        }

        keyboardSettingsSaveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (!((keyboardSettingsTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(keyboardSettingsTaskUpdateStatusMessage.getText());
        }
    }

    public void applySystemSettings_peripheralSettings_mouseSettings(String leftHandConfiguration) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

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

        doubleClickSpeedSlowSlider.click();
        doubleClickSpeedSlowSlider.sendKeys(Keys.ARROW_LEFT);
        doubleClickSpeedSlowSlider.sendKeys(Keys.ARROW_RIGHT);

        pointerSpeedSlowSlider.click();
        pointerSpeedSlowSlider.sendKeys(Keys.ARROW_LEFT);
        pointerSpeedSlowSlider.sendKeys(Keys.ARROW_RIGHT);

//        String leftHandConfiguration = "Y"; // Y // N
        if (leftHandConfiguration.equalsIgnoreCase("Y")) {
            leftHandConfigurationCheckbox.click();  // Change in keyboard locale(s) settings will require explicit reboot.
        }

        mouseSettingsSaveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (!((mouseSettingsTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(mouseSettingsTaskUpdateStatusMessage.getText());
        }
    }

    public void applySystemSettings_powerManagement_powerOption(String powerPlan, String turnOffDisplayTime, String putCompToSleepTime) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSystemSettingsDropdownRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsDropdownRhsMenu));
            windowsSystemSettingsDropdownRhsMenu.click();
        }

        if (!(windowsSystemSettingsPowerManagementDropdown.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsPowerManagementDropdown));
            windowsSystemSettingsPowerManagementDropdown.click();
        }

//      wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//		wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
//		rhsMenuToogleElement.click();

//        windowsSystemSettingsDropdown.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//        windowsSystemSettingsPowerManagementDropdown.click();
        windowsSystemSettingsPowerManagement_PowerOption_Menu.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        Select select = new Select(powerPlanDropdown);

        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {

            String optionText = option.getText();

            if (optionText.contains(powerPlan)) {

                select.selectByVisibleText(optionText);
                break;
            }
        }

////        String powerPlan = "Balanced[Active]"; // Balanced[Active] //High performance //Power saver
//        select = new Select(powerPlanDropdown);
//        select.selectByVisibleText(powerPlan);

//        String turnOffDisplayTime = "5 Minutes"; //0 Minutes // range 0 - 300 Minutes
        select = new Select(turnOffDisplayDropdown);
        select.selectByVisibleText(turnOffDisplayTime);

//        String putCompToSleepTime = "5 Minutes"; //0 Minutes // range 0 - 300 Minutes
        select = new Select(putCompToSleepTimeDropdown);
        select.selectByVisibleText(putCompToSleepTime);

        // Advanced settings script is pending

        powerOptionSaveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (!((powerOptionTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(powerOptionTaskUpdateStatusMessage.getText());
        }
    }

    public void applySystemSettings_printerSettings_addPrinter(String portType, String printerName, String Manufacturer, String printerDriverList,
                                                               String port, String ipAddress, String portText, String printerUsername, String printerPassword,
                                                               String isShared) throws InterruptedException {


        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSystemSettingsDropdownRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsDropdownRhsMenu));
            windowsSystemSettingsDropdownRhsMenu.click();
        }

        if (!(windowsSystemSettingsPrinterSettingsDropdown.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsPrinterSettingsDropdown));
            windowsSystemSettingsPrinterSettingsDropdown.click();
        }

//      Thread.sleep(1000);
//		wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
//		rhsMenuToogleElement.click();

//        windowsSystemSettingsDropdown.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//        windowsSystemSettingsPrinterSettingsDropdown.click();
        try {
            windowsSystemSettingsPrinterSettings_addPrinter_Menu.click();
        } catch(NoSuchElementException e) {
            Assert.fail("Printer Menu subitems not visible, 'add printer' menu is not visible.");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        Thread.sleep(3000);

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(portTypeLabel));

        wait.until(ExpectedConditions.elementToBeClickable(portTypeDropdown));
//        String portType = "Network Printer";  // Local //IP Port //Network Printer
        Select select = new Select(portTypeDropdown);
//        select.selectByValue(portType);
        select.selectByVisibleText(portType);

//        Thread.sleep(2000);


        if (portType.equalsIgnoreCase("Local")) {

            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            wait.until(ExpectedConditions.elementToBeClickable(printerNameTextarea));
            printerNameTextarea.sendKeys(printerName);  // test data

            select = new Select(manufacturerDropdown);
            select.selectByVisibleText(Manufacturer); // ---Select--- // Microsoft // Fuji Xerox // Lexmark // and many more check the dropdown select options

            select = new Select(printerDriverListDropdown);
            select.selectByVisibleText(printerDriverList); // ---Select--- // Microsoft 3MF Class Driver // HP 915 // and many miore check the dropdown select options

            select = new Select(portDropdown);
            select.selectByVisibleText(port); // LPT1 :(Recommended Printer Port) // LPT2 :(Printer Port) // LPT3 :(Printer Port) // and many miore check the dropdown select options

        } else if (portType.equalsIgnoreCase("IP Port")) {

            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            wait.until(ExpectedConditions.elementToBeClickable(printerNameTextarea));
            printerNameTextarea.sendKeys(printerName);  // test data

            select = new Select(manufacturerDropdown);
            select.selectByVisibleText(Manufacturer); // ---Select--- // Microsoft // Fuji Xerox // Lexmark // and many more check the dropdown select options

            select = new Select(printerDriverListDropdown);
            select.selectByVisibleText(printerDriverList); // ---Select--- // Microsoft 3MF Class Driver // HP 915 // and many miore check the dropdown select options

            ipAddressTextarea.sendKeys(ipAddress); // test data ip
            portTextarea.clear();
            portTextarea.sendKeys(portText); // test data // by default 9100 // but we can edit it

        } else if (portType.equalsIgnoreCase("Network Printer")) {

            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            wait.until(ExpectedConditions.elementToBeClickable(printerNameTextarea));
            printerNameTextarea.sendKeys(printerName);  // test data

            wait.until(ExpectedConditions.elementToBeClickable(printerUsernameTextbox));
            printerUsernameTextbox.sendKeys(printerUsername); // test data

            printerPasswordTextbox.sendKeys(printerPassword); // test data
        }

//        String isShared = "N"; //Y //N

        if (isShared.equalsIgnoreCase("Y")) {
            sharedCheckbox.click();
        } else {
            notSharedCheckbox.click();
        }

        addPrinterSaveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (!((addPrinterTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(addPrinterTaskUpdateStatusMessage.getText());
        }
    }


    public void applySystemSettings_timeAndLanguage_dateAndTime(String selectTab, String monthInput, String yearInput, String dayInput,
                                                                String timeInput, String timeZoneInput, String timeServerInput) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSystemSettingsDropdownRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsDropdownRhsMenu));
            windowsSystemSettingsDropdownRhsMenu.click();
        }

        if (!(windowsSystemSettingsTimeAndLanguageDropdown.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsTimeAndLanguageDropdown));
            windowsSystemSettingsTimeAndLanguageDropdown.click();
        }

//      wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//		wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
//		rhsMenuToogleElement.click();

//        windowsSystemSettingsDropdown.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//        windowsSystemSettingsTimeAndLanguageDropdown.click();
        windowsSystemSettingsTimeAndLanguage_dataAndTime_Menu.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//        String selectTab = "Date Time"; // Date Time // Time Zone // Time Server

        if (selectTab.equalsIgnoreCase("Date Time")) {

            dateTimeTabElement.click();

            // Click on the date picker input to open the calendar popup
            setDateField.click();

            // Select year
            Select select = new Select(yearSelect);
            select.selectByVisibleText(yearInput); // 2025

            // Select month
            select = new Select(monthSelect);
            select.selectByVisibleText(monthInput); // "Jan" // "Feb"

            // Select date
            // loop through all days
            for (WebElement day : days) {
                if (day.getText().equals(dayInput)) {
                    day.click();
                    break;
                }
            }

            // set time
            setTimeField.clear();
            setTimeField.sendKeys(timeInput); // test data // 24 hr format // 00:00 to 23:59 (24:00)

        } else if (selectTab.equalsIgnoreCase("Time Zone")) {

            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            timeZoneTabElement.click();

            Select select = new Select(timeZoneDropdownElement);
            select.selectByVisibleText(timeZoneInput); // (UTC+05:30) Chennai, Kolkata, Mumbai, New Delhi // (UTC-05:00) Eastern Time (US & Canada)

        } else if (selectTab.equalsIgnoreCase("Time Server")) {

            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            timeServerTabElement.click();

            timeServerDropdownElement.clear();
            timeServerDropdownElement.sendKeys(timeServerInput); // time.windows.com //time.nist.gov //time-nw.nist.gov //time-a.nist.gov

        }

        dateAndTimeSaveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (!((dateAndTimeTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(dateAndTimeTaskUpdateStatusMessage.getText());
        }
    }


    public void applySystemSettings_timeAndLanguage_regionAndLocation(String selectTab, String location, String format, String dateSeparator,
                                                                      String shortDateFormat, String longDateFormat, String timeFormat) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSystemSettingsDropdownRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsDropdownRhsMenu));
            windowsSystemSettingsDropdownRhsMenu.click();
        }

        if (!(windowsSystemSettingsTimeAndLanguageDropdown.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSystemSettingsTimeAndLanguageDropdown));
            windowsSystemSettingsTimeAndLanguageDropdown.click();
        }

//      Thread.sleep(1000);
//		wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
//		rhsMenuToogleElement.click();

//        windowsSystemSettingsDropdown.click();
//
//        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//
//        windowsSystemSettingsTimeAndLanguageDropdown.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsSystemSettingsTimeAndLanguage_regionAndLocation_Menu.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        Select select;

//        String selectTab = "Region and Location"; // Region and Location // Date and Time Format

        if (selectTab.equalsIgnoreCase("Region & Location")) {

            regionAndLocationTabElement.click();

            select = new Select(locationDropdownElement);
            select.selectByVisibleText(location); // India // United States // Germany

            select = new Select(formatDropdownElement);
            select.selectByVisibleText(format); // English - India // English - United States

        } else if (selectTab.equalsIgnoreCase("Date & Time Format")) {

            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            dateAndTimeFormatTabElement.click();

            // date formatting code is pending
            select = new Select(dateSeparatorDropdown);
            select.selectByVisibleText(dateSeparator); // - // / // .

            select = new Select(shortDateFormatDropdown);
            select.selectByVisibleText(shortDateFormat); // dd-MMM-yy

            select = new Select(longDateFormatDropdown);
            select.selectByVisibleText(longDateFormat); // dddd, dd MMMM, yyyy

            select = new Select(timeFormatDropdown);
            select.selectByVisibleText(timeFormat); //hh:mm:ss tt

        }

        regionAndLocationSaveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (!((regionAndLocationTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(regionAndLocationTaskUpdateStatusMessage.getText());
        }
    }


}
