package com.uem_automation.qa.pages;

import com.uem_automation.qa.utils.Utilities;
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

public class ConnectionManagementPage {

    public WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Utilities.EXPLICIT_WAIT_TIME));

    // Objects
    // Application Command
    @FindBy(xpath = "//div[@class='AjaxLoaderOuter loaderDivInitial']//button[@type='button'][normalize-space()='Please wait...']")
    private WebElement ajaxLoaderOuter;

    @FindBy(xpath = "//a[@id='kt_aside_toggle']")
    private WebElement rhsMenuToogleElement;

    //Citrix Workspace App
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_connection_management_settings']")
    private WebElement windowsConnectionManagementRhsMenu;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_connections_Win']")
    private WebElement windowsConnectionManagementConnectionsRhsMenu;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Citrix Workspace App'][normalize-space()='Citrix Workspace App']")
    private WebElement windowsConnectionManagementConnectionsCitrixWorkspaceAppRhsMenu;

    @FindBy(xpath = "//input[@id='WinContxtConName']")
    private WebElement connectionNameTextbox;

    @FindBy(xpath = "//select[@id='WinConddlType']")
    private WebElement citrixTypeDropdown;

    @FindBy(xpath = "//input[@id='WinContxtStore']")
    private WebElement storeNameTextbox;

    @FindBy(xpath = "//input[@id='WinContxtConfigURL']")
    private WebElement configurationUrlTextbox;

    @FindBy(xpath = "//input[@id='WinContxtDesc']")
    private WebElement descriptionTextbox;

    @FindBy(xpath = "//input[@id='WinConbtnSaveCitrix1']")
    private WebElement citrixWorkspaceAppSaveButton;

    @FindBy(xpath = "//div[@id='WinConrowbutton']//div[@class='pull-left']")
    private WebElement citrixWorkspaceAppStatusMessage;

    //Custom Executable
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Custom Executable'][normalize-space()='Custom Executable']")
    private WebElement windowsConnectionManagementConnectionsCustomExecutableRhsMenu;

    @FindBy(xpath = "//input[@id='WinContxtConNameForCustExec']")
    private WebElement connectionNameCusExeTextbox;

    @FindBy(xpath = "//input[@id='WinContxtPathForCustExec']")
    private WebElement pathCusExeTextbox;

    @FindBy(xpath = "//input[@id='WinConChkShortDesktop']")
    private WebElement createShortcutOnDesktopCheckbox;

    @FindBy(xpath = "//input[@id='WinConChkAutoconn']")
    private WebElement autostartConnectionCheckbox;

    @FindBy(xpath = "//input[@id='WinContxtArgumentsForCustExec']")
    private WebElement argumentsTextbox;

    @FindBy(xpath = "//input[@id='WinConbtnSaveCustom']")
    private WebElement customExecutableSaveButton;

    @FindBy(xpath = "//div[@id='WinConrowbuttonForCustExec']//div[@class='pull-left']")
    private WebElement customExecutableStatusMessage;

    //Browser
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_connection_management_settings']//label[@title='Browser'][normalize-space()='Browser']")
    private WebElement windowsConnectionManagementConnectionsBrowserRhsMenu;

    @FindBy(xpath = "//input[@id='WinContxtConNameForIE']")
    private WebElement connectionNameBrowserTextbox;

    @FindBy(xpath = "//select[@id='WinddlBrowserType']")
    private WebElement browserTypeDropdown;

    @FindBy(xpath = "//input[@id='WinContxtConfigURLForIE']")
    private WebElement browserConfigurationUrlTextbox;

    @FindBy(xpath = "//input[@id='WinConchkKiosk']")
    private WebElement kioskModeCheckbox;

    @FindBy(xpath = "//input[@id='WinConchkDesktop']")
    private WebElement browserCreateShortcutOnDesktopCheckbox;

    @FindBy(xpath = "//input[@id='WinConchkAutostartconn']")
    private WebElement browserAutostartConnectionCheckbox;

    @FindBy(xpath = "//input[@id='WinConchkAutoreconnect']")
    private WebElement autoReconnectConnectionCheckbox;

    @FindBy(xpath = "//input[@id='WinConbtnSaveIEBrowser']")
    private WebElement browserSaveButton;

    @FindBy(xpath = "//div[@id='WinConrowbuttonForIE']//div[@class='pull-left']")
    private WebElement browserStatusMessage;

    //RDP
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='RDP'][normalize-space()='RDP']")
    private WebElement windowsConnectionManagementConnectionsRDPRhsMenu;

    @FindBy(xpath = "//input[@id='WinContxtConnNameForRDP']")
    private WebElement rdpConnectionNameTextbox;

