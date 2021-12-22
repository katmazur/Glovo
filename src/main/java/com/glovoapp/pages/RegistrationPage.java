package com.glovoapp.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends Page {


    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public static String REG_URL = "https://couriers.glovoapp.com/by/";

    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement inputName;

    @FindBy(css = ".text-field__input .el-select__caret")
    private WebElement cityDropdown;

    @FindBy(xpath = "//input[@type='tel']")
    private WebElement inputTel;

    @FindBy(xpath = "//button/span")
    private WebElement buttonNext;

    @FindBy(css = ".iti__flag-container")
    private WebElement phoneCodeDropdown;

    @FindBy(xpath = "//input[@type=\"tel\"]")
    private WebElement phoneNumber;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement continueButton;

    @FindBy (xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement cookiesButton;


    public void insertUserData(String cityName, String countryName) {
        By cityLocator = generateXpath(cityName);
        By countryCodeLocator = generateXpath(countryName);
        inputName.sendKeys(faker.name().fullName());
        inputEmail.sendKeys(faker.internet().emailAddress());
        cityDropdown.click();
        waitAndClick(cityLocator);
        phoneCodeDropdown.click();
        waitAndClick(countryCodeLocator);
        phoneNumber.sendKeys("17563269463");
    }

    public void clickRegistration() {
        continueButton.click();
    }
    public void openURL(){
        driver.get(REG_URL);
    }
    public void getCookies (){
        wait.until(ExpectedConditions.elementToBeClickable(cookiesButton)).click();
    }
}


