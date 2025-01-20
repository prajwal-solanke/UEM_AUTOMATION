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

public class SoftwareDeploymentPage {

    public WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Utilities.EXPLICIT_WAIT_TIME));

    // Objects
    // Application Command
    @FindBy(xpath = "//div[@class='AjaxLoaderOuter loaderDivInitial']//button[@type='button'][normalize-space()='Please wait...']")
    private WebElement ajaxLoaderOuter;

    @FindBy(xpath = "//a[@id='kt_aside_toggle']")
    private WebElement rhsMenuToogleElement;

    // Software Deployment
    // Software And Patch Install Uninstall
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_software_deployment_Win']")
    private WebElement windowsSoftwareDeploymentRhsMenu;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_software_patch_Win']//label")
    private WebElement windowsSoftwareDeploymentSoftwareAndPatchInstallUninstallRhsMenu;

    @FindBy(xpath = "//input[@id='XPSoftwareUpgrade_btnNewInstall']")
    private WebElement newInstallButton;

    @FindBy(xpath = "//select[@id='XPSoftwareUpgrade_ddlSourceType']")
    private WebElement sourceTypeDropdown;

    @FindBy(xpath = "//select[@id='XPSoftwareUpgrade_ddlSource']")
    private WebElement sourceDropdown;

    @FindBy(xpath = "//input[@id='XPSoftwareUpgrade_fileUpload']")
    private WebElement fileUploadIcon;

    @FindBy(xpath = "//input[@id='XPSoftwareUpgrade_btnUpload']")
    private WebElement fileUploadButton;

    @FindBy(xpath = "//label[@id='WinFileTransferlblMessage']")
    private WebElement fileUploadStatus;

    @FindBy(xpath = "//label[@id='XPSoftwareUpgrade_lblErrorMsg']")
    private WebElement fileUploadStatus2;

    @FindBy(xpath = "//select[@id='XPSoftwareUpgrade_ddlFile']")
    private WebElement fileDropdown;

    @FindBy(xpath = "//input[@id='btnVldtCnnctnsoftwarePatechXP']")
    private WebElement validateConnectionButton;

    @FindBy(xpath = "//label[@id='lblErrorMsgForAddConnection']")
    private WebElement connectionStatus;

    @FindBy(xpath = "//input[@id='XPSoftwareUpgrade_txtParameter']")
    private WebElement parameterTextbox;

    @FindBy(xpath = "//input[@id='XPSoftwareUpgrade_isglobal']")
    private WebElement globalRepositoryCheckbox;

    @FindBy(xpath = "//input[@id='XPSoftwareUpgrade_btnInstall']")
    private WebElement softwarePatchInstallUninstallButtonSave;

    @FindBy(xpath = "//div[@id='trSummaryButton']")
    private WebElement softwarePatchInstallUninstallTaskUpdateStatusMessage;

    @FindBy(xpath = "//input[@id='XPSoftwareUpgrade_InstallidRebootRequired']")
    private WebElement softwareUpgradeSkipWriteFilterCheckbox;

    // file transfer
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_software_deployment_Win']//label[@title='File Transfer'][normalize-space()='File Transfer']")
    private WebElement windowsSoftwareDeploymentFileTransferRhsMenu ;

    @FindBy(xpath = "//label[@id='WinFileTransferlnkbtnfile']")
    private WebElement fileTansferLabel ;

    @FindBy(xpath = "//input[@id='WinFileTransfertxtTargetFolderPath']")
    private WebElement targetFolderPathTextbox ;

    @FindBy(xpath = "//select[@id='winFileTransferSourcedrp']")
    private WebElement ftSourceDropdown ;

    @FindBy(xpath = "//select[@id='winFileTransferSourceTypedrp']")
    private WebElement ftSourceTypeDropdown ;

    @FindBy(xpath = "//input[@id='WinFileTransferfileUpload']")
    private WebElement ftFileUploadIcon ;

    @FindBy(xpath = "//input[@id='WinFileTransferbtnUploads']")
    private WebElement ftFileUploadButton ;

    @FindBy(xpath = "//select[@id='winFileTransferNamedrp']")
    private WebElement ftFileNameDropdown ;

    @FindBy(xpath = "//input[@id='WinFileTransferchkFileExecute']")
    private WebElement executeFileCheckbox ;

    @FindBy(xpath = "//input[@id='WinFileTransfertxtCommandLine']")
    private WebElement commandParameterTextbox ;

    @FindBy(xpath = "//input[@id='WinFileTransferidRebootRequired']")
    private WebElement ftSkipWriteFilterCheckbox ;

    @FindBy(xpath = "//input[@id='WinFileTransferchkGlobalRepository']")
    private WebElement ftGlobalRepositoryCheckbox ;

    @FindBy(xpath = "//label[@id='WinFileTransferlnkbtnfolder']")
    private WebElement ftFolderTransferLabel ;

    @FindBy(xpath = "//input[@id='WinFileTransferchkBatchExecution']")
    private WebElement ftBatchExecutionCheckbox ;

    @FindBy(xpath = "//input[@id='WinFileTransferbtnFTApplyJQ']")
    private WebElement fileTransferButtonSave ;

    @FindBy(xpath = "//label[@id='WinFileTransferlblMessage']")
    private WebElement fileTransferStatusMessage ;

    @FindBy(xpath = "//div[@id='WinFileTransfertblFileTransferView']//div[@class='pull-left']")
    private WebElement ftFileUploadStatus ;

    // Import File
    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//li[@id='lblMenu_software_deployment_Win']//label[@title='Import File'][normalize-space()='Import File']")
    private WebElement windowsSoftwareDeploymentImportFileRhsMenu ;

    @FindBy(xpath = "//label[@id='WindowsImportFile_lilblImportFile']")
    private WebElement ifImportFileLabel ;

    @FindBy(xpath = "//select[@id='WindowsImportFileddlSourceType']")
    private WebElement ifSourceTypeDropdown ;

    @FindBy(xpath = "//select[@id='WindowsImportFileddlSource']")
    private WebElement ifSourceDropdown ;

    @FindBy(xpath = "//input[@id='WindowsImportFilePathTxt']")
    private WebElement ifFilePathTextbox ;

    @FindBy(xpath = "//label[@id='WindowsImportFile_lilblImportFolder']")
    private WebElement ifImportFolderLabel ;

    @FindBy(xpath = "//input[@id='txtWindowsImportFolderPath']")
    private WebElement ifFolderPathTextbox ;

    @FindBy(xpath = "//label[@id='WindowsImportFile_lilblFolderSync']")
    private WebElement ifFolderSynchronizationLabel ;

    @FindBy(xpath = "//input[@id='WindowsImportFile_txtFolderSyncPath']")
    private WebElement ifFolderSynchronizationPathTextbox ;

    @FindBy(xpath = "//input[@id='WindowsImportFile_ADDFolderSyncPath']")
    private WebElement addButton ;

    @FindBy(xpath = "//input[@id='btnApplyWindowsImportFile']")
    private WebElement importFileButtonSave ;

    @FindBy(xpath = "//input[@id='WindowsImportFile_btnFolderSyncApply']")
    private WebElement folderSyncButtonSave ;

    @FindBy(xpath = "//label[@id='WindowsImportFile_lblMsg']")
    private WebElement importFileStatusMessage ;

    @FindBy(xpath = "//label[@id='WindowsImportFilelblMessage']")
    private WebElement folderSyncStatusMessage ;

