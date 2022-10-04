package org.example.ui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ItemDetailsScreen extends BasePage {

    private By pageHeader = new By.ById("tvTitle");
    private By openTradeButton = new By.ById("btnSubmit");

    public void isUserOnItemDetailsScreen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(pageHeader));
        wait.until(ExpectedConditions.visibilityOfElementLocated(openTradeButton));
    }
}
