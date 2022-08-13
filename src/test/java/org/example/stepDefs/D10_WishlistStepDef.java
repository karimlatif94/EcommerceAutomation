package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P10_Wishlist;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D10_WishlistStepDef {
    P10_Wishlist wish = new P10_Wishlist();

    @When("user selects MacBook")
    public void selectMacBook() {
        wish.selectMacBook().click();
    }

    @And("user clicks on add to wishlist for MacBook")
    public void AddToWishlist1() {
        wish.AddToWishlist1().click();
    }

    @Then("product is added successfully to Wishlist")
    public void checkProductAddedWishSuccessMsg() {
        String ExpectedResult = "The product has been added to your wishlist";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }
    @When("user selects pies book")
    public void selectPiesBook() {
        wish.selectPiesBook().click();
    }
    @And("user clicks on add to wishlist for book")
    public void AddToWishlist2() {
        wish.AddToWishlist2().click();
    }
}
