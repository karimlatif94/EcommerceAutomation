package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P11_CompareList;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D11_CompareListStepDef {
    P11_CompareList compare = new P11_CompareList();

    @When("user selects pride Book")
    public void selectPrideBook() {
        compare.selectPrideBook().click();
    }

    @And("user clicks on add to CompareList")
    public void AddToComparelist() {
        compare.AddToComparelist().click();
    }

    @Then("product is added successfully to Comparelist")
    public void checkProductAddedCompareSuccessMsg() {
        String ExpectedResult = "The product has been added to your product comparison";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }
}
