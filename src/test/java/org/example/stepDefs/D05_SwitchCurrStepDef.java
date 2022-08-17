package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P05_SwitchCurr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D05_SwitchCurrStepDef {
    P05_SwitchCurr switchcurr = new P05_SwitchCurr();


    @And("user switches currency to Euro")
    public void CurrToEuro() {

        switchcurr.CurrTo("Euro");

    }

    @Then("Products currency is switched to Euro successfully")
    public void checkCurrencyisEuro() {

        for (WebElement currentPrice : switchcurr.productsList()) {
            Assert.assertTrue(currentPrice.getText().contains("€"));
        }
    }

    @And("user switches currency to Dollar")
    public void CurrToDollar() {

        switchcurr.CurrTo("US Dollar");

    }

    @Then("Products currency is switched to Dollar successfully")
    public void checkCurrencyisDollar() {
        for (WebElement currentPrice : switchcurr.productsList()) {
            Assert.assertTrue(currentPrice.getText().contains("$"));
        }
    }
}
