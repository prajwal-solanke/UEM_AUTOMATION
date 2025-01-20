package com.uem_automation.qa.pages;

import com.uem_automation.qa.utils.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SecuritySettingsPage {

    public WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Utilities.EXPLICIT_WAIT_TIME));

    // Objects
    // Application Command
    @FindBy(xpath = "//div[@class='AjaxLoaderOuter loaderDivInitial']//button[@type='button'][normalize-space()='Please wait...']")
    private WebElement ajaxLoaderOuter;

    @FindBy(xpath = "//a[@id='kt_aside_toggle']")
    private WebElement rhsMenuToogleElement;

    // Write Filter Application
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_security_window']")
    private WebElement windowsSecuritySettingsRhsMenu;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_filesystem_Window']")
    private WebElement windowsSecuritySettingsFileSystemRhsMenu;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Write Filter Operations'][normalize-space()='Write Filter Operations']")
    private WebElement windowsSecuritySettingsFileSystemWriteFilterOperationsRhsMenu;

    @FindBy(xpath = "//label[@id='WinWriteFilterlblMenuWrtFlterSett']")
    private WebElement writeFilterSettingLabel;

    @FindBy(xpath = "//label[@id='WinWriteFilterlblMenuFBWFCnfgrtn']")
    private WebElement writeFilterExclusionListLabel;

    @FindBy(xpath = "//select[@id='WinWriteFilterddlWriteFilterSelection']")
    private WebElement writeFilterDropdown;

    @FindBy(xpath = "//input[@id='WinWriteFiltertxtCombobox']")
    private WebElement fileAndFolderPathTextbox;

    @FindBy(xpath = "//input[@id='WinWriteFilterbtnadd']")
    private WebElement addButton1;

    @FindBy(xpath = "//input[@id='WinWriteFiltertxtCombobox1']")
    private WebElement registryPathTextbox;

    @FindBy(xpath = "//input[@id='WinWriteFilterbtnaddRegistry']")
    private WebElement addButton2;

    @FindBy(xpath = "//label[@id='WinWriteFilterlblMenuFBWFCacheSize']")
    private WebElement fbwfCacheSize;

    @FindBy(xpath = "//input[@id='WinWriteFiltertxtcatchsize']")
    private WebElement setMaxCacheSizeForNextSessionTextbox;

    @FindBy(xpath = "//label[@id='WinWriteFilterlblMenuOverlaySettings']")
    private WebElement overlaySettingsLabel;

    @FindBy(xpath = "//input[@id='WinOverlay_txtOverlaySize']")
    private WebElement overlaySizeTextbox;

    @FindBy(xpath = "//input[@id='WinWriteFilterchkWarnUser']/following-sibling::span")
    private WebElement alertUserCheckbox;

    @FindBy(xpath = "//select[@id='WinWriteFilterddlMessageType']")
    private WebElement messageTypeDropdown;

    @FindBy(xpath = "//select[@id='WinWriteFilterddlMessageImp']")
    private WebElement messageImportantDropdown;

    @FindBy(xpath = "//input[@id='WinWriteFiltertxttitle']")
    private WebElement titleTextbox;

    @FindBy(xpath = "//input[@id='WinWriteFiltertxtMsg']")
    private WebElement messageTextbox;

    @FindBy(xpath = "//select[@id='WinWriteFilterddlDisplayTime']")
    private WebElement displayTimeDropdown;

    @FindBy(xpath = "//input[@id='WinWriteFilterbtnFWFSaveNew']")
    private WebElement exclusionAndFbwfSizeButtonSave;

    @FindBy(xpath = "//input[@id='WinOverlaySettingbtnFWFSave']")
    private WebElement overlaySettingsButtonSave;

    @FindBy(xpath = "//div[@id='WinWriteFilterRowWriteFilterApply']//div[@class='pull-left']")
    private WebElement writeFilterOperationsTaskUpdateStatusMessage;

    // Firewall
    @FindBy(xpath = "//label[@id='XPFirewall_lblMenuAddPort']")
    private WebElement addPortLabel;

    @FindBy(xpath = "//input[@id='XPFirewall_txtName']")
    private WebElement nameTextbox;

    @FindBy(xpath = "//input[@id='XPFirewall_txtFirewallPortNo']")
    private WebElement portNumberTextbox;

    @FindBy(xpath = "//input[@id='XPFirewall_rbtnTCP']")
    private WebElement tcpRadioButton;

    @FindBy(xpath = "//input[@id='XPFirewall_rbtnUDP']")
    private WebElement udpRadioButton;

    @FindBy(xpath = "//input[@id='XPFirewall_btnSavePortXP']")
    private WebElement addPortSaveButton;

    @FindBy(xpath = "//div[@id='XPFirewall_pnlPort']//div[@class='pull-left']")
    private WebElement addPortStatusMessage;

    @FindBy(xpath = "//label[@id='XPFirewall_lblMenuAddProgram']")
    private WebElement addProgramLabel;

    @FindBy(xpath = "//input[@id='XPFirewall_txtProgramName']")
    private WebElement programNameTextbox;

    @FindBy(xpath = "//input[@id='XPFirewall_txtProgramPath']")
    private WebElement programPathTextbox;

    @FindBy(xpath = "//input[@id='XPFirewall_btnSaveProgram']")
    private WebElement addProgramSaveButton;

    @FindBy(xpath = "//div[@id='XPFirewall_pnlAddProgram']//div[@class='pull-left']")
    private WebElement addProgramStatusMessage;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_network_Window']")
    private WebElement windowsSecuritySettingsNetworkRhsMenu;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Firewall'][normalize-space()='Firewall']")
    private WebElement windowsSecuritySettingsNetworkFirewallRhsMenu;

    //Proxy Settings
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Proxy Settings'][normalize-space()='Proxy Settings']")
    private WebElement windowsSecuritySettingsNetworkProxySettingsRhsMenu;

    @FindBy(xpath = "//input[@id='WinProxySettingscbxAutoSelection']")
    private WebElement automaticallyDetectSettingsCheckbox;

    @FindBy(xpath = "//input[@id='WinProxySettingscbxAutomaticConfiguration']")
    private WebElement useAutomaticConfigScriptCheckbox;

    @FindBy(xpath = "//input[@id='WinProxySettingstxtAddress']")
    private WebElement addressTextbox;

    @FindBy(xpath = "//input[@id='WinProxySettingsbtnApplyIESettings']")
    private WebElement proxySettingSaveButton;

    @FindBy(xpath = "//div[@id='WinProxySettingsRowApplyIESettings']//div[@class='pull-left']")
    private WebElement proxySettingStatusMessage;

    // Software Restriction
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_security_window']//label[@title='Software Restriction'][normalize-space()='Software Restriction']")
    private WebElement windowsSecuritySettingsNetworkSoftwareRestrictionRhsMenu;

    @FindBy(xpath = "//a[@id='XPRestrictionlibtnInstallationUninstallation']")
    private WebElement installationAndUninstallationLabel;

    @FindBy(xpath = "//label[@for='XPRestrictionchkIntstall']")
    private WebElement installationAndUninstallationRestrictionSwitch;

    @FindBy(xpath = "//a[@id='XPRestrictionlibtnApplicationRestriction']")
    private WebElement applicatonRestrictionLabel;

    @FindBy(xpath = "//select[@id='XPRestrictionddlsoftwareRestictionAllowOrDeny']")
    private WebElement softwareRestrictionDropdown;

    @FindBy(xpath = "//input[@id='XPRestrictiontxtName']")
    private WebElement softwareApplicationNameTextbox;

    @FindBy(xpath = "//input[@id='XPRestrictionbtnAddToAppList']")
    private WebElement softwareApplicationNameAddButton;

    @FindBy(xpath = "//div[@id='XPRestrictionRowApplySettings']//div[@class='pull-left']")
    private WebElement applicationAddStatus;

    @FindBy(xpath = "//select[@id='XPRestrictionApplIst']")
    private WebElement restrictionAppListDropdown;

    @FindBy(xpath = "//input[@id='XPRestrictionbtnLoadToBlocklist']")
    private WebElement loadToBlockListButton;

    @FindBy(xpath = "//a[@id='XPRestrictionlibtnBrowserRestriction']")
    private WebElement browserRestrctionLabel;

    @FindBy(xpath = "//select[@id='XPRestrictionblacklistBrowser_ddlBrowserName']")
    private WebElement browserNameDropdown;

    @FindBy(xpath = "//select[@id='XPRestrictionblacklistBrowser_RestrictionType']")
    private WebElement restrictionTypeDropdown;

    @FindBy(xpath = "//input[@id='XPRestrictionSoftwareRestrictionXP_btnSave']")
    private WebElement softwareRestrictionSaveButton;

    @FindBy(xpath = "//div[@id='XPRestrictionRowApplySettings']//div[@class='pull-left']")
    private WebElement softwareRestrictionStatusMessage;

    //Data Wipe
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_System_Win']")
    private WebElement windowsSecuritySettingsSystemRhsMenu;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Data Wipe'][normalize-space()='Data Wipe']")
    private WebElement windowsSecuritySettingsNetworkDataWipeRhsMenu;

    @FindBy(xpath = "//input[@id='XPDataWipe_txtCombobox']")
    private WebElement fileFolderTextbox;

    @FindBy(xpath = "//div[@onclick='WinDataWipe_AddDataWipePath()']")
    private WebElement addDataWipePathSymbol;

    @FindBy(xpath = "//input[@id='WinDataWipebtnSaveAuth']")
    private WebElement dataWipeSaveButton;

    @FindBy(xpath = "//div[@id='WinDataWipeRowApplyDateTimeSettings']//div[@class='pull-left']")
    private WebElement dataWipeStatusMessage;

    //Deploy Certificate
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Deploy Certificate'][normalize-space()='Deploy Certificate']")
    private WebElement windowsSecuritySettingsNetworkDeployCertificateRhsMenu;

    @FindBy(xpath = "//select[@id='WinInstallCertificateddlBrowseUpload']")
    private WebElement sourceDropdown;

    @FindBy(xpath = "//select[@id='WinInstallCertificateddlConnName']")
    private WebElement connectionNameDropdown;

    @FindBy(xpath = "//select[@id='WinInstallCertificateddlPositions']")
    private WebElement certificateTypeDropdown;

    @FindBy(xpath = "//input[@id='WinInstallCertificatefileUpload']")
    private WebElement fileUpload;

    @FindBy(xpath = "//label[@id='WinInstallCertificatelblMessage']")
    private WebElement certficateStatusMessage;

    @FindBy(xpath = "//select[@id='WinInstallCertificateddlStoreName']")
    private WebElement storeNameDropdown;

    @FindBy(xpath = "//input[@id='WinInstallCertificatetxtCertTypePassword']")
    private WebElement passwordTextbox;

    @FindBy(xpath = "//select[@id='WinInstallCertificateddlFile']")
    private WebElement fileDropdown;

    @FindBy(xpath = "//input[@id='WinInstallCertificatebtnApply_DeployCertificate_XP']")
    private WebElement deployCertificateSaveButton;

    @FindBy(xpath = "//label[@id='WinInstallCertificatelblMessage']")
    private WebElement deployCertificateStatusMessage;

    //Integrated Peripheral
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Integrated Peripheral'][normalize-space()='Integrated Peripheral']")
    private WebElement windowsSecuritySettingsNetworkIntegratedPeripheralRhsMenu;

    @FindBy(xpath = "//select[@id='XPIntPeripheralddlWirelessSecurity']")
    private WebElement enableCdDvdDropdown;

    @FindBy(xpath = "//select[@id='XPIntPeripheralddlBluetoothSett']")
    private WebElement bluetoothDeviceDropdown;

    @FindBy(xpath = "//input[@id='XPIntPeripheralbtnTaskbarSave']")
    private WebElement integratedPeripheralSaveButton;

    @FindBy(xpath = "//div[@id='XPIntPeripheraldvShowResult']")
    private WebElement integratedPeripheralStatusMessage;

    //Port Settings
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Port Settings'][normalize-space()='Port Settings']")
    private WebElement windowsSecuritySettingsNetworkPortSettingsRhsMenu;

    @FindBy(xpath = "//input[@id='WinSecuritySettingscbxEnableCDDVD']")
    private WebElement enableCdDvdCheckbox;

    @FindBy(xpath = "//input[@id='WinSecuritySettingscbxEnableFirewall']")
    private WebElement enableFirewallCheckbox;

    @FindBy(xpath = "//input[@id='WinSecuritySettingscbxEnableParallelPort']")
    private WebElement enableParallelPortCheckbox;

    @FindBy(xpath = "//input[@id='WinSecuritySettingscbxEnableSerialPort']")
    private WebElement enableSerialPortCheckbox;

    @FindBy(xpath = "//input[@id='WinSecuritySettingscbxUSBPort']")
    private WebElement enableUsbPortCheckbox;

    @FindBy(xpath = "//input[@id='WinSecuritySettingscbxUSBMassStorage']")
    private WebElement usbMassStorageCheckbox;

    @FindBy(xpath = "//input[@id='WinSecuritySettingscbxUSBWriteProtect']")
    private WebElement usbWriteProtectCheckbox;

    @FindBy(xpath = "//input[@id='WinSecuritySettingsbtnSaveSecuritySetting_JQ']")
    private WebElement portSettingsSaveButton;

    @FindBy(xpath = "//div[@id='WinSecuritySettingsdvShowResult']")
    private WebElement portSettingsStatusMessage;


    // Constructor
    public SecuritySettingsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions

    public void applySecuritySettings_FileSystem_WriteFilterOperations(String selectTab, String writeFilterSetting, String writeFilter, String fileAndFolderPath,
                                                                       String registryPath, String setMaxCacheSizeForNextSession, String overlaySize,
                                                                       String alertUser, String messageType, String messageImportant, String title, String message,
                                                                       String displayTime) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSecuritySettingsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsRhsMenu));
            windowsSecuritySettingsRhsMenu.click();
        }

        if (!(windowsSecuritySettingsFileSystemRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsFileSystemRhsMenu));
            windowsSecuritySettingsFileSystemRhsMenu.click();
        }

        windowsSecuritySettingsFileSystemWriteFilterOperationsRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        Select select;
        JavascriptExecutor js = (JavascriptExecutor) driver;

