package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P09_ShoppingCart;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D09_ShoppingCartStepDef {
    P09_ShoppingCart cart = new P09_ShoppingCart();

    @When("user selects HTC mobile")
    public void selectHTCMobile() {
        cart.selectHTCMobile().click();
    }

    @And("user clicks on add to cart button for mobile")
    public void AddToCartButton1() {
        cart.AddToCartButton1().click();
    }


    @When("user selects Portable Sound Speakers")
    public void selectSpeakers() {
        cart.selectSpeakers().click();
    }

    @And("user clicks on add to cart button for speakers")
    public void AddToCartButton2() {
        cart.AddToCartButton2().click();
    }

    @Then("product is added successfully")
    public void checkProductAddedSuccessMsg() {
        String ExpectedResult = "The product has been added to your shopping cart";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }
}
