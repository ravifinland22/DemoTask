package org.example.ui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RightNavigationPanel extends BasePage {

    private By signOutButton = new By.ById("llSignOut");

    public void clickSignOutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signOutButton)).click();
    }
}