//    @FindBy(xpath = "//label[@id='WinConlblgeneral']")
//    private WebElement selectTabLabel ;

    @FindBy(xpath = "//label[@id='WinConlblgeneral']")
    private WebElement generalLabel;

    @FindBy(xpath = "//input[@id='WinContxtIPHostName']")
    private WebElement iphostNameTextbox;

    @FindBy(xpath = "//input[@id='WinContxtPortAddress']")
    private WebElement portTextbox;

    @FindBy(xpath = "//input[@id='WinContxtUserName']")
    private WebElement logonUsernameTextbox;

    @FindBy(xpath = "//input[@id='WinContxtDomain']")
    private WebElement logonDomainTextbox;

    @FindBy(xpath = "//input[@id='WinConcbxAlwaysAskForCredential']")
    private WebElement alwaysAsk4CredentialCheckbox;

    @FindBy(xpath = "//input[@id='WinConcbxAutomaticLogon']")
    private WebElement automaticLogonCheckbox;

    @FindBy(xpath = "//input[@id='WinContxtPwd']")
    private WebElement logonPasswordTextbox;

    @FindBy(xpath = "//input[@id='WinConcbxAutoStart']")
    private WebElement automaticStartCheckbox;

    @FindBy(xpath = "//label[@id='WinConlbldisplay']")
    private WebElement displayLabel;

    @FindBy(xpath = "//input[@id='WinConchkRedirectMonitors']")
    private WebElement useAllMonitorsForRemoteSessionCheckbox;

    @FindBy(xpath = "//input[@id='WinConchkFullScreen']")
    private WebElement fullScreenCheckbox;

    @FindBy(xpath = "//select[@id='WinConddlScreenSize']")
    private WebElement sizeOfDesktopDropdown;

    @FindBy(xpath = "//select[@id='WinConddlColors']")
    private WebElement colorsDropdown;

    @FindBy(xpath = "//input[@id='WinConcbxDisplayConBar']")
    private WebElement displayConnectionBarCheckbox;

    @FindBy(xpath = "//label[@id='WinConlbllocalresource']")
    private WebElement localResourcesLabel;

    @FindBy(xpath = "//select[@id='WinConddlRemoteComputerSound']")
    private WebElement remoteAudioPlaybackDropdown;

    @FindBy(xpath = "//select[@id='WinConddlremoteaudiorecordingXP']")
    private WebElement remoteAudioRecordingDropdown;

    @FindBy(xpath = "//input[@id='WinConcbxDiskdrives']")
    private WebElement drivesCheckbox;

    @FindBy(xpath = "//input[@id='WinConcbxClipBoard']")
    private WebElement clipboardCheckbox;

    @FindBy(xpath = "//input[@id='WinConcbxPrinters']")
    private WebElement printersCheckbox;

    @FindBy(xpath = "//input[@id='WinConcbxSmartCards']")
    private WebElement smartCardsCheckbox;

    @FindBy(xpath = "//input[@id='WinConcbxSerialPorts']")
    private WebElement portsCheckbox;

    @FindBy(xpath = "//input[@id='WinConcbxPlugNPlayDevices']")
    private WebElement pnpDevicesCheckbox;

    @FindBy(xpath = "//select[@id='WinConddlKeyboard']")
    private WebElement keyboardDropdown;

    @FindBy(xpath = "//label[@id='WinConlblprograms']")
    private WebElement programsLabel;

    @FindBy(xpath = "//input[@id='WinConcbxStartProgmOnConnect']")
    private WebElement startProgramOnConnectionCheckbox;

    @FindBy(xpath = "//input[@id='WinContxtFilePath']")
    private WebElement programPathFileNameTextbox;

    @FindBy(xpath = "//input[@id='WinContxtFolder']")
    private WebElement startInFollowingFolderTextbox;

    @FindBy(xpath = "//label[@id='WinConlblexperience']")
    private WebElement experienceLabel;

    @FindBy(xpath = "//select[@id='WinConddlConnectionSpeed']")
    private WebElement connectionSpeedDropdown;

    @FindBy(xpath = "//input[@id='WinConcbxReconnect']")
    private WebElement reconnectIfConnDroppedCheckbox;

    @FindBy(xpath = "//label[@id='WinConlbladvanced']")
    private WebElement advancedLabel;

    @FindBy(xpath = "//select[@id='WinConddlServerAuth']")
    private WebElement authenticationOptionsDropdown;

    @FindBy(xpath = "//input[@id='WinConrdbNoUseTS']")
    private WebElement doNotUseRDGatewayRadio;

    @FindBy(xpath = "//input[@id='WinConbtnSaveRDP']")
    private WebElement rdpSaveButton;

    @FindBy(xpath = "//div[@id='WinConrowbuttonRDP']//div[@class='pull-left']")
    private WebElement rdpStatusMessage;

    // teradici
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_connection_management_settings']//label[@title='Teradici'][normalize-space()='Teradici']")
    private WebElement windowsConnectionManagementConnectionsTeradiciRhsMenu;

    @FindBy(xpath = "//input[@id='WinContxtConNameForTeradici']")
    private WebElement teradiciConnectionNameTextbox;

    @FindBy(xpath = "//input[@id='WinContxtHostnameTD']")
    private WebElement teradiciHostNameTextbox;

    @FindBy(xpath = "//input[@id='WinContxtDomainTD']")
    private WebElement teradiciDomainNameTextbox;

    @FindBy(xpath = "//input[@id='WinContxtUsernameTD']")
    private WebElement teradiciUserameTextbox;

    @FindBy(xpath = "//input[@id='WinContxtPasswordTD']")
    private WebElement teradiciPasswordTextbox;

    @FindBy(xpath = "//input[@id='WinConcbxRemoteerkstn']")
    private WebElement remoteWorkCardCheckbox;

    @FindBy(xpath = "//input[@id='WinConcbxUSBdisable']")
    private WebElement usbDisableCheckbox;

    @FindBy(xpath = "//input[@id='WinConcbxcreateshrtcutdsk']")
    private WebElement teradiciCreateShortcutOnDesktopCheckbox;

    @FindBy(xpath = "//input[@id='WinConcbxcreateshrtcutstartmenu']")
    private WebElement teradiciCreateShortcutOnStartMenuCheckbox;

    @FindBy(xpath = "//input[@id='WinConcbxlautostart']")
    private WebElement teradiciAutostartConnectionCheckbox;

    @FindBy(xpath = "//input[@id='WinConrbtnfullscreenTD']")
    private WebElement teradiciFullScreenCheckbox;

    @FindBy(xpath = "//input[@id='WinConrbtnWindowsTD']")
    private WebElement teradiciWindowedCheckbox;

    @FindBy(xpath = "//input[@id='WinConbtnsaveTeradici']")
    private WebElement teradiciSaveButton;

    @FindBy(xpath = "//div[@id='WinConrowbuttonForTD']//div[@class='pull-left']")
    private WebElement teradiciStatusMessage;

    // vm ware view
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='VMWare View'][normalize-space()='VMWare View']")
    private WebElement windowsConnectionManagementConnectionsVMWareviewRhsMenu;

    @FindBy(xpath = "//input[@id='WinContxtConNameForVmware']")
    private WebElement vmConnectionNameTextbox;

    @FindBy(xpath = "//input[@id='WinContxtHostname']")
    private WebElement vmHostNameTextbox;

    @FindBy(xpath = "//input[@id='WinContxtLogin']")
    private WebElement vmLoginTextbox;

    @FindBy(xpath = "//input[@id='WinContxtPassword']")
    private WebElement vmPasswordTextbox;

    @FindBy(xpath = "//input[@id='WinContxtDoamin']")
    private WebElement vmDomainTextbox;

    @FindBy(xpath = "//select[@id='WinConddApplicationName']")
    private WebElement vmTypeDropdown;

    @FindBy(xpath = "//input[@id='WinContxtDesktopName']")
    private WebElement appDesktopNameTextbox;

    @FindBy(xpath = "//input[@id='WinContxtSmartCardPIN']")
    private WebElement smartCardPinTextbox;

    @FindBy(xpath = "//input[@id='WinConchkConnectUSBOnStartup']")
    private WebElement vmConnectUsbOnStartupCheckbox;

    @FindBy(xpath = "//input[@id='WinConchkConnectUSBOnInsert']")
    private WebElement connectUsbOnInsertCheckbox;

    @FindBy(xpath = "//input[@id='WinConchkNonInteractive']")
    private WebElement nonInteractiveCheckbox;

    @FindBy(xpath = "//select[@id='WinConddReconnectBehaviour']")
    private WebElement reconnectBehaviourDropdown;

    @FindBy(xpath = "//select[@id='WinConddlVMWProperty']")
    private WebElement vmwProtocolDropdown;

    @FindBy(xpath = "//input[@id='WinConchkDesktopForVmware']")
    private WebElement vmCreateShortcutOnDesktopCheckbox;

    @FindBy(xpath = "//input[@id='WinConchkAutostartconnForVmware']")
    private WebElement vmAutostartConnectionCheckbox;

    @FindBy(xpath = "//select[@id='WinConddlDisplay']")
    private WebElement displayDropdown;

    @FindBy(xpath = "//input[@id='WinConbtnSaveVMView']")
    private WebElement vmwareViewSaveButton;

    @FindBy(xpath = "//div[@id='WinConrowbuttonForVmware']//div[@class='pull-left']")
    private WebElement vmwareViewStatusMessage;

    //vmview global settings
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_connection_management_settings']//label[@title='VMView Global Settings'][normalize-space()='VMView Global Settings']")
    private WebElement windowsConnectionManagementVMViewGlobalSettingsRhsMenu;

    @FindBy(xpath = "//input[@id='WinVMViewchkUnauthenticatedAccessEnabled']")
    private WebElement unAuthenticatedAccessCheckbox;

    @FindBy(xpath = "//input[@id='WinVMViewchkHideClientAfterLaunchSession']")
    private WebElement hideClientAfterLaunchCheckbox;

    @FindBy(xpath = "//input[@id='WinVMViewchkAllowH264Decoding']")
    private WebElement allowH264DecodingCheckbox;

    @FindBy(xpath = "//input[@id='WinVMViewchkAllowHighColorAccuracy']")
    private WebElement allowHighColorAccuracyCheckbox;

    @FindBy(xpath = "//select[@id='WinVMViewddlConfigureSSL']")
    private WebElement configureSSLDropdown;

    @FindBy(xpath = "//select[@id='WinVMViewddlNetworkCondition']")
    private WebElement networkConditionDropdown;

    @FindBy(xpath = "//input[@id='WinVMViewbtnVmViewGlobalApply']")
    private WebElement vmViewGlobalSettingsSaveButton;

    @FindBy(xpath = "//div[@id='WinVMViewtblCitrixRevrViewForVmware']//div[@class='pull-left']")
    private WebElement vmViewGlobalSettingsStatusMessage;


    // Constructor
    public ConnectionManagementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions

    public void applyConnectionManagement_Connections_CitrixWorkspaceApp(String connectionName, String citrixType, String storeName, String configurationUrl, String descriptionCitrix) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsConnectionManagementRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementRhsMenu));
            windowsConnectionManagementRhsMenu.click();
        }

        if (!(windowsConnectionManagementConnectionsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementConnectionsRhsMenu));
            windowsConnectionManagementConnectionsRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsConnectionManagementConnectionsCitrixWorkspaceAppRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        connectionNameTextbox.sendKeys(connectionName); //testdata

        Select select = new Select(citrixTypeDropdown);
        select.selectByVisibleText(citrixType); //testdata

        if (!citrixType.equalsIgnoreCase("PNA")) {
            storeNameTextbox.sendKeys(storeName); //testdata
        }
        configurationUrlTextbox.sendKeys(configurationUrl); //testdata
        descriptionTextbox.sendKeys(descriptionCitrix); //testdata

        citrixWorkspaceAppSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(citrixWorkspaceAppStatusMessage));
        if (!((citrixWorkspaceAppStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(citrixWorkspaceAppStatusMessage.getText());
        }
    }
    public void applyConnectionManagement_Connections_CustomExecutable(String connectionName, String path, String createShortcutOnDesktop, String autostartConnection, String arguments) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsConnectionManagementRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementRhsMenu));
            windowsConnectionManagementRhsMenu.click();
        }

        if (!(windowsConnectionManagementConnectionsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementConnectionsRhsMenu));
            windowsConnectionManagementConnectionsRhsMenu.click();
        }

        windowsConnectionManagementConnectionsCustomExecutableRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        connectionNameCusExeTextbox.sendKeys(connectionName); //testdata
        pathCusExeTextbox.sendKeys(path); //testdata

        if (createShortcutOnDesktop.equalsIgnoreCase("Y")) { //testdata
            js.executeScript("arguments[0].click();", createShortcutOnDesktopCheckbox);
        }

