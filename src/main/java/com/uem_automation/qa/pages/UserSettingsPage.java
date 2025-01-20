package com.uem_automation.qa.pages;

import com.uem_automation.qa.utils.Utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class UserSettingsPage {

    public WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Utilities.EXPLICIT_WAIT_TIME));

    // Objects
    @FindBy(xpath = "//div[@class='AjaxLoaderOuter loaderDivInitial']//button[@type='button'][normalize-space()='Please wait...']")
    private WebElement ajaxLoaderOuter;

    @FindBy(xpath = "//a[@id='kt_aside_toggle']")
    private WebElement rhsMenuToogleElement;

    @FindBy(xpath = "(//label[text()='Request for settings update has been processed'])[1]")
    private WebElement taskUpdateStatusGreenMessage;

    @FindBy(xpath = "//label[@id='XPTaskbarlblTaskbarMsg']")
    private WebElement taskbarPropertiesStatusMessage;

    @FindBy(xpath = "//label[@id='WinScreenSaverlblSSStatusMsg']")
    private WebElement screenSaverSettingsStatusMessage;

    @FindBy(xpath = "//label[@id='XPWallpaperlblErrMsg']")
    private WebElement wallpaperSetteingTaskUpdateStatusGreenMessage;

    @FindBy(xpath = "//label[@id='lblUserInterfaceShowResults']")
    private WebElement userInterfaceTaskUpdateStatusGreenMessage;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_usersettings_window']")
    private WebElement windowsUserSettingsRhsMenu ;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_userinterface_window']")
    private WebElement windowsUserSettingsUserInterfaceRhsMenu ;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_usersettings_window']//label[@title='Screen Saver Settings'][normalize-space()='Screen Saver Settings']")
    private WebElement windowsUserSettingsUserInterfaceScreenSaverSettingsRhsMenu ;

    @FindBy(xpath = "//select[@id='WinScreenSaverddlScreenSaverBrowseUpload']")
    private WebElement sourceDropdown ;

    @FindBy(xpath = "//select[@id='WinScreenSaverddlScreenSaver']")
    private WebElement screenSaverDropdown ;

    @FindBy(xpath = "//input[@id='WinScreenSavertxtScrSaverWaitTimeOut']")
    private WebElement screenSaverWaitTextbox ;

    @FindBy(xpath = "//input[@id='WinScreenSavercbxEnablePassword']")
    private WebElement onResumePasswordProtectedCheckbox ;

    @FindBy(xpath = "//select[@id='WinScreenSaverddlScreenSaverConnName']")
    private WebElement connectionNameDropdown ;

    @FindBy(xpath = "//input[@id='WinScreenSaverfileUpload']")
    private WebElement fileUploadIcon ;

    @FindBy(xpath = "//input[@id='WinScreenSaverchkPreventUserScreenSaver']")
    private WebElement preventUserToSetScreensaverCheckbox ;

    @FindBy(xpath = "//input[@id='WinScreenSaverbtnScreenSaverApply']")
    private WebElement screenSaverSettingsSaveButton ;

    @FindBy(xpath = "//select[@id='WinScreenSaverddlScreenSaverFile']")
    private WebElement newScreenSaverDropdown;

    // taskbar properties
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Taskbar Properties'][normalize-space()='Taskbar Properties']")
    private WebElement windowsUserSettingsUserInterfaceTaskbarPropertiesRhsMenu;

    @FindBy(xpath = "//input[@id='XPTaskbarcbxAutoHideTaskbar']")
    private WebElement autoHideTaskbarCheckbox;

    @FindBy(xpath = "//input[@id='XPTaskbarcbxGrpSimlrTaskbarbtn']")
    private WebElement groupSimilarTaskbarButtonCheckbox;

    @FindBy(xpath = "//input[@id='XPTaskbarcbxLockTheTaskbar']")
    private WebElement lockTheTaskbarCheckbox;

    @FindBy(xpath = "//input[@id='XPTaskbarcbxTopTaskbar']")
    private WebElement keepTheTaskbarOnTopOfOtherWindowsCheckbox;

    @FindBy(xpath = "//input[@id='XPTaskbarcbxShowQuickLaunch']")
    private WebElement showQuickLaunchCheckbox;

    @FindBy(xpath = "//input[@id='XPTaskbarbtn_XP_TaskbarPropertieSave']")
    private WebElement taskbarPropertiesSaveButton;

    // user interface settings
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_usersettings_window']//label[@title='User Interface Settings'][normalize-space()='User Interface Settings']")
    private WebElement windowsUserSettingsUserInterfaceUserInterfaceSettingsRhsMenu ;

    @FindBy(xpath = "//label[@id='XPUserInterface_lblAutoLogon']")
    private WebElement autoLogonTab ;

    @FindBy(xpath = "//select[@id='XPUserInterfaceddlUserListName']")
    private WebElement uiUsernameDropdown ;

    @FindBy(xpath = "//input[@id='XPUserInterfacecbxAutoLogon']")
    private WebElement autoLogonCheckbox ;

    @FindBy(xpath = "//input[@id='XPUserInterfacetxtPassword']")
    private WebElement ui_password ;

    @FindBy(xpath = "//label[@id='XPUserInterface_lblUserInterfaceSett']")
    private WebElement wclInterfaceSettingsTab ;

    @FindBy(xpath = "//input[@id='chkAutostartOnBoot']")
    private WebElement autoStartOnBootCheckbox ;

    @FindBy(xpath = "//input[@id='chkAddUsersAsWCLAdministrator']")
    private WebElement addUserAsWclAdministratorCheckbox ;

    @FindBy(xpath = "//input[@id='txtAddUsersAsWCLAdminUserName']")
    private WebElement wclAdministratorUsername ;

    @FindBy(xpath = "//input[@id='btnUserInterfaceSettAutoLogonApply']")
    private WebElement userInterfaceAutoLogonSaveButton ;

    @FindBy(xpath = "//input[@id='btnUserInterfaceSettApply']")
    private WebElement userInterfaceWclInterfaceSettingsSaveButton ;

    @FindBy(xpath = "//input[@id='rdbRunAsShell']")
    private WebElement runAsShellRadioButton ;

    @FindBy(xpath = "//input[@id='rdbRunAsStandardDesktop']")
    private WebElement runAsStandardDesktop ;

    // Wallpaper settings

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Wallpaper Settings'][normalize-space()='Wallpaper Settings']")
    private WebElement windowsUserSettingsUserInterfaceWallpaperSettingsRhsMenu ;

    @FindBy(xpath = "//select[@id='XPWallpaperddlBrowseUpload']")
    private WebElement wallpaperSourceDropdown ;

    @FindBy(xpath = "//input[@id='XPWallpapertxtTargetFolderPath']")
    private WebElement wallpaperPath ;

    @FindBy(xpath = "//select[@id='XPWallpaperddlConnName']")
    private WebElement wallpaperConnectionNameDropdown ;

    @FindBy(xpath = "//input[@id='XPWallpaperfileUpload']")
    private WebElement wallpaperFileUploadIcon ;

    @FindBy(xpath = "//select[@id='XPWallpaperddlFile']")
    private WebElement wallpaperFileDropdown ;

    @FindBy(xpath = "//select[@id='XPWallpaperddlPositions']")
    private WebElement picturePositionDropdown ;

    @FindBy(xpath = "//input[@id='XPWallpaperchkPreventUserWallpaper']")
    private WebElement preventUserToSetWallpaperCheckbox ;

    @FindBy(xpath = "//input[@id='XPWallpaperbtnSaveWallpaper']")
    private WebElement wallpaperSettingsSaveButton ;

