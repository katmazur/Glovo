package com.glovoapp.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class Page {

    WebDriverWait wait;
    Faker faker = new Faker();
    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public By generateXpath (String searchText){
        return By.xpath("//*[contains(text(),'"+searchText+"')]/..");
    }

    public void waitAndClick(By el){
        wait.until(ExpectedConditions.elementToBeClickable(el)).click();

    }

}
