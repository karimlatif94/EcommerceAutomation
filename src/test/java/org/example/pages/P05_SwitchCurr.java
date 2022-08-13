package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P05_SwitchCurr {
    public WebElement selectEuro()
    {
        By dropdown= By.name("customerCurrency");
        WebElement selectEuro= Hooks.driver.findElement(dropdown);
        Select select = new Select(selectEuro);
        select.selectByVisibleText("Euro");
        return selectEuro;
    }


    public WebElement selectUSDollar()
    {
        By dropdown= By.name("customerCurrency");
        WebElement selectUS= Hooks.driver.findElement(dropdown);
        Select select = new Select(selectUS);
        select.selectByVisibleText("US Dollar");
        return selectUS;
    }
}
