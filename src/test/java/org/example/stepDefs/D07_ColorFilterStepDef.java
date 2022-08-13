package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_ColorFilter;

public class D07_ColorFilterStepDef {

    P07_ColorFilter colorFilter = new P07_ColorFilter();

    @When("user selects Apparel category then hover to Shoes subcategory")
    public void selectApparelCategory() {
        colorFilter.selectApparelCategory();
    }

    @And("user selects Shoes subcategory")
    public void selectShoesSubcategory() {
        colorFilter.selectShoesSubcategory().click();
    }

    @Then("user filter by Red color")
    public void filterColorCheckbox() {
        colorFilter.filterColorCheckbox().click();
    }
}