//        String selectTab = "Write Filter Setting"; // testdata

        if (selectTab.equalsIgnoreCase("Write Filter Setting")) {
            writeFilterSettingLabel.click();

//            String writeFilterSetting = "Enable UWF"; // testdata
//            select = new Select(writeFilterSettingDropdown);
//            select.selectByValue(writeFilterSetting);
            Assert.fail("Security Settings - File System - Write Filter Setting Code is Disabled, Save button is disabled");

        } else if (selectTab.equalsIgnoreCase("Write Filter Exclusion List")) {
            writeFilterExclusionListLabel.click();

//            String writeFilter = "Enable FBWF"; // testdata
            select = new Select(writeFilterDropdown);
            select.selectByVisibleText(writeFilter);

            if (writeFilter.equalsIgnoreCase("Enable FBWF")) {

//                String fileAndFolderPath = "testpath"; //testdata
                fileAndFolderPathTextbox.sendKeys(fileAndFolderPath);
                addButton1.click();
            } else if (writeFilter.equalsIgnoreCase("Enable UWF")) {

//                String fileAndFolderPath = "testpath"; //testdata
                fileAndFolderPathTextbox.sendKeys(fileAndFolderPath);
                addButton1.click();

//                String registryPath = "testpath"; //testdata
                registryPathTextbox.sendKeys(registryPath);
                addButton2.click();
            }

        } else if (selectTab.equalsIgnoreCase("FBWF Cache Size")) {
            fbwfCacheSize.click();

//            String setMaxCacheSizeForNextSession = "1024"; //testdata // in mb's
            setMaxCacheSizeForNextSessionTextbox.sendKeys(setMaxCacheSizeForNextSession); //Cache size 32 MB to 1024 MB

        } else if (selectTab.equalsIgnoreCase("Overlay Settings")) {
            overlaySettingsLabel.click();

//            String overlaySize = "1050"; //testdata in mb
            overlaySizeTextbox.clear();
            overlaySizeTextbox.sendKeys(overlaySize);
        }

        if (!selectTab.equalsIgnoreCase("Overlay Settings")) {

//            String alertUser = "Y"; // testdata
            if (alertUser.equalsIgnoreCase("Y")) {
                alertUserCheckbox.click(); ////input[@id='WinWriteFilterchkWarnUser']

//                String messageType = "Information"; //testdata
                select = new Select(messageTypeDropdown);
                select.selectByVisibleText(messageType);

//                String messageImportant = "Information"; //testdata
                select = new Select(messageImportantDropdown);
                select.selectByVisibleText(messageImportant);

//                String title = "Message from Administrator"; //testdata
                titleTextbox.clear();
                titleTextbox.sendKeys(title);

//                String message = "A maintenance task is going to be performed on your desktop. Your device may Shutdown to complete the task," +
//                        " so you need to save any open work to avoid data loss and then press ok"; //testdata
                messageTextbox.clear();
                messageTextbox.sendKeys(message);

//                String displayTime = "2 Minute"; // testdata 1 to 10 min
                select = new Select(displayTimeDropdown);
                select.selectByVisibleText(displayTime);

            }
        }

        if (selectTab.equalsIgnoreCase("Write Filter Exclusion List") || selectTab.equalsIgnoreCase("FBWF Cache Size")) {
            exclusionAndFbwfSizeButtonSave.click(); //input[@id='WinWriteFilterbtnFWFSaveNew']
        } else if (selectTab.equalsIgnoreCase("Overlay Settings")) {
            overlaySettingsButtonSave.click(); //input[@id='WinOverlaySettingbtnFWFSave']
        }

        // Wait for the loader to disappear
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        // Get the status message text once
        String statusMessage = writeFilterOperationsTaskUpdateStatusMessage.getText();

        if (!statusMessage.equals("Request for settings update has been processed") &&
                !statusMessage.equals("Write Filter Overlay Saved Successfully")) {
            Assert.fail(statusMessage);
        }

    }


    public void applySecuritySettings_Network_Firewall(String selectTab, String name, String portNumber, String selectProtocol,
                                                       String programName, String programPath) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSecuritySettingsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsRhsMenu));
            windowsSecuritySettingsRhsMenu.click();
        }

        if (!(windowsSecuritySettingsNetworkRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsNetworkRhsMenu));
            windowsSecuritySettingsNetworkRhsMenu.click();
        }

        windowsSecuritySettingsNetworkFirewallRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        JavascriptExecutor js = (JavascriptExecutor) driver;

