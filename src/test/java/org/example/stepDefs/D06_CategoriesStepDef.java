package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.P06_Categories;

public class D06_CategoriesStepDef {
    P06_Categories category = new P06_Categories();

    @When("user selects Digital Downloads category")
    public void selectDigitalDownloadsCategory() throws InterruptedException {
        category.selectDigitalDownloadsCategory();
        Thread.sleep(3000);

    }

    @And("user selects Electronics category then hover to Others subcategory")
    public void selectElectronicsOthersSubCategory() throws InterruptedException {
        category.selectElectronicsOthersSubCategory();
        Thread.sleep(3000);
    }


    @And("user selects Books category")
    public void selectBooksCategory() throws InterruptedException {
        category.selectBooksCategory();
        Thread.sleep(3000);
    }
}
