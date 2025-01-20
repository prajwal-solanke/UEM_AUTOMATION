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

public class RemoteOperationalToolPage {

    public WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Utilities.EXPLICIT_WAIT_TIME));

    // Objects
    // Application Command
    @FindBy(xpath = "//div[@class='AjaxLoaderOuter loaderDivInitial']//button[@type='button'][normalize-space()='Please wait...']")
    private WebElement ajaxLoaderOuter;

    @FindBy(xpath = "//a[@id='kt_aside_toggle']")
    private WebElement rhsMenuToogleElement;

    //Remote Operational Tool
    //Disable Client
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_remoteopration_Win']")
    private WebElement windowsRemoteOperationalToolRhsMenu;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Disable Client'][normalize-space()='Disable Client']")
    private WebElement windowsRemoteOperationalToolDisableCleientRhsMenu;

    @FindBy(xpath = "//input[@id='ucRemoteTool_btn_ApplyRemoteOperation']")
    private WebElement disableClientSaveButton;

    @FindBy(xpath = "//label[@id='ucRemoteTool_lblRemotemsg']")
    private WebElement disableClientStatusMessage;

    // Lock Computer
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Lock Computer'][normalize-space()='Lock Computer']")
    private WebElement windowsRemoteOperationalToolLockComputerRhsMenu;

    @FindBy(xpath = "//input[@id='ucRemoteTool_btn_ApplyRemoteOperation']")
    private WebElement lockComputerSaveButton;

    @FindBy(xpath = "//label[@id='ucRemoteTool_lblRemotemsg']")
    private WebElement lockComputerSaveStatusMessage;

    // Log Off
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Log Off'][normalize-space()='Log Off']")
    private WebElement windowsRemoteOperationalToolLogOffRhsMenu;

    @FindBy(xpath = "//input[@id='ucRemoteTool_btn_ApplyRemoteOperation']")
    private WebElement logOffSaveButton;

    @FindBy(xpath = "//div[@id='ucRemoteTool_dvShowResults']")
    private WebElement logOffSaveStatusMessage;

    //Restart
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_remoteopration_Win']//label[@title='Restart'][normalize-space()='Restart']")
    private WebElement windowsRemoteOperationalToolRestartRhsMenu;

    @FindBy(xpath = "//input[@id='ucRemoteTool_btn_ApplyRemoteOperation']")
    private WebElement RestartSaveButton;

    @FindBy(xpath = "//label[@id='ucRemoteTool_lblRemotemsg']")
    private WebElement RestartSaveStatusMessage;

    //Send Message To Client
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_remoteopration_Win']//label[@title='Send Message To Client'][normalize-space()='Send Message To Client']")
    private WebElement windowsRemoteOperationalToolSendMessageToClientRhsMenu;

    @FindBy(xpath = "//select[@id='ucRemoteTool_ddlMessageType']")
    private WebElement smMessageTypeDropdown;

    @FindBy(xpath = "//select[@id='ucRemoteTool_ddlimportance']")
    private WebElement smImportanceDropdown;

    @FindBy(xpath = "//input[@id='ucRemoteTool_txttitle']")
    private WebElement smTitleTextbox;

    @FindBy(xpath = "//textarea[@id='ucRemoteTool_txtMsg']")
    private WebElement smMessageTextbox;

    @FindBy(xpath = "//select[@id='ucRemoteTool_ddlDisplayTime']")
    private WebElement smDisplayTimeDropdown;

    @FindBy(xpath = "//input[@id='ucRemoteTool_chkIsFeedback']")
    private WebElement smFeedbackCheckbox;

    @FindBy(xpath = "//input[@id='ucRemoteTool_btn_ApplyRemoteOperation']")
    private WebElement sendMessageToClientSaveButton;

    @FindBy(xpath = "//label[@id='ucRemoteTool_lblRemotemsg']")
    private WebElement sendMessageToClientStatusMessage;

    // Service Mode
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Service Mode'][normalize-space()='Service Mode']")
    private WebElement windowsRemoteOperationalToolServiceModeRhsMenu;

    @FindBy(xpath = "//input[@id='ucTMWinServiceMode_RbtnEnabledServiceMode']")
    private WebElement enableServiceModeRadio;

    @FindBy(xpath = "//input[@id='ucTMWinServiceMode_RbtnDisabledServiceMode']")
    private WebElement disabledServiceModeRadio;

    @FindBy(xpath = "//input[@id='ucTMWinServiceMode_btnToolApply']")
    private WebElement serviceModeSaveButton;

    @FindBy(xpath = "//div[@id='ucTMWinServiceMode_tblTask']//div[@class='card-footer']//div[@class='pull-left']")
    private WebElement serviceModeStatusMessage;

    // Shut Down
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_remoteopration_Win']//label[@title='Shutdown'][normalize-space()='Shutdown']")
    private WebElement windowsRemoteOperationalToolShutDownRhsMenu;

    @FindBy(xpath = "//input[@id='ucRemoteTool_btn_ApplyRemoteOperation']")
    private WebElement ShutDownSaveButton;

    @FindBy(xpath = "//label[@id='ucRemoteTool_lblRemotemsg']")
    private WebElement ShutDownSaveStatusMessage;

    // Synchronise Inventory
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_remoteopration_Win']//label[@title='Synchronise Inventory'][normalize-space()='Synchronise Inventory']")
    private WebElement windowsRemoteOperationalToolSynchroniseInventoryRhsMenu ;

    @FindBy(xpath = "//select[@id='ucRemoteTool_ddlInventorySync']")
    private WebElement inventorySyncDropdown ;

    @FindBy(xpath = "//input[@id='ucRemoteTool_btn_ApplyRemoteOperation']")
    private WebElement inventorySyncSaveButton ;

    @FindBy(xpath = "//label[@id='ucRemoteTool_lblRemotemsg']")
    private WebElement inventorySyncSaveStatusMessage ;

    // Wake On Lan
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_remoteopration_Win']//label[@title='Wake On LAN'][normalize-space()='Wake On LAN']")
    private WebElement windowsRemoteOperationalToolWakeOnLanRhsMenu ;

    @FindBy(xpath = "//input[@id='ucRemoteTool_btn_ApplyRemoteOperation']")
    private WebElement wakeOnLanSaveButton ;

    @FindBy(xpath = "//label[@id='ucRemoteTool_lblRemotemsg']")
    private WebElement wakeOnLanStatusMessage ;