//        if(createShortcutInStartMenu.equalsIgnoreCase("Y")) { //testdata
//            js.executeScript("arguments[0].click();", createShortcutInStartMenuCheckbox);
//        }

        if (autostartConnection.equalsIgnoreCase("Y")) { //testdata
            js.executeScript("arguments[0].click();", autostartConnectionCheckbox);
        }

        argumentsTextbox.sendKeys(arguments); //testdata

        customExecutableSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(customExecutableStatusMessage));
        if (!((customExecutableStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(customExecutableStatusMessage.getText());
        }
    }

    public void applyConnectionManagement_Connections_Browser(String connectionName, String browserType, String configurationUrl,
                                                                               String kioskMode, String createShortcutOnDesktop, String autostartConnection,
                                                                               String autoReconnectConnection) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsConnectionManagementRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementRhsMenu));
            windowsConnectionManagementRhsMenu.click();
        }

        if (!(windowsConnectionManagementConnectionsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementConnectionsRhsMenu));
            windowsConnectionManagementConnectionsRhsMenu.click();
        }

        windowsConnectionManagementConnectionsBrowserRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        connectionNameBrowserTextbox.sendKeys(connectionName); //testdata

        Select select = new Select(browserTypeDropdown);
        select.selectByVisibleText(browserType); //testdata

        browserConfigurationUrlTextbox.sendKeys(configurationUrl); //testdata

        if (kioskMode.equalsIgnoreCase("Y")) { //testdata
            js.executeScript("arguments[0].click();", kioskModeCheckbox);
        }

        if (createShortcutOnDesktop.equalsIgnoreCase("Y")) { //testdata
            js.executeScript("arguments[0].click();", browserCreateShortcutOnDesktopCheckbox);
        }

