package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_ShoppingCart {
    public WebElement selectHTCMobile() {
        By mobile = By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]");
        return Hooks.driver.findElement(mobile);
    }

    public WebElement AddToCartButton1() {
        By cartButton1 = By.id("add-to-cart-button-18");
        return Hooks.driver.findElement(cartButton1);
    }

    public WebElement selectSpeakers() {
        By speakers = By.cssSelector("a[href=\"/portable-sound-speakers\"]");
        return Hooks.driver.findElement(speakers);
    }

    public WebElement AddToCartButton2() {

        By cartButton2 = By.id("add-to-cart-button-23");
        return Hooks.driver.findElement(cartButton2);
    }
}
