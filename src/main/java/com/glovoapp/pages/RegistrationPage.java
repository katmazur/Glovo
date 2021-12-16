package com.glovoapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.github.javafaker;

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

    public void insertUserData(){
        Faker faker = new Faker();
        inputName.sendKeys();
    }


}


