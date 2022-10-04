package org.example.ui.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.ui.pageobjects.BasePage;
import org.example.ui.pageobjects.LandingScreen;

public class LandingScreenSteps {

    private final LandingScreen landingScreen = new LandingScreen();

    @Given("the app is launched")
    public void the_app_is_launched() {
        landingScreen.launch();
    }

    @Given("user is on the Landing screen")
    public void user_is_on_the_landing_screen() {
        landingScreen.isUserOnLandingPage();
    }

    @When("user clicks on create new account button")
    public void user_clicks_on_create_new_account_button() {
        landingScreen.clickCreateAccountButton();
    }

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_username_and_password(String userName,String passwordText) {
        landingScreen.enterEmailAddress(userName);
        landingScreen.enterPassword(passwordText);
        landingScreen.clickSignInButton();
    }


}