//        String selectTab = "Add Port"; //testdata

        if (selectTab.equalsIgnoreCase("Add Port")) {

            addPortLabel.click();

//            String name = "testname"; // testdata
            nameTextbox.sendKeys(name);

//            String portNumber = "testportnumber"; // testdata
            portNumberTextbox.sendKeys(portNumber);

//            String selectProtocol = "UDP"; //testdata

            if (selectProtocol.equalsIgnoreCase("TCP")) {
                js.executeScript("arguments[0].click();", tcpRadioButton);
            } else if (selectProtocol.equalsIgnoreCase("UDP")) {
                js.executeScript("arguments[0].click();", udpRadioButton);
            }
            addPortSaveButton.click();

            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.visibilityOf(addPortStatusMessage));
            if (!((addPortStatusMessage.getText()).equals("Request for settings update has been processed"))) {
                Assert.fail(addPortStatusMessage.getText());
            }

        } else if (selectTab.equalsIgnoreCase("Add Program")) {

            addProgramLabel.click();

//            String programName = "testName"; //testdata
            programNameTextbox.sendKeys(programName);

//            String programPath = "C:\\Program Files\\Internet Explorer\\iexplore.exe"; //testdata
            programPathTextbox.sendKeys(programPath);

            addProgramSaveButton.click();

            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.visibilityOf(addProgramStatusMessage));
            if (!((addProgramStatusMessage.getText()).equals("Request for settings update has been processed"))) {
                Assert.fail(addProgramStatusMessage.getText());
            }
        }
    }

    public void applySecuritySettings_Network_ProxySettings(String automaticallyDetectSettings, String useAutomaticConfigScript, String address) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSecuritySettingsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsRhsMenu));
            windowsSecuritySettingsRhsMenu.click();
        }

        if (!(windowsSecuritySettingsNetworkRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsNetworkRhsMenu));
            windowsSecuritySettingsNetworkRhsMenu.click();
        }

        windowsSecuritySettingsNetworkProxySettingsRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Automatic Configuration
