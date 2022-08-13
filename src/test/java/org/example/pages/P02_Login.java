package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {
    public WebElement loginBtn() {
        By loginBtn = By.className("ico-login");
        return Hooks.driver.findElement(loginBtn);
    }

    public WebElement Email() {
        By email = By.name("Email");
        return Hooks.driver.findElement(email);
    }

    public WebElement Password() {
        By password = By.id("Password");
        return Hooks.driver.findElement(password);
    }

    public WebElement login() {
        By login = By.cssSelector("button[class=\"button-1 login-button\"]");
        return Hooks.driver.findElement(login);
    }

}
