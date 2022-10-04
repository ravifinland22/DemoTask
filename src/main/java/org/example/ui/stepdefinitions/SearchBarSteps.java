package org.example.ui.stepdefinitions;

import io.cucumber.java.en.When;
import org.example.ui.pageobjects.BasePage;
import org.example.ui.pageobjects.SearchBar;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchBarSteps  {
private final SearchBar searchBar= new SearchBar();

    @When("enters {string} on search bar")
    public void enters_lufthansa_on_search_bar(String searchText) {
        searchBar.enterSearchText(searchText);
    }
    @When("selects the item from the list")
    public void selects_the_item_from_the_list() {
        searchBar.clickSearchResultItem();
    }
}