//    @FindBy(xpath = "xxxxxxxx")
//    private WebElement xxxxx ;


    // Constructor
    public SoftwareDeploymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void applySoftwareDeployment_SoftwareAndPatch_InstallUninstall(String selectNewInstallOrUninstall, String sourceType, String source,
                                                                          String fileName, String parameter, String skipWriteFilter, String globalRepository) {


        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSoftwareDeploymentRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSoftwareDeploymentRhsMenu));
            windowsSoftwareDeploymentRhsMenu.click();
        }

        windowsSoftwareDeploymentSoftwareAndPatchInstallUninstallRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        Select select;
        JavascriptExecutor js = (JavascriptExecutor) driver;

//        String selectNewInstallOrUninstall = "NEW INSTALL"; // test data // UNINSTALL

        if (selectNewInstallOrUninstall.equalsIgnoreCase("NEW INSTALL")) {

            newInstallButton.click();
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            js.executeScript("arguments[0].scrollIntoView(true);", softwarePatchInstallUninstallButtonSave);

//            String sourceType = "Repository"; //Repository //New Upload //$Group$
            wait.until(ExpectedConditions.visibilityOf(sourceTypeDropdown));
            select = new Select(sourceTypeDropdown);
            select.selectByVisibleText(sourceType);
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            wait.until(ExpectedConditions.visibilityOf(sourceTypeDropdown));
            wait.until(ExpectedConditions.elementToBeClickable(sourceTypeDropdown));
//            String source = "HTTPS"; //FDM_HTTP //FTPS //CIFS //HTTPS //$GROUP$


            if (sourceType.equalsIgnoreCase("New Upload")) {

                select = new Select(sourceDropdown);
                select.selectByVisibleText(source);
                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

                // upload file
                fileUploadIcon.sendKeys(System.getProperty("user.dir") + ("\\src\\main\\java\\com\\uem_automation\\qa\\testdata\\") + fileName);
                fileUploadButton.click();
                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//                Assert.assertTrue((fileUploadStatus.getText()).equalsIgnoreCase(fileName + " is uploaded"));
                Assert.assertEquals(fileUploadStatus2.getText(), fileName + " is uploaded");

            } else if (sourceType.equalsIgnoreCase("$Group$")) {
                select = new Select(fileDropdown);
                select.selectByVisibleText(fileName);
                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//                validateConnectionButton.click();
                js.executeScript("arguments[0].click();", validateConnectionButton);
                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
                wait.until(ExpectedConditions.visibilityOf(connectionStatus));
                Assert.assertTrue((connectionStatus.getText()).equalsIgnoreCase("Connection validated successfully."));

            } else {

                select = new Select(sourceDropdown);
                select.selectByVisibleText(source);
                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//                String fileName = "ChromeSetup.exe"; // test data

                select = new Select(fileDropdown);
                select.selectByVisibleText(fileName);
                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

                validateConnectionButton.click();
//                Assert.assertTrue((connectionStatus.getText()).equalsIgnoreCase("Connection validated successfully."));
                Assert.assertEquals(connectionStatus.getText(), "Connection validated successfully.");

            }

//            String parameter = "/quiet"; // test data
            parameterTextbox.clear();
            parameterTextbox.sendKeys(parameter);

//            String skipWriteFilter = "Y"; //Y //N
            if (skipWriteFilter.equalsIgnoreCase("Y")) {
                js.executeScript("arguments[0].click();", softwareUpgradeSkipWriteFilterCheckbox);//input[@id='XPSoftwareUpgrade_InstallidRebootRequired']
            }
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//            String globalRepository = "Y"; //Y //N
            if (globalRepository.equalsIgnoreCase("Y")) {
                js.executeScript("arguments[0].click();", globalRepositoryCheckbox);
            }
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            softwarePatchInstallUninstallButtonSave.click();

            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            if (!((softwarePatchInstallUninstallTaskUpdateStatusMessage.getText()).equals("Request for settings update has been processed"))) {
                Assert.fail(softwarePatchInstallUninstallTaskUpdateStatusMessage.getText());
            }

        } else if (selectNewInstallOrUninstall.equalsIgnoreCase("UNINSTALL")) {
            Assert.fail("Uninstall code development is in progress....");
        }

    }

    public void apply_FileTransfer(
            String selectTab, String targetFolderPath, String ftSource,
            String ftSourceType, String fileName, String skipWriteFilter, String globalRepository,
            String executeFile, String batchExecution, String commandParameter
    ) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSoftwareDeploymentRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSoftwareDeploymentRhsMenu));
            windowsSoftwareDeploymentRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsSoftwareDeploymentFileTransferRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        Select select;
        JavascriptExecutor js = (JavascriptExecutor) driver;

