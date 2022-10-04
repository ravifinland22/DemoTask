package org.example.ui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeScreen extends BasePage {
    private By menuButton = new By.ById("icMenu");
    private By searchButton = new By.ById("icSearch");

    public void clickMenuButton() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButton)).click();
    }

    public void clickSearchButton() {
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }

    public void isUserOnHomeScreen() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButton));
    }
}
