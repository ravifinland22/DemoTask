package org.example.ui.pageobjects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingScreen extends BasePage{

    private By emailAddress = new By.ById("etUsername");
    private By password = new By.ById("etPassword");
    private By signInButton = new By.ById("btnSignIn");
    private By createAccountButton  = new By.ById("btnSignUp");
    private By signInHeader=new By.ById("tvSignInTo");

    public void enterEmailAddress(String emailID){
        wait.until(ExpectedConditions.elementToBeClickable(emailAddress)).sendKeys(emailID);
    }

    public void enterPassword(String passwordText){
        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys(passwordText);
    }

    public void clickSignInButton(){
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
    }

    public void clickCreateAccountButton(){
        wait.until(ExpectedConditions.elementToBeClickable(createAccountButton)).click();
    }

    public void isUserOnLandingPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(signInHeader));
    }

    public void launch(){
        // blank placeholder
    }
}