//        String selectTab = "File Transfer"; //testdata

        if (selectTab.equalsIgnoreCase("File Transfer")) {

            fileTansferLabel.click();
            targetFolderPathTextbox.sendKeys(targetFolderPath); //testdata

            //source
            select = new Select(ftSourceDropdown);
            select.selectByVisibleText(ftSource); //testdata
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            if (ftSource.equalsIgnoreCase("Upload")) {

                //source type
                select = new Select(ftSourceTypeDropdown);
                select.selectByVisibleText(ftSourceType); //testdata
                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

                // file name
                ftFileUploadIcon.sendKeys(System.getProperty("user.dir") + ("\\src\\main\\java\\com\\uem_automation\\qa\\testdata\\") + fileName); //testdata
                ftFileUploadButton.click();
                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
                Assert.assertTrue((ftFileUploadStatus.getText()).equalsIgnoreCase(fileName + " is uploaded"));


            } else if (ftSource.equalsIgnoreCase("Repository")) {

                //source type
                select = new Select(ftSourceTypeDropdown);
                select.selectByVisibleText(ftSourceType); //testdata
                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

                //file name
                select = new Select(ftFileNameDropdown);
                select.selectByVisibleText(fileName); // testdata=

            } else if (ftSource.equalsIgnoreCase("$GROUP$")) {

                //file name
                select = new Select (ftFileNameDropdown);
                select.selectByVisibleText(fileName); // testdata

            }

            //execute file
            if (executeFile.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", executeFileCheckbox);

                commandParameterTextbox.sendKeys(commandParameter); //testdata
            }

            // skip and global
            if (skipWriteFilter.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", ftSkipWriteFilterCheckbox);//input[@id='XPSoftwareUpgrade_InstallidRebootRequired']
            }
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            if (globalRepository.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", ftGlobalRepositoryCheckbox);
            }
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        } else if (selectTab.equalsIgnoreCase("Folder Transfer")) {

            ftFolderTransferLabel.click();
            targetFolderPathTextbox.sendKeys(targetFolderPath); //testdata

            //source
            wait.until(ExpectedConditions.elementToBeClickable(ftSourceDropdown));
            select = new Select(ftSourceDropdown);
            select.selectByVisibleText(ftSource); //testdata
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            if (ftSource.equalsIgnoreCase("Upload")) {

                //source type
                select = new Select(ftSourceTypeDropdown);
                select.selectByVisibleText(ftSourceType); //testdata
                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

                // folder name
                ftFileUploadIcon.sendKeys(System.getProperty("user.dir") + ("\\src\\main\\java\\com\\uem_automation\\qa\\testdata\\") + fileName); //testdata
                ftFileUploadButton.click();
                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
                Assert.assertTrue((fileUploadStatus.getText()).equalsIgnoreCase(fileName + " is uploaded"));

            } else if (ftSource.equalsIgnoreCase("Repository")) {

                //source type
                select = new Select(ftSourceTypeDropdown);
                select.selectByVisibleText(ftSourceType); //testdata
                wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

                //file name
                select = new Select (ftFileNameDropdown);
                select.selectByVisibleText(fileName); // testdata


            } else if (ftSource.equalsIgnoreCase("$GROUP$")) {

                //file name
                select = new Select (ftFileNameDropdown);
                select.selectByVisibleText(fileName); // testdata

            }

            // batch exe and skip and global
            if (batchExecution.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", ftBatchExecutionCheckbox);
            }
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            if (skipWriteFilter.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", ftSkipWriteFilterCheckbox);//input[@id='XPSoftwareUpgrade_InstallidRebootRequired']
            }
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

            if (globalRepository.equalsIgnoreCase("Y")) { //testdata
                js.executeScript("arguments[0].click();", ftGlobalRepositoryCheckbox);
            }
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        }

        fileTransferButtonSave.click();

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        if (!((fileTransferStatusMessage.getText()).equals("Request for settings update has been processed"))) {
            Assert.fail(fileTransferStatusMessage.getText());
        }

    }

    public void apply_ImportFile(
            String ifSelectTab, String sourceType, String source, String filePath, String folderPath,
            String folderSynchronizationPath
    ) {

        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
            rhsMenuToogleElement.click();
        }

        if (!(windowsSoftwareDeploymentRhsMenu.getAttribute("class").contains("menu-item-open"))) {
            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
            wait.until(ExpectedConditions.elementToBeClickable(windowsSoftwareDeploymentRhsMenu));
            windowsSoftwareDeploymentRhsMenu.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        windowsSoftwareDeploymentImportFileRhsMenu.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

        Select select;

//        String ifSelectTab = "Import File"; //testdata

        if(ifSelectTab.equalsIgnoreCase("Import File")) {

            ifImportFileLabel.click();

            select = new Select(ifSourceTypeDropdown);
            select.selectByVisibleText(sourceType); //testdata

            if(!sourceType.equalsIgnoreCase("$GROUP$")) {
                select = new Select(ifSourceDropdown);
                select.selectByVisibleText(source); //testdata
            }

            ifFilePathTextbox.sendKeys(filePath); //testdata

            importFileButtonSave.click();

        }
        else if(ifSelectTab.equalsIgnoreCase("Import Folder")) {

            ifImportFolderLabel.click();

            select = new Select(ifSourceTypeDropdown);
            select.selectByVisibleText(sourceType);

            if(!sourceType.equalsIgnoreCase("$GROUP$")) {
                select = new Select(ifSourceDropdown);
                select.selectByVisibleText(source); //testdata
            }

            ifFolderPathTextbox.sendKeys(folderPath); //testdata

            importFileButtonSave.click();

        }
        else if(ifSelectTab.equalsIgnoreCase("Folder synchronization")) {

            ifFolderSynchronizationLabel.click();

            ifFolderSynchronizationPathTextbox.sendKeys(folderSynchronizationPath); //testdata

            addButton.click();

            folderSyncButtonSave.click();
        }

        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));

