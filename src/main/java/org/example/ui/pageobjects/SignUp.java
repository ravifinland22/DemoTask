package org.example.ui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUp extends BasePage {
    private By signUpHeader = new By.ById("tvSignUpTo");
    private By firstName = new By.ById("etFirstName");
    private By lastName = new By.ById("etLastName");
    private By emailAddress = new By.ById("etEmail");
    private By password = new By.ById("etPassword");
    private By phoneNumber = new By.ById("etPhone");
    private By selectCountryButton = new By.ById("spCountry");
    private By countryList = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
    private By termsAndConditionsCheckBox = new By.ById("cbTnC");
    private By openAccountButton = new By.ById("btnSignUp");

    public void enterFirstName(String firstNameText) {
        wait.until(ExpectedConditions.elementToBeClickable(firstName)).sendKeys(firstNameText);
    }

    public void enterLastname(String lastNameText) {
        wait.until(ExpectedConditions.elementToBeClickable(lastName)).sendKeys(lastNameText);
    }

    public void enterEmailAddress(String emailID) {
        wait.until(ExpectedConditions.elementToBeClickable(emailAddress)).sendKeys(emailID);
    }

    public void enterPassword(String passwordText) {
        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys(passwordText);
    }

    public void enterPhoneNumber(String phoneNumberText) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumber)).sendKeys(phoneNumberText);
    }

    public void clickSignUpButton() {
        wait.until(ExpectedConditions.elementToBeClickable(openAccountButton)).click();
    }

    public void setTermsAndConditionsCheckBox() {
        wait.until(ExpectedConditions.elementToBeClickable(termsAndConditionsCheckBox)).click();
    }

    public void clickSelectCountryButton() {
        wait.until(ExpectedConditions.elementToBeClickable(selectCountryButton)).click();
    }

    public void selectCountryFromList(String text) {
        wait.until(ExpectedConditions.elementToBeClickable(countryList)).click();
    }

    public void isUserOnSignUpPage() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpHeader));
    }
}
