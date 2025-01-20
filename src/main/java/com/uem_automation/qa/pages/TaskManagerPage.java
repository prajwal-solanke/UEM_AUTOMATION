package com.uem_automation.qa.pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.uem_automation.qa.utils.Utilities;

public class TaskManagerPage {

    public WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Utilities.EXPLICIT_WAIT_TIME));

    // Objects
    @FindBy(xpath = "//div[@class='AjaxLoaderOuter loaderDivInitial']//button[@type='button'][normalize-space()='Please wait...']")
    private WebElement ajaxLoaderOuter;

    @FindBy(xpath = "//div[@class='dropdown viewDataMenu viewDataMenuTop']//div[@id='divTask']")
    private WebElement taskManagementTopMenuElement;

    @FindBy(xpath = "//a[@id='kt_aside_toggle']")
    private WebElement rhsMenuToogleElement;

    @FindBy(xpath = "//ul[@class='menu-nav mt-n1 page-sidebar-menu']//label[@title='Template Manager'][normalize-space()='Template Manager']")
    private WebElement templateManagerRhsMenuElement;

    // Constructor
    public TaskManagerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void navigateToTemplateMangerRhsMenu() {
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.elementToBeClickable(rhsMenuToogleElement));
        rhsMenuToogleElement.click();
        wait.until(ExpectedConditions.invisibilityOf(ajaxLoaderOuter));
        wait.until(ExpectedConditions.visibilityOf(templateManagerRhsMenuElement));
        wait.until(ExpectedConditions.elementToBeClickable(templateManagerRhsMenuElement));
        templateManagerRhsMenuElement.click();
    }


}