//        if(ifSelectTab.equalsIgnoreCase("Folder synchronization")) {
//            if (!((folderSyncStatusMessage.getText()).equals("Request for settings update has been processed"))) {
//                Assert.fail(folderSyncStatusMessage.getText());
//            }
//        }
//        else {
//            if (!((importFileStatusMessage.getText()).equals("Request for settings update has been processed"))) {
//                Assert.fail(importFileStatusMessage.getText());
//            }
//        }

        String actualMessage = (ifSelectTab.equalsIgnoreCase("Folder synchronization"))
                ? folderSyncStatusMessage.getText()
                : importFileStatusMessage.getText();

        Assert.assertEquals(actualMessage, "Request for settings update has been processed");
    }

//    public void apply_DeployImage(String ifSelectTab, String sourceType, String source, String filePath, String folderPath, String folderSynchronizationPath) {
//
//        if (rhsMenuToogleElement.getAttribute("class").contains("active")) {
//            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//            wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
//            rhsMenuToogleElement.click();
//        }
//
//        if (!(windowsSoftwareDeploymentRhsMenu.getAttribute("class").contains("menu-item-open"))) {
//            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//            wait.until(ExpectedConditions.elementToBeClickable(windowsSoftwareDeploymentRhsMenu));
//            windowsSoftwareDeploymentRhsMenu.click();
//        }
//
//        if (!(windowsImageManagementRhsMenu.getAttribute("class").contains("menu-item-open"))) {
//            wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//            wait.until(ExpectedConditions.elementToBeClickable(windowsImageManagementRhsMenu));
//            windowsImageManagementRhsMenu.click();
//        }
//
//        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//        windowsSoftwareDeploymentImageManagementDeployImageRhsMenu.click();
//        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
//
//        Select select;
//
//        select = new Select(targetConnectionDropdown);
//        select.selectByVisibleText(targetConnection); //testdata
//
//        select = new Select(diSourceDropdown);
//        select.selectByVisibleText(source); //testdata
//
//        // pending onwards...
//
//    }
}
