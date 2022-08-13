package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P08_SelectTags {

    public WebElement cellTag() {

        By cell = By.cssSelector("a[href=\"/cell\"]");
        WebElement cellTag = Hooks.driver.findElement(cell);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(cellTag).click().build().perform();
        return cellTag;
    }


    public WebElement cameraTag() {
        By camera = By.cssSelector("a[href=\"/camera\"]");
        WebElement  cameraTag = Hooks.driver.findElement(camera);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(cameraTag).click().build().perform();
        return cameraTag;
    }
}
