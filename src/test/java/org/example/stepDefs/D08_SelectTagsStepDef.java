package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P08_SelectTags;

public class D08_SelectTagsStepDef {

   P08_SelectTags Tags = new P08_SelectTags();

    @Given("user selects electronics category")
    public void selectCategory() {
        String url = "https://demo.nopcommerce.com/electronics";
        Hooks.driver.navigate().to(url);
    }

    @When("user clicks camera tag")
    public void selectCameraTag() {
        Tags.cameraTag();
    }

    @And("user clicks cell tag")
    public void selectCellTag() {
        Tags.cellTag();
    }
}
