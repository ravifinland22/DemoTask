package org.example.ui.stepdefinitions;

import io.cucumber.java.en.Then;
import org.example.ui.pageobjects.BasePage;
import org.example.ui.pageobjects.ItemDetailsScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ItemDetailsScreenSteps {
 private final ItemDetailsScreen itemDetailsScreen= new ItemDetailsScreen();

    @Then("user is on item details page")
    public void user_is_on_item_details_page() {
       itemDetailsScreen.isUserOnItemDetailsScreen();
    }
}