//        String automaticallyDetectSettings = "Y"; //testdata
//        String useAutomaticConfigScript = "Y"; //testdata

        if (automaticallyDetectSettings.equalsIgnoreCase("Y")) {
            js.executeScript("arguments[0].click();", automaticallyDetectSettingsCheckbox);
            if (useAutomaticConfigScript.equalsIgnoreCase("Y")) {
                js.executeScript("arguments[0].click();", useAutomaticConfigScriptCheckbox);
//                String address = "testaddress"; //testdata
                addressTextbox.sendKeys(address);
            }
        }

        // below settings are not required for the time period

        //Proxy Settings
//        String useProxyServerForLan = "Y"; //testdata
//        String bypassProxyServerForLocalAddress = "Y"; //testdata
//
//        if(useProxyServerForLan.equalsIgnoreCase("Y")) {
//            js.executeScript("arguments[0].click();", useProxyServerForLanCheckbox);
//            if(bypassProxyServerForLocalAddress.equalsIgnoreCase("Y")) {
//                js.executeScript("arguments[0].click();", bypassProxyServerForLocalAddressCheckbox);
//            }
//        }
//
//        //Servers
//        if(useProxyServerForLan.equalsIgnoreCase("Y")) {
//
//        }

        proxySettingSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(proxySettingStatusMessage));
        if (!((proxySettingStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(proxySettingStatusMessage.getText());
        }

    }

    public void applySecuritySettings_SoftwareRestriction(String selectTab, String installationAndUninstallationRestriction, String softwareRestriction,
                                                                  String softwareApplicationName, String browserName, String restrictionType) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSecuritySettingsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsRhsMenu));
            windowsSecuritySettingsRhsMenu.click();
        }

        if (!(windowsSecuritySettingsNetworkRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsNetworkRhsMenu));
            windowsSecuritySettingsNetworkRhsMenu.click();
        }

        windowsSecuritySettingsNetworkSoftwareRestrictionRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        Select select;

        //Software Restriction

