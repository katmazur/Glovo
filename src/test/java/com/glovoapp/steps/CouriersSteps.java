package com.glovoapp.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CouriersSteps extends BaseSteps {


    @Given("I am on the Registration page")
    public void iAmOnTheRegistrationPage() {
        driver.get("https://couriers.glovoapp.com/by/");
    }
    @When("I insert registration user data")
    public void iInsertRegistrationUserData(){

    }


}
