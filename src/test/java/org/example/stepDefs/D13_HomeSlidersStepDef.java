package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P13_HomeSliders;
import org.testng.Assert;

public class D13_HomeSlidersStepDef {

    P13_HomeSliders homesliders = new P13_HomeSliders();

    @When("user clicks on Lumia slider")
    public void clickLumiaSlider(){
        homesliders.LumiaSlider().click();

    }
    @Then("user opens Lumia product successfully")
    public void checkLumiaPageAccessible() throws InterruptedException {
        Thread.sleep(3000);
        String url = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(url,"https://demo.nopcommerce.com/nokia-lumia-1020","Error:URL Mismatch");

    }

    @When("user clicks on iPhone slider")
    public void clickiPhoneSlider(){
        homesliders.iPhoneSlider().click();
    }
    @Then("user opens iPhone product successfully")
    public void checkiPhonePageAccessible() throws InterruptedException {
        Thread.sleep(3000);
        String url = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(url,"https://demo.nopcommerce.com/iphone-6", "Error:URL Mismatch");

    }

}