//        String selectTab = "Installation & Uninstallation"; //testdata

        if (selectTab.equalsIgnoreCase("Installation & Uninstallation")) {

            installationAndUninstallationLabel.click();

//            String installationAndUninstallationRestriction = "Y"; //testdata

            if (installationAndUninstallationRestriction.equalsIgnoreCase("Y")) {
                installationAndUninstallationRestrictionSwitch.click();
            }

        } else if (selectTab.equalsIgnoreCase("Application Restriction")) {

            applicatonRestrictionLabel.click();

//            String softwareRestriction = "Allow All"; //testdata //Allow All //Deny All

            select = new Select(softwareRestrictionDropdown);
            select.selectByVisibleText(softwareRestriction);

//            String softwareApplicationName = "notepad.exe"; //testdata //notepad.exe
//            softwareApplicationNameTextbox.sendKeys(softwareApplicationName);
//            softwareApplicationNameAddButton.click();
//            Assert.assertEquals(applicationAddStatus.getText(), softwareApplicationName + " Added Successfully");

            select = new Select(restrictionAppListDropdown);
            select.selectByVisibleText(softwareApplicationName);

            loadToBlockListButton.click();

        } else if (selectTab.equalsIgnoreCase("Browser Restriction")) {

            browserRestrctionLabel.click();

//            String browserName = "Google Chrome"; //testdata //Google Chrome
//            String restrictionType = "Block dangerous downloads"; //testdata //Block dangerous downloads

            select = new Select(browserNameDropdown);
            select.selectByVisibleText(browserName);

            select = new Select(restrictionTypeDropdown);
            select.selectByVisibleText(restrictionType);
        }

        softwareRestrictionSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(softwareRestrictionStatusMessage));
        if (!((softwareRestrictionStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(softwareRestrictionStatusMessage.getText());
        }

    }

    public void applySecuritySettings_System_DataWipe(String fileFolder) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSecuritySettingsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsRhsMenu));
            windowsSecuritySettingsRhsMenu.click();
        }

        if (!(windowsSecuritySettingsSystemRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsSystemRhsMenu));
            windowsSecuritySettingsSystemRhsMenu.click();
        }

        windowsSecuritySettingsNetworkDataWipeRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//        String fileFolder = "C:\Users\admin\Documents"; //testdata
        fileFolderTextbox.clear();
        fileFolderTextbox.sendKeys(fileFolder);
        addDataWipePathSymbol.click();

        WebElement addedFileCheckbox = driver.findElement(By.xpath("//td[normalize-space()='" + fileFolder + "']/preceding-sibling::td/input[@type='checkbox']\n"));
        addedFileCheckbox.click();

        dataWipeSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(dataWipeStatusMessage));
        if (!((dataWipeStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(dataWipeStatusMessage.getText());
        }


    }

    public void applySecuritySettings_System_DeployCertificate(String source, String connectionName, String certificateType, String fileName, String storeName, String password, String file) throws InterruptedException {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSecuritySettingsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsRhsMenu));
            windowsSecuritySettingsRhsMenu.click();
        }

        if (!(windowsSecuritySettingsSystemRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsSystemRhsMenu));
            windowsSecuritySettingsSystemRhsMenu.click();
        }

        windowsSecuritySettingsNetworkDeployCertificateRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//        String source = "New Upload"; //testdata
        Select select = new Select(sourceDropdown);
        select.selectByVisibleText(source);

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (source.equalsIgnoreCase("New Upload")) {

//            String connectionName = "FTPS"; //testdata
            select = new Select(connectionNameDropdown);
            select.selectByVisibleText(connectionName);

//            String certificateType = "CER"; //testdata
            select = new Select(certificateTypeDropdown);
            select.selectByVisibleText(certificateType);

//            String fileName = "Shradha-20.cer"; //testdata
            fileUpload.sendKeys(System.getProperty("user.dir")
                    + ("//src//main//java//com//uem_automation//qa//testdata//" + fileName));
            Assert.assertEquals(certficateStatusMessage.getText(), fileName + " is uploaded");

//            String storeName = "Untrusted Certificates"; //testdata
            select = new Select(storeNameDropdown);
            select.selectByVisibleText(storeName);

            // agent action is not having any options

            if (certificateType.equalsIgnoreCase("PFX")) {
//                String password = "testpassword"; //testdata
                passwordTextbox.sendKeys(password);
            }

        } else if (source.equalsIgnoreCase("Repository")) {

//            String connectionName = "FTPS"; //testdata
            select = new Select(connectionNameDropdown);
            select.selectByVisibleText(connectionName);

//            String file = "fusion.key"; //testdata
            select = new Select(fileDropdown);
            select.selectByVisibleText(file);

//            String certificateType = "CER"; //testdata
            select = new Select(certificateTypeDropdown);
            select.selectByVisibleText(certificateType);

//            String storeName = "Untrusted Certificates"; //testdata
            select = new Select(storeNameDropdown);
            select.selectByVisibleText(storeName);

            // agent action is not having any options

            if (certificateType.equalsIgnoreCase("PFX")) {
//                String password = "testpassword"; //testdata
                passwordTextbox.sendKeys(password);
            }

        } else if (source.equalsIgnoreCase("$GROUP$")) {
            Thread.sleep(3000);
            wait.until(ExpectedConditions.visibilityOf(fileDropdown));
//            String file = "Shradha-20.cer"; //testdata
            select = new Select(fileDropdown);
            select.selectByVisibleText(file);

//            String certificateType = "CER"; //testdata
            select = new Select(certificateTypeDropdown);
            select.selectByVisibleText(certificateType);

//            String storeName = "Untrusted Certificates"; //testdata
            select = new Select(storeNameDropdown);
            select.selectByVisibleText(storeName);

            // agent action is not having any options

            if (certificateType.equalsIgnoreCase("PFX")) {
//                String password = "testpassword"; //testdata
                passwordTextbox.sendKeys(password);
            }

        }

        deployCertificateSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(deployCertificateStatusMessage));
        if (!((deployCertificateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(deployCertificateStatusMessage.getText());
        }
    }


    public void applySecuritySettings_System_IntegratedPeripheral(String enableCdDvd, String bluetoothDevice) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSecuritySettingsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsRhsMenu));
            windowsSecuritySettingsRhsMenu.click();
        }

        if (!(windowsSecuritySettingsSystemRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsSystemRhsMenu));
            windowsSecuritySettingsSystemRhsMenu.click();
        }

        windowsSecuritySettingsNetworkIntegratedPeripheralRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//        String enableCdDvd = "Enable"; //testdata
