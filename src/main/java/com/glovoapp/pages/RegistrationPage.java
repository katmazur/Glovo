package com.glovoapp.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    protected WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    @FindBy(xpath = "//input[@name='name']")
//    private WebElement inputName;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;

    @FindBy(css = ".text-field__input .el-select__caret")
    private WebElement cityDropdown;

    @FindBy(xpath = "//input[@type='tel']")
    private WebElement inputTel;

    @FindBy(xpath = "//button/span")
    private WebElement buttonNext;

    @FindBy (css = ".iti__flag-container" )
    private WebElement phoneCodeDropdown;

    @FindBy (xpath = "//input[@type=\"tel\"]")
    private WebElement phoneNumber;

    @FindBy (xpath = "//button[@type=\"submit\"]")
    private WebElement continueButton;

    public void insertUserData(String cityName, String countryName){
        Faker faker = new Faker();
        WebElement inputName = driver.findElement(By.xpath("//input[@name='name']"));
        inputName.sendKeys(faker.name().fullName());
        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(faker.internet().emailAddress());
        cityDropdown.click();
        WebElement cityFromList = driver.findElement(By.xpath("//*[contains(text(),'"+cityName+"')]/.."));
        cityFromList.click();
        phoneCodeDropdown.click();
        WebElement phoneCode = driver.findElement(By.xpath("//*[contains(text(), '" + countryName + "' )]"));
        phoneCode.click();
        phoneNumber.sendKeys(faker.phoneNumber().subscriberNumber(11));
    }

    public void clickRegistration() {
        continueButton.click();
    }
}


