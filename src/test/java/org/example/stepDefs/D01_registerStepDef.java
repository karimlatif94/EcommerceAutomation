package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_registration;
import org.testng.Assert;

public class D01_registerStepDef {
    P01_registration reg = new P01_registration();


    @When("user opens homepage")
    public void navigateToHomePage() {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate().to(url);
    }

    @And("user clicks on register to open register page")
    public void openRegisterlink() {
        reg.registrationLink().click();
    }


    @And("user enters first name and last name")
    public void setFirstName_lastName() {
        reg.firstNameTxtField().sendKeys("Karim");
        reg.lastNameTxtField().sendKeys("Mohamed");
    }

    @And("user enters valid Email address")
    public void setEmailAddress() {
        reg.Email().sendKeys("Karim@gmail.com");

    }

    @And("user enters valid password and confirm it")
    public void setPassword() {
        reg.Password().sendKeys("Abc1234!");
        reg.reEnterPassword().sendKeys("Abc1234!");

    }

    @And("user clicks on register button")
    public void registerButton() {
        reg.regBtn().click();
    }

    @Then("success message is displayed")
    public void checkSuccessMessage() {
        String actualResult = reg.registrationSuccessfulMsg().getText();
        String expectedResult = "Your registration completed";
        Assert.assertTrue(actualResult.equalsIgnoreCase(expectedResult));
    }

}
