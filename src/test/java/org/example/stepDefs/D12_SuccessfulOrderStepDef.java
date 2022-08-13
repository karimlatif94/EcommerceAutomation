package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P12_SuccessfulOrder;
import org.testng.Assert;

import java.time.Duration;

public class D12_SuccessfulOrderStepDef {
    P12_SuccessfulOrder order = new P12_SuccessfulOrder();
/*
 *
 Given
    When user clicks on checkout button
    And user fills all fields
    And user clicks on continue button
    And user select delivery method and click continue button
    And user select payment method and click continue button
    And user clicks continue button
    And user clicks confirm button
* */

    @Given("user clicks on shopping cart link")
    public void shoppingCart() {
        order.shoppingCart().click();
    }


    @And("user accepts the agreement")
    public void agreeOnTerms() {
        order.agreeOnTerms().click();
    }

    @When("user clicks on checkout button")
    public void checkoutButton() {
        order.checkoutButton().click();

    }

    @And("user fills all fields")
    public void fillAllFields() {

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        order.country();
        order.city().sendKeys("Cairo");
        order.address().sendKeys("Maadi");
        order.zipCode().sendKeys("50005");
        order.phone().sendKeys("0225161000");

    }

    @Then("user clicks on continue button")
    public void fieldsContinueButton() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        order.fieldsContinueButton().click();
    }

    @And("user select delivery method and click continue button")
    public void shippingContinueButton() {

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        order.shippingContinueButton().click();

    }

    @And("user select payment method and click continue button")
    public void paymentMethodContinueButton() {

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        order.paymentMethodContinueButton().click();

    }

    @And("user clicks continue button")
    public void paymentInfoContinueButton() {

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        order.paymentInfoContinueButton().click();

    }

    @And("user clicks confirm button")
    public void confirmButton(){
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        order.confirmButton().click();

    }

    @And("order is processed successfully")
    public void orderProcessedSuccessfully() {
        String actualResult= order.orderProceededTitle().getText();
        String expectedResult = "Your order has been successfully processed!";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