//        String bluetoothDevice = "Enable"; //testdata

        Select select;

        select = new Select(enableCdDvdDropdown);
        select.selectByVisibleText(enableCdDvd);

        select = new Select(bluetoothDeviceDropdown);
        select.selectByVisibleText(bluetoothDevice);

        // camera device script is not developed

        integratedPeripheralSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(integratedPeripheralStatusMessage));
        if (!((integratedPeripheralStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(integratedPeripheralStatusMessage.getText());
        }
    }

    public void applySecuritySettings_System_PortSettings(String enableCdDvd, String enableFirewall, String enableParallelPort, String enableSerialPort
            , String enableUsbPort, String usbMassStorage, String usbWriteProtect) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSecuritySettingsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsRhsMenu));
            windowsSecuritySettingsRhsMenu.click();
        }

        if (!(windowsSecuritySettingsSystemRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSecuritySettingsSystemRhsMenu));
            windowsSecuritySettingsSystemRhsMenu.click();
        }

        windowsSecuritySettingsNetworkPortSettingsRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//        String enableCdDvd = "Y"; //testdata
//        String enableFirewall = "Y"; //testdata
//        String enableParallelPort = "Y"; //testdata
//        String enableSerialPort = "Y"; //testdata
//        String enableUsbPort = "Y"; //testdata
//        String usbMassStorage = "Y"; //testdata
//        String usbWriteProtect = "Y"; //testdata

        JavascriptExecutor js = (JavascriptExecutor) driver;

        if (enableCdDvd.equalsIgnoreCase("Y")) {
            if (!enableCdDvdCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", enableCdDvdCheckbox);
            }
        } else if (enableCdDvd.equalsIgnoreCase("N")) {
            if (enableCdDvdCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", enableCdDvdCheckbox);
            }
        }

        if (enableFirewall.equalsIgnoreCase("Y")) {
            if (!enableFirewallCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", enableFirewallCheckbox);
            }
        } else if (enableFirewall.equalsIgnoreCase("N")) {
            if (enableFirewallCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", enableFirewallCheckbox);
            }
        }

        if (enableParallelPort.equalsIgnoreCase("Y")) {
            if (!enableParallelPortCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", enableParallelPortCheckbox);
            }
        } else if (enableParallelPort.equalsIgnoreCase("N")) {
            if (enableParallelPortCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", enableParallelPortCheckbox);
            }
        }

        if (enableSerialPort.equalsIgnoreCase("Y")) {
            if (!enableSerialPortCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", enableSerialPortCheckbox);
            }
        } else if (enableSerialPort.equalsIgnoreCase("N")) {
            if (enableSerialPortCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", enableSerialPortCheckbox);
            }
        }

        if (enableUsbPort.equalsIgnoreCase("Y")) {
            if (!enableUsbPortCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", enableUsbPortCheckbox);
            }
        } else if (enableUsbPort.equalsIgnoreCase("N")) {
            if (enableUsbPortCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", enableUsbPortCheckbox);
            }
        }

        if (usbMassStorage.equalsIgnoreCase("Y")) {
            if (!usbMassStorageCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", usbMassStorageCheckbox);
            }
        } else if (usbMassStorage.equalsIgnoreCase("N")) {
            if (usbMassStorageCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", usbMassStorageCheckbox);
            }
        }

        // Usb write protect is disabled in the script section

        if (usbWriteProtect.equalsIgnoreCase("Y")) {
            if (!usbWriteProtectCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", usbWriteProtectCheckbox);
            }
        } else if (usbWriteProtect.equalsIgnoreCase("N")) {
            if (usbWriteProtectCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", usbWriteProtectCheckbox);
            }
        }

        portSettingsSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(portSettingsStatusMessage));
        if (!((portSettingsStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(portSettingsStatusMessage.getText());
        }
    }
}
