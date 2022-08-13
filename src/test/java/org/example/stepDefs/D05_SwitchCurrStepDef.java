package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P05_SwitchCurr;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D05_SwitchCurrStepDef {
    P05_SwitchCurr switchcurr = new P05_SwitchCurr();


    @And("user selects Euro from menu")
    public void choose_Euro() {

        switchcurr.selectEuro();

    }
    @Then("user selects Euro successfully")
    public void success_Euro() {
        String ExpectedResult = "Euro";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

    @And ("user selects US Dollar from menu")
    public void selectUS(){
        switchcurr.selectUSDollar();

    }
    @Then("user selects US Dollar successfully")
    public void success_US() {
        String ExpectedResult = "US Dollar";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }
}