//    @FindBy(xpath = "xxxxxx")
//    private WebElement sendMessageToClientStatusMessage ;


    // Constructor
    public RemoteOperationalToolPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void applyRemoteOperationTool_DisableClient(String disableClientSave) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsRemoteOperationalToolRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsRemoteOperationalToolRhsMenu));
            windowsRemoteOperationalToolRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsRemoteOperationalToolDisableCleientRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (disableClientSave.equalsIgnoreCase("Y")) {
            disableClientSaveButton.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(disableClientStatusMessage));
        if (!((disableClientStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(disableClientStatusMessage.getText());
        }
    }

    public void applyRemoteOperationTool_LockComputer(String lockComputerSave) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsRemoteOperationalToolRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsRemoteOperationalToolRhsMenu));
            windowsRemoteOperationalToolRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsRemoteOperationalToolLockComputerRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (lockComputerSave.equalsIgnoreCase("Y")) {
            lockComputerSaveButton.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(lockComputerSaveStatusMessage));
        if (!((lockComputerSaveStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(lockComputerSaveStatusMessage.getText());
        }
    }

    public void applyRemoteOperationTool_LogOffSave(String logOffSave) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsRemoteOperationalToolRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsRemoteOperationalToolRhsMenu));
            windowsRemoteOperationalToolRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsRemoteOperationalToolLogOffRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (logOffSave.equalsIgnoreCase("Y")) {
            logOffSaveButton.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(logOffSaveStatusMessage));
        if (!((logOffSaveStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(logOffSaveStatusMessage.getText());
        }
    }

    public void applyRemoteOperationTool_Restart(String restartSave) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsRemoteOperationalToolRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsRemoteOperationalToolRhsMenu));
            windowsRemoteOperationalToolRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsRemoteOperationalToolRestartRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//        if(restartAlertUser.equalsIgnoreCase("Y")) {
