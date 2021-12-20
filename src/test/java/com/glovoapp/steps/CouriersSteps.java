package com.glovoapp.steps;

import com.glovoapp.pages.RegistrationPage;
import com.glovoapp.pages.RegistrationPageContinue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class CouriersSteps {

    RegistrationPage registrationPage;
    RegistrationPageContinue registrationPageContinue;

    public CouriersSteps() {
        this.registrationPage = new RegistrationPage(Hooks.driver);
        this.registrationPageContinue = new RegistrationPageContinue(Hooks.driver);
    }

    @Given("I am on the Registration page")
    public void iAmOnTheRegistrationPage() {
        Hooks.driver.get("https://couriers.glovoapp.com/by/");
    }

    @When("I insert registration user data")
    public void iInsertRegistrationUserData() {
        registrationPage.insertUserData("Minsk", "Germany");
    }

    @When("I click on Register button")
    public void iClickRegisterButton() {
        registrationPage.clickRegistration();

    }

    @Then("I see next page is opened")
    public void iSeeNextPage() {
        WebElement el = (new WebDriverWait(Hooks.driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form//h2[@class = 'extras__title']")));
        String actualString = Hooks.driver.findElement(By.xpath("//form//h2[@class = 'extras__title']")).getText();
        String expectedString = "Почти готово!";
        assertTrue(actualString.contains(expectedString));
    }
}
