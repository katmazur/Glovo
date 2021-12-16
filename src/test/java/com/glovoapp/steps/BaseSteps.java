package com.glovoapp.steps;

import com.glovoapp.pages.RegistrationPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSteps {


        ChromeDriver driver;
        RegistrationPage registrationPage;

    @Before
    public void setupBrowser(){
        driver = new ChromeDriver();
        registrationPage = new RegistrationPage(driver);
        //System.setProperty("webdriver.chrome.driver", "C://Tools//chromedriver.exe/");
    }


    @After
    public void tearDown(){
        driver.close();
    }
}
