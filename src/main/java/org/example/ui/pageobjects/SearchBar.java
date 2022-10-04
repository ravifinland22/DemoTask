package org.example.ui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchBar extends BasePage{

    private final By searchBar  = new By.ById("search_plate");
    private final By searchResultItem= new By.ById("wrapItemSymbol");

    public void enterSearchText(String searchText){
        wait.until(ExpectedConditions.presenceOfElementLocated(searchBar)).sendKeys(searchText);
    }

    public void clickSearchResultItem(){
        wait.until(ExpectedConditions.elementToBeClickable(searchResultItem)).click();
    }

}
