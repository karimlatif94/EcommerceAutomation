package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.example.pages.P14_FollowUs;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D14_FollowUsStepDef {
    P14_FollowUs followUs = new P14_FollowUs();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));


    @And("user clicks youtube icon")
    public void clickYoutubeIcon() {
        followUs.youtube().click();
    }

    @Then("youtube is accessed successfully")
    public void checkYoutubeAccessed() {
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tablist = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tablist.get(1));
        String currentURl = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(currentURl, "https://www.youtube.com/user/nopCommerce");

        //switch to parent window
        Hooks.driver.switchTo().window(tablist.get(0));

    }

    @And("user clicks facebook icon")
    public void clickFacebookIcon() {
        followUs.facebook().click();
    }

    @Then("facebook is accessed successfully")
    public void checkFacebookAccessed() {
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tablist = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tablist.get(1));
        String currentURl = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(currentURl, "https://www.facebook.com/nopCommerce");

        //switch to parent window
        Hooks.driver.switchTo().window(tablist.get(0));

    }
    @And("user clicks twitter icon")
    public void clickTwitterIcon(){
        followUs.twitter().click();
    }

    @Then("twitter is accessed successfully")
    public void checkTwitterAccessed(){
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tablist = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tablist.get(1));
        String currentURl = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(currentURl,"https://twitter.com/nopCommerce");

        //switch to parent window
        Hooks.driver.switchTo().window(tablist.get(0));

    }
    @And("user clicks RSS icon")
    public void clickRSSIcon(){
        followUs.RSS().click();
    }

    @Then("RSS is accessed successfully")
    public void checkRSSAccessed(){
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tablist = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tablist.get(1));
        String currentURl = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(currentURl,"https://demo.nopcommerce.com/new-online-store-is-open");

        //switch to parent window
        Hooks.driver.switchTo().window(tablist.get(0));

    }

}