//        if(kioskMode.equalsIgnoreCase("Y")) {
//            js.executeScript("arguments[0].click();", kioskModeCheckbox);
//        }

        if (autostartConnection.equalsIgnoreCase("Y")) { //testdata
            js.executeScript("arguments[0].click();", browserAutostartConnectionCheckbox);
        }

        if (autoReconnectConnection.equalsIgnoreCase("Y")) { //testdata
            js.executeScript("arguments[0].click();", autoReconnectConnectionCheckbox);
        }

        browserSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(browserStatusMessage));
        if (!((browserStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(browserStatusMessage.getText());
        }

    }


    public void applyConnectionManagement_Connections_RDP(String rdpConnectionName, String selectTab, String iphostName, String port, String alwaysAsk4Credential, String userName, String domain, String password, String automaticLogon, String automaticStart, String useAllMonitorsForRemoteSession, String fullScreen, String sizeOfDesktop, String colors, String displayConnectionBar, String remoteAudioPlayback, String remoteAudioRecording, String drives, String clipboard, String printers, String smartCards, String ports, String pnpDevices, String keyboard, String startProgramOnConnection, String programPathFileName, String startInFollowingFolder, String connectionSpeed, String reconnectIfConnDropped, String authenticationOption, String doNotUseRDGateway) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsConnectionManagementRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementRhsMenu));
            windowsConnectionManagementRhsMenu.click();
        }

        if (!(windowsConnectionManagementConnectionsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementConnectionsRhsMenu));
            windowsConnectionManagementConnectionsRhsMenu.click();
        }

        windowsConnectionManagementConnectionsRDPRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        Select select;
        JavascriptExecutor js = (JavascriptExecutor) driver;

        rdpConnectionNameTextbox.sendKeys(rdpConnectionName); //testdata
        iphostNameTextbox.sendKeys(iphostName); //testdata // it's a mandatory field without it task settings won't apply

