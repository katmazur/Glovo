package com.glovoapp.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

    protected WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }



    @FindBy(xpath = "//input[@name='name']")
    private WebElement inputName;


    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;

    @FindBy(css = ".text-field__input .el-select__caret")
    private WebElement cityDropdown;

    @FindBy(xpath = "//input[@type='tel']")
    private WebElement inputTel;

    @FindBy(xpath = "//button/span")
    private WebElement buttonNext;

    public void insertUserData(String cityName){
        Faker faker = new Faker();
        inputName.sendKeys(faker.name().fullName());
        inputEmail.sendKeys(faker.internet().emailAddress());
        cityDropdown.click();
        WebElement cityFromList = driver.findElement(By.xpath("//*[contains(text(), '" + cityName + "' )]"));
        cityFromList.click();
    }
}