//    @FindBy(xpath = "xxxxxx")
//    private WebElement xxxxx ;


    // Constructor
    public UserSettingsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // Actions

    public void applyUserInterface_ScreenSaverSettings() {

        // Navigate to windows user settings - user interface - screen saver settings rhs menu
        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsUserSettingsRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsUserSettingsRhsMenu));
            windowsUserSettingsRhsMenu.click();
        }

        if (!(windowsUserSettingsUserInterfaceRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsUserSettingsUserInterfaceRhsMenu));
            windowsUserSettingsUserInterfaceRhsMenu.click();
        }

        // Navigate to windows user settings - user interface - screen saver settings rhs menu
//        windowsUserSettingsRhsMenu.click();
//        windowsUserSettingsUserInterfaceRhsMenu.click();
        windowsUserSettingsUserInterfaceScreenSaverSettingsRhsMenu.click();

        // source
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        String sourceName = "New Upload"; // Local File System //New Upload //Repository //$GROUP$
        Select select = new Select(sourceDropdown);
        select.selectByVisibleText(sourceName);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        if (sourceName.equalsIgnoreCase("Local File System")) {

            String screenSaverName = "3D Pipes.scr"; //None //3D Pipes.scr //3d-pipes-1.scr // etc. .scr types are listed in the application
            select = new Select(screenSaverDropdown);
            select.selectByVisibleText(screenSaverName);

            if (screenSaverName.equalsIgnoreCase("None")) {


            } else {

                screenSaverWaitTextbox.clear();
                screenSaverWaitTextbox.sendKeys("5"); // in minutes // test data

                String onResumePasswordProtected = "N"; // Y // N

                if(onResumePasswordProtected.equalsIgnoreCase("Y")) {

                    js.executeScript("arguments[0].click();", onResumePasswordProtectedCheckbox);

                }
            }

        } else if (sourceName.equalsIgnoreCase("New Upload")) {

            String connectionName = "FDM_HTTP"; //---Select--- //FDM_HTTP //CIFS //HTTPS
            select = new Select(connectionNameDropdown);
            select.selectByVisibleText(connectionName);

            fileUploadIcon.sendKeys(System.getProperty("user.dir") + ("\\src\\main\\java\\com\\uem_automation\\qa\\testdata\\LiquidArtWinScreenSaver.scr")); // test data  //LiquidArtWinScreenSaver.scr

            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            
            screenSaverWaitTextbox.clear();
            screenSaverWaitTextbox.sendKeys("5"); // in minutes // test data

            String onResumePasswordProtected = "Y"; // Y // N

            if(onResumePasswordProtected.equalsIgnoreCase("Y")) {

                js.executeScript("arguments[0].click();", onResumePasswordProtectedCheckbox);

            }

        } else if (sourceName.equalsIgnoreCase("Repository")) {

            String connectionName = "FDM_HTTP"; //---Select--- //FDM_HTTP //CIFS //HTTPS
            select = new Select(connectionNameDropdown);
            select.selectByVisibleText(connectionName);

            String newScreenSaver = "LiquidArt.scr"; //---Select--- //Bubbles-22.scr //LiquidArt.scr //Mystify-28.scr
            select = new Select(newScreenSaverDropdown);
            select.selectByVisibleText(newScreenSaver);

            if(newScreenSaver.equalsIgnoreCase("---Select---")) {


            } else {

                screenSaverWaitTextbox.clear();
                screenSaverWaitTextbox.sendKeys("5"); // in minutes // test data

                String onResumePasswordProtected = "Y"; // Y // N

                if(onResumePasswordProtected.equalsIgnoreCase("Y")) {

                    js.executeScript("arguments[0].click();", onResumePasswordProtectedCheckbox);

                }

            }

        } else if (sourceName.equalsIgnoreCase("$GROUP$")) {

            String newScreenSaver = "Bubbles-22.scr"; //---Select--- //Bubbles-22.scr //LiquidArt.scr //Mystify-28.scr
            select = new Select(newScreenSaverDropdown);
            select.selectByVisibleText(newScreenSaver);

            if(newScreenSaver.equalsIgnoreCase("---Select---")) {


            } else {

                screenSaverWaitTextbox.clear();
                screenSaverWaitTextbox.sendKeys("5"); // in minutes // test data

                String onResumePasswordProtected = "Y"; // Y // N

                if(onResumePasswordProtected.equalsIgnoreCase("Y")) {

                    js.executeScript("arguments[0].click();", onResumePasswordProtectedCheckbox);

                }

            }

            // File Map With Repository - pending

        }

        String preventUserToSetScreenSaver = "Y"; //Y //N // test data

        if (preventUserToSetScreenSaver.equalsIgnoreCase("Y")) {

            js.executeScript("arguments[0].click();", preventUserToSetScreensaverCheckbox);

        }

        screenSaverSettingsSaveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (!((screenSaverSettingsStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(screenSaverSettingsStatusMessage.getText());
        }

    }


    public void applyUserInterface_TaskbarProperties() {

        // Navigate to taskbar properties
//        windowsUserSettingsRhsMenu.click();
//        windowsUserSettingsUserInterfaceRhsMenu.click();
        windowsUserSettingsUserInterfaceTaskbarPropertiesRhsMenu.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        // Taskbar Properties
        String autoHideTaskbar = "Y"; //Y //N // test data
        String groupSimilarTaskbarButton = "Y"; //Y //N // test data
        String lockTheTaskbar = "Y"; //Y //N // test data
        String keepTheTaskbarOnTopOfOtherWindows = "Y"; //Y //N // test data
        String showQuickLaunch = "Y"; //Y //N // test data

        JavascriptExecutor js = (JavascriptExecutor) driver;

        if(autoHideTaskbar.equalsIgnoreCase("Y")) {
//            autoHideTaskbarCheckbox.click();
            js.executeScript("arguments[0].click();", autoHideTaskbarCheckbox);
        }

        if(groupSimilarTaskbarButton.equalsIgnoreCase("Y")) {
//            groupSimilarTaskbarButtonCheckbox.click();
            js.executeScript("arguments[0].click();", groupSimilarTaskbarButtonCheckbox);
        }

        if(lockTheTaskbar.equalsIgnoreCase("Y")) {
//            lockTheTaskbarCheckbox.click();
            js.executeScript("arguments[0].click();", lockTheTaskbarCheckbox);
        }

        if(keepTheTaskbarOnTopOfOtherWindows.equalsIgnoreCase("Y")) {
//            keepTheTaskbarOnTopOfOtherWindowsCheckbox.click();
            js.executeScript("arguments[0].click();", keepTheTaskbarOnTopOfOtherWindowsCheckbox);
        }

        if(showQuickLaunch.equalsIgnoreCase("Y")) {
//            showQuickLaunchCheckbox.click();
            js.executeScript("arguments[0].click();", showQuickLaunchCheckbox);
        }

        taskbarPropertiesSaveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(taskbarPropertiesStatusMessage));
        if (!((taskbarPropertiesStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(taskUpdateStatusGreenMessage.getText());
        }
    }

    public void applyUserInterface_UserInterfaceSettings() {

        // Navigate to user interface settings
//        windowsUserSettingsRhsMenu.click();
//        windowsUserSettingsUserInterfaceRhsMenu.click();
        windowsUserSettingsUserInterfaceUserInterfaceSettingsRhsMenu.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // User Interfae settings

        String selectTab = "AutoLogon"; //AutoLogon //WCL Interface Settings

        if(selectTab.equalsIgnoreCase("AutoLogon")) {

            autoLogonTab.click();

            String ui_username = "Guest"; //Admin //Guest //shradha // etc. chk the application

            Select select = new Select(uiUsernameDropdown);
            select.selectByVisibleText(ui_username);

            String autoLogon = "Y"; //Y //N // test data
            if(autoLogon.equalsIgnoreCase("Y")) {
//                autoLogonCheckbox.click();
                js.executeScript("arguments[0].click();", autoLogonCheckbox);

                ui_password.sendKeys("admin@123"); // test data

            }

            js.executeScript("arguments[0].click();", userInterfaceAutoLogonSaveButton); //userInterfaceAutoLogonSaveButton


        }
        else if(selectTab.equalsIgnoreCase("WCL Interface Settings")) {

            wclInterfaceSettingsTab.click();

            String displayOption = "Run As Standard Desktop"; //Run As Shell(Kiosk) //Run As Standard Desktop

            if(displayOption.equalsIgnoreCase("Run As Shell(Kiosk)")) {

//                runAsShellRadioButton.click();
                js.executeScript("arguments[0].click();", runAsShellRadioButton);

            } else if(displayOption.equalsIgnoreCase("Run As Standard Desktop")) {

//                runAsStandardDesktop.click();
                js.executeScript("arguments[0].click();", runAsStandardDesktop);

                // auto start on boot
                String autoStartOnBoot = "Y"; //Y //N // test data
                if(autoStartOnBoot.equalsIgnoreCase("Y")) {
//                    autoStartOnBootCheckbox.click();
                    js.executeScript("arguments[0].click();", autoStartOnBootCheckbox);
                }
            }

            // add user as wcl administrator
            String addUserAsWclAdministrator = "Y"; //Y //N // test data
            if(addUserAsWclAdministrator.equalsIgnoreCase("Y")) {
//                addUserAsWclAdministratorCheckbox.click();
                js.executeScript("arguments[0].click();", addUserAsWclAdministratorCheckbox);

                wclAdministratorUsername.sendKeys("prajwal.solanke"); // test data

            }
            js.executeScript("arguments[0].click();", userInterfaceWclInterfaceSettingsSaveButton); //userInterfaceWclInterfaceSettingsSaveButton

        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (!((userInterfaceTaskUpdateStatusGreenMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(userInterfaceTaskUpdateStatusGreenMessage.getText());
        }
    }


    public void applyUserInterface_WallpaperSettings() {

        // Navigate to user interface settings
//        windowsUserSettingsRhsMenu.click();
//        windowsUserSettingsUserInterfaceRhsMenu.click();
        windowsUserSettingsUserInterfaceWallpaperSettingsRhsMenu.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Wallpaper settings
        // source
        String sourceName = "New Upload"; // Local File System //New Upload //Repository //$GROUP$
        Select select = new Select(wallpaperSourceDropdown);
        select.selectByVisibleText(sourceName);

        if (sourceName.equalsIgnoreCase("Local File System")) {

            wallpaperPath.sendKeys(System.getProperty("user.dir") + ("\\src\\main\\java\\com\\uem_automation\\qa\\testdata\\SampleJPGFile.jpg")); // test data

        }
        else if(sourceName.equalsIgnoreCase("New Upload")) {

            String wallpaperConnectionName = "FDM_HTTP"; //---Select--- //FDM_HTTP //CIFS //HTTPS
            select = new Select(wallpaperConnectionNameDropdown);
            select.selectByVisibleText(wallpaperConnectionName);

            wallpaperFileUploadIcon.sendKeys(System.getProperty("user.dir") + ("\\src\\main\\java\\com\\uem_automation\\qa\\testdata\\SampleJPGFile.jpg")); // test data

        }
        else if(sourceName.equalsIgnoreCase("Repository")) {

            String wallpaperConnectionName = "FDM_HTTP"; //---Select--- //FDM_HTTP //CIFS //HTTPS
            select = new Select(wallpaperConnectionNameDropdown);
            select.selectByVisibleText(wallpaperConnectionName);

            if(wallpaperConnectionName.equalsIgnoreCase("---Select---")) {

            }
            else {

                select = new Select(wallpaperFileDropdown);
                select.selectByIndex(1); // test data

            }

        }
        else if(sourceName.equalsIgnoreCase("$GROUP$")) {

            select = new Select(wallpaperFileDropdown);
            select.selectByIndex(2); // test data

        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        String picturePosition = "Center"; //---Select--- //Stretch //Tile //Center
        select = new Select(picturePositionDropdown);
        select.selectByVisibleText(picturePosition);


        String preventUserToSetWallpaper = "Y"; //Y //N // test data
        if(preventUserToSetWallpaper.equalsIgnoreCase("Y")) {
//                preventUserToSetWallpaperCheckbox.click();
            js.executeScript("arguments[0].click();", preventUserToSetWallpaperCheckbox);
        }

        wallpaperSettingsSaveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        if (!((wallpaperSetteingTaskUpdateStatusGreenMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(wallpaperSetteingTaskUpdateStatusGreenMessage.getText());
        }

    }
}