//        String selectTab = "General"; //testdata

//        select = new Select(selectTabLabel);
//        select.selectByVisibleText(selectTab);

        if (selectTab.equalsIgnoreCase("General")) {
            generalLabel.click();
            iphostNameTextbox.clear();
            iphostNameTextbox.sendKeys(iphostName); //testdata
            portTextbox.sendKeys(port); //testdata

            if (alwaysAsk4Credential.equalsIgnoreCase("Y")) { //testdata
                logonUsernameTextbox.sendKeys(userName); //testdata
                logonDomainTextbox.sendKeys(domain); //testdata

            } else if (alwaysAsk4Credential.equalsIgnoreCase("N")) {
                js.executeScript("arguments[0].click();", alwaysAsk4CredentialCheckbox);

                if (automaticLogon.equalsIgnoreCase("Y")) { //testdata
                    js.executeScript("arguments[0].click();", automaticLogonCheckbox);
                    logonUsernameTextbox.sendKeys(userName);
                    logonDomainTextbox.sendKeys(domain);
                    logonPasswordTextbox.sendKeys(password); //testdata
                }
            }

            if (automaticStart.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", automaticStartCheckbox);
            }

        } else if (selectTab.equalsIgnoreCase("Display")) {
            displayLabel.click();

            //Remote Desktop Size
            if (useAllMonitorsForRemoteSession.equalsIgnoreCase("N")) {  //testdata
                js.executeScript("arguments[0].click();", useAllMonitorsForRemoteSessionCheckbox);
                if (fullScreen.equalsIgnoreCase("N")) { //testdata
                    js.executeScript("arguments[0].click();", fullScreenCheckbox);

                    select = new Select(sizeOfDesktopDropdown);
                    select.selectByVisibleText(sizeOfDesktop); //testdata
                }
            }

            //Colors
            select = new Select(colorsDropdown);
            select.selectByVisibleText(colors); //testdata

            if (displayConnectionBar.equalsIgnoreCase("N")) { //testdata
                js.executeScript("arguments[0].click();", displayConnectionBarCheckbox);
            }

        } else if (selectTab.equalsIgnoreCase("Local Resources")) {
            localResourcesLabel.click();

            //Remote Audio
            select = new Select(remoteAudioPlaybackDropdown);
            select.selectByVisibleText(remoteAudioPlayback); //testdata

            select = new Select(remoteAudioRecordingDropdown);
            select.selectByVisibleText(remoteAudioRecording); //testdata

            //Local Devices And Resources
            if (drives.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", drivesCheckbox);
            }

            if (clipboard.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", clipboardCheckbox);
            }

            if (printers.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", printersCheckbox);
            }

            if (smartCards.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", smartCardsCheckbox);
            }

            if (ports.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", portsCheckbox);
            }

            if (pnpDevices.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", pnpDevicesCheckbox);
            }

            //Keyboard
            select = new Select(keyboardDropdown);
            select.selectByVisibleText(keyboard); //testdata

        } else if (selectTab.equalsIgnoreCase("Programs")) {
            programsLabel.click();

            if (startProgramOnConnection.equalsIgnoreCase("Y")) {
                js.executeScript("arguments[0].click();", startProgramOnConnectionCheckbox);
                programPathFileNameTextbox.sendKeys(programPathFileName); //testdata
                startInFollowingFolderTextbox.sendKeys(startInFollowingFolder); //testdata
            }

        } else if (selectTab.equalsIgnoreCase("Experience")) {
            experienceLabel.click();

            //Performance
            select = new Select(connectionSpeedDropdown);
            select.selectByVisibleText(connectionSpeed); //testdata

            // Allowing the following checkbox script is not developed yet

            if (reconnectIfConnDropped.equalsIgnoreCase("N")) { //testdata
                js.executeScript("arguments[0].click();", reconnectIfConnDroppedCheckbox);
            }

        } else if (selectTab.equalsIgnoreCase("Advanced")) {
            advancedLabel.click();

            //Server Authentication
            select = new Select(authenticationOptionsDropdown);
            select.selectByVisibleText(authenticationOption); //testdata

            if (doNotUseRDGateway.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", doNotUseRDGatewayRadio);
            }
        }

        rdpSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(rdpStatusMessage));
        if (!((rdpStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(rdpStatusMessage.getText());
        }

    }

    public void applyConnectionManagement_Connections_Teradici(

            String connectionName, String hostName, String domainName, String Username, String password,
            String remoteWorkCard, String usbDisable, String teradiciCreateShortcutOnDesktop,
            String teradiciCreateShortcutOnStartMenu, String teradiciAutostartConnection, String teradiciType) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsConnectionManagementRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementRhsMenu));
            windowsConnectionManagementRhsMenu.click();
        }

        if (!(windowsConnectionManagementConnectionsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementConnectionsRhsMenu));
            windowsConnectionManagementConnectionsRhsMenu.click();
        }

        windowsConnectionManagementConnectionsTeradiciRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        teradiciConnectionNameTextbox.sendKeys(connectionName); //testdata //Teradici PCoIP
        teradiciHostNameTextbox.sendKeys(hostName);//testdata
        teradiciDomainNameTextbox.sendKeys(domainName);//testdata
        teradiciUserameTextbox.sendKeys(Username);//testdata
        teradiciPasswordTextbox.sendKeys(password);//testdata

        if (remoteWorkCard.equalsIgnoreCase("Y")) {//testdata
            js.executeScript("arguments[0].click();", remoteWorkCardCheckbox);
        }

        if (usbDisable.equalsIgnoreCase("Y")) {//testdata
            js.executeScript("arguments[0].click();", usbDisableCheckbox);
        }

        if (teradiciCreateShortcutOnDesktop.equalsIgnoreCase("Y")) {//testdata
            js.executeScript("arguments[0].click();", teradiciCreateShortcutOnDesktopCheckbox);
        }

        if (teradiciCreateShortcutOnStartMenu.equalsIgnoreCase("N")) {//testdata
            js.executeScript("arguments[0].click();", teradiciCreateShortcutOnStartMenuCheckbox);
        }

        if (teradiciAutostartConnection.equalsIgnoreCase("Y")) {//testdata
            js.executeScript("arguments[0].click();", teradiciAutostartConnectionCheckbox);
        }

