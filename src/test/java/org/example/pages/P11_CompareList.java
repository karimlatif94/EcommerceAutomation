package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P11_CompareList {
    public WebElement selectPrideBook() {
        By MacBook = By.cssSelector("a[href=\"/pride-and-prejudice\"]");
        return Hooks.driver.findElement(MacBook);
    }

    public WebElement AddToComparelist() {
        By comparelist = By.cssSelector("div div[class=\"compare-products\"]");
        return Hooks.driver.findElement(comparelist);

    }
//
//    public WebElement selectPiesBook() {
//        By MacBook = By.cssSelector("a[href=\"/first-prize-pies\"]");
//        return Hooks.driver.findElement(MacBook);
//    }

}
