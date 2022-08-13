package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P07_ColorFilter {
    public WebElement selectApparelCategory() {
        By apparel = By.cssSelector("a[href=\"/apparel\"]");
        WebElement ApparelCategory = Hooks.driver.findElement(apparel);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(ApparelCategory).build().perform();
        return ApparelCategory;
    }

    public WebElement selectShoesSubcategory() {
        By shoes = By.cssSelector("a[href=\"/shoes\"]");
        WebElement ShoesCategory = Hooks.driver.findElement(shoes);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(ShoesCategory).build().perform();
        return ShoesCategory;
    }

    public WebElement filterColorCheckbox() {
        By color = By.id("attribute-option-15");
        WebElement filterColor = Hooks.driver.findElement(color);
        return filterColor;
    }
}
