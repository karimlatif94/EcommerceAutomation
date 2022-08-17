package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P05_SwitchCurr {
    public WebElement CurrTo(String new_currency)
    {
        By dropdown= By.name("customerCurrency");
        WebElement selectEuro= Hooks.driver.findElement(dropdown);
        Select select = new Select(selectEuro);
        select.selectByVisibleText(new_currency);//"Euro" / "US Dollar"
        return selectEuro;
    }
    public List<WebElement> productsList(){
        By productsList= By.cssSelector("span[class=\"price actual-price\"]");
        return Hooks.driver.findElements(productsList);
    }

}
