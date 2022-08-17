package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P14_FollowUs {
    public WebElement facebook(){
        By facebook = By.linkText("Facebook");
        return Hooks.driver.findElement(facebook);
    }

    public WebElement twitter(){
        By twitter = By.linkText("Twitter");
        return Hooks.driver.findElement(twitter);
    }

    public WebElement youtube(){
        By youtube = By.linkText("YouTube");
        return Hooks.driver.findElement(youtube);
    }
    public WebElement RSS(){
        By RSS = By.linkText("RSS");
        return Hooks.driver.findElement(RSS);
    }
}
