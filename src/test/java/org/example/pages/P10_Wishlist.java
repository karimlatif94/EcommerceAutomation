package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P10_Wishlist {
    public WebElement selectMacBook() {
        By MacBook = By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]");
        return Hooks.driver.findElement(MacBook);
    }

    public WebElement AddToWishlist1() {
        By wishlist = By.id("add-to-wishlist-button-4");
        return Hooks.driver.findElement(wishlist);

    }

    public WebElement selectPiesBook() {
        By pieBook = By.cssSelector("a[href=\"/first-prize-pies\"]");
        return Hooks.driver.findElement(pieBook);
    }
    public WebElement AddToWishlist2() {
        By wishlist = By.id("add-to-wishlist-button-38");
        return Hooks.driver.findElement(wishlist);
    }


}
