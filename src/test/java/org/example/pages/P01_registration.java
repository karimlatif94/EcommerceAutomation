package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_registration {

    public WebElement registrationLink()
    {
        By register= By.className("ico-register");
        return Hooks.driver.findElement(register);

    }
    public WebElement firstNameTxtField() {
        By firstName = By.cssSelector("input[id^=\"FirstName\"]");
        return Hooks.driver.findElement(firstName);
    }
    public WebElement lastNameTxtField() {
        By lastName = By.cssSelector("input[id^=\"LastName\"]");
        return Hooks.driver.findElement(lastName);
    }
    public WebElement Email() {
        By email = By.name("Email");
        return Hooks.driver.findElement(email);
    }
    public WebElement Password() {
        By password = By.id("Password");
        return Hooks.driver.findElement(password);
    }
    public WebElement reEnterPassword() {
        By confirmedpassword = By.id("ConfirmPassword");
        return Hooks.driver.findElement(confirmedpassword);
    }

    public WebElement regBtn()
    {
        By registerbtn = By.xpath("//button[contains(@name,\"register-butt\")]");
        return Hooks.driver.findElement(registerbtn);
    }

    public WebElement registrationSuccessfulMsg() {
        By registrationResult = By.cssSelector("div[class=\"result\"]");
        return Hooks.driver.findElement(registrationResult);
    }
}
