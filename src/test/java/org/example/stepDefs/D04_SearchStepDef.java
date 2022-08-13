package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P04_Search;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D04_SearchStepDef {
    P04_Search search = new P04_Search();

    @And("user searches with product name")
    public void search()
    {
        search.search().sendKeys("nike");
        search.SearchBtn().click();
    }

    @Then("user finds product results successfully")
    public void checkProductResult()
    {
        int items_count = Hooks.driver.findElements(By.cssSelector("div[class=\"product-item\"]")).size();
        System.out.println(items_count);
        Assert.assertTrue(items_count>0);
    }

}
