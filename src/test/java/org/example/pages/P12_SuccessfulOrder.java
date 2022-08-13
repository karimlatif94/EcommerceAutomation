package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P12_SuccessfulOrder {

    public WebElement shoppingCart() {

        By shoppingCart = By.cssSelector("a[href=\"/cart\"]");
        return Hooks.driver.findElement(shoppingCart);

    }

    public WebElement agreeOnTerms() {
        By terms = By.id("termsofservice");
        return Hooks.driver.findElement(terms);
    }

    public WebElement checkoutButton() {

        By checkout = By.id("checkout");
        return Hooks.driver.findElement(checkout);
    }

    public WebElement country() {
        By country = By.id("BillingNewAddress_CountryId");
        WebElement Country = Hooks.driver.findElement(country);
        Select select = new Select(Country);
        select.selectByValue("123");
        return Country;
    }

    public WebElement city() {
        By city = By.id("BillingNewAddress_City");
        return Hooks.driver.findElement(city);

    }

    public WebElement address() {
        By address = By.id("BillingNewAddress_Address1");
        return Hooks.driver.findElement(address);
    }

    public WebElement zipCode() {
        By zip_code = By.id("BillingNewAddress_ZipPostalCode");
        return Hooks.driver.findElement(zip_code);
    }

    public WebElement phone() {
        By phone = By.id("BillingNewAddress_PhoneNumber");
        return Hooks.driver.findElement(phone);

    }

    public WebElement fieldsContinueButton() {
        By cont = By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button");
        return Hooks.driver.findElement(cont);
    }

    public WebElement shippingContinueButton() {
        By cont = By.cssSelector("#shipping-method-buttons-container > button");
        return Hooks.driver.findElement(cont);
    }

    public WebElement paymentMethodContinueButton() {
        By cont = By.cssSelector("#payment-method-buttons-container > button");
        return Hooks.driver.findElement(cont);
    }

    public WebElement paymentInfoContinueButton() {
        By cont = By.cssSelector("#payment-info-buttons-container > button");
        return Hooks.driver.findElement(cont);
    }

    public WebElement confirmButton() {
        By confirm = By.cssSelector("#confirm-order-buttons-container > button");
        return Hooks.driver.findElement(confirm);
    }

    public WebElement orderProceededTitle() {
        By orderProceededTitle = By.cssSelector("div.page-body.checkout-data > div > div.title > strong");
        return Hooks.driver.findElement(orderProceededTitle);
    }
}