//        String teradiciType = "Fullscreen"; //Windowed//testdata

        if (teradiciType.equalsIgnoreCase("Fullscreen")) {
//            teradiciFullScreenCheckbox.click();
            js.executeScript("arguments[0].click();", teradiciFullScreenCheckbox);

        } else if (teradiciType.equalsIgnoreCase("Windowed")) {
            js.executeScript("arguments[0].click();", teradiciWindowedCheckbox);
        }

        teradiciSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(teradiciStatusMessage));
        if (!((teradiciStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(teradiciStatusMessage.getText());
        }
    }

    public void applyConnectionManagement_Connections_VMWareview(String vmConnectionName, String vmHostName, String vmLogin, String vmPassword, String vmDomain, String vmType, String appDesktopName, String smartCardPin, String connectUsbOnStartup, String connectUsbOnInsert, String nonInteractive, String reconnectBehaviour, String vmwProtocol, String createShortcutOnDesktop, String autoStartConnection, String display) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsConnectionManagementRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementRhsMenu));
            windowsConnectionManagementRhsMenu.click();
        }

        if (!(windowsConnectionManagementConnectionsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementConnectionsRhsMenu));
            windowsConnectionManagementConnectionsRhsMenu.click();
        }

        windowsConnectionManagementConnectionsVMWareviewRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        Select select;
        JavascriptExecutor js = (JavascriptExecutor) driver;

        vmConnectionNameTextbox.sendKeys(vmConnectionName); //testdata
        vmHostNameTextbox.sendKeys(vmHostName); //testdata
        vmLoginTextbox.sendKeys(vmLogin); //testdata
        vmPasswordTextbox.sendKeys(vmPassword); //testdata
        vmDomainTextbox.sendKeys(vmDomain); //testdata

