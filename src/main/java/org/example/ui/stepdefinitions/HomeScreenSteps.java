package org.example.ui.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ui.pageobjects.BasePage;
import org.example.ui.pageobjects.HomeScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeScreenSteps {

    private final HomeScreen homeScreen = new HomeScreen();

    @Then("user account is registered and user is on home page")
    @Then("user is on Home Screen")
    public void user_account_is_registered_and_user_is_on_home_page() {
        homeScreen.isUserOnHomeScreen();
    }
    @When("user taps on search icon")
    public void user_taps_on_search_icon() {
        homeScreen.clickSearchButton();
    }

    @After
    public void teardown(){
        homeScreen.closeDriver();
    }
}
