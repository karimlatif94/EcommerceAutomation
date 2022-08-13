package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_ResetPassword;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D03_ResetPasswordStepDef {
    P03_ResetPassword reset = new P03_ResetPassword();

    @Given("user navigate to login page")
    public void navigateToLoginPage() {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        Hooks.driver.navigate().to(url);
    }

    @And("user clicks on forget password link")
    public void forgetlink() {

        reset.forgetPassword().click();
    }


    @And("user enters his Email")
    public void Email() {

        reset.Email().sendKeys("Karim@gmail.com");
    }


    @Then("user clicks on Recover button")
    public void recoverButton() {
        reset.recoverBtn().click();

    }

    @Then("Reset message is displayed")
    public void checkResetMessage() {
        String ExpectedResult = "Email with instructions has been sent to you";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

}