//        String vmType = "Application Name"; //testdata
        select = new Select(vmTypeDropdown);
        select.selectByVisibleText(vmType);

        appDesktopNameTextbox.sendKeys(appDesktopName); //testdata
        smartCardPinTextbox.sendKeys(smartCardPin); //testdata

        if (connectUsbOnStartup.equalsIgnoreCase("Y")) { //testdata
            js.executeScript("arguments[0].click();", vmConnectUsbOnStartupCheckbox); //testdata
        }

        if (connectUsbOnInsert.equalsIgnoreCase("Y")) { //testdata
            js.executeScript("arguments[0].click();", connectUsbOnInsertCheckbox); //testdata
        }

        if (nonInteractive.equalsIgnoreCase("Y")) { //testdata
            js.executeScript("arguments[0].click();", nonInteractiveCheckbox); //testdata
        }

        if (vmType.equalsIgnoreCase("Application Name")) {
//        String reconnectBehaviour = "Do not ask to reconnect and do not automatically reconnect"; //testdata
            select = new Select(reconnectBehaviourDropdown);
            select.selectByVisibleText(reconnectBehaviour);
        }

//        String vmwProtocol = "VMware Blast"; //testdata
        select = new Select(vmwProtocolDropdown);
        select.selectByVisibleText(vmwProtocol);

        if (createShortcutOnDesktop.equalsIgnoreCase("Y")) { //testdata
            js.executeScript("arguments[0].click();", vmCreateShortcutOnDesktopCheckbox); //testdata
        }

        if (autoStartConnection.equalsIgnoreCase("Y")) { //testdata
            js.executeScript("arguments[0].click();", vmAutostartConnectionCheckbox); //testdata
        }

