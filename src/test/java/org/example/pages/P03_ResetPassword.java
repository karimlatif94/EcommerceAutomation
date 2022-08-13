package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_ResetPassword {
    public WebElement forgetPassword()
    {
        By forgetPassword= By.className("forgot-password");
        return Hooks.driver.findElement(forgetPassword);

    }

    public WebElement Email()
    {
        By Email= By.id("Email");
        return Hooks.driver.findElement(Email);
    }
    public WebElement recoverBtn()
    {
        By changePassword= By.xpath("//button[contains(@name,\"send-email\")]");
        return Hooks.driver.findElement(changePassword);
    }
}
