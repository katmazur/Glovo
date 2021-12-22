package com.glovoapp.steps;

import com.glovoapp.pages.RegistrationPage;
import com.glovoapp.pages.RegistrationPageContinue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CouriersSteps {
    RegistrationPage registrationPage;
    RegistrationPageContinue registrationPageContinue;

    public CouriersSteps() {
        registrationPage = new RegistrationPage(Hooks.driver);
        registrationPageContinue = new RegistrationPageContinue(Hooks.driver);
    }

    @Given("I am on the Registration page")
    public void iAmOnTheRegistrationPage() {
        registrationPage.openURL();
        registrationPage.getCookies();
    }

    @When("I insert registration user data")
    public void iInsertRegistrationUserData() {
        registrationPage.insertUserData("Minsk", "Germany"); //datatable for cucumber
    }

    @When("I click on Register button")
    public void iClickRegisterButton() {
        registrationPage.clickRegistration();

    }

    @Then("I see '{}' on the next page")
    public void iSeeNextPage(String expectedTitle) {
        String actualString = registrationPageContinue.getTitleText();
        assertTrue(actualString.contains(expectedTitle));
    }

}