//        String display = "1024x768"; //testdata
        select = new Select(displayDropdown);
        select.selectByVisibleText(display);

        vmwareViewSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(vmwareViewStatusMessage));
        if (!((vmwareViewStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(vmwareViewStatusMessage.getText());
        }

    }

    public void applyConnectionManagement_VMViewGlobalSettings(
            String unAuthenticatedAccess, String hideClientAfterLaunch, String allowH264Decoding, String allowHighColorAccuracy, String configureSSL,
            String networkCondition
    ) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsConnectionManagementRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsConnectionManagementRhsMenu));
            windowsConnectionManagementRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsConnectionManagementVMViewGlobalSettingsRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        Select select;
        JavascriptExecutor js = (JavascriptExecutor) driver;

        if (unAuthenticatedAccess.equalsIgnoreCase("Y") && !unAuthenticatedAccessCheckbox.isSelected()) { //testdata
            js.executeScript("arguments[0].click();", unAuthenticatedAccessCheckbox);
        } else if (unAuthenticatedAccess.equalsIgnoreCase("N") && unAuthenticatedAccessCheckbox.isSelected()) { //testdata
            js.executeScript("arguments[0].click();", unAuthenticatedAccessCheckbox);
        }


        if (hideClientAfterLaunch.equalsIgnoreCase("Y") && !hideClientAfterLaunchCheckbox.isSelected()) { //testdata
            js.executeScript("arguments[0].click();", hideClientAfterLaunchCheckbox);
        } else if (hideClientAfterLaunch.equalsIgnoreCase("N") && hideClientAfterLaunchCheckbox.isSelected()) { //testdata
            js.executeScript("arguments[0].click();", hideClientAfterLaunchCheckbox);
        }


        if (allowH264Decoding.equalsIgnoreCase("N") && allowH264DecodingCheckbox.isSelected()) { //testdata
            js.executeScript("arguments[0].click();", allowH264DecodingCheckbox);
        } else if (allowH264Decoding.equalsIgnoreCase("Y") && !allowH264DecodingCheckbox.isSelected()) { //testdata
            js.executeScript("arguments[0].click();", allowH264DecodingCheckbox);
        }


        if (allowHighColorAccuracy.equalsIgnoreCase("Y") && !allowHighColorAccuracyCheckbox.isSelected()) { //testdata
            js.executeScript("arguments[0].click();", allowHighColorAccuracyCheckbox);
        } else if (allowHighColorAccuracy.equalsIgnoreCase("N") && allowHighColorAccuracyCheckbox.isSelected()) { //testdata
            js.executeScript("arguments[0].click();", allowHighColorAccuracyCheckbox);
        }


        select = new Select(configureSSLDropdown);
        select.selectByVisibleText(configureSSL); //testdata

        select = new Select(networkConditionDropdown);
        select.selectByVisibleText(networkCondition); //testdata

        vmViewGlobalSettingsSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(vmViewGlobalSettingsStatusMessage));
        if (!((vmViewGlobalSettingsStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(vmViewGlobalSettingsStatusMessage.getText());
        }
    }


}
