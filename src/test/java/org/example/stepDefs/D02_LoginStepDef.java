package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_Login;
import org.testng.Assert;

public class D02_LoginStepDef {
    P02_Login log = new P02_Login();

    @Given("user navigates to login page")
    public void navigateToLoginPage()
    {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        Hooks.driver.navigate().to(url);
    }
    @And("user clicks login link")
    public void loginlink()
    {
        log.loginBtn().click();

    }

    @And("user enters correct email")
    public void Email()
    {
        log.Email().sendKeys("Karim@gmail.com");

    }
    @And("user enters correct password")
    public void Password()

    {
        log.Password().sendKeys("Abc1234!");

    }

    @And("user clicks on login button")
    public void loginButton()
    {
        log.login().click();
    }


    @Then("user login is done successfully")
    public void checkSuccessMessage () throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertFalse(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/login?returnUrl=%2F/"));
    }
}
