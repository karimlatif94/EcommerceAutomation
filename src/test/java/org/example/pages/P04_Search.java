package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_Search {

    public WebElement search() {
        By SearchTxtField = By.id("small-searchterms");
        return Hooks.driver.findElement(SearchTxtField);
    }

    public WebElement SearchBtn() {

        By Searchbtn = By.cssSelector("button[class=\"button-1 search-box-button\"]");
        return Hooks.driver.findElement(Searchbtn);
    }
}
