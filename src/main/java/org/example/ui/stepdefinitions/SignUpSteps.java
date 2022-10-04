package org.example.ui.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ui.pageobjects.BasePage;
import org.example.ui.pageobjects.SignUp;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpSteps {
    private final SignUp signUp = new SignUp();

    @Then("user is on Sign Up screen")
    public void user_is_on_sign_up_screen() {
        signUp.isUserOnSignUpPage();
    }

    @When("user sets {string},{string},{string},{string},{string},{string} on Sign Up screen")
    public void user_sets_sign_up_details_on_sign_up_screen(String firstNameText, String lastNameText, String emailID, String passwordText, String phoneNumberText, String countryName) {
        signUp.enterFirstName(firstNameText);
        signUp.enterLastname(lastNameText);
        signUp.enterEmailAddress(emailID);
        signUp.enterPassword(passwordText);
        signUp.enterPhoneNumber(phoneNumberText);
        signUp.clickSelectCountryButton();
        signUp.selectCountryFromList(countryName);
    }

    @When("user checks terms and conditions and clicks on clicks on Open Account button")
    public void user_checks_terms_and_conditions_and_clicks_on_clicks_on_open_account_button() {
        signUp.setTermsAndConditionsCheckBox();
        signUp.clickSignUpButton();
    }
}
