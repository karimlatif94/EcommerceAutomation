package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_Search;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D04_SearchStepDef {
    P04_Search search = new P04_Search();
    String SKU_input = "NK_FRC_RS";

    @And("user searches by product name for NIKE SHOES")
    public void searchByName()
    {
        search.search().sendKeys("nike");
        search.SearchBtn().click();
    }

    @Then("user finds product results successfully")
    public void checkProductResult()
    {
        int items_count = search.getProductResultList().size();
        Assert.assertTrue(items_count>0);
    }
    @When("user searches by SKU for NIKE SHOES")
    public void searchBySKU() {
        search.search().sendKeys(SKU_input);
        search.SearchBtn().click();
        if (search.getProductResultList().size()>0){
            ((WebElement) search.getProductResultList().get(0)).click(); ///get first result
        }
    }


    @Then("user finds product result by SKU successfully")
    public void checkProductHasSameSKU() {
        String currentSerial = search.productSKU().getText();
        Assert.assertTrue(currentSerial.contains(SKU_input));
    }

}