//            js.executeScript("arguments[0].click();", restartAlertUserCheckbox);
//        }

        if (restartSave.equalsIgnoreCase("Y")) {
            RestartSaveButton.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(RestartSaveStatusMessage));
        if (!((RestartSaveStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(RestartSaveStatusMessage.getText());
        }
    }

    public void applyRemoteOperationTool_SendMessageToClient(String smMessageType, String smImportance, String smTitle, String smMessage
            , String smDisplayTime, String smFeedback) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsRemoteOperationalToolRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsRemoteOperationalToolRhsMenu));
            windowsRemoteOperationalToolRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsRemoteOperationalToolSendMessageToClientRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        Select select = new Select(smMessageTypeDropdown);
        select.selectByVisibleText(smMessageType); // testdata

        select = new Select(smImportanceDropdown);
        select.selectByVisibleText(smImportance); // testdata

        smTitleTextbox.clear();
        smTitleTextbox.sendKeys(smTitle); //testdata

        smMessageTextbox.sendKeys(smMessage); //testdata

        select = new Select(smDisplayTimeDropdown);
        select.selectByVisibleText(smDisplayTime); //testdata

        if (smFeedback.equalsIgnoreCase("N")) { // testdata
            js.executeScript("arguments[0].click();", smFeedbackCheckbox);
        }

        sendMessageToClientSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(sendMessageToClientStatusMessage));
        if (!((sendMessageToClientStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(sendMessageToClientStatusMessage.getText());
        }
    }

    public void applyRemoteOperationTool_ServiceMode(String serviceMode) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsRemoteOperationalToolRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsRemoteOperationalToolRhsMenu));
            windowsRemoteOperationalToolRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsRemoteOperationalToolServiceModeRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        if (serviceMode.equalsIgnoreCase("Enabled Service Mode")) { //testdata
//            enableServiceModeRadio.click();
            js.executeScript("arguments[0].click();", enableServiceModeRadio);
        } else if (serviceMode.equalsIgnoreCase("Disabled Service Mode")) {
//            disabledServiceModeRadio.click();
            js.executeScript("arguments[0].click();", disabledServiceModeRadio);
        }

        serviceModeSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(serviceModeStatusMessage));
        if (!((serviceModeStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(serviceModeStatusMessage.getText());
        }
    }

    public void applyRemoteOperationTool_ShutDown(String ShutDownSave) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsRemoteOperationalToolRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsRemoteOperationalToolRhsMenu));
            windowsRemoteOperationalToolRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsRemoteOperationalToolShutDownRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (ShutDownSave.equalsIgnoreCase("Y")) {
            ShutDownSaveButton.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(ShutDownSaveStatusMessage));
        if (!(ShutDownSaveStatusMessage.getText().equals("Shutdown settings saved successfully."))) {
            Assert.fail(ShutDownSaveStatusMessage.getText());
        }

    }

    public void applyRemoteOperationTool_SynchroniseInventory(String inventorySync) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsRemoteOperationalToolRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsRemoteOperationalToolRhsMenu));
            windowsRemoteOperationalToolRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsRemoteOperationalToolSynchroniseInventoryRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        Select select = new Select(inventorySyncDropdown);
        select.selectByVisibleText(inventorySync); //testdata

        inventorySyncSaveButton.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(inventorySyncSaveStatusMessage));
        if (!(inventorySyncSaveStatusMessage.getText().equals("Request for settings update has been processed"))) {
            Assert.fail(inventorySyncSaveStatusMessage.getText());
        }
    }

    public void applyRemoteOperationTool_WakeOnLan(String wakeOnLan) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsRemoteOperationalToolRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsRemoteOperationalToolRhsMenu));
            windowsRemoteOperationalToolRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsRemoteOperationalToolWakeOnLanRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (wakeOnLan.equalsIgnoreCase("Y")) {
            wakeOnLanSaveButton.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(wakeOnLanStatusMessage));
        if (!((wakeOnLanStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(wakeOnLanStatusMessage.getText());
        }
    }

}
